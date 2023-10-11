package org.iesvdm;

import org.iesvdm.models.Empresa;
import org.iesvdm.models.Empleado;
public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        Empresa.cargadorDeContexto(empresa);

        for (Empleado empleado : empresa.getEmpleadoSet()
             ) {

            System.out.println(empleado.getNombre());

        }
    }
}