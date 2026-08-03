/**
 * CHAPITRE 10 — ENCAPSULATION
 */

public class TrainV4 {
    private String number;
    private String destination;
    private int hour;
    public TrainV4(String number, String destination, int hour) {
        this.number = number;
        this.destination = destination;
        this.hour = hour;
    }
    public String getNumber() { return number; }
    public String getDestination() { return destination; }
    public int getHour() { return hour; }
    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Invalid hour! Must be between 0 and 23.");
        }
    }
    public void display() {
        System.out.println("Train " + number + " to " + destination);
        System.out.println("Departure: " + hour + ":00");
    }
}

class TestTrainV4 {
    public static void main(String[] args) {
        TrainV4 train = new TrainV4("TGV 701", "Lyon", 14);
        System.out.println("Train: " + train.getNumber());
        System.out.println("Destination: " + train.getDestination());
        System.out.println("Hour: " + train.getHour());
        train.setHour(25);
        train.setHour(16);
        System.out.println("New hour: " + train.getHour());
    }
}

class LyaV4 {
    private String name;
    private String version;
    private int messagesProcessed;
    private boolean ready;
    public LyaV4(String name, String version) {
        this.name = name;
        this.version = version;
        this.messagesProcessed = 0;
        this.ready = true;
    }
    public String getName() { return name; }
    public String getVersion() { return version; }
    public int getMessagesProcessed() { return messagesProcessed; }
    public boolean isReady() { return ready; }
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
    public void setVersion(String version) {
        if (version != null && !version.trim().isEmpty()) {
            this.version = version;
        }
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public void processMessage(String message) {
        if (!ready) {
            System.out.println("Lya is not ready.");
            return;
        }
        messagesProcessed++;
        System.out.println("Processing: " + message);
        System.out.println("Messages processed: " + messagesProcessed);
    }
    public void greet() {
        System.out.println("Hello, I'm " + name + ".");
        System.out.println("Version " + version);
    }
}
