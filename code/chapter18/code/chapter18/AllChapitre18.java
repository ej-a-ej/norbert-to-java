/**
 * CHAPITRE 18 — HASHMAP
 */

import java.util.ArrayList;
import java.util.HashMap;

public class LyaV11 {
    private HashMap<String, String> responses;
    private HashMap<Integer, Order> orders;
    private HashMap<String, ArrayList<Order>> ordersByClient;

    public LyaV11() {
        this.responses = new HashMap<>();
        this.orders = new HashMap<>();
        this.ordersByClient = new HashMap<>();
        responses.put("hello", "Hello! How can I help you?");
        responses.put("help", "I can answer simple questions.");
    }

    public void addOrder(int number, String client, String description, String priority) {
        Order order = new Order(number, client, description, priority);
        orders.put(number, order);
        if (!ordersByClient.containsKey(client)) {
            ordersByClient.put(client, new ArrayList<>());
        }
        ordersByClient.get(client).add(order);
        System.out.println("Order #" + number + " created for " + client);
    }

    public Order getOrder(int number) {
        return orders.get(number);
    }

    public ArrayList<Order> getOrdersByClient(String client) {
        return ordersByClient.get(client);
    }

    public void showOrdersByClient(String client) {
        ArrayList<Order> clientOrders = ordersByClient.get(client);
        if (clientOrders == null || clientOrders.isEmpty()) {
            System.out.println("No orders for " + client);
            return;
        }
        System.out.println("--- Orders for " + client + " ---");
        for (Order order : clientOrders) {
            System.out.println("#" + order.getNumber() + ": " + order.getDescription() +
                             " (" + order.getStatus() + ")");
        }
    }
}

class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> responses = new HashMap<>();
        responses.put("hello", "Hello!");
        responses.put("help", "How can I help?");
        responses.put("goodbye", "Goodbye!");
        System.out.println("Response for 'hello': " + responses.get("hello"));
        System.out.println("Response for 'unknown': " + responses.get("unknown"));
        if (responses.containsKey("help")) {
            System.out.println("Help response: " + responses.get("help"));
        }
        for (String key : responses.keySet()) {
            System.out.println(key + " -> " + responses.get(key));
        }
    }
}
