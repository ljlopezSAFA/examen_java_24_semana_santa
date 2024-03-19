package org.example.modelos;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"hermandad"})
@ToString(exclude = {"hermandad"})
public class InformeHermandad {
    private  Hermandad hermandad;
    private  Integer totalHermanos;
    private Integer totalTitulares;
    private Integer totalCostaleros;
    private Double recaudacionCuotas;
    private Integer totalPasos;
    private Map<Paso, Integer> costalerosPorPaso;
    private Map<Paso, Integer> pasoTotalFiguras;
    private Map<Paso, Integer> musicosPorPaso;

}
