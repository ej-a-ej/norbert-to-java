import java.util.ArrayList;
import java.util.HashMap;

public class Collection {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> livres = new ArrayList<String>();
        livres.add("Le Petit Prince");
        livres.add("1984");
        livres.add("L'Étranger");
        livres.add(1, "Harry Potter");
        livres.remove("1984");
        
        System.out.println("Mes livres (" + livres.size() + ") :");
        for (String livre : livres) {
            System.out.println("- " + livre);
        }
        
        // HashMap
        HashMap<String, String> annuaire = new HashMap<String, String>();
        annuaire.put("Alice", "0612345678");
        annuaire.put("Bob", "0623456789");
        annuaire.put("Charlie", "0634567890");
        
        System.out.println("\nAnnuaire :");
        for (String nom : annuaire.keySet()) {
            System.out.println(nom + " → " + annuaire.get(nom));
        }
    }
}
