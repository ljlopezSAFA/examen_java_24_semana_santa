package org.example.utilidades;

import org.example.enums.DiaSalida;
import org.example.enums.TipoCuota;
import org.example.modelos.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesSemanaSanta2 {

    /**
     * Ejercicio 1 (1 pt)
     * El método devuelve los títulares cuyo tipo es "Cristo" y que llevan realizados más de 10 años
     * es decir, su fecha de creación es anterior a 10 años desde la fecha actual.
     *
     * @param titulares
     * @return
     */
    public static List<Titular> getCristosconMasDe20Anyos(List<Titular> titulares){
        return new ArrayList<>();
    }


    /**
     * Ejercicio 2 (1 pt)
     *
     * A partir de una lista de hermandades te da los nazarenos que salen cada día, agrupando las hermandades
     * por su día de salida y sumando sus nazarenos.
     *
     * @param hermandades
     * @return
     */
    public static Map<DiaSalida, Integer> numNazarenosPorDia(List<Hermandad> hermandades){
        return new HashMap<>();
    }


    /**
     * Ejercico 3 (2 pts)
     *
     * A patir de una hermandad te da los 3 hermanos más jovenes (fecha nacimiento)
     * El maa contiene el hermano y su edad
     *
     * @param hermandad
     * @return
     */
    public static Map<Hermano,Integer> hermanosmasJovenes(Hermandad hermandad){
        return new HashMap<>();
    }



    /**
     * Ejercico 4 (2.5 pts)
     *
     * A Partir de una hermandad elige la junta de gobierno entre sus hermanos, para ello debe rellenar los datos de la
     * siguiente manera en la propia Junta de Gobierno.
     * - hermandad: la hermandad que se pasa como parámetro
     * - fechaInicioMandato: la fecha actual
     * - fechaFinMandato: la fecha actual + 500 días
     * - Map<CarjoJunta, Hermano> : tienes que rellenarlo con todos los cargo de Junta que hay en el enumerado, asignando
     *                              un hermano aleatorio de la hermandad (sin repetir)
     *                              y con la condición de que sea mayor de edad.
     *
     * @param hermandad
     * @return
     */
    public static JuntaGobierno elegirJuntaDeGobierno(Hermandad hermandad){
        return new JuntaGobierno();
    }



    /**
     * Ejercicio 5 (3.5 pts)
     * A partir de una hermandad devuelve el informe de la hermandad completo con los siguientes datos:
     * hermandad → La hermandad pasada como parámetro
     * totalHermanos → el número de hermanos que tiene la hermandad
     * totalTitulares → el número total de titulares que tiene la hermandad
     * totalPasos → el número total de pasos que tiene la hermandad
     * recaudacionCuotas → el dinero total de cuotas que recauda la hermandad se calcula multiplicando el número de hermanos por el importe de las cuotas, teniendo en cuenta que los menores de edad pagan la mitad.
     * musicosPorPaso → contiene de clave los pasos de la hermandad y de valor el total músicos que van en cada paso, cogiéndolo del total de músicos de la banda que va en el paso, si el paso no tiene banda tiene que poner 0.
     *
     * @param hermandad
     * @return
     */
    public static InformeHermandad informeHermandad(Hermandad hermandad){
        return null;
    }


}
