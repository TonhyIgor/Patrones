package tp5.decorator.ejercicio4;

public class ConPapas implements Combo {
    public static final int ADICIONAL = 100;
    private Combo combo;

    public ConPapas(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String descripcion() {
        return this.combo.descripcion() + System.lineSeparator() + "+Papas";
    }

    @Override
    public float precio() {
        return this.combo.precio() + ADICIONAL;
    }
}
