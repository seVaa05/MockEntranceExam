package rs.ac.bg.fon.backend.mapper;

import rs.ac.bg.fon.backend.dto.CandidateDto;
import rs.ac.bg.fon.backend.entities.Candidate;

public class CandidateMapper {
    public static CandidateDto mapToCandidateDto(Candidate candidate){
        return new CandidateDto(
            candidate.getId(),
            candidate.getFirstName(),
            candidate.getLastName(),
            candidate.getEmail(),
            candidate.getPassword(),
            candidate.isActive(),
            candidate.getJmbg(),
            candidate.getPhone(),
            candidate.getAddress());
    }

    public static Candidate mapToCandidate(CandidateDto candidateDto){
        return new Candidate(
            candidateDto.getId(),
            candidateDto.getFirstName(),
            candidateDto.getLastName(),
            candidateDto.getEmail(),
            candidateDto.getPassword(),
            candidateDto.isActive(),
            candidateDto.getJmbg(),
            candidateDto.getPhone(),
            candidateDto.getAddress());
    }
}
