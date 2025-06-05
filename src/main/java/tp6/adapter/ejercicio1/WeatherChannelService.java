package tp6.adapter.ejercicio1;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

public class WeatherChannelService implements ClimaOnline {
    private String ciudad;
    private String pais;

    public WeatherChannelService(String ciudad, String pais) {
        this.ciudad = ciudad;
        this.pais = pais;
    }

    private Optional<JsonObject> consultarAPI() {
        String apiKEY = "36f496a939c106627192dba16a2e64a7";
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + this.ciudad + "," +
                this.pais + "&units=metric&APPID=" + apiKEY;

        //se crea el cliente http
        HttpClient cliente = HttpClient.newHttpClient();

        //se crea la consulta con la url generada y se especifica que sea de tipo GET
        HttpRequest consulta = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        try {
            // Enviar petición y obtener respuesta como String
            HttpResponse<String> response = cliente.send(consulta, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                JsonObject objetoPrincipal = JsonParser.parseString(response.body()).getAsJsonObject();
                return Optional.of(objetoPrincipal.getAsJsonObject("main"));
            } else {
                //System.out.println("Error HTTP: " + response.statusCode());
                return Optional.empty();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private float aObtener(String filtro) {
        var objeto = consultarAPI();
        if (objeto.isPresent()) {
            return objeto.get().get(filtro).getAsFloat();
        } else {
            throw new RuntimeException("El dato fue vacio");
        }
    }

    @Override
    public float temperatura() {
        //int temp = new Random().nextInt(100);
        //return temp + " c";
        return aObtener("temp");
    }
}
