package rs.ac.bg.fon.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.ac.bg.fon.backend.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
