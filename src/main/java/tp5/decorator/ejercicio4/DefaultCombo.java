package tp5.decorator.ejercicio4;

public class DefaultCombo implements Combo {
    private String descripcion;
    private float precio;

    protected DefaultCombo(String descripcion, float precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String descripcion() {
        return this.descripcion;
    }

    @Override
    public float precio() {
        return this.precio;
    }
}
