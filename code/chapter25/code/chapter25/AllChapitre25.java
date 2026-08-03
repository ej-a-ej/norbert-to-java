/**
 * CHAPITRE 25 — SERVEUR WEB
 */

import java.io.*;
import java.net.*;

public class LyaWebServer {
    private LyaAPI api;

    public LyaWebServer() {
        this.api = new LyaAPI();
    }

    public void start() {
        System.out.println("Lya Web Server on port 8080...");
        System.out.println("Try: http://localhost:8080/hello");
        System.out.println("Try: http://localhost:8080/orders");
        System.out.println("Try: http://localhost:8080/orders/1001");

        try (ServerSocket server = new ServerSocket(8080)) {
            System.out.println("Server ready.");
            while (true) {
                try (Socket client = server.accept()) {
                    BufferedReader reader = new BufferedReader(
                        new InputStreamReader(client.getInputStream())
                    );
                    String requestLine = reader.readLine();
                    if (requestLine == null) continue;
                    System.out.println("Request: " + requestLine);
                    String line;
                    while ((line = reader.readLine()) != null && !line.isEmpty()) {}
                    String response = handleRequest(requestLine);
                    OutputStream out = client.getOutputStream();
                    String httpResponse = "HTTP/1.1 200 OK\n" +
                                         "Content-Type: text/plain; charset=UTF-8\n" +
                                         "Content-Length: " + response.getBytes().length + "\n\n" +
                                         response;
                    out.write(httpResponse.getBytes());
                    System.out.println("Client disconnected.\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private String handleRequest(String requestLine) {
        String[] parts = requestLine.split(" ");
        if (parts.length < 2) return "Invalid request";
        String path = parts[1];
        if (path.equals("/") || path.equals("/hello")) {
            return "Hello! I'm Lya. How can I help you?";
        }
        if (path.equals("/orders")) {
            return api.getOrders();
        }
        if (path.matches("/orders/\\d+")) {
            int id = Integer.parseInt(path.substring(8));
            return api.getOrder(id);
        }
        if (path.startsWith("/weather/")) {
            String city = path.substring(9);
            return WeatherService.getWeather(city);
        }
        if (path.equals("/joke")) {
            return JokeService.getRandomJoke();
        }
        if (path.equals("/help")) {
            return "Commands:\n" +
                   "/hello\n" +
                   "/orders\n" +
                   "/orders/123\n" +
                   "/weather/Paris\n" +
                   "/joke\n" +
                   "/help";
        }
        return "Not found: " + path + "\nTry /help";
    }

    public static void main(String[] args) {
        LyaWebServer server = new LyaWebServer();
        server.start();
    }
}
