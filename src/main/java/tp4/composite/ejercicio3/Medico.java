package tp4.composite.ejercicio3;

public class Medico implements Seguro {
    private int costo;

    public Medico(int costo) {
        this.costo = costo;
    }

    @Override
    public double costoTotalSeguro() {
        return this.costo;
    }
}
