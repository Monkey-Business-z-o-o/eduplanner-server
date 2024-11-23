package pl.edu.pjwstk.EduPlanner.config;

import ai.timefold.solver.test.api.score.stream.ConstraintVerifier;
import pl.edu.pjwstk.EduPlanner.domain.Lesson;
import pl.edu.pjwstk.EduPlanner.domain.Timetable;
import pl.edu.pjwstk.EduPlanner.solver.TimetableConstraintProvider;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class ConstraintConfig {

    @Bean
    public ConstraintVerifier<TimetableConstraintProvider, Timetable> buildConstraintVerifier() {
        return ConstraintVerifier.build(new TimetableConstraintProvider(), Timetable.class, Lesson.class);
    }
}