package tp4.template.ejercicio4;

public class CalculadorJubilado extends Calculador {
    private LogTransaction log;

    public CalculadorJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

/*    public double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        if (!of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal += precioProducto * 0.1;
        }
        //log.log(CalculadorJubilado.class.getName());
        return precioTotal;
    }*/

    @Override
    double calcularPrecioConMesPromocion(double precioProducto) {
        return precioProducto;
    }

    @Override
    double calcularPrecionSinMesPromocion(double precioProducto) {
        return precioProducto + (precioProducto * 0.1);
    }
}
