package tp4.template.ejercicio4;

public class CalculadorNoJubilado extends Calculador {
    private LogTransaction log;

    public CalculadorNoJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

/*    public double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        if (of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal += precioProducto * 0.15;
        } else {
            precioTotal += precioProducto * 0.21;
        }
        //log.log(CalculadorNoJubilado.class.getName());
        return precioTotal;
    }*/

    @Override
    double calcularPrecioConMesPromocion(double precioProducto) {
        return precioProducto + (precioProducto * 0.15);
    }

    @Override
    double calcularPrecionSinMesPromocion(double precioProducto) {
        return precioProducto + (precioProducto * 0.21);
    }
}
