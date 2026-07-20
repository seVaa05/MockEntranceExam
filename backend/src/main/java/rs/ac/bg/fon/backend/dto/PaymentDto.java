package rs.ac.bg.fon.backend.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
public class PaymentDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Long registrationId;
    private Long administratorId;
    private BigDecimal amount;
    private Instant paymentDate;
    private Instant recordedAt;
    private String transactionReference;
    private String note;
}
