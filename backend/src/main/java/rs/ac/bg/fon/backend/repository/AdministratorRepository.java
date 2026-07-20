package rs.ac.bg.fon.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.ac.bg.fon.backend.entities.Administrator;

public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
}
