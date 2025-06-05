package tp5.adapter.ejercicio1;

public class MotorEconomico implements Motor {
    @Override
    public String arrancar() {
        return "El motor arranco gastando poco";
    }

    @Override
    public String acelerar() {
        return "El motor acelero economicamente";
    }

    @Override
    public String apagar() {
        return "El motor se apago y gasto poco";
    }
}
