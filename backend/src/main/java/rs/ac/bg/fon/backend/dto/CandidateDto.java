package rs.ac.bg.fon.backend.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CandidateDto extends UserDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String jmbg;
    private String phone;
    private String address;

    public CandidateDto() {
    }

    public CandidateDto(Long id, String firstName, String lastName, String email,
                        String password, boolean active, String jmbg, String phone, String address) {
        super(id, firstName, lastName, email, password, active);
        this.jmbg = jmbg;
        this.phone = phone;
        this.address = address;
    }
}
