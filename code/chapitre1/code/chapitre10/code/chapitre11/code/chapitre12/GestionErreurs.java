import java.util.Scanner;

public class GestionErreurs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Donne un nombre : ");
        String saisie = scanner.nextLine();
        
        try {
            int nombre = Integer.parseInt(saisie);
            System.out.println("Tu as saisi : " + nombre);
            System.out.println("Son double : " + (nombre * 2));
        } catch (NumberFormatException e) {
            System.out.println("Erreur : ce n'est pas un nombre valide !");
            System.out.println("Détail : " + e.getMessage());
        }
        
        System.out.println("Le programme continue.");
        scanner.close();
    }
}
