package rs.ac.bg.fon.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.ac.bg.fon.backend.entities.Candidate;


public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
