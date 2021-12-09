package fr.api.services;

import fr.api.dtos.seisme.SeismeDTO;
import fr.api.dtos.seisme.SeismeDeleteDTO;
import fr.api.dtos.seisme.SeismeSaveDTO;
import fr.api.dtos.seisme.SeismeUpdateDTO;
import fr.api.entities.Seisme;
import fr.api.repositories.SeismeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SeismeService {
    SeismeRepository seismeRepository;
    ModelMapper mapper;

    public SeismeService(SeismeRepository seismeRepository, ModelMapper mapper) {
    }

    public List<SeismeDTO> findAll() {
        List<SeismeDTO> seismeDTOS = new ArrayList<>();
        this.seismeRepository.findAll().forEach(seisme -> {
            seismeDTOS.add(mapper.map(seisme, SeismeDTO.class));
        });
        return seismeDTOS;
    }

    public SeismeDTO findById(String id) {
        Optional<Seisme> s = seismeRepository.findById(id);
        SeismeDTO seismeDTO = null;
        if (s.isPresent()) {
            seismeDTO = mapper.map(s, SeismeDTO.class);
        }
        return seismeDTO;
    }

    public SeismeDTO save(SeismeSaveDTO seismeDTO) {
        Seisme seismeSave = mapper.map(
                seismeDTO,
                Seisme.class
        );
        Seisme seisme = seismeRepository.save(seismeSave);
        SeismeDTO seismesaved = mapper.map(seisme, SeismeDTO.class);
        return seismesaved;
    }

    public SeismeDTO update(SeismeUpdateDTO sei) {
        Seisme seismeUpdate = mapper.map(
                sei,
                Seisme.class
        );
        Seisme seisme = seismeRepository.save(seismeUpdate);
        SeismeDTO seismeSaved = mapper.map(seisme, SeismeDTO.class);
        return seismeSaved;
    }

    public void delete (SeismeDeleteDTO sei){
        Seisme seisme = mapper.map(
                sei,
                Seisme.class
        );
        seismeRepository.delete(seisme);
    }

}

















