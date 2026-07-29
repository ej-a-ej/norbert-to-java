import java.util.ArrayList;
import java.util.HashMap;

public class LyaComprehension {
    private HashMap<String, String> reponses;
    private ArrayList<String> historique;
    
    public LyaComprehension() {
        this.reponses = new HashMap<String, String>();
        this.historique = new ArrayList<String>();
        
        reponses.put("bonjour", "Bonjour ! Comment puis-je t'aider ?");
        reponses.put("salut", "Salut !");
        reponses.put("merci", "Avec plaisir !");
        reponses.put("au revoir", "Au revoir !");
    }
    
    private String trouverReponse(String demande) {
        String nettoyee = demande.toLowerCase().trim();
        
        // 1. Correspondance exacte
        if (reponses.containsKey(nettoyee)) {
            return reponses.get(nettoyee);
        }
        
        // 2. Mots-clés
        String[] mots = nettoyee.split(" ");
        for (String mot : mots) {
            if (reponses.containsKey(mot)) {
                return reponses.get(mot);
            }
        }
        
        // 3. Types de questions
        if (nettoyee.contains("qui") || nettoyee.contains("qu'est-ce")) {
            return "Je suis Lya, un assistant créé par Norbert.";
        }
        if (nettoyee.contains("pourquoi")) {
            return "Je ne sais pas encore répondre aux 'pourquoi'.";
        }
        if (nettoyee.contains("comment")) {
            return "Je ne peux pas encore t'expliquer comment faire.";
        }
        
        return null;
    }
    
    public void repondre(String demande) {
        historique.add("Demande : " + demande);
        String reponse = trouverReponse(demande);
        if (reponse != null) {
            System.out.println(reponse);
        } else {
            System.out.println("Je ne comprends pas encore cette demande.");
        }
        historique.add("Réponse : " + (reponse != null ? reponse : "Je ne comprends pas"));
    }
    
    public void afficherHistorique() {
        System.out.println("\n--- Historique ---");
        for (String ligne : historique) {
            System.out.println(ligne);
        }
        System.out.println("--- Fin ---\n");
    }
    
    public static void main(String[] args) {
        LyaComprehension lya = new LyaComprehension();
        lya.repondre("bonjour");
        lya.repondre("qui es-tu");
        lya.repondre("pourquoi le ciel est bleu");
        lya.repondre("météo");
        lya.afficherHistorique();
    }
}

