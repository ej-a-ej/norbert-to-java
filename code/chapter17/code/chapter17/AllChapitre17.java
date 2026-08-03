/**
 * CHAPITRE 17 — ARRAYLIST
 */

import java.util.ArrayList;

public class LyaV10 {
    private ArrayList<String> history;
    private ArrayList<Ticket> tickets;
    private int nextTicketNumber;

    public LyaV10() {
        this.history = new ArrayList<>();
        this.tickets = new ArrayList<>();
        this.nextTicketNumber = 1001;
    }

    public void addTicket(String client, String description, String priority) {
        Ticket ticket = new Ticket(nextTicketNumber, client, description, priority);
        tickets.add(ticket);
        nextTicketNumber++;
        System.out.println("Ticket #" + ticket.getNumber() + " created for " + client);
    }

    public Ticket getTicket(int number) {
        for (Ticket ticket : tickets) {
            if (ticket.getNumber() == number) {
                return ticket;
            }
        }
        return null;
    }

    public void updateTicketStatus(int number, String status) {
        Ticket ticket = getTicket(number);
        if (ticket != null) {
            ticket.setStatus(status);
            System.out.println("Ticket #" + number + " updated to: " + status);
