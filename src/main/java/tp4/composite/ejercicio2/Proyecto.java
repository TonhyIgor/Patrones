package tp4.composite.ejercicio2;

import java.util.List;

public class Proyecto implements ItemDeTrabajo {
    private List<ItemDeTrabajo> items;

    public Proyecto(List<ItemDeTrabajo> items) {
        this.items = items;
    }

    @Override
    public int tiempoTotal() {
        return this.items.stream().mapToInt(ItemDeTrabajo::tiempoTotal).sum();
    }
}
