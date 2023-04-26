package Modelo;

import Controlador.ErrorException;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Partido {
    private String local;
    private String visitante;
    private  int golesLocal;
    private int golesVisitante;
    private String resultado;
    private String empate = "empate";
    private Equipo equipoLocal, equipoVisitante;

    public  Partido (ArrayList<String> listaPartido) throws ErrorException{
        equipoLocal = new Equipo(listaPartido.get(0),"" );
        equipoVisitante = new Equipo(listaPartido.get(1),"" );

        if(Integer.parseInt(listaPartido.get(2)) < 0){
            throw new ErrorException();
        }
        this.golesLocal = Integer.parseInt(listaPartido.get(2));//puede fallar

        if(Integer.parseInt(listaPartido.get(3)) < 0){
            throw new ErrorException();
        }
        this.golesVisitante = Integer.parseInt(listaPartido.get(3));//puede fallar

    }


    public String getEquipoLocalNombre() {
        return this.equipoLocal.getNombre();
    }

    public String getEquipoVisitanteNombre() {
        return this.equipoVisitante.getNombre();
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }


    public String obtenerResultado() {

        if( this.getGolesLocal() > this.getGolesVisitante()){
            return this.getEquipoLocalNombre();
        }
        else if( this.getGolesLocal() < this.getGolesVisitante()){
            return this.getEquipoVisitanteNombre();
        }
        return this.empate;
    }


    public  String obtenerPartido(){
        String resultado = this.obtenerResultado();
        String noEmpate = "Local: " + this.getEquipoLocalNombre() + "; " + "Visitante: " + this.getEquipoVisitanteNombre() +"; " + "Resultado: " + this.golesLocal + "-" + this.golesVisitante;

        if (resultado.equals(this.empate)){
            noEmpate += " hubo empate!";

        }else{
            noEmpate += " Ganador: " + resultado;
        }
        return noEmpate;

    }

    public String obtenerEquipos(){
        return this.getEquipoLocalNombre()+"-"+this.getEquipoVisitanteNombre();
    }

}