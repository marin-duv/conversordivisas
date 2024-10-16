import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Moneda buscaMoneda(String tipoMoneda){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/21a020703c4aff37a2f14ef8/latest/"+tipoMoneda+"/");
        //para comprobar direccion se imprime -por defecto desactivado
        //System.out.println(direccion);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Moneda moneda = new Gson().fromJson(response.body(),Moneda.class);
            if (!moneda.result().equals("success")){
                throw new RuntimeException("Error en la API" + moneda.result());
            }
            return moneda;
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener datos del API  "+
                    "Ejemplo: para Dolar Americano escribe: USD \n");
        }
    }
}

