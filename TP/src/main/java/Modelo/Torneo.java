package Modelo;

import Controlador.Main;
import Modelo.Partido;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.util.ArrayList;

import java.util.Hashtable;


public class Torneo {
    private Hashtable<Integer, ArrayList<Partido>> partidos;

    public Torneo(Hashtable<Integer, ArrayList<Partido>> partidos){

        this.partidos = partidos;
    }

    public Hashtable<Integer, ArrayList<Partido>> ObtenerResultados(){
        return  this.partidos;
    }


}
