/**
 * CHAPITRE 30 — JPA
 */

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class OrderJPA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String client;
    private String description;
    private String status;
    private String priority;

    public OrderJPA() {}

    public OrderJPA(String client, String description, String priority) {
        this.client = client;
        this.description = description;
        this.status = "Pending";
        this.priority = priority;
    }

    public int getId() { return id; }
    public String getClient() { return client; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
    public String getPriority() { return priority; }
    public void setStatus(String status) { this.status = status; }
}

import javax.persistence.*;
import java.util.List;

class OrderRepositoryJPA {
    private EntityManager entityManager;

    public OrderRepositoryJPA() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("lyaPU");
        this.entityManager = factory.createEntityManager();
    }

    public void save(OrderJPA order) {
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            entityManager.persist(order);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            System.out.println("Error saving order: " + e.getMessage());
        }
    }

    public OrderJPA findById(int id) {
        return entityManager.find(OrderJPA.class, id);
    }

    public List<OrderJPA> findAll() {
        return entityManager.createQuery("SELECT o FROM OrderJPA o", OrderJPA.class)
                           .getResultList();
    }

    public void close() {
        if (entityManager != null) {
            entityManager.close();
        }
    }
}
