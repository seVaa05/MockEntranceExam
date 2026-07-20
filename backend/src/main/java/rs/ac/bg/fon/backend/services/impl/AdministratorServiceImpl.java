package rs.ac.bg.fon.backend.services.impl;

import org.springframework.stereotype.Service;
import rs.ac.bg.fon.backend.dto.AdministratorDto;
import rs.ac.bg.fon.backend.dto.UserDto;
import rs.ac.bg.fon.backend.services.UserService;

import java.util.List;


@Service
public class AdministratorServiceImpl implements UserService<AdministratorDto> {

    @Override
    public AdministratorDto createUserDto(AdministratorDto userDto) {
        return null;
    }

    @Override
    public AdministratorDto getUserById(Long userId) {
        return null;
    }

    @Override
    public List<AdministratorDto> getAllUser() {
        return List.of();
    }

    @Override
    public AdministratorDto updateUser(Long userId, AdministratorDto updatedUser) {
        return null;
    }


    @Override
    public void deleteUser(Long employeeId) {

    }
}
