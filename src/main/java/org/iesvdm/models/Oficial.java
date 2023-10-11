package org.iesvdm.models;

/**
 * Operario tipo Oficial que tiene
 * asignado una categoria
 */
public class Oficial extends Operario{

    // Atributos

    private String categoria;

    // Constructor
    public Oficial(String nombre, String apellidos, String dni, String dir, String tlf) {

        super(nombre, apellidos, dni, dir, tlf);

    }

    // Getters y Setters

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
