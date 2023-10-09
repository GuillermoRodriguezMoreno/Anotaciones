package ies.vdm;

import org.iesvdm.models.Empresa;
import org.junit.jupiter.api.*;

public class EmpresaTest {

    @Test
    public void procesadorTest(){

        Empresa empresa = new Empresa();

        Empresa.cargadorDeContexto(empresa);


    }
}
