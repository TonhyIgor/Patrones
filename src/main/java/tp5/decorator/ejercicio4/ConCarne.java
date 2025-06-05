package tp5.decorator.ejercicio4;

public class ConCarne implements Combo {
    public static final int ADICIONAL = 200;
    private Combo combo;

    public ConCarne(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String descripcion() {
        return this.combo.descripcion() + System.lineSeparator() + "+Carne";
    }

    @Override
    public float precio() {
        return this.combo.precio() + ADICIONAL;
    }
}
