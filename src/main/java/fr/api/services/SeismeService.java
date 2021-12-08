package fr.api.services;

import fr.api.repositories.SeismeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class SeismeService {

    public SeismeService(SeismeRepository seismeRepository, ModelMapper mapper) {
    }
}
