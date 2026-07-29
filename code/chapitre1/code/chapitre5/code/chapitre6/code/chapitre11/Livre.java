public class Livre {
    private String titre;
    private String auteur;
    private int pages;
    
    public Livre(String titre, String auteur, int pages) {
        this.titre = titre;
        this.auteur = auteur;
        this.pages = pages;
    }
    
    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public int getPages() { return pages; }
    
    public void afficher() {
        System.out.println(titre + " - " + auteur + " (" + pages + " pages)");
    }
}

import java.util.ArrayList;

public class Bibliotheque {
    public static void main(String[] args) {
        ArrayList<Livre> bibliotheque = new ArrayList<Livre>();
        
        bibliotheque.add(new Livre("Le Petit Prince", "Saint-Exupéry", 96));
        bibliotheque.add(new Livre("1984", "Orwell", 328));
        bibliotheque.add(new Livre("L'Étranger", "Camus", 123));
        
        System.out.println("📚 Ma bibliothèque :");
        for (Livre livre : bibliotheque) {
            livre.afficher();
        }
        
        // Trouver le livre le plus long
        Livre plusLong = bibliotheque.get(0);
        for (Livre livre : bibliotheque) {
            if (livre.getPages() > plusLong.getPages()) {
                plusLong = livre;
            }
        }
        
        System.out.println("\n📖 Le plus long :");
        plusLong.afficher();
        
        // Ajouter un livre
        bibliotheque.add(new Livre("Harry Potter", "J.K. Rowling", 400));
        
        System.out.println("\n📚 Après ajout (" + bibliotheque.size() + " livres) :");
        for (Livre livre : bibliotheque) {
            livre.afficher();
        }
    }
}
