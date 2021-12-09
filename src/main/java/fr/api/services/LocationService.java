package fr.api.services;

import fr.api.dtos.localisation.LocalisationDTO;
import fr.api.dtos.localisation.LocalisationDeleteDTO;
import fr.api.dtos.localisation.LocalisationSaveDTO;
import fr.api.dtos.localisation.LocalisationUpdateDTO;
import fr.api.entities.Localisation;
import fr.api.repositories.LocalisationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class LocationService {
    LocalisationRepository localisationRepository;
    ModelMapper mapper;

    public LocationService(LocalisationRepository localisationRepository, ModelMapper mapper) {
    }

    public List<LocalisationDTO> findAll() {
        List<LocalisationDTO> loca = new ArrayList<>();
        localisationRepository.findAll().forEach(localisation -> {
            loca.add(mapper.map(localisation, LocalisationDTO.class));
        });
        return loca;
    }
    public LocalisationDTO save(LocalisationSaveDTO loca){
        Localisation l = this.localisationRepository.save(this.mapper.map(loca,Localisation.class));
        return this.mapper.map(l,LocalisationDTO.class);
    }

    public LocalisationDTO findById(String id) {
        LocalisationDTO loca = null;
        Optional<Localisation> optionalLocalisation = this.localisationRepository.findById(id);
        if (optionalLocalisation.isPresent()) {
            Localisation localisation = optionalLocalisation.get();
            loca = mapper.map(localisation,LocalisationDTO.class);
        }
        return loca;
    }

    public LocalisationDTO update(LocalisationUpdateDTO loca){
        Localisation locaSave = mapper.map(loca,Localisation.class);

        Localisation locaSaving = localisationRepository.save(locaSave);
        LocalisationDTO locaRetour = mapper.map(locaSaving,LocalisationDTO.class);
        return  locaRetour;
     }

     public void deleteById (LocalisationDeleteDTO loca){
        Localisation locaSave = mapper.map(
                loca,
                Localisation.class
        );
        localisationRepository.deleteById(locaSave);
     }
}
