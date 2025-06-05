package tp4.composite.ejercicio2;

import java.util.List;

public class HistoriaDeUsuario implements ItemDeTrabajo {
    private List<Tarea> tareas;

    public HistoriaDeUsuario(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    @Override
    public int tiempoTotal() {
        return tareas.stream().mapToInt(Tarea::tiempoTotal).sum();
    }
}
