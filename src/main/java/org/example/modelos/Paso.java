package org.example.modelos;


import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Paso {
    private List<Titular> titulares;
    private Integer numFigurasSegundarias;
    private Integer numCostaleros;
    private Integer numCuadrillas;
    private Integer orden;
    private Banda banda;
}
