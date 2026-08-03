/**
 * CHAPITRE 12 — EXCEPTIONS
 */

public class Division {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }
}

class SafeDivision {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        System.out.println("Program continues.");
    }
}

class MultipleCatch {
    public static void main(String[] args) {
        String[] numbers = {"10", "5", "abc", "0"};
        for (String num : numbers) {
            try {
                int value = Integer.parseInt(num);
                int result = 100 / value;
                System.out.println("Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Not a valid number: " + num);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero: " + num);
            }
        }
    }
}

class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Trying something risky...");
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This always runs.");
        }
    }
}

class EmptyRequestException extends Exception {
    public EmptyRequestException(String message) {
        super(message);
    }
}

class LyaV6 {
    private String name;
    private String version;
    public LyaV6(String name, String version) {
        this.name = name;
        this.version = version;
    }
    public void respond(String request) throws EmptyRequestException {
        if (request == null || request.trim().isEmpty()) {
            throw new EmptyRequestException("Request cannot be empty!");
        }
        System.out.println("Processing: " + request);
    }
}

class TestLyaV6 {
    public static void main(String[] args) {
        LyaV6 lya = new LyaV6("Lya", "1.0");
        try {
            lya.respond("Hello");
            lya.respond("");
        } catch (EmptyRequestException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Request handling complete.");
        }
    }
}
