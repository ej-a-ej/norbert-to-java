public class Methodes {
    public static void main(String[] args) {
        direBonjour();
        direBonjourA("Alice");
        direBonjourA("Bob");
        
        int somme = additionner(5, 3);
        System.out.println("5 + 3 = " + somme);
    }
    
    public static void direBonjour() {
        System.out.println("Bonjour, je suis Lya.");
    }
    
    public static void direBonjourA(String nom) {
        System.out.println("Bonjour " + nom + " !");
    }
    
    public static int additionner(int a, int b) {
        return a + b;
    }
}
