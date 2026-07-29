import java.util.HashMap;

public class Authentification {
    private HashMap<String, String> utilisateurs;
    private String utilisateurConnecte;
    
    public Authentification() {
        this.utilisateurs = new HashMap<String, String>();
        this.utilisateurConnecte = null;
        utilisateurs.put("admin", "admin123");
        utilisateurs.put("norbert", "norbert456");
        utilisateurs.put("alice", "alice789");
    }
    
    public boolean connecter(String nom, String motDePasse) {
        if (!utilisateurs.containsKey(nom)) {
            System.out.println("❌ Utilisateur inconnu.");
            return false;
        }
        if (utilisateurs.get(nom).equals(motDePasse)) {
            this.utilisateurConnecte = nom;
            System.out.println("✅ Connexion réussie. Bienvenue " + nom + " !");
            return true;
        } else {
            System.out.println("❌ Mot de passe incorrect.");
            return false;
        }
    }
    
    public void deconnecter() {
        if (utilisateurConnecte != null) {
            System.out.println("👋 Au revoir " + utilisateurConnecte + " !");
            utilisateurConnecte = null;
        }
    }
    
    public boolean estConnecte() {
        return utilisateurConnecte != null;
    }
    
    public String getUtilisateurConnecte() {
        return utilisateurConnecte;
    }
    
    public boolean ajouterUtilisateur(String nom, String motDePasse) {
        if (nom == null || nom.trim().isEmpty() || motDePasse == null || motDePasse.trim().isEmpty()) {
            System.out.println("❌ Nom ou mot de passe invalide.");
            return false;
        }
        if (utilisateurs.containsKey(nom)) {
            System.out.println("❌ L'utilisateur " + nom + " existe déjà.");
            return false;
        }
        utilisateurs.put(nom, motDePasse);
        System.out.println("✅ Utilisateur " + nom + " créé !");
        return true;
    }
    
    public static void main(String[] args) {
        Authentification auth = new Authentification();
        auth.connecter("norbert", "norbert456");
        auth.connecter("norbert", "mauvais");
        auth.deconnecter();
        auth.ajouterUtilisateur("test", "test123");
    }
}







