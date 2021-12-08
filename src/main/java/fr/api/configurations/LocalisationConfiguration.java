package fr.api.configurations;

import fr.api.repositories.LocalisationRepository;
import fr.api.services.LocationService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalisationConfiguration {
    @Bean
    public LocationService locationService (
            LocalisationRepository localisationRepository,
            ModelMapper mapper){
        return new LocationService(localisationRepository,mapper);
    }

}
