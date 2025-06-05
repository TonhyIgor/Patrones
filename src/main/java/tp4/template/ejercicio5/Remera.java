package tp4.template.ejercicio5;

public abstract class Remera {
    private float precio;

    protected Remera(float precio) {
        this.precio = precio;
    }

    public float precioFinal() {
        this.precio += recargo() + impuestoAduanero() + ganacia();
        this.precio -= bonificacion(this.precio);

        return this.precio;
    }

    protected abstract float bonificacion(float precio);

    protected abstract float ganacia();

    protected abstract float impuestoAduanero();

    protected abstract float recargo();
}
