package org.iesvdm.anotaciones;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Empleados.class)
public @interface Empleado {

    // Campos
    String nombre();
    String apellidos();

}
