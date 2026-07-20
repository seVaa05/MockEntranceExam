package rs.ac.bg.fon.backend.mapper;

import rs.ac.bg.fon.backend.dto.AdministratorDto;
import rs.ac.bg.fon.backend.entities.Administrator;

public class AdministratorMapper {
    public static AdministratorDto mapToAdministratorDto(Administrator administrator){
        return new AdministratorDto(
            administrator.getId(),
            administrator.getFirstName(),
            administrator.getLastName(),
            administrator.getEmail(),
            administrator.getPassword(),
            administrator.isActive(),
            administrator.getEmployeeNum());
    }

    public static Administrator mapToAdministrator(AdministratorDto administratorDto){
        return new Administrator(
            administratorDto.getId(),
            administratorDto.getFirstName(),
            administratorDto.getLastName(),
            administratorDto.getEmail(),
            administratorDto.getPassword(),
            administratorDto.isActive(),
            administratorDto.getEmployeeNum());
    }
}
