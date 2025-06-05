package tp5.decorator.ejercicio4;

public class DefaultComboBuilder {
    private Combo combo;

    public DefaultComboBuilder(String descripcion, float precio) {
        this.combo = new DefaultCombo(descripcion, precio);
    }

    public DefaultComboBuilder conCarne() {
        this.combo = new ConCarne(this.combo);
        return this;
    }

    public DefaultComboBuilder conPapas() {
        this.combo = new ConPapas(this.combo);
        return this;
    }

    public DefaultComboBuilder conQueso() {
        this.combo = new ConQueso(this.combo);
        return this;
    }

    public DefaultComboBuilder conTomate() {
        this.combo = new ConTomate(this.combo);
        return this;
    }

    public Combo build() {
        return this.combo;
    }
}
