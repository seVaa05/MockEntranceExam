package rs.ac.bg.fon.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class AdministratorDto extends UserDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long employeeNum;

    public AdministratorDto() {
    }

    public AdministratorDto(Long id, String firstName, String lastName, String email,
                            String password, boolean active, Long employeeNum) {
        super(id, firstName, lastName, email, password, active);
        this.employeeNum = employeeNum;
    }
}
