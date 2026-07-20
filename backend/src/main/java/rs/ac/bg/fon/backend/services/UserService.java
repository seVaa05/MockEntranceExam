package rs.ac.bg.fon.backend.services;

import rs.ac.bg.fon.backend.dto.UserDto;

import java.util.List;

public interface UserService<T extends UserDto> {
    T createUserDto(T userDto);
    T getUserById(Long userId);
    List<T> getAllUser();
    T updateUser(Long userId,T updatedUser);
    void deleteUser(Long employeeId);
}
