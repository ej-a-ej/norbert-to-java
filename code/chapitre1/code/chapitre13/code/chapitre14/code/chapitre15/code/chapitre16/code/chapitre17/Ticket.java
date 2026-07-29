public class Ticket {
    private int id;
    private String client;
    private String description;
    private String priorite;
    private String statut;
    
    public Ticket(int id, String client, String description, String priorite) {
        this.id = id;
        this.client = client;
        this.description = description;
        this.priorite = priorite;
        this.statut = "ouvert";
    }
    
    public int getId() { return id; }
    public String getClient() { return client; }
    public String getDescription() { return description; }
    public String getPriorite() { return priorite; }
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
    
    public void afficher() {
        String emoji = "";
        if (priorite.equals("haute")) emoji = "🔴";
        else if (priorite.equals("moyenne")) emoji = "🟡";
        else if (priorite.equals("basse")) emoji = "🟢";
        
        System.out.println(emoji + " Ticket #" + id + " | " + client + " | " + priorite + " | " + statut);
        System.out.println("   " + description);
    }
}

import java.util.ArrayList;

public class LyaTickets {
    private ArrayList<Ticket> tickets;
    private int prochainId;
    
    public LyaTickets() {
        this.tickets = new ArrayList<Ticket>();
        this.prochainId = 1;
        
        // Tickets de démonstration
        creerTicket("Alice", "Problème de paiement", "haute");
        creerTicket("Bob", "Question sur la facture", "moyenne");
        creerTicket("Charlie", "Demande d'information", "basse");
    }
    
    public Ticket creerTicket(String client, String description, String priorite) {
        Ticket ticket = new Ticket(prochainId, client, description, priorite);
        tickets.add(ticket);
        prochainId++;
        return ticket;
    }
    
    public void afficherTickets() {
        System.out.println("\n--- Tickets ---");
        for (Ticket ticket : tickets) {
            ticket.afficher();
        }
        System.out.println("--- Fin ---\n");
    }
    
    public void afficherTicketsParPriorite(String priorite) {
        System.out.println("\n--- Tickets " + priorite + " priorité ---");
        boolean trouve = false;
        for (Ticket ticket : tickets) {
            if (ticket.getPriorite().equals(priorite)) {
                ticket.afficher();
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Aucun ticket avec priorité " + priorite);
        }
        System.out.println("--- Fin ---\n");
    }
    
    public static void main(String[] args) {
        LyaTickets lya = new LyaTickets();
        lya.afficherTickets();
        lya.afficherTicketsParPriorite("haute");
        
        lya.creerTicket("David", "Problème d'installation", "haute");
        lya.afficherTicketsParPriorite("haute");
    }
}
