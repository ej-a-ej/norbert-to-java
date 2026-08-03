Fichier 1 : code/chapter6/Methods.java

java
public class Methods {
    public static void main(String[] args) {
        sayHello();
        sayHello();
    }

    public static void sayHello() {
        System.out.println("Hello from Lya.");
    }
}
Fichier 2 : code/chapter6/Greetings.java

java
public class Greetings {
    public static void main(String[] args) {
        greet("Alice");
        greet("Norbert");
        greet("Lya");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
Fichier 3 : code/chapter6/Calculator.java

java
public class Calculator {
    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println("5 + 3 = " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
Fichier 4 : code/chapter6/LyaOrganized.java

java
import java.util.Scanner;

public class LyaOrganized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayWelcome();
        
        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                handleRequest(input);
            }
        }
        scanner.close();
    }

    public static void displayWelcome() {
        System.out.println("=== LYA ASSISTANT ===");
        System.out.println("Type 'quit' to stop.");
    }

    public static void handleRequest(String request) {
        if (request.equals("hello")) {
            System.out.println("Hello! How can I help you?");
        } else if (request.equals("help")) {
            System.out.println("I can handle: hello, help, time");
        } else if (request.equals("time")) {
            System.out.println("I don't have a clock yet.");
        } else {
            System.out.println("I don't understand that.");
        }
    }
}
Fichier 5 : code/chapter6/EvenChecker.java

java
public class EvenChecker {
    public static void main(String[] args) {
        System.out.println("Is 4 even? " + isEven(4));
        System.out.println("Is 7 even? " + isEven(7));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
