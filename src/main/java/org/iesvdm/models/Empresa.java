package org.iesvdm.models;

import org.iesvdm.anotaciones.EmpleadoAnot;
import org.iesvdm.anotaciones.EmpleadosAnot;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Clase la cual contiene un conjunto de Empleado independientemente
 * de su tipo {@link ies.vdm.EmpresaTest test}
 */

// El value de EmpleadosAnot nos permite introducir anotaciones Empleados en vez de un array
// El default en EmpleadoAnot nos permite omitir valores
@EmpleadoAnot(nombre = "Jose", apellidos = "Martin", dni = "79039350L", direccion = "Fuengirola", telefono = "657456753", clase = "Directivo")
@EmpleadoAnot(nombre = "Juan", apellidos = "Fernandez", dni = "67039350J", direccion = "Mijas", telefono = "666456753", clase = "Tecnico")
@EmpleadoAnot(nombre = "Pedro", apellidos = "Rodriguez", dni = "23039350M", direccion = "Benalmadena", telefono = "795456753", clase = "Oficial")
public class Empresa {

    // Atributos

    Set<org.iesvdm.models.Empleado> empleadoSet = new HashSet<>();

    // Constructor

    /**
     * Contructor vacio
     */
    public Empresa(){

    }

    // Getter y Setter

    public Set<org.iesvdm.models.Empleado> getEmpleadoSet() {
        return empleadoSet;
    }

    // Metodos

    /**
     * Devuelve la informacion (nombre, dni y tipo)
     * del conjunto de empleados.Un Empleado por linea
     * @return String
     */
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

    /**
     * Haciendo uso de las Anotaciones EmpleadosAnot
     * y EmpleadoAnot nos permite instanciar Empleados
     * segun su tipo y agregarlos al conjundo de Empresa
     * @param empresa
     */
    public static void cargadorDeContexto(Empresa empresa){

        // Contenedor de anotaciones padre (conjunto anotaciones)
        // getAnnotation devuelve el array de EmpleadosAnot
        EmpleadosAnot empleadosAnotPadre = empresa.getClass().getAnnotation(EmpleadosAnot.class);

        // Array de anotaciones hijas EmpleadoAnot (Anotacion individual)
        EmpleadoAnot[] empleadoAnotHijos = empleadosAnotPadre.value();

        // Recorre array de anotaciones
        for (EmpleadoAnot empleadoAnotHijo: empleadoAnotHijos) {

            // Instancio empleado
            Empleado e = null;

            // Recojo valores de cada anotacion
            String nombre = empleadoAnotHijo.nombre();
            String apellidos = empleadoAnotHijo.apellidos();
            String dni = empleadoAnotHijo.dni();
            String dir = empleadoAnotHijo.direccion();
            String tlf = empleadoAnotHijo.telefono();
            String clase = empleadoAnotHijo.clase();

            // Instancion un tipo de empleado segun su clase
            if (clase.equalsIgnoreCase("directivo")){

                // Directivo
                e = new Directivo(nombre, apellidos, dni, dir, tlf);

            }

            else if (clase.equalsIgnoreCase("tecnico")) {

                // Tecnico
                e = new Tecnico(nombre, apellidos, dni, dir, tlf);

            }

            else if (clase.equalsIgnoreCase("oficial")) {

                // Oficial
                e = new Oficial(nombre, apellidos, dni, dir, tlf);

            }

            // Añado Empleado al set
            empresa.getEmpleadoSet().add(e);

        }

    }

}
