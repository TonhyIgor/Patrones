package tp4.composite.ejercicio3;

public class Hogar implements Seguro {
    private int costo;

    public Hogar(int costo) {
        this.costo = costo;
    }

    @Override
    public double costoTotalSeguro() {
        return this.costo;
    }
}
