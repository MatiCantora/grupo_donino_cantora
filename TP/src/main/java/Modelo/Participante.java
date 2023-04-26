package Modelo;
public interface Participante {
    String getNombre();

    void setScore(int punto);

    int obtenerPuntaje();

    String festejoVictoria();

    String obtenerPronostico(String encuentro);
}
