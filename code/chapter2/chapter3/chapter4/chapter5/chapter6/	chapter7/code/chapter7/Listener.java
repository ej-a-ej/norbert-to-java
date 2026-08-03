Fichier 1 : code/chapter7/Listener.java

java
import java.util.Scanner;

public class Listener {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
Fichier 2 : code/chapter7/NumberInput.java

java
import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consomme le retour à la ligne
        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
        scanner.close();
    }
}
Fichier 3 : code/chapter7/LyaInteractive.java

java
import java.util.Scanner;

public class LyaInteractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== LYA ASSISTANT ===");
        System.out.println("Hello! I'm Lya.");
        System.out.println("Type 'quit' to stop.");
        
        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine();
            
            if (input.equals("quit")) {
                System.out.println("Goodbye!");
                break;
            } else if (input.equals("hello")) {
                System.out.println("Hello! How can I help you?");
            } else if (input.equals("help")) {
                System.out.println("Commands: hello, help, quit");
            } else {
                System.out.println("I don't understand that.");
            }
        }
        scanner.close();
    }
}
