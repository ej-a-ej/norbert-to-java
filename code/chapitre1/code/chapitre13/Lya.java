import java.util.ArrayList;
import java.util.HashMap;

public class Lya {
    private String nom;
    private String version;
    private HashMap<String, String> reponses;
    private ArrayList<String> historique;
    
    public Lya() {
        this.nom = "Lya";
        this.version = "0.1";
        this.reponses = new HashMap<String, String>();
        this.historique = new ArrayList<String>();
        
        reponses.put("bonjour", "Bonjour ! Comment puis-je t'aider ?");
        reponses.put("salut", "Salut ! Qu'est-ce que je peux faire pour toi ?");
        reponses.put("au revoir", "Au revoir ! À bientôt.");
        reponses.put("merci", "Avec plaisir !");
        reponses.put("qui es-tu", "Je suis Lya, un assistant créé par Norbert.");
    }
    
    public void direBonjour() {
        System.out.println("Bonjour, je suis " + nom + ".");
        System.out.println("Version " + version);
        System.out.println("Pose-moi une question ou dis-moi bonjour.");
    }
    
    public void repondre(String demande) throws DemandeVideException {
        if (demande == null || demande.trim().isEmpty()) {
            throw new DemandeVideException("La demande est vide.");
        }
        
        historique.add("Demande : " + demande);
        String demandePropre = demande.toLowerCase().trim();
        String reponse = reponses.get(demandePropre);
        
        if (reponse != null) {
            System.out.println(reponse);
        } else {
            System.out.println("Je ne comprends pas encore cette demande.");
            System.out.println("Peux-tu reformuler ?");
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
    
    public void ajouterReponse(String demande, String reponse) throws DemandeVideException {
        if (demande == null || demande.trim().isEmpty()) {
            throw new DemandeVideException("La demande ne peut pas être vide.");
        }
        if (reponse == null || reponse.trim().isEmpty()) {
            throw new DemandeVideException("La réponse ne peut pas être vide.");
        }
        this.reponses.put(demande.toLowerCase().trim(), reponse);
        System.out.println("Nouvelle réponse ajoutée !");
    }
}


import java.util.Scanner;

public class TestLya {
    public static void main(String[] args) {
        Lya lya = new Lya();
        Scanner scanner = new Scanner(System.in);
        
        lya.direBonjour();
        
        boolean continuer = true;
        while (continuer) {
            System.out.print("\nToi : ");
            String demande = scanner.nextLine();
            
            try {
                if (demande.equalsIgnoreCase("quitter")) {
                    continuer = false;
                    System.out.println("Au revoir !");
                } else if (demande.equalsIgnoreCase("historique")) {
                    lya.afficherHistorique();
                } else if (demande.toLowerCase().startsWith("apprendre ")) {
                    String contenu = demande.substring(10);
                    String[] parts = contenu.split("\\|");
                    if (parts.length == 2) {
                        lya.ajouterReponse(parts[0].trim(), parts[1].trim());
                    } else {
                        System.out.println("Format : apprendre question|réponse");
                    }
                } else {
                    lya.repondre(demande);
                }
            } catch (DemandeVideException e) {
                System.out.println("Erreur : " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erreur inattendue : " + e.getMessage());
            }
        }
        scanner.close();
    }
}
