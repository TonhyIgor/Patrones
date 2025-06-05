package tp5.adapter.ejercicio1;

public class MotorComun implements Motor {
    @Override
    public String arrancar() {
        return "El motor arranco normal";
    }

    @Override
    public String acelerar() {
        return "El motor acelero";
    }

    @Override
    public String apagar() {
        return "El motor se apago";
    }
}
