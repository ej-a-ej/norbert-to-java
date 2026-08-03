/**
 * CHAPITRE 27 — SESSIONS
 */

import java.util.HashMap;
import java.util.UUID;

public class Session {
    private String id;
    private String username;
    private HashMap<String, Object> data;
    private long lastActivity;
    private static final long TIMEOUT = 300000;

    public Session(String username) {
        this.id = UUID.randomUUID().toString();
        this.username = username;
        this.data = new HashMap<>();
        this.lastActivity = System.currentTimeMillis();
    }

    public String getId() { return id; }
    public String getUsername() { return username; }
    public long getLastActivity() { return lastActivity; }

    public void setData(String key, Object value) {
        data.put(key, value);
        lastActivity = System.currentTimeMillis();
    }

    public Object getData(String key) {
        lastActivity = System.currentTimeMillis();
        return data.get(key);
    }

    public boolean isExpired() {
        return System.currentTimeMillis() - lastActivity > TIMEOUT;
    }

    public void touch() {
        lastActivity = System.currentTimeMillis();
    }

    public void setLastActivity(long lastActivity) {
        this.lastActivity = lastActivity;
    }
}

class SessionManager {
    private static SessionManager instance;
    private HashMap<String, Session> sessions;
    private HashMap<String, String> sessionsByUser;

    private SessionManager() {
        this.sessions = new HashMap<>();
        this.sessionsByUser = new HashMap<>();
    }

    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
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

    public void removeSession(String sessionId) {
        Session session = sessions.remove(sessionId);
        if (session != null) {
            sessionsByUser.remove(session.getUsername());
        }
    }

    private void cleanExpiredSessions() {
        sessions.values().removeIf(Session::isExpired);
    }

    public int getActiveSessionCount() {
        return sessions.size();
    }
}
