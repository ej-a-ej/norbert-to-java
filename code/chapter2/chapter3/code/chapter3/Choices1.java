CONDITIONS
Fichier 1 : code/chapter3/Choices.java

java
public class Choices {
    public static void main(String[] args) {
        int hour = 14;

        if (hour < 12) {
            System.out.println("Good morning.");
        } else {
            System.out.println("Good afternoon.");
        }
    }
}
 code/chapter3/MoreChoices.java

java
public class MoreChoices {
    public static void main(String[] args) {
        int hour = 19;

        if (hour < 12) {
            System.out.println("Good morning.");
        } else if (hour < 18) {
            System.out.println("Good afternoon.");
        } else {
            System.out.println("Good evening.");
        }
    }
}
Fichier 3 : code/chapter3/LyaReply.java

java
public class LyaReply {
    public static void main(String[] args) {
        String request = "hello";

        if (request.equals("hello")) {
            System.out.println("Hello! How can I help you?");
        } else if (request.equals("help")) {
            System.out.println("I can answer simple questions.");
        } else {
            System.out.println("I don't understand that yet.");
        }
    }
}
