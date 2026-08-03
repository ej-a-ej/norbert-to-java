/**
 * CHAPITRE 9 — LE CONSTRUCTEUR
 */

public class TrainV2 {
    String number;
    String destination;
    int hour;
    public TrainV2(String number, String destination, int hour) {
        this.number = number;
        this.destination = destination;
        this.hour = hour;
    }
    void display() {
        System.out.println("Train " + number + " to " + destination);
        System.out.println("Departure: " + hour + ":00");
    }
}

class TrainV3 {
    String number;
    String destination;
    int hour;
    public TrainV3(String number, String destination, int hour) {
        this.number = number;
        this.destination = destination;
        this.hour = hour;
    }
    public TrainV3(String number, String destination) {
        this(number, destination, 12);
    }
    void display() {
        System.out.println("Train " + number + " to " + destination);
        System.out.println("Departure: " + hour + ":00");
    }
}

class LyaV3 {
    String name;
    String version;
    int messagesProcessed;
    public LyaV3(String name, String version) {
        this.name = name;
        this.version = version;
        this.messagesProcessed = 0;
    }
    public LyaV3() {
        this("Lya", "0.1");
    }
    void greet() {
        System.out.println("Hello, I'm " + name + ".");
        System.out.println("Version " + version);
    }
    void respond(String request) {
        messagesProcessed++;
        System.out.println("Processing: " + request);
        System.out.println("Messages processed: " + messagesProcessed);
    }
}

class TestConstructors {
    public static void main(String[] args) {
        LyaV3 lya = new LyaV3("Lya", "1.0");
        LyaV3 defaultLya = new LyaV3();
        lya.greet();
        defaultLya.greet();
    }
}
