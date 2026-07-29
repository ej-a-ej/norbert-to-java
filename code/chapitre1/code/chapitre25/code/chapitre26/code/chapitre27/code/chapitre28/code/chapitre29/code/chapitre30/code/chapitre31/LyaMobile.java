import java.util.Scanner;

public class LyaMobile {
    private Lya lya;
    private String utilisateur;
    
    public LyaMobile() {
        this.lya = new Lya();
        this.utilisateur = "Norbert";
    }
    
    public void demarrer() {
        System.out.println("📱 Lya Mobile v0.1");
        System.out.println("==================");
        System.out.println("Bienvenue, " + utilisateur + " !");
        System.out.println("Lya est dans votre poche.");
        System.out.println("Tapez 'aide' pour voir les commandes.");
        System.out.println("Tapez 'quitter' pour arrêter.\n");
        
        Scanner scanner = new Scanner(System.in);
        boolean actif = true;
        
        while (actif) {
            System.out.print(utilisateur + " > ");
            String demande = scanner.nextLine().trim();
            
            if (demande.equalsIgnoreCase("quitter") || demande.equalsIgnoreCase("exit")) {
                actif = false;
                System.out.println("👋 Au revoir ! Lya vous attendra.");
            } else if (demande.equalsIgnoreCase("aide")) {
                afficherAide();
            } else if (demande.equalsIgnoreCase("statut")) {
                afficherStatut();
            } else {
                traiterDemande(demande);
            }
        }
        
        scanner.close();
        System.out.println("📱 Lya Mobile arrêtée.");
    }
    
    private void afficherAide() {
        System.out.println("\n📚 Commandes disponibles :");
        System.out.println("  - Bonjour, salut");
        System.out.println("  - Météo à [ville]");
        System.out.println("  - Commande #[numéro]");
        System.out.println("  - Ticket pour [client] problème [description]");
        System.out.println("  - Tickets (liste)");
        System.out.println("  - Statut (de Lya)");
        System.out.println("  - Historique");
        System.out.println("  - Aide");
        System.out.println("  - Quitter\n");
    }
    
    private void afficherStatut() {
        System.out.println("\n📊 Statut de Lya Mobile");
        System.out.println("========================");
        System.out.println("📱 Version : 0.1");
        System.out.println("👤 Utilisateur : " + utilisateur);
        System.out.println("🔋 Prêt à répondre !\n");
    }
    
    private void traiterDemande(String demande) {
        System.out.print("🤔 Lya réfléchit");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(300);
                System.out.print(".");
            } catch (InterruptedException e) {}
        }
        System.out.println();
        
        try {
            lya.repondre(demande);
            System.out.println();
        } catch (DemandeVideException e) {
            System.out.println("❌ Erreur : " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        LyaMobile mobile = new LyaMobile();
        mobile.demarrer();
    }
}



