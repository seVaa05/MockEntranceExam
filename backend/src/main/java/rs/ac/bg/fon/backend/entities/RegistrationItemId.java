package rs.ac.bg.fon.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class RegistrationItemId implements Serializable {
    private static final long serialVersionUID = 5599905863342564632L;
    @Column(name = "registration_id", nullable = false)
    private Long registrationId;

    @Column(name = "term_id", nullable = false)
    private Long termId;


}