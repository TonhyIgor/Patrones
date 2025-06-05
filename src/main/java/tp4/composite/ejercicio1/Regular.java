package tp4.composite.ejercicio1;

public class Regular extends Empleado {
    public Regular(double salario) {
        super(salario);
    }

    @Override
    public double calcularSalarioTotal() {
        return this.salario();
    }
}
