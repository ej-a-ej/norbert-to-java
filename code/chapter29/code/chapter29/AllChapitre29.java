/**
 * CHAPITRE 29 — BASE DE DONNÉES
 */

import java.sql.*;
import java.util.ArrayList;

public class Database {
    private Connection connection;

    public Database() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:lya.db");
            createTables();
            System.out.println("Database connected.");
        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    private void createTables() {
        try (Statement stmt = connection.createStatement()) {
            stmt.execute("CREATE TABLE IF NOT EXISTS orders (" +
                         "id INTEGER PRIMARY KEY," +
                         "client TEXT," +
                         "description TEXT," +
                         "status TEXT," +
                         "priority TEXT," +
                         "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");
            stmt.execute("CREATE TABLE IF NOT EXISTS tickets (" +
                         "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                         "client TEXT," +
                         "description TEXT," +
                         "priority TEXT," +
                         "status TEXT," +
                         "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");
            stmt.execute("CREATE TABLE IF NOT EXISTS history (" +
                         "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                         "user_message TEXT," +
                         "ly_response TEXT," +
                         "timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");
            stmt.execute("CREATE TABLE IF NOT EXISTS responses (" +
                         "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                         "keyword TEXT UNIQUE," +
                         "response TEXT," +
                         "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");
            System.out.println("Tables created.");
        } catch (SQLException e) {
            System.out.println("Table creation error: " + e.getMessage());
        }
    }

    public void saveOrder(OrderV2 order) {
        String sql = "INSERT OR REPLACE INTO orders (id, client, description, status, priority) " +
                     "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, order.getNumber());
            stmt.setString(2, order.getClient());
            stmt.setString(3, order.getDescription());
            stmt.setString(4, order.getStatus());
            stmt.setString(5, order.getPriority());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Save order error: " + e.getMessage());
        }
    }

    public OrderV2 getOrder(int id) {
        String sql = "SELECT * FROM orders WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new OrderV2(
                    rs.getInt("id"),
                    rs.getString("client"),
                    rs.getString("description"),
                    rs.getString("status"),
                    rs.getString("priority")
                );
            }
        } catch (SQLException e) {
            System.out.println("Get order error: " + e.getMessage());
        }
        return null;
    }

    public ArrayList<OrderV2> getAllOrders() {
        ArrayList<OrderV2> orders = new ArrayList<>();
        String sql = "SELECT * FROM orders ORDER BY id DESC";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                orders.add(new OrderV2(
                    rs.getInt("id"),
                    rs.getString("client"),
                    rs.getString("description"),
                    rs.getString("status"),
                    rs.getString("priority")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Get all orders error: " + e.getMessage());
        }
        return orders;
    }

    public void close() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Database closed.");
            }
        } catch (SQLException e) {
            System.out.println("Close error: " + e.getMessage());
        }
    }
}

class TestDatabase {
    public static void main(String[] args) {
        Database db = new Database();
        OrderV2 order = new OrderV2(1001, "Alice", "Payment issue", "high");
        db.saveOrder(order);
        System.out.println("Order saved.");
        OrderV2 retrieved = db.getOrder(1001);
        if (retrieved != null) {
            retrieved.display();
        }
        db.close();
    }
}
