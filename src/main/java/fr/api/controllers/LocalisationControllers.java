package fr.api.controllers;

import fr.api.dtos.localisation.LocalisationDTO;
import fr.api.dtos.localisation.LocalisationDeleteDTO;
import fr.api.dtos.localisation.LocalisationSaveDTO;
import fr.api.dtos.localisation.LocalisationUpdateDTO;
import fr.api.services.LocationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/localisation")
public class LocalisationControllers {
    public LocalisationControllers(LocationService locationService) {
        this.locationService = locationService;
    }

    private LocationService locationService;

    @GetMapping
    public List<LocalisationDTO> findAll() {
        return locationService.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<LocalisationDTO> find(@PathVariable String id) {
        LocalisationDTO locaDTO = locationService.findById(id);
        if (locaDTO == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(locaDTO);
    }

    @PostMapping
    public LocalisationDTO save(@RequestBody LocalisationSaveDTO localisationDTO) {
        return locationService.save(localisationDTO);
    }

    @PutMapping
    public ResponseEntity<LocalisationDTO> update(@RequestBody LocalisationUpdateDTO localisationDTO) {
        return ResponseEntity.ok(locationService.update(localisationDTO));
    }

    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestBody LocalisationDeleteDTO localisationDTO) {
        locationService.deleteById(localisationDTO);
        return ResponseEntity.ok(true);
    }
}




