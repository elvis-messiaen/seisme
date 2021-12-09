package fr.api.dtos.localisation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocalisationDTO {

    private String id;

    private String nom;

    private String code;

}
