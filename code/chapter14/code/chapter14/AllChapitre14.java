/**
 * CHAPITRE 14 — RECONNAISSANCE
 * À ajouter dans LyaV7
 */

import java.util.ArrayList;
import java.util.HashMap;

public class LyaV7WithFindResponse {
    private String name;
    private String version;
    private HashMap<String, String> responses;
    private ArrayList<String> history;

    public LyaV7WithFindResponse() {
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

    private String findResponse(String request) {
        String cleaned = request.toLowerCase().trim();
        if (responses.containsKey(cleaned)) {
            return responses.get(cleaned);
        }
        String[] words = cleaned.split(" ");
        for (String word : words) {
            if (responses.containsKey(word)) {
                return responses.get(word);
            }
        }
        if (cleaned.contains("who") || cleaned.contains("what")) {
            return "I can tell you about myself, but I don't know much yet.";
        }
        if (cleaned.contains("why")) {
            return "I'm still learning how to answer 'why' questions.";
        }
        if (cleaned.contains("how")) {
            return "I can explain simple things, but I need more training.";
        }
        if (cleaned.contains("where")) {
            return "I don't know much about places yet.";
        }
        if (cleaned.contains("when")) {
            return "I don't have a good sense of time yet.";
        }
        return null;
    }

    public void respond(String request) throws EmptyRequestException {
        if (request == null || request.trim().isEmpty()) {
            throw new EmptyRequestException("Request cannot be empty.");
        }
        history.add("User: " + request);
        String response = findResponse(request);
        if (response != null) {
            System.out.println("Lya: " + response);
            history.add("Lya: " + response);
        } else {
            System.out.println("Lya: I don't understand that yet.");
            System.out.println("Lya: You can teach me with 'learn [request] | [response]'");
            history.add("Lya: I don't understand that yet.");
        }
    }
}
