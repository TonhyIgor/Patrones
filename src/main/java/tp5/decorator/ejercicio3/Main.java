package tp5.decorator.ejercicio3;

import java.io.File;

public class Main {

    public static final String ARCHIVO_DEL_REPORTE = "/home/tonhy/reporte.txt";

    public static void main(String[] args) {
        String contenido = "Todo el reporte esta aca";
        var reporte = new Report(contenido);
        reporte.exportar(new File(ARCHIVO_DEL_REPORTE));
    }
}
