import java.util.HashMap;
import java.util.UUID;

public class Session {
    private String id;
    private String utilisateur;
    private HashMap<String, Object> donnees;
    private long derniereActivite;
    private static final long TIMEOUT = 300000; // 5 minutes
    
    public Session(String utilisateur) {
        this.id = UUID.randomUUID().toString();
        this.utilisateur = utilisateur;
        this.donnees = new HashMap<String, Object>();
        this.derniereActivite = System.currentTimeMillis();
    }
    
    public String getId() { return id; }
    public String getUtilisateur() { return utilisateur; }
    
    public void setDonnee(String cle, Object valeur) {
        donnees.put(cle, valeur);
        derniereActivite = System.currentTimeMillis();
    }
    
    public Object getDonnee(String cle) {
        derniereActivite = System.currentTimeMillis();
        return donnees.get(cle);
    }
    
    public boolean estExpiree() {
        return System.currentTimeMillis() - derniereActivite > TIMEOUT;
    }
    
    public void afficher() {
        System.out.println("🔑 Session : " + id.substring(0, 8) + "...");
        System.out.println("👤 Utilisateur : " + utilisateur);
        System.out.println("📊 Données : " + donnees);
        System.out.println("⏱️ Expire dans : " + (TIMEOUT - (System.currentTimeMillis() - derniereActivite)) / 1000 + "s");
    }
}




import java.util.HashMap;
import java.util.Map;

public class GestionnaireSessions {
    private static GestionnaireSessions instance;
    private Map<String, Session> sessions;
    private Map<String, String> sessionsParUtilisateur;
    
    private GestionnaireSessions() {
        this.sessions = new HashMap<String, Session>();
        this.sessionsParUtilisateur = new HashMap<String, String>();
    }
    
    public static GestionnaireSessions getInstance() {
        if (instance == null) {
            instance = new GestionnaireSessions();
        }
        return instance;
    }
    
    public Session creerSession(String utilisateur) {
        Session session = new Session(utilisateur);
        sessions.put(session.getId(), session);
        sessionsParUtilisateur.put(utilisateur, session.getId());
        return session;
    }
    
    public Session getSession(String sessionId) {
        Session session = sessions.get(sessionId);
        if (session != null && !session.estExpiree()) {
            return session;
        }
        return null;
    }
    
    public Session getSessionParUtilisateur(String utilisateur) {
        String sessionId = sessionsParUtilisateur.get(utilisateur);
        if (sessionId != null) {
            return getSession(sessionId);
        }
        return null;
    }
    
    public void supprimerSession(String sessionId) {
        Session session = sessions.remove(sessionId);
        if (session != null) {
            sessionsParUtilisateur.remove(session.getUtilisateur());
        }
    }
    
    public void afficherToutes() {
        System.out.println("\n📋 Sessions actives (" + sessions.size() + ") :");
        for (Session s : sessions.values()) {
            System.out.println("   - " + s.getId().substring(0, 8) + "... | " + s.getUtilisateur());
        }
        System.out.println();
    }
}
