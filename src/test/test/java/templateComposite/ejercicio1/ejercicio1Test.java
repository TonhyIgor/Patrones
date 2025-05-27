package templateComposite.ejercicio1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ejercicio1Test {
    @Test
    void test01(){
        var regular1 = new Regular(1000);
        var regular2 = new Regular(1000);
        var regular3 = new Regular(1000);
        List<Empleado> listaRegular1 = List.of(regular1, regular2);
        List<Empleado> listaRegular2 = List.of(regular3);

        var liderProyecto1 = new LiderDeProyecto(2000, listaRegular1);
        var liderProyecto2 = new LiderDeProyecto(2000, listaRegular2);
        List<Empleado> listaLiderProyecto = List.of(liderProyecto1, liderProyecto2);

        var mandoMedio1 = new MandoMedio(3000, listaLiderProyecto);
        List<Empleado> listaMandoMedio = List.of(mandoMedio1);

        var gerente1 = new Gerente(4000, listaMandoMedio);
        var gerente2 = new Gerente(4000, List.of());
        List<Empleado> listaGerente = List.of(gerente1, gerente2);

        var director = new Director(5000, listaGerente);

        assertEquals(23000, director.calcularSalarioTotal());
    }
}
