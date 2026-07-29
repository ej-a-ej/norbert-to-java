public class Train {
    String numero;
    String destination;
    int heure;
    
    void afficher() {
        System.out.println("Train " + numero + " pour " + destination);
        System.out.println("Départ à " + heure + "h");
    }
}


public class Gare {
    public static void main(String[] args) {
        Train train1 = new Train();
        train1.numero = "TGV 701";
        train1.destination = "Lyon";
        train1.heure = 14;
        
        Train train2 = new Train();
        train2.numero = "TER 405";
        train2.destination = "Rennes";
        train2.heure = 16;
        
        train1.afficher();
        System.out.println();
        train2.afficher();
    }
}
