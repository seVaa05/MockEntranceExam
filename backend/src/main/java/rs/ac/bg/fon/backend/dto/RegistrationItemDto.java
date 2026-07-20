package rs.ac.bg.fon.backend.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class RegistrationItemDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long registrationId;
    private Long termId;
    private BigDecimal price;
}
