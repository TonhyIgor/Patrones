package templeteComposite.ejercicio2;

import org.junit.jupiter.api.Test;
import tp4.composite.ejercicio2.HistoriaDeUsuario;
import tp4.composite.ejercicio2.Proyecto;
import tp4.composite.ejercicio2.Spike;
import tp4.composite.ejercicio2.Tarea;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testEjercicio2 {
    @Test
    void test01() {
        var spike1 = new Spike(10);
        var spike2 = new Spike(20);
        var tarea1 = new Tarea(50);
        var tarea2 = new Tarea(100);
        var tarea3 = new Tarea(150);
        var historia1 = new HistoriaDeUsuario(List.of(tarea1, tarea3));
        var historia2 = new HistoriaDeUsuario(List.of(tarea2));

        var proyecto = new Proyecto(List.of(spike1, spike2, historia1, historia2));

        assertEquals(330, proyecto.tiempoTotal());
    }
}
