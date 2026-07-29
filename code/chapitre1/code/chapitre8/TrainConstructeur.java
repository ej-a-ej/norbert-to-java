public class TrainConstructeur {
    String numero;
    String destination;
    int heure;
    
    public TrainConstructeur(String numero, String destination, int heure) {
        this.numero = numero;
        this.destination = destination;
        this.heure = heure;
    }
    
    public TrainConstructeur(String numero, String destination) {
        this(numero, destination, 12);
    }
    
    void afficher() {
        System.out.println("Train " + numero + " pour " + destination);
        System.out.println("Départ à " + heure + "h");
    }
    
    public static void main(String[] args) {
        TrainConstructeur train1 = new TrainConstructeur("TGV 701", "Lyon", 14);
        TrainConstructeur train2 = new TrainConstructeur("TER 405", "Rennes");
        
        train1.afficher();
        System.out.println();
        train2.afficher();
    }
}
