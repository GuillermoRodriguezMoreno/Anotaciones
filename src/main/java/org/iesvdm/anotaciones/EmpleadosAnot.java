package org.iesvdm.anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anotacion que contiene el conjunto
 * de anotacines EmpleadoAnot
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface EmpleadosAnot {

    // Array de anotaciones empleado
    // value para que acepte el tipo EmpleadoAnot
    EmpleadoAnot[]value();

}
