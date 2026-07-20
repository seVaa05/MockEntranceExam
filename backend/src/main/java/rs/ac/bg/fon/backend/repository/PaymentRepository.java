package rs.ac.bg.fon.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.ac.bg.fon.backend.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
