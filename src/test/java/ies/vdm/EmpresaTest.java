package ies.vdm;

import org.iesvdm.models.*;
import org.junit.jupiter.api.*;

public class EmpresaTest {

    @Test
    public void procesadorTest(){

        Empresa empresa = new Empresa();

        Empresa.cargadorDeContexto(empresa);

        // Contadores
        int nDirectivo = 0;
        int nTecnico = 0;
        int nOficial = 0;

        // Tamaño empresa igual a 3
        Assertions.assertEquals(3, empresa.getEmpleadoSet().size());

        // Recorrer el set y ver que las clases son correctas
        for (Empleado empleado:empresa.getEmpleadoSet()
             ) {

            // Directivo
            if(empleado instanceof Directivo){

                Assertions.assertInstanceOf(Directivo.class, empleado);

                ++nDirectivo;

            }

            // Tecnico
            else if (empleado instanceof Tecnico) {

                Assertions.assertInstanceOf(Tecnico.class, empleado);

                ++nTecnico;

            }

            // Oficial
            else if (empleado instanceof Oficial) {

                Assertions.assertInstanceOf(Oficial.class, empleado);

                ++nOficial;
            }

        }

        // Numero directivo debe ser 1
        Assertions.assertEquals(1, nDirectivo);

        // Numero tecnico debe ser 1
        Assertions.assertEquals(1, nTecnico);

        // Numero oficial debe ser 1
        Assertions.assertEquals(1, nOficial);

    }
}
