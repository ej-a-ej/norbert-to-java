/**
 * CHAPITRE 3 — NORBERT CHOISIT
 * Tous les exemples du chapitre 3 réunis dans un seul fichier.
 * Chaque classe peut être exécutée indépendamment.
 */

// ============================================================
// EXEMPLE 1 — Condition simple (if/else)
// ============================================================

class Choices {
    public static void main(String[] args) {
        int hour = 14;

        if (hour < 12) {
            System.out.println("Good morning.");
        } else {
            System.out.println("Good afternoon.");
        }
    }
}

// ============================================================
// EXEMPLE 2 — Conditions multiples (if/else if/else)
// ============================================================

class MoreChoices {
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

// ============================================================
// EXEMPLE 3 — Lya répond différemment selon la demande
// ============================================================

class LyaReply {
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

// ============================================================
// EXERCICES DU CHAPITRE 3
// ============================================================

// Exercice 1 — La température
class TemperatureCheck {
    public static void main(String[] args) {
        int temperature = 12;

        if (temperature < 15) {
            System.out.println("Il fait frais.");
        } else {
            System.out.println("Il fait bon.");
        }
    }
}

// Exercice 2 — Le message personnalisé
class PersonalizedMessage {
    public static void main(String[] args) {
        int hour = 15;

        if (hour < 12) {
            System.out.println("Bonjour Lya.");
        } else if (hour < 18) {
            System.out.println("Bon après-midi Lya.");
        } else {
            System.out.println("Bonsoir Lya.");
        }
    }
}

// Exercice 3 — La condition composée (achat)
class ShoppingBudget {
    public static void main(String[] args) {
        double price = 2.50;
        int quantity = 3;
        double budget = 10.00;

        double total = price * quantity;

        if (total <= budget) {
            System.out.println("J'achète.");
        } else {
            System.out.println("Je n'ai pas assez.");
        }
    }
}
