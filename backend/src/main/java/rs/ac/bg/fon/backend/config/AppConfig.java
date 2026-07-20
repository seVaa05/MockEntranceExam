package rs.ac.bg.fon.backend.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import rs.ac.bg.fon.backend.services.impl.CandidateServiceImpl;

@Configuration
@ComponentScan("rs.ac.bg.fon.backend")
public class AppConfig {

    @Bean
    public CandidateServiceImpl getCandidateService(){
        return new CandidateServiceImpl();
    }
}
