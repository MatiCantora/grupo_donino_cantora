package Modelo;

import java.util.ArrayList;

public class Pronostico {
    private String resultado,local, visitante;

    public Pronostico(ArrayList<String> partido){
        this.local = partido.get(0);
        this.visitante = partido.get(1);
        this.resultado = partido.get(2);
    }

    public String getPronostico(){
        return this.resultado;
    }

}
