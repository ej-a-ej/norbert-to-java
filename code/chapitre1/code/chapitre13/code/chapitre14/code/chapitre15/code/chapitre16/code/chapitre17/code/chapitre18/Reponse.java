import java.util.ArrayList;

public class Reponse {
    private String texte;
    private String type;
    private ArrayList<String> elements;
    private String titre;
    
    public Reponse(String texte) {
        this.texte = texte;
        this.type = "simple";
        this.elements = new ArrayList<String>();
        this.titre = "";
    }
    
    public Reponse(String titre, ArrayList<String> elements, String type) {
        this.titre = titre;
        this.elements = elements;
        this.type = type;
        this.texte = "";
    }
    
    public void afficher() {
        if (type.equals("simple")) {
            if (!titre.isEmpty()) System.out.println(titre);
            System.out.println(texte);
        } else if (type.equals("liste")) {
            if (!titre.isEmpty()) System.out.println(titre);
            for (int i = 0; i < elements.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + elements.get(i));
            }
        }
    }
    
    public static void main(String[] args) {
        Reponse simple = new Reponse("Bonjour ! Comment puis-je t'aider ?");
        simple.afficher();
        
        ArrayList<String> liste = new ArrayList<String>();
        liste.add("Client : Alice");
        liste.add("Statut : En cours");
        liste.add("Priorité : Haute");
        Reponse structuree = new Reponse("Détails de la commande", liste, "liste");
        structuree.afficher();
    }
}

