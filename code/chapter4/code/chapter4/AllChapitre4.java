/**
 * CHAPITRE 4 — NORBERT RÉPÈTE
 */

public class Pushups {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 5) {
            System.out.println("Push-up number " + count);
            count = count + 1;
        }
        System.out.println("Done!");
    }
}

class ForPushups {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Push-up number " + i);
        }
        System.out.println("Done!");
    }
}

class InfiniteLoop {
    public static void main(String[] args) {
        int count = 1;
        // ATTENTION: Cette boucle ne s'arrête jamais !
        while (count <= 5) {
            System.out.println("Push-up number " + count);
            // count = count + 1;  // ← Cette ligne est manquante !
        }
    }
}
