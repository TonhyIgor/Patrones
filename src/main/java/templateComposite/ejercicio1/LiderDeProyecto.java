package templateComposite.ejercicio1;

import java.util.List;

public class LiderDeProyecto extends Empleado{
    List<Empleado> aCargo;

    protected LiderDeProyecto(double salario, List<Empleado> aCargo) {
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
