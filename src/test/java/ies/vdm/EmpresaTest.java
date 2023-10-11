package ies.vdm;

import org.iesvdm.models.*;
import org.junit.jupiter.api.*;

/**
 * Tests relacionados con la clase Empresa
 */
public class EmpresaTest {

    /**
     * Test que comprueba que el cargador
     * de contexto mediante Anotaciones
     * funciona correctamente e instancia los
     * tipos de empleados adecuadamente
     */
    @Test
    public void procesadorTest(){

        // Instancio empresa
        Empresa empresa = new Empresa();

        // Cargo los valores segun las anotaciones
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

                // La clase de empleado debe ser Directivo
                Assertions.assertInstanceOf(Directivo.class, empleado);

                // Incremento contador Directivo para posterior comprobacion
                ++nDirectivo;

            }

            // Tecnico
            else if (empleado instanceof Tecnico) {

                // La clase de empleado debe ser Tecnico
                Assertions.assertInstanceOf(Tecnico.class, empleado);

                ++nTecnico;

            }

            // Oficial
            else if (empleado instanceof Oficial) {

                // La clase de empleado debe ser Oficial
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
