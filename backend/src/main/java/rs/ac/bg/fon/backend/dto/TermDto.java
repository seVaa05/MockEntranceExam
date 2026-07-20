package rs.ac.bg.fon.backend.dto;

import lombok.Getter;
import lombok.Setter;
import rs.ac.bg.fon.backend.enumeration.TermStatus;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
public class TermDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Long examId;
    private Instant startsAt;
    private String address;
    private Integer capacity;
    private Instant registrationDeadline;
    private TermStatus status;
}
