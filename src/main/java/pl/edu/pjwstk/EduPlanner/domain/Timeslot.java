package pl.edu.pjwstk.EduPlanner.domain;

import ai.timefold.solver.core.api.domain.lookup.PlanningId;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import pl.edu.pjwstk.EduPlanner.rest.LocalTimeDeserializer;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Entity
@Table(name = "Timeslot")
public class Timeslot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "TimeslotID")
    @PlanningId
    private String id;

    @Column(name = "DayOfWeek")
    private DayOfWeek dayOfWeek;

    @Column(name = "StartTime")
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    private LocalTime startTime;

    @Column(name = "EndTime")
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    private LocalTime endTime;

    public Timeslot() {
    }

    public Timeslot(String id, DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.id = id;
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Timeslot(String id, DayOfWeek dayOfWeek, LocalTime startTime) {
        this(id, dayOfWeek, startTime, startTime.plusMinutes(45));
    }

    @Override
    public String toString() {
        return dayOfWeek + " " + startTime;
    }

    // ************************************************************************
    // Getters and setters
    // ************************************************************************

    public String getId() {
        return id;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}
