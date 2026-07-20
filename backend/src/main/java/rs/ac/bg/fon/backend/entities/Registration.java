package rs.ac.bg.fon.backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import rs.ac.bg.fon.backend.enumeration.RegistrationStatus;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "Registration")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "candidate_id", nullable = false)
    private Candidate candidate;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "total_cost", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalCost;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 30)
    private RegistrationStatus status;

    @Column(name = "reference_number", nullable = false, length = 100)
    private String referenceNumber;

    @Column(name = "cancellation_date")
    private Instant cancellationDate;

    @Column(name = "payment_deadline", nullable = false)
    private Instant paymentDeadline;


}
