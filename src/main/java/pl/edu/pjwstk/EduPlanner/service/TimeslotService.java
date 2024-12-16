package pl.edu.pjwstk.EduPlanner.service;

import org.springframework.stereotype.Service;
import pl.edu.pjwstk.EduPlanner.domain.Timeslot;
import pl.edu.pjwstk.EduPlanner.repository.TimeslotRepository;

import java.util.List;


@Service
public class TimeslotService {

    private final TimeslotRepository timeslotRepository;

    public TimeslotService(TimeslotRepository timeslotRepository) {
        this.timeslotRepository = timeslotRepository;
    }

    public List<Timeslot> getAllTimeslots() {
        return timeslotRepository.findAll();
    }

    public Timeslot getTimeslotById(Long id) {
        return timeslotRepository.findById(id).orElse(null);
    }

    public Timeslot createTimeslot(Timeslot timeslot) {
        return timeslotRepository.save(timeslot);
    }

    public Timeslot updateTimeslot(Long id, Timeslot updatedTimeslot) {
        return timeslotRepository.findById(id)
                .map(existingTimeslot -> {
                    existingTimeslot.setDayOfWeek(updatedTimeslot.getDayOfWeek());
                    existingTimeslot.setStartTime(updatedTimeslot.getStartTime());
                    existingTimeslot.setEndTime(updatedTimeslot.getEndTime());
                    return timeslotRepository.save(existingTimeslot);
                })
                .orElse(null);
    }

    public boolean deleteTimeslot(Long id) {
        if (timeslotRepository.existsById(id)) {
            timeslotRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
