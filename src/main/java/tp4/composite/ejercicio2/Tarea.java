package tp4.composite.ejercicio2;

public class Tarea implements ItemDeTrabajo {
    private int horas;

    public Tarea(int horas) {
        this.horas = horas;
    }

    @Override
    public int tiempoTotal() {
        return this.horas;
    }
}
