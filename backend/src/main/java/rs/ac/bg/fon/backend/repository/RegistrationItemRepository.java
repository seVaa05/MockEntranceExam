package rs.ac.bg.fon.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.ac.bg.fon.backend.entities.RegistrationItem;
import rs.ac.bg.fon.backend.entities.RegistrationItemId;

public interface RegistrationItemRepository extends JpaRepository<RegistrationItem, RegistrationItemId> {
}
