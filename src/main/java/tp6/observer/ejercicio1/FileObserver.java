package tp6.observer.ejercicio1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Arrays;

public class FileObserver implements Observer {
    private void archivo(float data) {
        final Path path = Paths.get("/home/tonhy/temperatura.txt");
        String registro = data + " || " + LocalDate.now();
        try {
            Files.write(path, Arrays.asList(registro), StandardCharsets.UTF_8,
                    Files.exists(path) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
        } catch (IOException e) {
            throw new RuntimeException("No se pudo crear o acceder al archivo.");
        }
    }

    @Override
    public void actualizar(float data) {
        archivo(data);
    }
}
