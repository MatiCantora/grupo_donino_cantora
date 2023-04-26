package Modelo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PronosticoTest {
    public ArrayList<String> crearListadelPronostico(String local,String visitante, String resultado){
        ArrayList<String> lista = new ArrayList<>();
        lista.add(local);
        lista.add(visitante);
        lista.add(resultado);
        return lista;
    }
    @Test
    public void testCrearPronostico(){
        Pronostico p = new Pronostico(crearListadelPronostico("Argentina","Brazil","empate"));
        assertTrue("el pronostico ha sido creado",p != null);

    }

    @Test
    public void testResultadoPronostico(){
        Pronostico p = new Pronostico(crearListadelPronostico("Chile","Brazil","empate"));
        Pronostico p2 = new Pronostico(crearListadelPronostico("Chile","Brazil","Chile"));
        Pronostico p3 = new Pronostico(crearListadelPronostico("Chile","Brazil","Brazil"));

        assertTrue("el pronostico 1 ha sido creado",p != null);
        assertTrue("el pronostico 2 ha sido creado",p2 != null);
        assertTrue("el pronostico 3 ha sido creado",p3 != null);

        assertTrue("el pronostico  1 es el pronostico esperado",p.getPronostico().equals("empate"));
        assertTrue("el pronostico  2 es el pronostico esperado",p2.getPronostico().equals("Chile"));
        assertTrue("el pronostico  3 es el pronostico esperado",p3.getPronostico().equals("Brazil"));

    }

}