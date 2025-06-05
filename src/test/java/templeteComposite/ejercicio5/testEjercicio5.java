package templeteComposite.ejercicio5;

import org.junit.jupiter.api.Test;
import tp4.template.ejercicio5.RemeraImportada;
import tp4.template.ejercicio5.RemeraNacional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testEjercicio5 {
    @Test
    void testPrecioRemeraImportada() {
        var importada = new RemeraImportada(100);
        assertEquals(133.75002F, importada.precioFinal(), 00.1);
    }

    @Test
    void testPrecioRemeraNacional() {
        var nacional = new RemeraNacional(100);
        assertEquals(136.27502F, nacional.precioFinal(), 00.1);
    }
}
