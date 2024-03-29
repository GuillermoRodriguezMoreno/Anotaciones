package org.iesvdm.models;

/**
 * Clase Empleado
 */
public class Empleado {

    // Atributos

    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String direccion;
    protected String telefono;

    // Constructor

    public Empleado(){

    }

    public Empleado(String nombre, String apellido, String dni, String direccion, String telefono) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;

    }

// Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
