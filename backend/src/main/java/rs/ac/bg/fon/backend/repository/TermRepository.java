package rs.ac.bg.fon.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.ac.bg.fon.backend.entities.Term;

public interface TermRepository extends JpaRepository<Term, Long> {
}
