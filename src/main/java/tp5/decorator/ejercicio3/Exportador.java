package tp5.decorator.ejercicio3;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Exportador implements Reporte {
    private String reporte;

    public Exportador(String reporte) {
        this.reporte = reporte;
    }

    @Override
    public void exportar(File file) {
        Path path = file.toPath();
        try {
            Files.write(path, Arrays.asList(this.reporte), StandardCharsets.UTF_8,
                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
        } catch (IOException e) {
            throw new RuntimeException("No se pudo crear o acceder al archivo.");
        }
    }
}
