package rs.ac.bg.fon.backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import rs.ac.bg.fon.backend.enumeration.TermStatus;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "Term")
public class Term {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "exam_id", nullable = false)
    private Exam exam;

    @Column(name = "starts_at", nullable = false)
    private Instant startsAt;

    @Column(name = "address", nullable = false, length = 100)
    private String address;

    @Column(name = "capacity", nullable = false)
    private Integer capacity;

    @Column(name = "registration_deadline", nullable = false)
    private Instant registrationDeadline;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 30)
    private TermStatus status;


}
