package Modelo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Hashtable;

import static org.junit.Assert.*;

public class TorneoTest {
    Torneo t;

    /*
    @Before
    public void crearTorneo(){
        t = new Torneo(("../TP/src/test/resources/testResultados.csv");

    }

    ya no se usa este metodo, porque desligamos a torneo de cargar los archivos, ahora lo hace en el main

     */
    @Test
    public void testCrearTorneo(){
        assertTrue("El torneo ha sido creado",t != null);
        assertFalse("El torneo no es null ",t == null);
    }

    @Test
    public void testVerificarLosPatidos(){
        Hashtable<Integer, ArrayList<Partido>> partidos = t.ObtenerResultados();

        assertTrue("El torneo posee 1 ronda",partidos.containsKey(1));
        assertTrue("El torneo posee 2 rondas",partidos.containsKey(2));
        assertTrue("en la primero ronda se jugo Argentina - Brasil ",partidos.get(1).get(0).obtenerEquipos().equals("Argentina-Brasil"));
        assertTrue("en la segunda ronda se jugo Chile - Brasil ",partidos.get(2).get(0).obtenerEquipos().equals("Chile-Brasil"));
    }

}