package tp5.decorator.ejercicio4;

public class ConTomate implements Combo {
    public static final int ADICIONAL = 100;
    private Combo combo;

    public ConTomate(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String descripcion() {
        return this.combo.descripcion() + System.lineSeparator() + "+Tomate";
    }

    @Override
    public float precio() {
        return this.combo.precio() + ADICIONAL;
    }
}
