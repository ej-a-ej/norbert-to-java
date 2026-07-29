import java.util.ArrayList;
import java.util.HashMap;

public class LyaPersistante {
    private HashMap<String, String> reponses;
    private ArrayList<String> historique;
    private static final String FICHIER_REPONSES = "reponses.txt";
    private static final String FICHIER_HISTORIQUE = "historique.txt";
    
    public LyaPersistante() {
        this.reponses = GestionFichiers.chargerReponses(FICHIER_REPONSES);
        this.historique = GestionFichiers.chargerHistorique(FICHIER_HISTORIQUE);
        
        if (reponses.isEmpty()) {
            reponses.put("bonjour", "Bonjour !");
            reponses.put("salut", "Salut !");
            reponses.put("merci", "Avec plaisir !");
            reponses.put("au revoir", "Au revoir !");
        }
        
        System.out.println("📂 Lya chargée : " + reponses.size() + " réponses, " + historique.size() + " historique");
    }
    
    public void repondre(String demande) {
        historique.add("Demande : " + demande);
        String nettoyee = demande.toLowerCase().trim();
        String reponse = reponses.get(nettoyee);
        
        if (reponse != null) {
            System.out.println(reponse);
        } else {
            System.out.println("Je ne comprends pas.");
        }
        historique.add("Réponse : " + (reponse != null ? reponse : "Je ne comprends pas"));
        sauvegarder();
    }
    
    public void ajouterReponse(String demande, String reponse) {
        reponses.put(demande.toLowerCase().trim(), reponse);
        System.out.println("✅ Nouvelle réponse ajoutée !");
        sauvegarder();
    }
    
    public void sauvegarder() {
        GestionFichiers.sauvegarderReponses(reponses, FICHIER_REPONSES);
        GestionFichiers.sauvegarderHistorique(historique, FICHIER_HISTORIQUE);
    }
    
    public void afficherHistorique() {
        System.out.println("\n--- Historique ---");
        for (String ligne : historique) {
            System.out.println(ligne);
        }
        System.out.println("--- Fin ---\n");
    }
    
    public static void main(String[] args) {
        LyaPersistante lya = new LyaPersistante();
        lya.repondre("bonjour");
        lya.ajouterReponse("test", "Ceci est un test");
        lya.repondre("test");
        lya.afficherHistorique();
        lya.sauvegarder();
        System.out.println("✅ Lya sauvegardée !");
    }
}

