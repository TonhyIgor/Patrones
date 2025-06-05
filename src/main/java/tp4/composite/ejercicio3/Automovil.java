package tp4.composite.ejercicio3;

public class Automovil implements Seguro {
    private int costo;

    public Automovil(int costo) {
        this.costo = costo;
    }

    @Override
    public double costoTotalSeguro() {
        return this.costo;
    }
}
