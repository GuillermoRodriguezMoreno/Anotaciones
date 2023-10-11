package org.iesvdm.models;

/**
 * Empleado tipo Operario que
 * tiene asignado un codigo de taller
 */
public class Operario extends Empleado{

    // Atributos

    protected String codTaller;

    // Constructor
    public Operario(String nombre, String apellidos, String dni, String dir, String tlf) {

        super(nombre, apellidos, dni, dir, tlf);

    }

    // Getters y Setters

    public String getCodTaller() {
        return codTaller;
    }

    public void setCodTaller(String codTaller) {
        this.codTaller = codTaller;
    }
}
