package tp6.adapter.ejercicio1;

import java.util.List;

public class Main {
    public static final String PAIS = "Argentina";
    public static final String CIUDAD = "Viedma";

    public static void main(String[] args) {
        var clima = new WeatherChannelService(CIUDAD, PAIS);
        var medidor = new Medidor(clima, List.of(new ConsoleObserver(), new FileObserver()));
        medidor.leerTemperatura();
        //System.out.println(medidor.leerTemperatura());
    }
}
