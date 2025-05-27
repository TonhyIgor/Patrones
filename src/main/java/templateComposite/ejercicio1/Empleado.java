package templateComposite.ejercicio1;

public abstract class Empleado {
    private final double salario;

    protected Empleado(double salario) {
        this.salario = salario;
    }

    protected double salario(){
        return this.salario;
    }

    abstract double calcularSalarioTotal();
}
