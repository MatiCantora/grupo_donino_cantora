package Modelo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class JugadorTest {

    private Jugador j1,j2;

    public ArrayList<String> crearListadelPornosticoJugador(String local, String visitante, String resultado){
        ArrayList<String> lista = new ArrayList<>();
        lista.add(local);
        lista.add(visitante);
        lista.add(resultado);
        return lista;
    }


    @Before
    public void crearJugadores(){
         j1 = new Jugador("Juan",crearListadelPornosticoJugador("Argentina","Peru","Peru"));
         j2 = new Jugador("Escobar",crearListadelPornosticoJugador("Argentina","Peru","Argentina"));
    }
    @Test
    public void testCrearJuagador(){
        assertTrue("El jugadar 1 ha sico creado correctamente",j1 != null);
        assertTrue("El jugadar 2 ha sico creado correctamente",j2 != null);
    }

    @Test
    public void testGetNombre() {
        assertTrue("El nombre del primer Jugardor es Juan",j1.getNombre().equals("Juan"));
        assertTrue("El nombre del segundo Jugardor es Escobar",j2.getNombre().equals("Escobar"));
    }

    @Test
    public void testGetScore() {
        j1.setScore(5);
        j2.setScore(6);
        assertEquals("El score del jugador 1 es lo esperado",5,j1.obtenerPuntaje());
        assertEquals("El score del jugador 2 es lo esperado",6,j2.obtenerPuntaje());

        j1.setScore(5);
        j2.setScore(6);
        assertEquals("El score del jugador 1 es lo esperado",10,j1.obtenerPuntaje());
        assertEquals("El score del jugador 2 es lo esperado",12,j2.obtenerPuntaje());
    }


    @Test
    public void testObtenerPronostico() {
        assertTrue("el pronostico del jugador 1 es Peru",j1.obtenerPronostico("Argentina-Peru").equals("Peru"));
        assertTrue("el pronostico del jugador 2 es Argentina",j2.obtenerPronostico("Argentina-Peru").equals("Argentina"));
        assertFalse("el pronostico del jugador 2 es Peru",j1.obtenerPronostico("Argentina-Peru").equals("Argentina"));
    }

    @Test
    public void testCargarPronosticos() {
        j1.cargarPronosticos(crearListadelPornosticoJugador("Brazil","Francia","Brazil"));
        j2.cargarPronosticos(crearListadelPornosticoJugador("Brazil","Francia","Francia"));

        assertTrue("el pronostico del jugador 1 es Peru por el partido Argentina-Peru",j1.obtenerPronostico
                ("Argentina-Peru").equals("Peru"));
        assertTrue("el pronostico del jugador 2 es Argentina por el partido Argentina-Peru",j2.obtenerPronostico
                ("Argentina-Peru").equals("Argentina"));
        assertFalse("el pronostico del jugador 2 es Peru por el partido Argentina-Peru",j1.obtenerPronostico
                ("Argentina-Peru").equals("Argentina"));

        assertTrue("el pronostico del jugador 1 es Brazil por el partido Brazil-Francia",j1.obtenerPronostico
                ("Brazil-Francia").equals("Brazil"));
        assertTrue("el pronostico del jugador 2 es Francia por el partido Brazil-Francia",j2.obtenerPronostico
                ("Brazil-Francia").equals("Francia"));
        assertFalse("el pronostico del jugador 2 es Brazil por el partido Brazil-Francia",j1.obtenerPronostico
                ("Brazil-Francia").equals("Francia"));
    }
}