package fr.api.entities;

import fr.api.entities.Seisme;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Localisation {
    @Id
    private String id;

    private String nom;

    private String code;
    @DBRef
    private Seisme seisme;

}
