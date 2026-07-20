package rs.ac.bg.fon.backend.services.impl;

import org.springframework.stereotype.Service;
import rs.ac.bg.fon.backend.dto.CandidateDto;
import rs.ac.bg.fon.backend.services.UserService;

import java.util.List;

@Service
public class CandidateServiceImpl implements UserService<CandidateDto> {

    @Override
    public CandidateDto createUserDto(CandidateDto userDto) {
        return null;
    }

    @Override
    public CandidateDto getUserById(Long userId) {
        return null;
    }

    @Override
    public List<CandidateDto> getAllUser() {
        return List.of();
    }

    @Override
    public CandidateDto updateUser(Long userId, CandidateDto updatedUser) {
        return null;
    }

    @Override
    public void deleteUser(Long employeeId) {

    }
}
