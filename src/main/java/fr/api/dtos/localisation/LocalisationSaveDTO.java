package fr.api.dtos.localisation;

import fr.api.entities.Seisme;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocalisationSaveDTO {

    private String nom;

    private String code;

}
