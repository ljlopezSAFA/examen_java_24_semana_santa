package org.example.utilidades;

import org.example.enums.CargoJunta;
import org.example.enums.DiaSalida;
import org.example.enums.TipoCuota;
import org.example.modelos.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class UtilidadesSemanaSanta {

    /**
     * Ejercicio 1 (1 pt)
     *
     * @param hermandades
     * @param cuotaMaxima
     * @param tipoCuota
     * @return
     */
    public static List<Hermandad> hermandadesConCuota(List<Hermandad> hermandades, Double cuotaMaxima, TipoCuota tipoCuota) {
        return hermandades.
                stream().
                filter(h -> h.getTipoCuota().equals(tipoCuota) && h.getCuotaHermano() < cuotaMaxima)
                .toList();
    }


    /**
     * Ejercicio 2 (1 pt)
     *
     * @param hermandades
     * @return
     */
    public static Map<DiaSalida, Integer> numHermandadesPorDiaSalida(List<Hermandad> hermandades) {
        return hermandades
                .stream()
                .collect(Collectors.groupingBy(Hermandad::getDiaSalida, Collectors.summingInt(h -> 1)));
    }


    /**
     * Ejercico 3 (2 pts)
     *
     * @param hermandad
     * @return
     */
    public static Map<Hermano, Integer> hermanosConMayorAntiguedad(Hermandad hermandad) {
        return hermandad.getHermanos()
                .stream()
                .sorted(Comparator.comparing(Hermano::getFechaInscripcionHermandad)).toList().subList(0, 5)
                .stream()
                .collect(Collectors.toMap(h -> h, h -> Period.between(h.getFechaInscripcionHermandad(), LocalDate.now()).getYears()));
    }


    /**
     * Ejercico 4 (2.5  pts)
     *
     * @param hermandad
     * @return
     */
    public static JuntaGobierno elegirJuntaDeGobierno(Hermandad hermandad) {

        JuntaGobierno juntaGobierno = new JuntaGobierno();

        juntaGobierno.setHermandad(hermandad);
        juntaGobierno.setFechaInicioMandato(LocalDate.now());
        juntaGobierno.setFechaFinMandato(LocalDate.now().plusYears(4));

        List<Hermano> hermanosOrdenados = new ArrayList<>(hermandad.getHermanos());
        hermanosOrdenados.sort(Comparator.comparing(Hermano::getFechaInscripcionHermandad));

        Map<CargoJunta, Hermano> mapaFinal = new HashMap<>();

        for(CargoJunta c : CargoJunta.values()){
            mapaFinal.put(c, hermanosOrdenados.get(0));
            hermanosOrdenados.remove(0);

        }

        juntaGobierno.setPersonalJunta(mapaFinal);

        return juntaGobierno;
    }


    /**
     * Ejercicio 5 (3.5 pts)
     *
     * @param hermandad
     * @return
     */
    public static InformeHermandad informeHermandad(Hermandad hermandad) {

        InformeHermandad informeHermandad = new InformeHermandad();

        informeHermandad.setHermandad(hermandad);

        informeHermandad.setTotalHermanos(hermandad.getHermanos().size());
        informeHermandad.setTotalTitulares(hermandad.getTitulares().size());
        informeHermandad.setTotalPasos(hermandad.getPasos().size());


//        Integer totalCostaleros = 0;
//        Map<Paso, Integer> mapaCostaleros = new HashMap<>();
//        Map<Paso, Integer> mapaFiguras = new HashMap<>();
//
//        for(Paso p : hermandad.getPasos()){
//
//            //totalCostaleros
//            totalCostaleros += p.getNumCostaleros()* p.getNumCuadrillas();
//
//            //mapaCOstaleros
//            mapaCostaleros.put(p, p.getNumCostaleros()* p.getNumCuadrillas());
//
//            //mapaFiguras
//            mapaFiguras.put(p, p.getTitulares().size() + p.getNumFigurasSegundarias());
//
//        }
//
//        informeHermandad.setTotalCostaleros(totalCostaleros);
//        informeHermandad.setCostalerosPorPaso(mapaCostaleros);
//        informeHermandad.setPasoTotalFiguras(mapaFiguras);


          informeHermandad.setTotalCostaleros(
                  hermandad.getPasos()
                  .stream()
                  .mapToInt(p-> p.getNumCostaleros() * p.getNumCuadrillas())
                          .sum());


          informeHermandad.setCostalerosPorPaso(
                  hermandad.getPasos()
                          .stream().collect(Collectors.toMap(
                                  p-> p, //CLAVE
                                 p-> p.getNumCuadrillas() * p.getNumCostaleros() //VALORES
                          ))
          );



        informeHermandad.setPasoTotalFiguras(
                hermandad.getPasos().stream()
                        .collect(Collectors.toMap(
                                p->p,
                                p-> p.getNumFigurasSegundarias() + p.getTitulares().size()
                        ))
        );


        return informeHermandad;
    }


}
