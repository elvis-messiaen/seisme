package fr.api.dtos.seisme;

import fr.api.entities.Localisation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeismeUpdateDTO {

    private String id;

    private String nom;

    private String Magnitude;

    private Date date;

    private Localisation localisation;
}
