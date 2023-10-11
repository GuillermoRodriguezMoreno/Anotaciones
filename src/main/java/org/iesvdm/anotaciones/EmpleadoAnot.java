package org.iesvdm.anotaciones;

import java.lang.annotation.*;

/**
 * Anotacion con atributos de la clase Empleado,
 * la cual nos permitira instanciar diferentes
 * empleados mediante un cargador de contexto
 */
@Retention(RetentionPolicy.RUNTIME) // En tiempo de ejecucion
@Target(ElementType.TYPE)
@Repeatable(EmpleadosAnot.class)    // Repetible
public @interface EmpleadoAnot {

    String nombre();
    String apellidos();
    String dni();
    String direccion();
    String telefono();
    String clase();
    String codDespacho() default ""; // default para ominir valores no dados
    String codTaller() default "";
    String perfil() default "";
    String categoria() default "";

}
