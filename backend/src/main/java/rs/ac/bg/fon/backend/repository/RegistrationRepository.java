package rs.ac.bg.fon.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.ac.bg.fon.backend.entities.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
