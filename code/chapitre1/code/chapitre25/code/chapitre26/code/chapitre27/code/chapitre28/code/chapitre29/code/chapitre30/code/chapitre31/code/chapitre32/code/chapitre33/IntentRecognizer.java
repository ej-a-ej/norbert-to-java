import java.util.HashMap;

public class IntentRecognizer {
    private HashMap<String, String> intents;
    
    public IntentRecognizer() {
        this.intents = new HashMap<String, String>();
        
        intents.put("hello", "salutation");
        intents.put("hi", "salutation");
        intents.put("bonjour", "salutation");
        intents.put("salut", "salutation");
        
        intents.put("bye", "au_revoir");
        intents.put("goodbye", "au_revoir");
        intents.put("au revoir", "au_revoir");
        
        intents.put("help", "aide");
        intents.put("aide", "aide");
        
        intents.put("weather", "meteo");
        intents.put("météo", "meteo");
        intents.put("meteo", "meteo");
        intents.put("temps", "meteo");
        
        intents.put("order", "commande");
        intents.put("commande", "commande");
        
        intents.put("ticket", "ticket");
        intents.put("support", "ticket");
        intents.put("problème", "ticket");
        intents.put("incident", "ticket");
    }
    
    public String reconnaitre(String demande) {
        if (demande == null || demande.trim().isEmpty()) {
            return "inconnu";
        }
        
        String nettoyee = demande.toLowerCase().trim();
        
        // Vérifier les correspondances exactes
        if (intents.containsKey(nettoyee)) {
            return intents.get(nettoyee);
        }
        
        // Vérifier les mots-clés
        String[] mots = nettoyee.split(" ");
        for (String mot : mots) {
            if (intents.containsKey(mot)) {
                return intents.get(mot);
            }
        }
        
        // Vérifier les expressions
        if (nettoyee.contains("quoi") || nettoyee.contains("qui")) {
            return "question";
        }
        
        if (nettoyee.contains("pourquoi")) {
            return "question_pourquoi";
        }
        
        if (nettoyee.contains("comment")) {
            return "question_comment";
        }
        
        return "inconnu";
    }
    
    public static void main(String[] args) {
        IntentRecognizer ir = new IntentRecognizer();
        
        String[] tests = {
            "bonjour",
            "météo à Paris",
            "aide",
            "commande #1001",
            "ticket pour Alice",
            "pourquoi le ciel est bleu",
            "inconnu"
        };
        
        for (String test : tests) {
            System.out.println("📝 " + test + " → " + ir.reconnaitre(test));
        }
    }
}
