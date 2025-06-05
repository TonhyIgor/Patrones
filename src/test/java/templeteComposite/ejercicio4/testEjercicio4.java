package templeteComposite.ejercicio4;

import org.junit.jupiter.api.Test;
import tp4.template.ejercicio4.CalculadorJubilado;
import tp4.template.ejercicio4.CalculadorNoJubilado;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testEjercicio4 {
    @Test
    void testJubiladoEnMesPromocion() {
        var jubilado = new CalculadorJubilado(5);
        assertEquals(100, jubilado.calcularPrecio(100));
    }

    @Test
    void testJubiladoSinMesPromocion() {
        var jubilado = new CalculadorJubilado(8);
        assertEquals(110, jubilado.calcularPrecio(100));
    }

    @Test
    void testNoJubiladoEnMesPromocion() {
        var noJubilado = new CalculadorNoJubilado(5);
        assertEquals(115, noJubilado.calcularPrecio(100));
    }

    @Test
    void testNoJubiladoSinMesPromocion() {
        var noJubilado = new CalculadorNoJubilado(8);
        assertEquals(121, noJubilado.calcularPrecio(100));
    }
}
