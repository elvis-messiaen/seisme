package fr.api.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class Seisme {
    @Id
    private String id;

    private String nom;

    private String Magnitude;

    private Date date;
    @DBRef
    private List<Localisation> localisation;
}
