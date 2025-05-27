package templateComposite.ejercicio1;

public class Regular extends Empleado{
    protected Regular(double salario) {
        super(salario);
    }

    @Override
    public double calcularSalarioTotal() {
        return this.salario();
    }
}
