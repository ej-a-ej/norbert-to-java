import java.util.HashMap;

public class LearningMemory {
    private HashMap<String, String> connaissances;
    private HashMap<String, Integer> confiance;
    
    public LearningMemory() {
        this.connaissances = new HashMap<String, String>();
        this.confiance = new HashMap<String, Integer>();
        
        // Connaissances de base
        connaissances.put("bonjour", "Bonjour !");
        connaissances.put("salut", "Salut !");
        connaissances.put("merci", "Avec plaisir !");
        connaissances.put("au revoir", "Au revoir !");
        
        for (String cle : connaissances.keySet()) {
            confiance.put(cle, 1);
        }
    }
    
    public String getReponse(String demande) {
        if (demande == null) return null;
        String nettoyee = demande.toLowerCase().trim();
        
        // Recherche exacte
        if (connaissances.containsKey(nettoyee)) {
            renforcer(nettoyee);
            return connaissances.get(nettoyee);
        }
        
        // Recherche par mot-clé
        String[] mots = nettoyee.split(" ");
        for (String mot : mots) {
            if (connaissances.containsKey(mot)) {
                renforcer(mot);
                return connaissances.get(mot);
            }
        }
        
        return null;
    }
    
    public void apprendre(String demande, String reponse) {
        if (demande == null || demande.trim().isEmpty() || 
            reponse == null || reponse.trim().isEmpty()) {
            System.out.println("❌ Demande ou réponse vide.");
            return;
        }
        
        String nettoyee = demande.toLowerCase().trim();
        connaissances.put(nettoyee, reponse);
        confiance.put(nettoyee, 1);
        System.out.println("✅ J'ai appris : '" + demande + "' → '" + reponse + "'");
    }
    
    private void renforcer(String cle) {
        if (confiance.containsKey(cle)) {
            confiance.put(cle, confiance.get(cle) + 1);
        }
    }
    
    public int getConfiance(String cle) {
        return confiance.getOrDefault(cle.toLowerCase().trim(), 0);
    }
    
    public void afficherConnaissances() {
        System.out.println("\n📚 Connaissances (" + connaissances.size() + ") :");
        for (String cle : connaissances.keySet()) {
            System.out.println("   - " + cle + " → " + connaissances.get(cle) + 
                             " (confiance: " + confiance.get(cle) + ")");
        }
    }
    
    public static void main(String[] args) {
        LearningMemory lm = new LearningMemory();
        
        System.out.println(lm.getReponse("bonjour"));
        System.out.println(lm.getReponse("salut"));
        
        lm.apprendre("ça va", "Je vais bien, merci !");
        System.out.println(lm.getReponse("ça va"));
        
        lm.apprendre("météo", "Je ne peux pas encore donner la météo.");
        System.out.println(lm.getReponse("météo Paris")); // Mot-clé "météo"
        
        lm.afficherConnaissances();
        
        System.out.println("\nConfiance pour 'bonjour' : " + lm.getConfiance("bonjour"));
    }
}

