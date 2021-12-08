package fr.api.dtos;

import fr.api.entities.Localisation;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class SeismeDTO {
    @Id
    private String id;

    private String nom;

    private String Magnitude;

    private Date date;
    @DBRef
    private List<Localisation> localisation;
}
