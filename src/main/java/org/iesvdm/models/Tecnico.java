package org.iesvdm.models;

/**
 * Operario tipo ternico que
 * tiene asignado un perfil
 */
public class Tecnico extends Operario{

    // Atributos

    private String perfil;

    // Constructor
    public Tecnico(String nombre, String apellidos, String dni, String dir, String tlf) {

        super(nombre, apellidos, dni, dir, tlf);

    }

    // Getters y Setters

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
