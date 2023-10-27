import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpStatusChecker {
    private static final String URL = "https://http.cat/";
    private static final HttpClient CLIENT = HttpClient.newHttpClient();

    public String getStatusImage(int code){
        String requestUrl = URL + code + ".jpg";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(requestUrl))
                .GET()
                .build();
        HttpResponse<String> response;
        try {
            response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (response.statusCode() == 200){
            return requestUrl;
        }else{
            throw new IllegalArgumentException();
        }
    }
}
