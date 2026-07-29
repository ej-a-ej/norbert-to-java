import java.util.ArrayList;
import java.util.HashMap;

public class LyaSecurisee {
    private HashMap<String, String> reponses;
    private ArrayList<String> historique;
    private Authentification auth;
    private boolean modeSecurise;
    
    public LyaSecurisee() {
        this.reponses = new HashMap<String, String>();
        this.historique = new ArrayList<String>();
        this.auth = new Authentification();
        this.modeSecurise = false;
        
        reponses.put("bonjour", "Bonjour !");
        reponses.put("salut", "Salut !");
        reponses.put("merci", "Avec plaisir !");
        reponses.put("au revoir", "Au revoir !");
    }
    
    public boolean connecter(String nom, String motDePasse) {
        boolean resultat = auth.connecter(nom, motDePasse);
        if (resultat) {
            modeSecurise = true;
        }
        return resultat;
    }
    
    public void deconnecter() {
        auth.deconnecter();
        modeSecurise = false;
    }
    
    public boolean estAuthentifie() {
        return auth.estConnecte();
    }
    
    public String getUtilisateurConnecte() {
        return auth.getUtilisateurConnecte();
    }
    
    public void repondre(String demande) {
        if (!modeSecurise) {
            System.out.println("❌ Accès refusé. Authentification requise.");
            return;
        }
        
        historique.add("Demande : " + demande);
        String nettoyee = demande.toLowerCase().trim();
        String reponse = reponses.get(nettoyee);
        
        if (reponse != null) {
            System.out.println("🔒 " + reponse);
        } else {
            System.out.println("Je ne comprends pas.");
        }
        historique.add("Réponse : " + (reponse != null ? "🔒 " + reponse : "Je ne comprends pas"));
    }
    
    public void afficherHistoriqueSecurise() {
        if (!modeSecurise) {
            System.out.println("❌ Accès refusé.");
            return;
        }
        System.out.println("\n--- Historique ---");
        for (String ligne : historique) {
            System.out.println(Chiffrement.masquer(ligne));
        }
        System.out.println("--- Fin ---\n");
    }
    
    public static void main(String[] args) {
        LyaSecurisee lya = new LyaSecurisee();
        
        System.out.println("🔐 Authentification...");
        lya.connecter("norbert", "norbert456");
        lya.repondre("bonjour");
        lya.afficherHistoriqueSecurise();
        lya.deconnecter();
        
        System.out.println("\n🔐 Tentative sans authentification...");
        lya.repondre("salut");
    }
}
