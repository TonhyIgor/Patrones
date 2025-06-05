package tp4.composite.ejercicio1;

import java.util.List;

public class EmpleadosConCargo extends Empleado {
    List<Empleado> empleados;

    public EmpleadosConCargo(double salario, List<Empleado> empleados) {
        super(salario);
        this.empleados = empleados;
    }

    @Override
    public double calcularSalarioTotal() {
        return this.salario() + empleados.stream()
                .mapToDouble(Empleado::calcularSalarioTotal)
                .sum();
    }
}
