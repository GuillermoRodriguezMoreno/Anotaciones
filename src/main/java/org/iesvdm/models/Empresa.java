package org.iesvdm.models;

import org.iesvdm.anotaciones.EmpleadoAnot;
import org.iesvdm.anotaciones.EmpleadosAnot;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@EmpleadoAnot(nombre = "Jose", apellidos = "Martin", dni = "79039350L", direccion = "Fuengirola", telefono = "657456753", clase = "Directivo")
@EmpleadoAnot(nombre = "Juan", apellidos = "Fernandez", dni = "67039350J", direccion = "Mijas", telefono = "666456753", clase = "Tecnico")
@EmpleadoAnot(nombre = "Pedro", apellidos = "Rodriguez", dni = "23039350M", direccion = "Benalmadena", telefono = "795456753", clase = "Oficial")
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

    // Metodos


    @Override
    public String toString() {

        String resultado = "";

        for (Empleado empleado: this.getEmpleadoSet()
             ) {

            resultado = resultado + empleado.getNombre() + " " + empleado.getDni() + " " + empleado.getClass().getSimpleName() + "\n";

        }

        return resultado;

    }

    // Cargador de contexto
    public static void cargadorDeContexto(Empresa empresa){

        EmpleadosAnot empleadosAnotPadre = empresa.getClass().getAnnotation(EmpleadosAnot.class);

        EmpleadoAnot[] empleadoAnotHijos = empleadosAnotPadre.value();

        for (EmpleadoAnot empleadoAnotHijo: empleadoAnotHijos
             ) {

                Empleado e = null;

                String nombre = empleadoAnotHijo.nombre();
                String apellidos = empleadoAnotHijo.apellidos();
                String dni = empleadoAnotHijo.dni();
                String dir = empleadoAnotHijo.direccion();
                String tlf = empleadoAnotHijo.telefono();
                String clase = empleadoAnotHijo.clase();

                if (clase.equalsIgnoreCase("directivo")){

                    e = new Directivo(nombre, apellidos, dni, dir, tlf);

                }

                else if (clase.equalsIgnoreCase("tecnico")) {

                    e = new Tecnico(nombre, apellidos, dni, dir, tlf);

                }

                else if (clase.equalsIgnoreCase("oficial")) {

                    e = new Oficial(nombre, apellidos, dni, dir, tlf);

                }

            empresa.getEmpleadoSet().add(e);

        }

    }

}
