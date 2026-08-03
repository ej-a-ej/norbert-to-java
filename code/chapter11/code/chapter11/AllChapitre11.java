/**
 * CHAPITRE 11 — STATIC
 */

public class TrainV5 {
    private static int totalTrains = 0;
    private String number;
    private String destination;
    private int hour;
    public TrainV5(String number, String destination, int hour) {
        this.number = number;
        this.destination = destination;
        this.hour = hour;
        totalTrains++;
    }
    public static int getTotalTrains() {
        return totalTrains;
    }
    public void display() {
        System.out.println("Train " + number + " to " + destination);
        System.out.println("Departure: " + hour + ":00");
        System.out.println("Total trains: " + totalTrains);
    }
}

class TestTrainV5 {
    public static void main(String[] args) {
        System.out.println("Total trains: " + TrainV5.getTotalTrains());
        TrainV5 t1 = new TrainV5("TGV 701", "Lyon", 14);
        TrainV5 t2 = new TrainV5("TER 405", "Rennes", 16);
        TrainV5 t3 = new TrainV5("TGV 801", "Paris", 10);
        System.out.println("Total trains: " + TrainV5.getTotalTrains());
        t1.display();
    }
}

class Constants {
    public static final int MAX_MESSAGES = 100;
    public static final String DEFAULT_VERSION = "1.0";
    public static final String APP_NAME = "Lya Assistant";
}

class LyaV5 {
    private static int totalInstances = 0;
    public static final String APP_NAME = "Lya Assistant";
    public static final String DEFAULT_VERSION = "1.0";
    private String name;
    private String version;
    private int messagesProcessed;
    private boolean ready;
    public LyaV5(String name, String version) {
        this.name = name;
        this.version = version;
        this.messagesProcessed = 0;
        this.ready = true;
        totalInstances++;
    }
    public LyaV5() {
        this("Lya", DEFAULT_VERSION);
    }
    public static int getTotalInstances() {
        return totalInstances;
    }
    public static void displayAppInfo() {
        System.out.println("=== " + APP_NAME + " ===");
        System.out.println("Total instances: " + totalInstances);
        System.out.println("Default version: " + DEFAULT_VERSION);
    }
    public void greet() {
        System.out.println("Hello, I'm " + name + ".");
        System.out.println("Version " + version);
    }
}
