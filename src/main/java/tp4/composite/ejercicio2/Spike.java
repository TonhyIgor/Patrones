package tp4.composite.ejercicio2;

public class Spike implements ItemDeTrabajo {
    private int horas;

    public Spike(int horas) {
        this.horas = horas;
    }

    @Override
    public int tiempoTotal() {
        return this.horas;
    }
}
