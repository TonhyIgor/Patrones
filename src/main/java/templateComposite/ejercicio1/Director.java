package templateComposite.ejercicio1;

import java.util.List;

public class Director extends Empleado{
    List<Empleado> aCargo;

    protected Director(double salario, List<Empleado> aCargo) {
        super(salario);
        this.aCargo = aCargo;
    }

    @Override
    double calcularSalarioTotal() {
        double salarioTotal = this.salario() + aCargo.stream()
                .mapToDouble(Empleado::calcularSalarioTotal)
                .sum();
        return salarioTotal;
    }
}
