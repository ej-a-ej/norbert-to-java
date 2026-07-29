public class TrainEncapsule {
    private String numero;
    private String destination;
    private int heure;
    
    public TrainEncapsule(String numero, String destination, int heure) {
        this.numero = numero;
        this.destination = destination;
        this.heure = heure;
    }
    
    public String getNumero() { return numero; }
    public String getDestination() { return destination; }
    public int getHeure() { return heure; }
    
    public void setHeure(int heure) {
        if (heure >= 0 && heure <= 23) {
            this.heure = heure;
        } else {
            System.out.println("Heure invalide !");
        }
    }
    
    public void afficher() {
        System.out.println("Train " + numero + " pour " + destination);
        System.out.println("Départ à " + heure + "h");
    }
    
    public static void main(String[] args) {
        TrainEncapsule train = new TrainEncapsule("TGV 701", "Lyon", 14);
        train.afficher();
        train.setHeure(15);
        train.afficher();
        train.setHeure(25);
    }
}
