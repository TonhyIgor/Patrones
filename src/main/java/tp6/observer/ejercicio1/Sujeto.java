package tp6.observer.ejercicio1;

import java.util.List;

public abstract class Sujeto {
    private List<Observer> observadores;

    protected Sujeto(List<Observer> observadores) {
        this.observadores = observadores;
    }

    public void notificar(float data) {
        for (Observer observador : observadores) {
            observador.actualizar(data);
        }
    }
}
