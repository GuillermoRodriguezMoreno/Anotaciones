package org.iesvdm;

import org.iesvdm.models.Empresa;
import org.iesvdm.models.Empleado;
public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        Empresa.cargadorDeContexto(empresa);

        System.out.println(empresa);

    }
}