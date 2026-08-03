/**
 * CHAPITRE 24 — REST API
 */

public class OrderV2 {
    private int number;
    private String client;
    private String description;
    private String status;
    private String priority;

    public OrderV2(int number, String client, String description, String priority) {
        this.number = number;
        this.client = client;
        this.description = description;
        this.status = "Pending";
        this.priority = priority;
    }

    public OrderV2(int number, String client, String description, String status, String priority) {
        this.number = number;
        this.client = client;
        this.description = description;
        this.status = status;
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

    public String toJson() {
        return "{" +
               "\"number\":" + number + "," +
               "\"client\":\"" + client + "\"," +
               "\"description\":\"" + description + "\"," +
               "\"status\":\"" + status + "\"," +
               "\"priority\":\"" + priority + "\"" +
               "}";
    }

    public void display() {
        System.out.println("=== Order #" + number + " ===");
        System.out.println("Client: " + client);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("Priority: " + priority);
    }
}

import java.util.HashMap;

class LyaAPI {
    private HashMap<Integer, OrderV2> orders;
    private HashMap<Integer, Ticket> tickets;
    private int nextOrderId;
    private int nextTicketId;

    public LyaAPI() {
        this.orders = new HashMap<>();
        this.tickets = new HashMap<>();
        this.nextOrderId = 1001;
        this.nextTicketId = 1;
        orders.put(1001, new OrderV2(1001, "Alice", "Payment issue", "high"));
        orders.put(1002, new OrderV2(1002, "Bob", "Delivery delay", "medium"));
        tickets.put(1, new Ticket(1, "Charlie", "Cannot login", "urgent"));
        tickets.put(2, new Ticket(2, "Alice", "Bug in payment", "high"));
    }

    public String getOrders() {
        StringBuilder response = new StringBuilder();
        response.append("{\"type\":\"orders\",");
        response.append("\"count\":").append(orders.size()).append(",");
        response.append("\"data\":[");
        boolean first = true;
        for (OrderV2 order : orders.values()) {
            if (!first) response.append(",");
            response.append(order.toJson());
            first = false;
        }
        response.append("]}");
        return response.toString();
    }

    public String getOrder(int id) {
        OrderV2 order = orders.get(id);
        if (order == null) {
            return "{\"error\":\"Order not found\"}";
        }
        return order.toJson();
    }

    public String createOrder(String client, String description, String priority) {
        OrderV2 order = new OrderV2(nextOrderId, client, description, priority);
        orders.put(nextOrderId, order);
        nextOrderId++;
        return order.toJson();
    }

    public String updateOrder(int id, String status) {
        OrderV2 order = orders.get(id);
        if (order == null) {
            return "{\"error\":\"Order not found\"}";
        }
        order.setStatus(status);
        return order.toJson();
    }

    public String deleteOrder(int id) {
        if (orders.containsKey(id)) {
            orders.remove(id);
            return "{\"success\":true,\"message\":\"Order deleted\"}";
        }
        return "{\"error\":\"Order not found\"}";
    }

    public String getTickets() {
        StringBuilder response = new StringBuilder();
        response.append("{\"type\":\"tickets\",");
        response.append("\"count\":").append(tickets.size()).append(",");
        response.append("\"data\":[");
        boolean first = true;
        for (Ticket ticket : tickets.values()) {
            if (!first) response.append(",");
            response.append(ticket.toJson());
            first = false;
        }
        response.append("]}");
        return response.toString();
    }

    public String getTicket(int id) {
        Ticket ticket = tickets.get(id);
        if (ticket == null) {
            return "{\"error\":\"Ticket not found\"}";
        }
        return ticket.toJson();
    }

    public String getOrdersByClient(String client) {
        StringBuilder result = new StringBuilder();
        result.append("{\"orders\":[");
        boolean first = true;
        for (OrderV2 order : orders.values()) {
            if (order.getClient().equalsIgnoreCase(client)) {
                if (!first) result.append(",");
                result.append(order.toJson());
                first = false;
            }
        }
        result.append("]}");
        return result.toString();
    }
}
