package org.iesvdm.models;

/**
 * Tipo de Empleado que tiene
 * asignado un codigo de despacho
 */
public class Directivo extends Empleado{

    // Atributos

    private String codDespacho;

    // Costructor
    public Directivo(String nombre, String apellidos, String dni, String dir, String tlf) {

        super(nombre, apellidos, dni, dir, tlf);

    }

    // Getters y Setters

    public String getCodDespacho() {
        return codDespacho;
    }

    public void setCodDespacho(String codDespacho) {
        this.codDespacho = codDespacho;
    }
}
