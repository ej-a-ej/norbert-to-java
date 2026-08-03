/**
 * CHAPITRE 20 — PERSISTANCE
 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class LyaStorage {
    private static final String RESPONSES_FILE = "lya_responses.txt";
    private static final String HISTORY_FILE = "lya_history.txt";
    private static final String STATUS_FILE = "lya_status.txt";

    public static void saveResponses(HashMap<String, String> responses) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(RESPONSES_FILE))) {
            for (String key : responses.keySet()) {
                writer.println(key + "|||" + responses.get(key));
            }
            System.out.println("Responses saved.");
        } catch (IOException e) {
            System.out.println("Error saving responses: " + e.getMessage());
        }
    }

    public static HashMap<String, String> loadResponses() {
        HashMap<String, String> responses = new HashMap<>();
        File file = new File(RESPONSES_FILE);
        if (!file.exists()) {
            return responses;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(RESPONSES_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|\\|\\|");
                if (parts.length == 2) {
                    responses.put(parts[0], parts[1]);
                }
            }
            System.out.println("Responses loaded: " + responses.size() + " entries.");
        } catch (IOException e) {
            System.out.println("Error loading responses: " + e.getMessage());
        }
        return responses;
    }

    public static void saveHistory(ArrayList<String> history) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(HISTORY_FILE))) {
            for (String entry : history) {
                writer.println(entry);
            }
            System.out.println("History saved.");
        } catch (IOException e) {
            System.out.println("Error saving history: " + e.getMessage());
        }
    }

    public static ArrayList<String> loadHistory() {
        ArrayList<String> history = new ArrayList<>();
        File file = new File(HISTORY_FILE);
        if (!file.exists()) {
            return history;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(HISTORY_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                history.add(line);
            }
            System.out.println("History loaded: " + history.size() + " entries.");
        } catch (IOException e) {
            System.out.println("Error loading history: " + e.getMessage());
        }
        return history;
    }

    public static void saveStatus(int messagesProcessed) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(STATUS_FILE))) {
            writer.println(messagesProcessed);
        } catch (IOException e) {
            System.out.println("Error saving status: " + e.getMessage());
        }
    }

    public static int loadStatus() {
        File file = new File(STATUS_FILE);
        if (!file.exists()) {
            return 0;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(STATUS_FILE))) {
            String line = reader.readLine();
            if (line != null) {
                return Integer.parseInt(line.trim());
            }
        } catch (Exception e) {
            System.out.println("Error loading status: " + e.getMessage());
        }
        return 0;
    }
}

import java.util.ArrayList;
import java.util.HashMap;

class LyaV13 {
    private String name;
    private String version;
    private HashMap<String, String> responses;
    private ArrayList<String> history;
    private int messagesProcessed;

    public LyaV13() {
        this.name = "Lya";
        this.version = "1.0";
        this.responses = LyaStorage.loadResponses();
        this.history = LyaStorage.loadHistory();
        this.messagesProcessed = LyaStorage.loadStatus();
        if (responses.isEmpty()) {
            responses.put("hello", "Hello! How can I help you?");
            responses.put("hi", "Hi there! What can I do for you?");
            responses.put("help", "I can answer simple questions.");
            responses.put("goodbye", "Goodbye! See you later!");
            responses.put("thanks", "You're welcome!");
            responses.put("who are you", "I'm Lya, an assistant built by Norbert.");
        }
        System.out.println("Lya loaded. Responses: " + responses.size() +
                           ", History: " + history.size());
    }

    public void save() {
        LyaStorage.saveResponses(responses);
        LyaStorage.saveHistory(history);
        LyaStorage.saveStatus(messagesProcessed);
        System.out.println("Lya saved.");
    }

    public int getMessagesProcessed() {
        return messagesProcessed;
    }

    public void respond(String request) throws EmptyRequestException {
        if (request == null || request.trim().isEmpty()) {
            throw new EmptyRequestException("Request cannot be empty.");
        }
        messagesProcessed++;
        history.add("User: " + request);
        String cleanRequest = request.toLowerCase().trim();
        String response = responses.get(cleanRequest);
        if (response != null) {
            System.out.println("Lya: " + response);
            history.add("Lya: " + response);
        } else {
            System.out.println("Lya: I don't understand that yet.");
            history.add("Lya: I don't understand that yet.");
        }
    }
}
