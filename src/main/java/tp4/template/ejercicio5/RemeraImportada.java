package tp4.template.ejercicio5;

public class RemeraImportada extends Remera {
    public RemeraImportada(float precio) {
        super(precio);
    }

    @Override
    protected float bonificacion(float precio) {
        return precio;
    }

    @Override
    protected float ganacia() {
        return 0.25f;
    }

    @Override
    protected float impuestoAduanero() {
        return 0.05f;
    }

    @Override
    protected float recargo() {
        return 0.03f;
    }
}
