package tp5.decorator.ejercicio4;

public class ConQueso implements Combo {
    public static final int ADICIONAL = 50;
    private Combo combo;

    public ConQueso(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String descripcion() {
        return this.combo.descripcion() + System.lineSeparator() + "+Queso";
    }

    @Override
    public float precio() {
        return this.combo.precio() + ADICIONAL;
    }
}
