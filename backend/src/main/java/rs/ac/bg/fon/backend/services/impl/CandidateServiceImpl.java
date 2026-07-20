package rs.ac.bg.fon.backend.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import rs.ac.bg.fon.backend.dto.CandidateDto;
import rs.ac.bg.fon.backend.entities.Candidate;
import rs.ac.bg.fon.backend.repository.CandidateRepository;
import rs.ac.bg.fon.backend.services.UserService;

import java.util.List;

@Service
public class CandidateServiceImpl {

    private final CandidateRepository candidateRepository;

    public CandidateServiceImpl( CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public Candidate save(){
        candidateRepository.save(new Candidate());
        return null;
    }

    public void delete(Long candidateId){
        candidateRepository.deleteById(candidateId);
    }

    public List<Candidate> findAll(){
        return candidateRepository.findAll();
    }

}
