package tp5.decorator.ejercicio3;

import java.io.File;

public class Report implements Reporte {
    private String reporte;

    public Report(String reporte) {
        this.reporte = reporte;
    }

/*    void export(File file) {
// Exportar el reporte a un archivo.
    }*/

    @Override
    public void exportar(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
        /*Path path = file.toPath();
        try {
            Files.write(path, Arrays.asList(this.reporte), StandardCharsets.UTF_8,
                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
        } catch (IOException e) {
            throw new RuntimeException("No se pudo crear o acceder al archivo.");
        }*/
    }
}
