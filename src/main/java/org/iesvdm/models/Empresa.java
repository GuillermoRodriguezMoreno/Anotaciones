package org.iesvdm.models;

import org.iesvdm.anotaciones.EmpleadoAnot;
import org.iesvdm.anotaciones.EmpleadosAnot;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@EmpleadoAnot(nombre = "jose", apellidos = "Martin")
@EmpleadoAnot(nombre = "Pedro", apellidos = "Rodriguez")
public class Empresa {

    // Atributos

    Set<org.iesvdm.models.Empleado> empleadoSet = new HashSet<>();

    // Constructor
    public Empresa(){

    }

    // Getter y Setter


    public Set<org.iesvdm.models.Empleado> getEmpleadoSet() {
        return empleadoSet;
    }

    // Cargador de contexto
    public static void cargadorDeContexto(Empresa empresa){

        EmpleadosAnot empleadosAnotPadre = empresa.getClass().getAnnotation(EmpleadosAnot.class);

        EmpleadoAnot[] empleadoAnotHijos = empleadosAnotPadre.value();

        for (EmpleadoAnot empleadoAnotHijo: empleadoAnotHijos
             ) {

                String nombre = empleadoAnotHijo.nombre();
                String apellidos = empleadoAnotHijo.apellidos();

                empresa.getEmpleadoSet().add(new Empleado(nombre, apellidos));

        }

    }

}
