package tp6.observer.ejercicio1;

import java.util.List;

public class Medidor extends Sujeto {
    private float temperatura;
    private ClimaOnline clima;

    public Medidor(ClimaOnline clima, List<Observer> observadores) {
        super(observadores);
        this.clima = clima;
    }

    public void leerTemperatura() {
        //leo la temperatura del servicio web
        this.temperatura = this.clima.temperatura();
        this.notificar(this.temperatura);
    }
}
