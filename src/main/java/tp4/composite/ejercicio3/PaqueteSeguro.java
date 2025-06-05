package tp4.composite.ejercicio3;

import java.util.List;

public class PaqueteSeguro implements Seguro {
    public static final double DESCUENTO_POR_SEGURO_INDIVIDUAL = 0.05;
    private List<Seguro> seguros;

    public PaqueteSeguro(List<Seguro> seguros) {
        this.seguros = seguros;
    }

    @Override
    public double costoTotalSeguro() {
        return seguros.stream().mapToDouble(Seguro::costoTotalSeguro).sum() - (seguros.size() * DESCUENTO_POR_SEGURO_INDIVIDUAL);
    }
}
