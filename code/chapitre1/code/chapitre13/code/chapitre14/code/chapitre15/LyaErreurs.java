import java.util.ArrayList;
import java.util.HashMap;

public class LyaErreurs {
    private HashMap<String, String> reponses;
    private ArrayList<String> historique;
    
    public LyaErreurs() {
        this.reponses = new HashMap<String, String>();
        this.historique = new ArrayList<String>();
        reponses.put("bonjour", "Bonjour !");
        reponses.put("salut", "Salut !");
    }
    
    public void repondre(String demande) throws DemandeVideException {
        if (demande == null || demande.trim().isEmpty()) {
            throw new DemandeVideException("La demande est vide. Je ne peux pas traiter une demande sans texte.");
        }
        
        historique.add("Demande : " + demande);
        String nettoyee = demande.toLowerCase().trim();
        String reponse = reponses.get(nettoyee);
        
        if (reponse != null) {
            System.out.println(reponse);
        } else {
            System.out.println("Je ne comprends pas.");
        }
        historique.add("Réponse : " + (reponse != null ? reponse : "Je ne comprends pas"));
    }
    
    public void ajouterReponse(String demande, String reponse) throws DemandeVideException {
        if (demande == null || demande.trim().isEmpty()) {
            throw new DemandeVideException("La demande ne peut pas être vide.");
        }
        if (reponse == null || reponse.trim().isEmpty()) {
            throw new DemandeVideException("La réponse ne peut pas être vide.");
        }
        this.reponses.put(demande.toLowerCase().trim(), reponse);
        System.out.println("✅ Nouvelle réponse ajoutée !");
    }
    
    public static void main(String[] args) {
        LyaErreurs lya = new LyaErreurs();
        
        try {
            lya.repondre("bonjour");
            lya.repondre("");
        } catch (DemandeVideException e) {
            System.out.println("❌ Erreur : " + e.getMessage());
        }
        
        try {
            lya.ajouterReponse("test", "");
        } catch (DemandeVideException e) {
            System.out.println("❌ Erreur : " + e.getMessage());
        }
    }
}

