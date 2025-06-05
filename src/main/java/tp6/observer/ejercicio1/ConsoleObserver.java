package tp6.observer.ejercicio1;

public class ConsoleObserver implements Observer {
    private Medidor medidor;

    /*public ConsoleObserver(Medidor medidor) {
        this.medidor = medidor;
    }*/

    @Override
    public void actualizar(float data) {
        if (data < 12) {
            System.out.println("Hace frio, se encenderá la caldera");
        }
        if (data > 17) {
            System.out.println("Hace calor, se encenderá el aire acondicionado");
        }
    }
}
