import java.util.ArrayList;
import java.util.HashMap;

public class AdvancedAI {
    private HashMap<String, ArrayList<String>> reponsesVariations;
    
    public AdvancedAI() {
        this.reponsesVariations = new HashMap<String, ArrayList<String>>();
        
        ArrayList<String> salutations = new ArrayList<String>();
        salutations.add("Bonjour ! Comment puis-je t'aider ?");
        salutations.add("Salut ! Qu'est-ce que je peux faire pour toi ?");
        salutations.add("Hey ! Content de te voir !");
        reponsesVariations.put("salutation", salutations);
        
        ArrayList<String> auRevoir = new ArrayList<String>();
        auRevoir.add("Au revoir ! À bientôt.");
        auRevoir.add("À plus tard !");
        auRevoir.add("Bonne journée !");
        reponsesVariations.put("au_revoir", auRevoir);
        
        ArrayList<String> meteo = new ArrayList<String>();
        meteo.add("Je ne peux pas encore donner la météo.");
        meteo.add("Météo : pas encore disponible.");
        meteo.add("La météo arrive bientôt !");
        reponsesVariations.put("meteo", meteo);
    }
    
    public String getReponse(String intention) {
        ArrayList<String> variations = reponsesVariations.get(intention);
        if (variations == null || variations.isEmpty()) {
            return "Je ne comprends pas encore.";
        }
        
        int index = (int)(Math.random() * variations.size());
        return variations.get(index);
    }
    
    public void ajouterVariation(String intention, String reponse) {
        if (reponsesVariations.containsKey(intention)) {
            reponsesVariations.get(intention).add(reponse);
        } else {
            ArrayList<String> nouvelles = new ArrayList<String>();
            nouvelles.add(reponse);
            reponsesVariations.put(intention, nouvelles);
        }
    }
    
    public static void main(String[] args) {
        AdvancedAI ai = new AdvancedAI();
        
        for (int i = 0; i < 5; i++) {
            System.out.println(ai.getReponse("salutation"));
        }
        
        ai.ajouterVariation("salutation", "Coucou ! Comment ça va ?");
        System.out.println("\nAprès ajout :");
        for (int i = 0; i < 3; i++) {
            System.out.println(ai.getReponse("salutation"));
        }
    }
}
