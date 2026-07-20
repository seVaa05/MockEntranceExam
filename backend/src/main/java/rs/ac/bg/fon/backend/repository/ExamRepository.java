package rs.ac.bg.fon.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.ac.bg.fon.backend.entities.Exam;

public interface ExamRepository extends JpaRepository<Exam, Long> {
}
