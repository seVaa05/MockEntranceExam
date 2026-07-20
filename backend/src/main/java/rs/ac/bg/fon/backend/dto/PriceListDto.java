package rs.ac.bg.fon.backend.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
public class PriceListDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Long examId;
    private BigDecimal price;
    private Instant startDate;
    private Instant endDate;
    private Boolean active;
}
