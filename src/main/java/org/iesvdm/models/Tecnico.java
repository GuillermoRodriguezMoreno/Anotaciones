package org.iesvdm.models;

public class Tecnico extends Operario{

    // Atributos

    private String perfil;

    // Constructor
    public Tecnico(String nombre, String apellidos, String dni, String dir, String tlf, String clase) {

        super(nombre, apellidos, dni, dir, tlf, clase);

    }

    // Getters y Setters

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
