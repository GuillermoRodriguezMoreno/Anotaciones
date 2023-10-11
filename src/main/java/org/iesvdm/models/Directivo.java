package org.iesvdm.models;

public class Directivo extends Empleado{


    // Atributos

    private String codDespacho;

    // Costructor
    public Directivo(String nombre, String apellidos, String dni, String dir, String tlf, String clase) {

        super(nombre, apellidos, dni, dir, tlf, clase);

    }

    // Getters y Setters

    public String getCodDespacho() {
        return codDespacho;
    }

    public void setCodDespacho(String codDespacho) {
        this.codDespacho = codDespacho;
    }
}
