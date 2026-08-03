/**
 * CHAPITRE 28 — SESSIONS PERSISTANTES
 */

import java.io.*;
import java.util.ArrayList;

class SessionStorage {
    private static final String SESSION_FILE = "sessions.txt";
    private static final String SEPARATOR = "|||";

    public static void saveSession(String sessionId, String username,
                                   String cartData, long lastActivity) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(SESSION_FILE, true))) {
            writer.println(sessionId + SEPARATOR + username + SEPARATOR +
                          cartData + SEPARATOR + lastActivity);
        } catch (IOException e) {
            System.out.println("Error saving session: " + e.getMessage());
        }
    }

    public static ArrayList<String[]> loadSessions() {
        ArrayList<String[]> sessions = new ArrayList<>();
        File file = new File(SESSION_FILE);
        if (!file.exists()) {
            return sessions;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|\\|\\|");
                if (parts.length == 4) {
                    sessions.add(parts);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading sessions: " + e.getMessage());
        }
        return sessions;
    }

    public static void clearAllSessions() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(SESSION_FILE))) {}
        catch (IOException e) {
            System.out.println("Error clearing sessions: " + e.getMessage());
        }
    }
}

import java.util.*;

class SessionManagerV2 {
    private static SessionManagerV2 instance;
    private Map<String, Session> sessions;
    private Map<String, String> sessionsByUser;
    private static final long TIMEOUT = 300000;

    private SessionManagerV2() {
        this.sessions = new HashMap<>();
        this.sessionsByUser = new HashMap<>();
        loadFromDisk();
    }

    public static SessionManagerV2 getInstance() {
        if (instance == null) {
            instance = new SessionManagerV2();
        }
        return instance;
    }

    private void loadFromDisk() {
        ArrayList<String[]> loaded = SessionStorage.loadSessions();
        System.out.println("Loading " + loaded.size() + " saved sessions...");
        for (String[] parts : loaded) {
            String sessionId = parts[0];
            String username = parts[1];
            String cartData = parts[2];
            long lastActivity = Long.parseLong(parts[3]);
            if (System.currentTimeMillis() - lastActivity < TIMEOUT) {
                Session session = new Session(username);
                session.setLastActivity(lastActivity);
                if (!cartData.isEmpty()) {
                    String[] cartItems = cartData.split(",");
                    ArrayList<String> cart = new ArrayList<>();
                    for (String item : cartItems) {
                        if (!item.isEmpty()) {
                            cart.add(item);
                        }
                    }
                    session.setData("cart", cart);
                }
                sessions.put(sessionId, session);
                sessionsByUser.put(username, sessionId);
            }
        }
        System.out.println("Loaded " + sessions.size() + " valid sessions.");
    }

    public void saveToDisk() {
        SessionStorage.clearAllSessions();
        for (Session session : sessions.values()) {
            String cartData = "";
            @SuppressWarnings("unchecked")
            ArrayList<String> cart = (ArrayList<String>) session.getData("cart");
            if (cart != null && !cart.isEmpty()) {
                cartData = String.join(",", cart);
            }
            SessionStorage.saveSession(
                session.getId(),
                session.getUsername(),
                cartData,
                session.getLastActivity()
            );
        }
        System.out.println("Sessions saved to disk.");
    }

    public Session createSession(String username) {
        cleanExpiredSessions();
        Session session = new Session(username);
        sessions.put(session.getId(), session);
        sessionsByUser.put(username, session.getId());
        return session;
    }

    public Session getSession(String sessionId) {
        if (sessionId == null) return null;
        cleanExpiredSessions();
        Session session = sessions.get(sessionId);
        if (session != null && !session.isExpired()) {
            session.touch();
            return session;
        }
        return null;
    }

    private void cleanExpiredSessions() {
        Iterator<Map.Entry<String, Session>> it = sessions.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Session> entry = it.next();
            if (entry.getValue().isExpired()) {
                sessionsByUser.remove(entry.getValue().getUsername());
                it.remove();
            }
        }
    }

    public void shutdown() {
        saveToDisk();
    }
}
