public class Commande {
    private int numero;
    private String statut;
    private String client;
    
    public Commande(int numero, String client) {
        this.numero = numero;
        this.client = client;
        this.statut = "En attente de traitement";
    }
    
    public int getNumero() { return numero; }
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
    public String getClient() { return client; }
    
    public void afficher() {
        System.out.println("Commande #" + numero + " | Client : " + client + " | Statut : " + statut);
    }
}

import java.util.ArrayList;
import java.util.HashMap;

public class LyaCommandes {
    private HashMap<Integer, Commande> commandes;
    private HashMap<String, String> reponses;
    private ArrayList<String> historique;
    
    public LyaCommandes() {
        this.commandes = new HashMap<Integer, Commande>();
        this.reponses = new HashMap<String, String>();
        this.historique = new ArrayList<String>();
        
        reponses.put("bonjour", "Bonjour !");
        reponses.put("salut", "Salut !");
        
        commandes.put(1001, new Commande(1001, "Alice"));
        commandes.put(1002, new Commande(1002, "Bob"));
        commandes.put(1003, new Commande(1003, "Charlie"));
        commandes.get(1001).setStatut("En cours de préparation");
        commandes.get(1002).setStatut("Expédiée");
        commandes.get(1003).setStatut("Livrée");
    }
    
    public void repondre(String demande) throws DemandeVideException {
        if (demande == null || demande.trim().isEmpty()) {
            throw new DemandeVideException("La demande est vide.");
        }
        
        historique.add("Demande : " + demande);
        String nettoyee = demande.toLowerCase().trim();
        
        if (nettoyee.contains("statut") || nettoyee.contains("commande")) {
            traiterStatut(nettoyee);
        } else {
            String reponse = reponses.get(nettoyee);
            if (reponse != null) {
                System.out.println(reponse);
            } else {
                System.out.println("Je ne comprends pas.");
            }
        }
    }
    
    private void traiterStatut(String demande) {
        int numero = extraireNumero(demande);
        if (numero == -1) {
            System.out.println("Je n'ai pas trouvé de numéro de commande.");
            return;
        }
        
        Commande commande = commandes.get(numero);
        if (commande == null) {
            System.out.println("Commande #" + numero + " non trouvée.");
        } else {
            System.out.println("Commande #" + numero + " : " + commande.getStatut());
        }
    }
    
    private int extraireNumero(String demande) {
        for (String mot : demande.split(" ")) {
            if (mot.startsWith("#") && mot.length() > 1) {
                try {
                    return Integer.parseInt(mot.substring(1));
                } catch (NumberFormatException e) {}
            }
        }
        return -1;
    }
    
    public void afficherHistorique() {
        System.out.println("\n--- Historique ---");
        for (String ligne : historique) {
            System.out.println(ligne);
        }
        System.out.println("--- Fin ---\n");
    }
    
    public static void main(String[] args) {
        LyaCommandes lya = new LyaCommandes();
        try {
            lya.repondre("statut de la commande #1001");
            lya.repondre("commande 1002");
            lya.repondre("statut #9999");
            lya.afficherHistorique();
        } catch (DemandeVideException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
