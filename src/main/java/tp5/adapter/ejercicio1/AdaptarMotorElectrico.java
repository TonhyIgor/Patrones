package tp5.adapter.ejercicio1;

public class AdaptarMotorElectrico implements Motor {
    private MotorElectrico electrico;

    public AdaptarMotorElectrico(MotorElectrico electrico) {
        this.electrico = electrico;
    }

    @Override
    public String arrancar() {
        return this.electrico.conectarYActivar();
    }

    @Override
    public String acelerar() {
        return this.electrico.moverMasRapido();
    }

    @Override
    public String apagar() {
        return this.electrico.detener() + this.electrico.desconectar();
    }
}
