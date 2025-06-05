package tp4.composite.ejercicio3;

public class Vida implements Seguro {
    private int costo;

    public Vida(int costo) {
        this.costo = costo;
    }

    @Override
    public double costoTotalSeguro() {
        return this.costo;
    }
}
