package fr.api.controllers;

import fr.api.configurations.SeismeConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seisme")
public class SeismeController {
    SeismeConfiguration seismeConfiguration;

}
