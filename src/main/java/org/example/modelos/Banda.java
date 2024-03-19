package org.example.modelos;

import lombok.*;
import org.example.enums.TipoBanda;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Banda {
    private String nombre;
    private Integer numComponetes;
    private TipoBanda tipoBanda;
}
