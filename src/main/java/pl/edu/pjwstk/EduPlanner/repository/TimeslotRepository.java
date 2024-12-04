package pl.edu.pjwstk.EduPlanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.edu.pjwstk.EduPlanner.domain.Timeslot;

@RepositoryRestResource
public interface TimeslotRepository extends JpaRepository<Timeslot, String> {
}
