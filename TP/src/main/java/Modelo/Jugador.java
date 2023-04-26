package Modelo;

import java.util.ArrayList;
import java.util.Hashtable;

public class Jugador implements Participante{
    private String nombre;
    private int puntaje;
    private Hashtable<String, Pronostico> pronosticos ;

    public Jugador(String nombre , ArrayList<String> lista){
        this.nombre = nombre;
        this.puntaje = 0;
        this.pronosticos = new Hashtable<>();
        this.cargarPronosticos(lista);

    }

    public String getNombre(){
        return  this.nombre;
    }

    public int obtenerPuntaje(){
        return  this.puntaje;
    }

    public String festejoVictoria() {
        return "Soy "+this.getNombre() + " tengo "+this.obtenerPuntaje()+" punto(s) Ganeee";
    }

    @Override
    public String obtenerPronostico(String encuentro) {
        return  pronosticos.containsKey(encuentro)? pronosticos.get(encuentro).getPronostico(): null;
    }

    public void setScore(int punto){
        this.puntaje += punto;
    }

    public void cargarPronosticos(ArrayList<String> lista){
        String partido = lista.get(0)+"-"+lista.get(1);
        pronosticos.put(partido,new Pronostico(lista));
    }


}
