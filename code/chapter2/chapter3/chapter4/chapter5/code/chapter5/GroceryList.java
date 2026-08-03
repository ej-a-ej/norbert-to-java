Fichier 1 : code/chapter5/GroceryList.java

java
public class GroceryList {
    public static void main(String[] args) {
        String[] groceries = {"bread", "milk", "eggs", "apples", "butter"};

        System.out.println("First item: " + groceries[0]);
        System.out.println("Second item: " + groceries[1]);
        System.out.println("Last item: " + groceries[4]);

        System.out.println("\nMy grocery list:");
        for (int i = 0; i < groceries.length; i++) {
            System.out.println("- " + groceries[i]);
        }
    }
}
Fichier 2 : code/chapter5/LyaCommandsV1.java

java
public class LyaCommandsV1 {
    public static void main(String[] args) {
        String[] commands = {"help", "hello", "time", "exit"};

        System.out.println("Available commands:");
        for (String command : commands) {
            System.out.println("- " + command);
        }
    }
}
