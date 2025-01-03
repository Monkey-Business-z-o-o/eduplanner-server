package pl.edu.pjwstk.EduPlanner.solver;

import java.time.DayOfWeek;
import java.time.LocalTime;

import ai.timefold.solver.test.api.score.stream.ConstraintVerifier;

import pl.edu.pjwstk.EduPlanner.domain.Lesson;
import pl.edu.pjwstk.EduPlanner.domain.Room;
import pl.edu.pjwstk.EduPlanner.domain.Timeslot;
import pl.edu.pjwstk.EduPlanner.domain.Timetable;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledInNativeImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisabledInNativeImage
class TimetableConstraintProviderTest {

    private static final Room ROOM1 = new Room(1L, "Room1");
    private static final Room ROOM2 = new Room(2L, "Room2");
    private static final Timeslot TIMESLOT1 = new Timeslot(1L, DayOfWeek.MONDAY, LocalTime.NOON);
    private static final Timeslot TIMESLOT2 = new Timeslot(2L, DayOfWeek.TUESDAY, LocalTime.NOON);
    private static final Timeslot TIMESLOT3 = new Timeslot(3L, DayOfWeek.TUESDAY, LocalTime.NOON.plusHours(1));
    private static final Timeslot TIMESLOT4 = new Timeslot(4L, DayOfWeek.TUESDAY, LocalTime.NOON.plusHours(3));

    @Autowired
    ConstraintVerifier<TimetableConstraintProvider, Timetable> constraintVerifier;

    @Test
    void roomConflict() {
        Lesson firstLesson = new Lesson(1L, "Subject1", "Teacher1", "Group1", TIMESLOT1, ROOM1);
        Lesson conflictingLesson = new Lesson(2L, "Subject2", "Teacher2", "Group2", TIMESLOT1, ROOM1);
        Lesson nonConflictingLesson = new Lesson(3L, "Subject3", "Teacher3", "Group3", TIMESLOT2, ROOM1);
        constraintVerifier.verifyThat(TimetableConstraintProvider::roomConflict)
                .given(firstLesson, conflictingLesson, nonConflictingLesson)
                .penalizesBy(1);
    }

    @Test
    void teacherConflict() {
        String conflictingTeacher = "Teacher1";
        Lesson firstLesson = new Lesson(1L, "Subject1", conflictingTeacher, "Group1", TIMESLOT1, ROOM1);
        Lesson conflictingLesson = new Lesson(2L, "Subject2", conflictingTeacher, "Group2", TIMESLOT1, ROOM2);
        Lesson nonConflictingLesson = new Lesson(3L, "Subject3", "Teacher2", "Group3", TIMESLOT2, ROOM1);
        constraintVerifier.verifyThat(TimetableConstraintProvider::teacherConflict)
                .given(firstLesson, conflictingLesson, nonConflictingLesson)
                .penalizesBy(1);
    }

    @Test
    void studentGroupConflict() {
        String conflictingGroup = "Group1";
        Lesson firstLesson = new Lesson(1L, "Subject1", "Teacher1", conflictingGroup, TIMESLOT1, ROOM1);
        Lesson conflictingLesson = new Lesson(2L, "Subject2", "Teacher2", conflictingGroup, TIMESLOT1, ROOM2);
        Lesson nonConflictingLesson = new Lesson(3L, "Subject3", "Teacher3", "Group3", TIMESLOT2, ROOM1);
        constraintVerifier.verifyThat(TimetableConstraintProvider::studentGroupConflict)
                .given(firstLesson, conflictingLesson, nonConflictingLesson)
                .penalizesBy(1);
    }

    @Test
    void teacherRoomStability() {
        String teacher = "Teacher1";
        Lesson lessonInFirstRoom = new Lesson(1L, "Subject1", teacher, "Group1", TIMESLOT1, ROOM1);
        Lesson lessonInSameRoom = new Lesson(2L, "Subject2", teacher, "Group2", TIMESLOT1, ROOM1);
        Lesson lessonInDifferentRoom = new Lesson(3L, "Subject3", teacher, "Group3", TIMESLOT1, ROOM2);
        constraintVerifier.verifyThat(TimetableConstraintProvider::teacherRoomStability)
                .given(lessonInFirstRoom, lessonInDifferentRoom, lessonInSameRoom)
                .penalizesBy(2);
    }

    @Test
    void teacherTimeEfficiency() {
        String teacher = "Teacher1";
        Lesson singleLessonOnMonday = new Lesson(1L, "Subject1", teacher, "Group1", TIMESLOT1, ROOM1);
        Lesson firstTuesdayLesson = new Lesson(2L, "Subject2", teacher, "Group2", TIMESLOT2, ROOM1);
        Lesson secondTuesdayLesson = new Lesson(3L, "Subject3", teacher, "Group3", TIMESLOT3, ROOM1);
        Lesson thirdTuesdayLessonWithGap = new Lesson(4L, "Subject4", teacher, "Group4", TIMESLOT4, ROOM1);
        constraintVerifier.verifyThat(TimetableConstraintProvider::teacherTimeEfficiency)
                .given(singleLessonOnMonday, firstTuesdayLesson, secondTuesdayLesson, thirdTuesdayLessonWithGap)
                .rewardsWith(1); // Second tuesday lesson immediately follows the first.

        // Reverse ID order
        Lesson altSecondTuesdayLesson = new Lesson(2L, "Subject2", teacher, "Group3", TIMESLOT3, ROOM1);
        Lesson altFirstTuesdayLesson = new Lesson(3L, "Subject3", teacher, "Group2", TIMESLOT2, ROOM1);
        constraintVerifier.verifyThat(TimetableConstraintProvider::teacherTimeEfficiency)
                .given(altSecondTuesdayLesson, altFirstTuesdayLesson)
                .rewardsWith(1); // Second tuesday lesson immediately follows the first.
    }

    @Test
    void studentGroupSubjectVariety() {
        String studentGroup = "Group1";
        String repeatedSubject = "Subject1";
        Lesson mondayLesson = new Lesson(1L, repeatedSubject, "Teacher1", studentGroup, TIMESLOT1, ROOM1);
        Lesson firstTuesdayLesson = new Lesson(2L, repeatedSubject, "Teacher2", studentGroup, TIMESLOT2, ROOM1);
        Lesson secondTuesdayLesson = new Lesson(3L, repeatedSubject, "Teacher3", studentGroup, TIMESLOT3, ROOM1);
        Lesson thirdTuesdayLessonWithDifferentSubject = new Lesson(4L, "Subject2", "Teacher4", studentGroup, TIMESLOT4, ROOM1);
        Lesson lessonInAnotherGroup = new Lesson(5L, repeatedSubject, "Teacher5", "Group2", TIMESLOT1, ROOM1);
        constraintVerifier.verifyThat(TimetableConstraintProvider::studentGroupSubjectVariety)
                .given(mondayLesson, firstTuesdayLesson, secondTuesdayLesson, thirdTuesdayLessonWithDifferentSubject,
                        lessonInAnotherGroup)
                .penalizesBy(1); // Second tuesday lesson immediately follows the first.
    }

}