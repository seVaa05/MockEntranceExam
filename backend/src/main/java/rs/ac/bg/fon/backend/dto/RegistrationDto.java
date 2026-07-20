package rs.ac.bg.fon.backend.dto;

import lombok.Getter;
import lombok.Setter;
import rs.ac.bg.fon.backend.enumeration.RegistrationStatus;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
public class RegistrationDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Long candidateId;
    private Instant createdAt;
    private BigDecimal totalCost;
    private RegistrationStatus status;
    private String referenceNumber;
    private Instant cancellationDate;
    private Instant paymentDeadline;
}
