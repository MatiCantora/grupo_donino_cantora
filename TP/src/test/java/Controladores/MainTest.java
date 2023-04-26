package Controladores;

import Controlador.PronosticosResultado;
import Modelo.Torneo;
import org.junit.Before;
import org.junit.Test;


import static Controlador.Main.ListaPartidos;
import static Controlador.Main.ListaJugadores;
import static org.junit.Assert.*;

public class MainTest {

    Torneo t;
    PronosticosResultado juego;

    @Before
    public void crearTorneo(){
        t  = new Torneo(ListaPartidos("../TP/src/test/resources/testPartidosMain.csv"));
        assertTrue("Vamos a comprobar si el archivo contiene datos.", t.ObtenerResultados().isEmpty());
    }

    @Before
    public void crearPronostico(){
       juego = new PronosticosResultado(t,ListaJugadores("../TP/src/test/resources/testPronosticosMain.csv"));
       assertTrue("Vamos a comprobar si el archivo contiene datos.", juego.getJugadores().isEmpty());
    }

    @Test
    public void testMain(){

    }


}