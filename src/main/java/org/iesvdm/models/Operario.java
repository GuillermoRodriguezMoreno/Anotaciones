package org.iesvdm.models;

public class Operario extends Empleado{

    // Atributos

    protected String codTaller;

    // Constructor
    public Operario(String nombre, String apellidos, String dni, String dir, String tlf, String clase) {

        super(nombre, apellidos, dni, dir, tlf, clase);

    }

    // Getters y Setters

    public String getCodTaller() {
        return codTaller;
    }

    public void setCodTaller(String codTaller) {
        this.codTaller = codTaller;
    }
}
