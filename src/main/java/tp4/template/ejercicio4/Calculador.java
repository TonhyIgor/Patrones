package tp4.template.ejercicio4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {
    private int mesEnPromocion;

    protected Calculador(int mesEnPromocion) {
        this.mesEnPromocion = mesEnPromocion;
    }

    public double calcularPrecio(double precioProducto) {
        if (of(mesEnPromocion).equals(now().getMonth())) {
            return calcularPrecioConMesPromocion(precioProducto);
        }
        return calcularPrecionSinMesPromocion(precioProducto);
    }

    abstract double calcularPrecioConMesPromocion(double precioProducto);

    abstract double calcularPrecionSinMesPromocion(double precioProducto);
}
