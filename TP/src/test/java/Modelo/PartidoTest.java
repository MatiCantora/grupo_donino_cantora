package Modelo;

import Controlador.ErrorException;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PartidoTest {

    public ArrayList<String>  crearListaEncuentro(String local, String visitante, String golesLocal,String golesVisitante){
        ArrayList<String> encuentro = new ArrayList<>();
        encuentro.add(local);encuentro.add(visitante);encuentro.add(golesLocal);encuentro.add(golesVisitante);
        return  encuentro;
    }
    @Test
    public  void TestCrearPartido() throws ErrorException {
        Partido partido1 = new Partido(crearListaEncuentro("Argentina","Chile","1","0"));
        Partido partido2 = new Partido(crearListaEncuentro("Argentina","Chile","1","0"));
        assertTrue("El partido 1 ha sido creado",partido1 != null);
        assertTrue("El partido 2 ha sido creado",partido2 != null);
    }

    @Test
    public void TestVerificarDatosDelPartido() throws ErrorException {
        Partido partido1 = new Partido(crearListaEncuentro("Francia","Chile","1","0"));
        Partido partido2 = new Partido(crearListaEncuentro("Brazil","Chile","1","0"));

        assertTrue("El equipo Local del primer encuentro es Francia",partido1.getEquipoLocalNombre().equals("Francia"));
        assertTrue("El equipo Local del segundo encuentro es Brazil",partido2.getEquipoLocalNombre().equals("Brazil"));

        assertTrue("El equipo visitante del primer encuentro es Chile",partido1.getEquipoVisitanteNombre().equals("Chile"));
        assertTrue("El equipo visitante del segundo encuentro es Chile",partido2.getEquipoVisitanteNombre().equals("Chile"));

        assertTrue("El equipo Local del primer encuentro marco 1 gol",partido1.getGolesLocal() == 1);
        assertTrue("El equipo Visitante del primer encuentro marco 0 gol",partido1.getGolesVisitante() == 0);

        assertTrue("El equipo Local del segundo encuentro marco 1 gol",partido1.getGolesLocal() == 1);
        assertTrue("El equipo Visitante del segundo encuentro marco 0 gol",partido1.getGolesVisitante() == 0);
    }



}