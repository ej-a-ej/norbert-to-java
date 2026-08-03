/**
 * CHAPITRE 13 — APPLICATION COMPLÈTE
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LyaV7 {
    private String name;
    private String version;
    private HashMap<String, String> responses;
    private ArrayList<String> history;

    public LyaV7() {
        this.name = "Lya";
        this.version = "0.1";
        this.responses = new HashMap<>();
        this.history = new ArrayList<>();
        responses.put("hello", "Hello! How can I help you?");
        responses.put("hi", "Hi there! What can I do for you?");
        responses.put("who are you", "I'm Lya, an assistant built by Norbert.");
        responses.put("help", "I can answer simple questions. Try saying 'hello'.");
        responses.put("thanks", "You're welcome!");
        responses.put("goodbye", "Goodbye! See you later!");
    }

    public void greet() {
        System.out.println("=== LYA ASSISTANT ===");
        System.out.println("Hello, I'm " + name + ".");
        System.out.println("Version " + version);
        System.out.println("Ask me something, or type 'quit' to stop.");
    }

    public void respond(String request) throws EmptyRequestException {
        if (request == null || request.trim().isEmpty()) {
            throw new EmptyRequestException("Request cannot be empty.");
        }
        history.add("User: " + request);
        String cleanRequest = request.toLowerCase().trim();
        String response = responses.get(cleanRequest);
        if (response != null) {
            System.out.println("Lya: " + response);
            history.add("Lya: " + response);
        } else {
            System.out.println("Lya: I don't understand that yet.");
            System.out.println("Lya: You can teach me with 'learn [request] | [response]'");
            history.add("Lya: I don't understand that yet.");
        }
    }

    public void learn(String request, String response) throws EmptyRequestException {
        if (request == null || request.trim().isEmpty()) {
            throw new EmptyRequestException("Request cannot be empty.");
        }
        if (response == null || response.trim().isEmpty()) {
            throw new EmptyRequestException("Response cannot be empty.");
        }
        String cleanRequest = request.toLowerCase().trim();
        responses.put(cleanRequest, response);
        System.out.println("Lya learned: '" + request + "' -> '" + response + "'");
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No history yet.");
            return;
        }
        System.out.println("--- Conversation History ---");
        for (String entry : history) {
            System.out.println(entry);
        }
        System.out.println("--- End of History ---");
    }

    public void showKnownResponses() {
        if (responses.isEmpty()) {
            System.out.println("I don't know any responses yet.");
            return;
        }
        System.out.println("--- Known Responses ---");
        for (String key : responses.keySet()) {
            System.out.println(key + " -> " + responses.get(key));
        }
        System.out.println("--- End of Responses ---");
    }

    public void displayStatus() {
        System.out.println("--- Lya Status ---");
        System.out.println("Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Known responses: " + responses.size());
        System.out.println("History entries: " + history.size());
    }
}

class LyaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LyaV7 lya = new LyaV7();
        lya.greet();
        boolean running = true;
        while (running) {
            System.out.print("\nYou: ");
            String input = scanner.nextLine().trim();
            try {
                if (input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("exit")) {
                    running = false;
                    System.out.println("Lya: Goodbye!");
                    break;
                }
                if (input.equalsIgnoreCase("history")) {
                    lya.showHistory();
                    continue;
                }
                if (input.equalsIgnoreCase("knowledge")) {
                    lya.showKnownResponses();
                    continue;
                }
                if (input.equalsIgnoreCase("status")) {
                    lya.displayStatus();
                    continue;
                }
                if (input.toLowerCase().startsWith("learn ")) {
                    String content = input.substring(6);
                    String[] parts = content.split("\\|");
                    if (parts.length == 2) {
                        lya.learn(parts[0].trim(), parts[1].trim());
                    } else {
                        System.out.println("Usage: learn [request] | [response]");
                        System.out.println("Example: learn hello | Hello there!");
                    }
                    continue;
                }
                lya.respond(input);
            } catch (EmptyRequestException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please type something.");
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }
        scanner.close();
        System.out.println("Lya: See you next time!");
    }
}
