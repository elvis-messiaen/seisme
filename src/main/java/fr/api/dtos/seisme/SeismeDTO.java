package fr.api.dtos.seisme;

import fr.api.entities.Localisation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeismeDTO {

    private String id;

    private String nom;

    private String Magnitude;

    private Date date;

    private Localisation localisation;
}
