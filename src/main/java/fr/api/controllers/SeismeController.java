package fr.api.controllers;

import fr.api.configurations.SeismeConfiguration;
import fr.api.dtos.seisme.SeismeDTO;
import fr.api.dtos.seisme.SeismeDeleteDTO;
import fr.api.dtos.seisme.SeismeSaveDTO;
import fr.api.dtos.seisme.SeismeUpdateDTO;
import fr.api.services.SeismeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seisme")
public class SeismeController {
    SeismeConfiguration seismeConfiguration;
    private SeismeService seismeService;

    @GetMapping
    public List<SeismeDTO> findAll() {
        return seismeService.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<SeismeDTO> find(@PathVariable String id) {
        SeismeDTO seismeDTO = seismeService.findById(id);
        if (seismeDTO == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(seismeDTO);
    }

    @PostMapping
    public ResponseEntity<SeismeDTO> save(@RequestBody SeismeSaveDTO seismeSaveDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(seismeService.save(seismeSaveDTO));
    }

    @PutMapping
    public ResponseEntity<SeismeDTO> update(@RequestBody SeismeUpdateDTO seismeUpdateDTO) {
        return ResponseEntity.ok(seismeService.update(seismeUpdateDTO));
    }


    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestBody SeismeDeleteDTO seismeDeleteDTO) {
        seismeService.delete(seismeDeleteDTO);
        return ResponseEntity.ok(true);
    }

}
