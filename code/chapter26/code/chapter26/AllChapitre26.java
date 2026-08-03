/**
 * CHAPITRE 26 — MULTITHREADING
 */

import java.io.*;
import java.net.*;

class ClientHandler implements Runnable {
    private Socket client;
    private LyaAPI api;

    public ClientHandler(Socket client, LyaAPI api) {
        this.client = client;
        this.api = api;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("[" + threadName + "] Processing client...");
        try (client) {
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(client.getInputStream())
            );
            String requestLine = reader.readLine();
            if (requestLine == null) return;
            System.out.println("[" + threadName + "] Request: " + requestLine);
            String response = handleRequest(requestLine);
            OutputStream out = client.getOutputStream();
            String httpResponse = "HTTP/1.1 200 OK\n" +
                                 "Content-Type: text/plain; charset=UTF-8\n" +
                                 "Content-Length: " + response.getBytes().length + "\n\n" +
                                 response;
            out.write(httpResponse.getBytes());
            System.out.println("[" + threadName + "] Client disconnected.\n");
        } catch (IOException e) {
            System.out.println("[" + threadName + "] Error: " + e.getMessage());
        }
    }

    private String handleRequest(String requestLine) {
        String[] parts = requestLine.split(" ");
        if (parts.length < 2) return "Invalid request";
        String path = parts[1];
        if (path.equals("/") || path.equals("/hello")) {
            return "Hello! I'm Lya. (Served by " + Thread.currentThread().getName() + ")";
        }
        if (path.equals("/orders")) {
            return api.getOrders();
        }
        if (path.startsWith("/weather/")) {
            String city = path.substring(9);
            return WeatherService.getWeather(city);
        }
        return "Not found: " + path;
    }
}

class MultithreadedServer {
    private LyaAPI api;
    private int clientCount;

    public MultithreadedServer() {
        this.api = new LyaAPI();
        this.clientCount = 0;
    }

    public void start() {
        System.out.println("Lya Multithreaded Server on port 8080...");
        System.out.println("Multiple clients can connect simultaneously!");
        try (ServerSocket server = new ServerSocket(8080)) {
            System.out.println("Server ready.\n");
            while (true) {
                Socket client = server.accept();
                clientCount++;
                System.out.println("Client #" + clientCount + " connected!");
                ClientHandler handler = new ClientHandler(client, api);
                Thread thread = new Thread(handler);
                thread.setName("Client-" + clientCount);
                thread.start();
                System.out.println("Thread " + thread.getName() + " started.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        MultithreadedServer server = new MultithreadedServer();
        server.start();
    }
}
