package templateComposite.ejercicio1;

import java.util.List;

public class Gerente extends Empleado{
    List<Empleado> aCargo;

    protected Gerente(double salario, List<Empleado> aCargo) {
        super(salario);
        this.aCargo = aCargo;
    }

    @Override
    public double calcularSalarioTotal() {
        double salarioTotal = this.salario() + aCargo.stream()
                .mapToDouble(Empleado::calcularSalarioTotal)
                .sum();
        return salarioTotal;
    }
}
