/**
 * CHAPITRE 16 — DONNÉES STRUCTURÉES
 */

public class Order {
    private int number;
    private String client;
    private String description;
    private String status;
    private String priority;

    public Order(int number, String client, String description) {
        this.number = number;
        this.client = client;
        this.description = description;
        this.status = "Pending";
        this.priority = "medium";
    }

    public Order(int number, String client, String description, String priority) {
        this(number, client, description);
        this.priority = priority;
    }

    public int getNumber() { return number; }
    public String getClient() { return client; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
    public String getPriority() { return priority; }

    public void setStatus(String status) {
        if (status != null && !status.trim().isEmpty()) {
            this.status = status;
        }
    }

    public void display() {
        System.out.println("=== Order #" + number + " ===");
        System.out.println("Client: " + client);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("Priority: " + priority);
    }
}

class Ticket {
    private int number;
    private String client;
    private String description;
    private String priority;
    private String status;

    public Ticket(int number, String client, String description, String priority) {
        this.number = number;
        this.client = client;
        this.description = description;
        this.priority = priority;
        this.status = "Open";
    }

    public int getNumber() { return number; }
    public String getClient() { return client; }
    public String getDescription() { return description; }
    public String getPriority() { return priority; }
    public String getStatus() { return status; }

    public void setStatus(String status) {
        if (status != null && !status.trim().isEmpty()) {
            this.status = status;
        }
    }

    public void display() {
        System.out.println("=== Ticket #" + number + " ===");
        System.out.println("Client: " + client);
        System.out.println("Description: " + description);
        System.out.println("Priority: " + priority);
        System.out.println("Status: " + status);
    }
}

import java.util.HashMap;

class LyaV9 {
    private HashMap<Integer, Order> orders;
    private int nextOrderNumber;

    public LyaV9() {
        this.orders = new HashMap<>();
        this.nextOrderNumber = 1001;
    }

    public void addOrder(String client, String description, String priority) {
        Order order = new Order(nextOrderNumber, client, description, priority);
        orders.put(nextOrderNumber, order);
        nextOrderNumber++;
        System.out.println("Order #" + order.getNumber() + " created for " + client);
    }

    public Order getOrder(int number) {
        return orders.get(number);
    }

    public void updateOrderStatus(int number, String status) {
        Order order = orders.get(number);
        if (order != null) {
            order.setStatus(status);
            System.out.println("Order #" + number + " updated to: " + status);
        } else {
            System.out.println("Order #" + number + " not found.");
        }
    }

    public void showOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
            return;
        }
        System.out.println("--- All Orders ---");
        for (Order order : orders.values()) {
            order.display();
        }
    }
}
