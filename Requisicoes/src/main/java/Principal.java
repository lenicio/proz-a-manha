import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);

//        System.out.print("Digite um cep para buscar: ");
        String cep = "38400126";

        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();



        Gson gson = new Gson();

        EnderecoDTO enderecoDTO = gson.fromJson(json, EnderecoDTO.class);
        Endereco endereco = new Endereco(enderecoDTO);

        System.out.println(endereco);





    }
}
