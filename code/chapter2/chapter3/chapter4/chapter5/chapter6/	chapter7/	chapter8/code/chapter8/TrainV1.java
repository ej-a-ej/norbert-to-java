Fichier 1 : code/chapter8/TrainV1.java

java
public class TrainV1 {
    String number;
    String destination;
    int hour;

    void display() {
        System.out.println("Train " + number + " to " + destination);
        System.out.println("Departure: " + hour + ":00");
    }
}
Fichier 2 : code/chapter8/Station.java

java
public class Station {
    public static void main(String[] args) {
        TrainV1 train1 = new TrainV1();
        train1.number = "TGV 701";
        train1.destination = "Lyon";
        train1.hour = 14;

        TrainV1 train2 = new TrainV1();
        train2.number = "TER 405";
        train2.destination = "Rennes";
        train2.hour = 16;

        train1.display();
        System.out.println();
        train2.display();
    }
}
Fichier 3 : code/chapter8/LyaV2.java

java
public class LyaV2 {
    String name;
    String version;
    int messagesProcessed;

    void greet() {
        System.out.println("Hello, I'm " + name + ".");
        System.out.println("Version " + version);
    }

    void respond(String request) {
        messagesProcessed++;
        System.out.println("Processing: " + request);
        System.out.println("Messages processed: " + messagesProcessed);
    }

    void displayStatus() {
        System.out.println("--- Lya Status ---");
        System.out.println("Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Messages: " + messagesProcessed);
    }
}
Fichier 4 : code/chapter8/TestLyaV2.java

java
public class TestLyaV2 {
    public static void main(String[] args) {
        LyaV2 lya = new LyaV2();
        lya.name = "Lya";
        lya.version = "0.1";
        lya.messagesProcessed = 0;

        lya.greet();
        lya.respond("Hello!");
        lya.respond("What's the weather?");
        lya.displayStatus();

        LyaV2 lya2 = new LyaV2();
        lya2.name = "Lya Pro";
        lya2.version = "1.0";
        lya2.messagesProcessed = 0;

        lya2.greet();
    }
}
