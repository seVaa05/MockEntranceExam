package rs.ac.bg.fon.backend.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AdministratorDto extends UserDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long employeeNum;
}
