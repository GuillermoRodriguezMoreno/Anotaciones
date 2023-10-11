package org.iesvdm.models;

public class Oficial extends Operario{

    // Atributos

    private String categoria;

    // Constructor
    public Oficial(String nombre, String apellidos, String dni, String dir, String tlf, String clase) {

        super(nombre, apellidos, dni, dir, tlf, clase);

    }

    // Getters y Setters

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
