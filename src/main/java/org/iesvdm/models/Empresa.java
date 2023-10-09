package org.iesvdm.models;

import org.iesvdm.anotaciones.Empleado;
import org.iesvdm.anotaciones.Empleados;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Empleado(nombre = "jose", apellidos = "Martin")
@Empleado(nombre = "Pedro", apellidos = "Rodriguez")
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

        Annotation[] anotaciones = empresa.getClass().getAnnotations();

        for (Annotation anotacion: anotaciones
             ) {

            if (anotacion instanceof Empleado){

                System.out.println(anotacion);

                String nombre = ((Empleado) anotacion).nombre();
                String apellido = ((Empleado) anotacion).apellidos();

                empresa.getEmpleadoSet().add(new org.iesvdm.models.Empleado(nombre, apellido));
            }
        }

    }



}
