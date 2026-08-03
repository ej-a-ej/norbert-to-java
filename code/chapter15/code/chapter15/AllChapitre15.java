/**
 * CHAPITRE 15 — VALIDATION
 */

public class ValidationException extends Exception {
    public ValidationException(String message) {
        super(message);
    }
}

class EmptyRequestException extends ValidationException {
    public EmptyRequestException() {
        super("Request cannot be empty.");
    }
}

class RequestTooLongException extends ValidationException {
    public RequestTooLongException(int maxLength) {
        super("Request cannot exceed " + maxLength + " characters.");
    }
}

import java.util.ArrayList;
import java.util.HashMap;

class LyaV8 {
    private static final int MAX_REQUEST_LENGTH = 200;
    private String name;
    private String version;
    private HashMap<String, String> responses;
    private ArrayList<String> history;

    public LyaV8() {
        this.name = "Lya";
        this.version = "0.5";
        this.responses = new HashMap<>();
        this.history = new ArrayList<>();
        initializeDefaultResponses();
    }

    private void initializeDefaultResponses() {
        responses.put("hello", "Hello! How can I help you?");
        responses.put("hi", "Hi there! What can I do for you?");
        responses.put("help", "I can answer simple questions.");
        responses.put("goodbye", "Goodbye! See you later!");
    }

    private void validateRequest(String request) throws ValidationException {
        if (request == null) {
            throw new ValidationException("Request cannot be null.");
        }
        String trimmed = request.trim();
        if (trimmed.isEmpty()) {
            throw new EmptyRequestException();
        }
        if (trimmed.length() > MAX_REQUEST_LENGTH) {
            throw new RequestTooLongException(MAX_REQUEST_LENGTH);
        }
        if (!trimmed.matches("^[a-zA-Z0-9\\s.,!?'-]+$")) {
            throw new ValidationException("Request contains invalid characters.");
        }
    }

    public void respond(String request) throws ValidationException {
        validateRequest(request);
        System.out.println("Processing: " + request);
    }

    public void learn(String request, String response) throws ValidationException {
        validateRequest(request);
        validateRequest(response);
        responses.put(request.toLowerCase().trim(), response);
        System.out.println("Learned: " + request + " -> " + response);
    }
}
