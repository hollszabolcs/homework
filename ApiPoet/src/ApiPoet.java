import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiPoet {
    public static void main(String[] args) throws IOException, InterruptedException {
        final var uri = URI.create("https://poetrydb.org/author,title/Edgar%20Allan%20Poe;The%20Raven");
        final var client = HttpClient.newHttpClient();
        final var request = HttpRequest
                .newBuilder()
                .uri(uri)
                .GET()
                .build();
        final var response = client.send(
                request, HttpResponse.BodyHandlers.ofString()
        );
        System.out.println("req "+ request);
        System.out.println("resp "+ response.body());
    }
}