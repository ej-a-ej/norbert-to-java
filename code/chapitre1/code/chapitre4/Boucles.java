public class Boucles {
    public static void main(String[] args) {
        // While loop - count push-ups
        int count = 1;
        while (count <= 5) {
            System.out.println("Push-up number " + count);
            count = count + 1;
        }
        System.out.println("Done!");
        
        // For loop - multiplication table
        System.out.println("\nMultiplication table for 7:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }
        
        // Sum of numbers 1 to 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("\nSum of 1 to 100: " + sum);
    }
}
