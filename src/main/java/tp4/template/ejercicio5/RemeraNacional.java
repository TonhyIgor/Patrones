package tp4.template.ejercicio5;

public class RemeraNacional extends Remera {
    public RemeraNacional(float precio) {
        super(precio);
    }

    @Override
    protected float bonificacion(float precio) {
        return 0.2f;
    }

    @Override
    protected float ganacia() {
        return 0.15f;
    }

    @Override
    protected float impuestoAduanero() {
        return 0;
    }

    @Override
    protected float recargo() {
        return 0.015f;
    }
}
