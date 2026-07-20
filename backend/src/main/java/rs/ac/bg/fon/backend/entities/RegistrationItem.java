package rs.ac.bg.fon.backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "RegistrationItem")
public class RegistrationItem {
    @EmbeddedId
    private RegistrationItemId id;

    @MapsId("registrationId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "registration_id", nullable = false)
    private Registration registration;

    @MapsId("termId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "term_id", nullable = false)
    private Term term;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;


}