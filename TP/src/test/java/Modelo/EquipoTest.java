package Modelo;

import static org.junit.Assert.*;
import  org.junit.Test;

public class EquipoTest {

    @Test
    public  void  TestCrearEquipo(){
        Equipo equipo1 = new Equipo("Barcelona","");
        Equipo equipo2 = new Equipo("River Plate","");
        assertTrue("El equipo1 esta Creado ",equipo1 != null);
        assertTrue("El equipo2 esta Creado ",equipo2 != null);
        assertTrue("El nombre del equipo1 es Barcelona",equipo1.getNombre().equals("Barcelona"));
        assertTrue("El nombre del equipo2  no es Boca",equipo2.getNombre().equals("River Plate"));
    }

}