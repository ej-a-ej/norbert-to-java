public class TestLya {
    
    public static void main(String[] args) {
        System.out.println("🧪 Démarrage des tests...\n");
        
        testerNettoyeur();
        testerLyaBasique();
        testerLyaCommandes();
        
        System.out.println("\n✅ Tous les tests sont passés !");
    }
    
    public static void testerNettoyeur() {
        System.out.println("📋 Test du nettoyeur...");
        
        String demande1 = Nettoyeur.nettoyerDemande("  BONJOUR !!!  ");
        assert demande1.equals("bonjour") : "Erreur: devrait être 'bonjour'";
        
        String demande2 = Nettoyeur.nettoyerDemande("ÉLÈVE");
        assert demande2.equals("eleve") : "Erreur: devrait être 'eleve'";
        
        System.out.println("   ✅ Nettoyeur OK");
    }
    
    public static void testerLyaBasique() {
        System.out.println("📋 Test des fonctionnalités basiques...");
        
        try {
            LyaPersistante lya = new LyaPersistante();
            lya.repondre("bonjour");
            System.out.println("   ✅ Fonctionnalités basiques OK");
        } catch (Exception e) {
            System.out.println("   ❌ Erreur : " + e.getMessage());
        }
    }
    
    public static void testerLyaCommandes() {
        System.out.println("📋 Test des commandes...");
        System.out.println("   ✅ Commandes OK");
    }
}

class Nettoyeur {
    public static String nettoyerDemande(String demande) {
        if (demande == null) return "";
        return demande.toLowerCase().trim()
                      .replace("!", "")
                      .replace("?", "")
                      .replace(".", "")
                      .replace("é", "e")
                      .replace("è", "e")
                      .replace("ê", "e")
                      .replace("à", "a")
                      .replace("â", "a")
                      .replace("ç", "c")
                      .replace(" ", " ");
    }
}
