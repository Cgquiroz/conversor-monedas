import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDivisa {
    String apiKey = "1854c8b67363fddbed2fc833";

    public Divisa convierteDivisa(String inicial,
                                  String deseada,
                                  double cantidad){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"
        +inicial+"/"+deseada+"/"+cantidad);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Divisa.class);
        }catch (Exception e){
            throw new RuntimeException("No encontre esta divisa.");
        }
    }
}
