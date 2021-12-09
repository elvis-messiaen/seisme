package fr.api.configurations;

import fr.api.repositories.SeismeRepository;
import fr.api.services.SeismeService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeismeConfiguration {

/*    @Bean
    public SeismeService seismeService (
            SeismeRepository seismeRepository,
            ModelMapper mapper){
        return new SeismeService(seismeRepository,mapper);
    }*/
}
