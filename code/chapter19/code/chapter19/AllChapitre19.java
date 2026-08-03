/**
 * CHAPITRE 19 — HASHSET
 */

import java.util.HashSet;

public class LyaV12 {
    private HashSet<String> commands;
    private HashSet<String> clients;

    public LyaV12() {
        this.commands = new HashSet<>();
        this.clients = new HashSet<>();
        commands.add("hello");
        commands.add("help");
        commands.add("goodbye");
        commands.add("weather");
        commands.add("orders");
        commands.add("tickets");
        clients.add("Alice");
        clients.add("Bob");
        clients.add("Charlie");
    }

    public boolean isKnownCommand(String command) {
        return commands.contains(command.toLowerCase().trim());
    }

    public void addClient(String client) {
        if (clients.add(client)) {
            System.out.println("New client added: " + client);
        } else {
            System.out.println("Client already known: " + client);
        }
    }

    public void showCommands() {
        System.out.println("--- Known Commands ---");
        for (String command : commands) {
            System.out.println("- " + command);
        }
    }

    public void showClients() {
        System.out.println("--- Known Clients ---");
        for (String client : clients) {
            System.out.println("- " + client);
        }
    }
}

class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("apple");
        System.out.println("Number of unique words: " + words.size());
        if (words.contains("banana")) {
            System.out.println("Banana is in the set");
        }
        for (String word : words) {
            System.out.println("- " + word);
        }
    }
}
