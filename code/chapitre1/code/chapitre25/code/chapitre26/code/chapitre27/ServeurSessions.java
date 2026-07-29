import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class GestionClientSession implements Runnable {
    private Socket client;
    private GestionnaireSessions gestionnaire;
    
    public GestionClientSession(Socket client) {
        this.client = client;
        this.gestionnaire = GestionnaireSessions.getInstance();
    }
    
    @Override
    public void run() {
        try {
            BufferedReader entree = new BufferedReader(
                new InputStreamReader(client.getInputStream())
            );
            String ligne = entree.readLine();
            
            if (ligne == null) {
                client.close();
                return;
            }
            
            String[] parts = ligne.split(" ");
            if (parts.length < 2) {
                client.close();
                return;
            }
            
            String chemin = parts[1];
            String sessionId = extraireSessionId(ligne);
            String reponse = traiterAvecSession(chemin, sessionId);
            
            OutputStream sortie = client.getOutputStream();
            sortie.write(("HTTP/1.1 200 OK\n\n" + reponse).getBytes());
            client.close();
            
        } catch (Exception e) {
            System.out.println("❌ Erreur : " + e.getMessage());
        }
    }
    
    private String extraireSessionId(String ligne) {
        if (ligne.contains("session=")) {
            int debut = ligne.indexOf("session=") + 8;
            int fin = ligne.indexOf(" ", debut);
            if (fin == -1) fin = ligne.length();
            return ligne.substring(debut, fin);
        }
        return null;
    }
    
    private String traiterAvecSession(String chemin, String sessionId) {
        // Login
        if (chemin.startsWith("/login")) {
            String nom = extraireParametre(chemin, "nom");
            if (nom == null || nom.isEmpty()) {
                return "❌ /login?nom=VotreNom";
            }
            Session session = gestionnaire.creerSession(nom);
            return "✅ Bienvenue " + nom + " ! Session: " + session.getId().substring(0, 8);
        }
        
        // Session existante ?
        Session session = null;
        if (sessionId != null) {
            session = gestionnaire.getSession(sessionId);
        }
        
        if (session == null) {
            return "🔐 Connectez-vous : /login?nom=VotreNom";
        }
        
        String utilisateur = session.getUtilisateur();
        
        if (chemin.equals("/")) {
            return "👋 Bonjour " + utilisateur + " !";
        }
        
        if (chemin.startsWith("/ajouter")) {
            String item = extraireParametre(chemin, "item");
            if (item != null) {
                java.util.ArrayList<String> panier = (java.util.ArrayList<String>) session.getDonnee("panier");
                if (panier == null) {
                    panier = new java.util.ArrayList<String>();
                }
                panier.add(item);
                session.setDonnee("panier", panier);
                return "🛒 " + item + " ajouté au panier de " + utilisateur;
            }
            return "❌ /ajouter?item=...";
        }
        
        if (chemin.equals("/panier")) {
            java.util.ArrayList<String> panier = (java.util.ArrayList<String>) session.getDonnee("panier");
            if (panier == null || panier.isEmpty()) {
                return "🛒 Panier vide pour " + utilisateur;
            }
            return "🛒 Panier de " + utilisateur + " : " + panier.toString();
        }
        
        if (chemin.equals("/logout")) {
            gestionnaire.supprimerSession(sessionId);
            return "👋 Au revoir " + utilisateur + " ! Déconnecté.";
        }
        
        return "❌ Commande inconnue : " + chemin;
    }
    
    private String extraireParametre(String chemin, String nom) {
        if (chemin.contains(nom + "=")) {
            int debut = chemin.indexOf(nom + "=") + nom.length() + 1;
            int fin = chemin.indexOf("&", debut);
            if (fin == -1) fin = chemin.length();
            return chemin.substring(debut, fin);
        }
        return null;
    }
}

public class ServeurSessions {
    public static void main(String[] args) {
        System.out.println("🚀 Lya avec sessions sur le port 8080...");
        System.out.println("📋 Exemples :");
        System.out.println("   GET /login?nom=Norbert");
        System.out.println("   GET /ajouter?item=cafe");
        System.out.println("   GET /panier");
        System.out.println("   GET /logout\n");
        
        try {
            ServerSocket serveur = new ServerSocket(8080);
            int compteur = 0;
            
            while (true) {
                Socket client = serveur.accept();
                compteur++;
                Thread thread = new Thread(new GestionClientSession(client));
                thread.setName("Session-" + compteur);
                thread.start();
            }
        } catch (Exception e) {
            System.out.println("❌ Erreur : " + e.getMessage());
        }
    }
}
