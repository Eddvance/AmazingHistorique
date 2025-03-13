package io.eddvance.practice.amazing_historique.entity.historique;

public class Historique {

    private int nombre;
    private String langue;
    //private date

    public Historique(int nombre, String langue) {
        this.nombre = nombre;
        this.langue = langue;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }
}
