package pl.edu.pjwstk.EduPlanner.service;

import org.springframework.stereotype.Service;
import pl.edu.pjwstk.EduPlanner.domain.Lesson;
import pl.edu.pjwstk.EduPlanner.repository.LessonRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LessonService {

    private final LessonRepository lessonRepository;

    public LessonService(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public List<Lesson> getAllLessons() {
        return lessonRepository.findAll();
    }

    public Optional<Lesson> getLessonById(Long id) {
        return lessonRepository.findById(id);
    }

    public Lesson createLesson(Lesson lesson) {
        return lessonRepository.save(lesson);
    }

    public Lesson updateLesson(Long id, Lesson updatedLesson) {
        return lessonRepository.findById(id)
                .map(existingLesson -> {
                    existingLesson.setTimeslot(updatedLesson.getTimeslot());
                    existingLesson.setRoom(updatedLesson.getRoom());
                    existingLesson.setSubject(updatedLesson.getSubject());
                    existingLesson.setTeacher(updatedLesson.getTeacher());
                    existingLesson.setStudentGroup(updatedLesson.getStudentGroup());
                    return lessonRepository.save(existingLesson);
                })
                .orElseThrow(() -> new IllegalArgumentException("Lesson with id " + id + " not found."));
    }

    public void deleteLesson(Long id) {
        lessonRepository.deleteById(id);
    }
}
