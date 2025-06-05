package tp5.decorator.ejercicio4;

import static java.lang.System.lineSeparator;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        var combo1 = new ConCarne(new ConPapas(new ConTomate(new DefaultCombo("Combo basico", 100))));
        out.println(combo1.descripcion());
        out.println(combo1.precio());

        var combo2 = new ConQueso(new ConTomate(new ConPapas(new ConCarne(new DefaultCombo("Combo familiar", 100)))));
        out.println(lineSeparator() + combo2.descripcion());
        out.println(combo2.precio());

        var comboBuilder = new DefaultComboBuilder("Combo especial", 100)
                .conTomate()
                .conPapas()
                .conQueso()
                .conCarne()
                .build();
        out.println(lineSeparator() + comboBuilder.descripcion());
        out.println(comboBuilder.precio());
    }
}
