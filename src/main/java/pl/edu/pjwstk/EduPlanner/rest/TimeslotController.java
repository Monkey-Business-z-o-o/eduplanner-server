package pl.edu.pjwstk.EduPlanner.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.edu.pjwstk.EduPlanner.domain.Timeslot;
import pl.edu.pjwstk.EduPlanner.service.TimeslotService;

import java.util.List;

@Tag(name = "Timeslots", description = "Timeslots service.")
@RestController
@RequestMapping("/timeslots")
public class TimeslotController {

    private final TimeslotService timeslotService;

    @Autowired
    public TimeslotController(TimeslotService timeslotService) {
        this.timeslotService = timeslotService;
    }

    @GetMapping
    public List<Timeslot> getAllTimeslots() {
        return timeslotService.getAllTimeslots();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Timeslot> getTimeslotById(@PathVariable Long id) {
        Timeslot timeslot = timeslotService.getTimeslotById(id);
        if (timeslot != null) {
            return ResponseEntity.ok(timeslot);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Timeslot> createTimeslot(@RequestBody Timeslot timeslot) {
        Timeslot createdTimeslot = timeslotService.createTimeslot(timeslot);
        return ResponseEntity.ok(createdTimeslot);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Timeslot> updateTimeslot(@PathVariable Long id, @RequestBody Timeslot updatedTimeslot) {
        Timeslot timeslot = timeslotService.updateTimeslot(id, updatedTimeslot);
        if (timeslot != null) {
            return ResponseEntity.ok(timeslot);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTimeslot(@PathVariable Long id) {
        boolean deleted = timeslotService.deleteTimeslot(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
