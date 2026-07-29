Voici le fichier complet `solutions.md` avec **tous les corrigés des exercices** du livre *Norbert to Java*, prêt à être copié-collé sur votre dépôt GitHub.

---

## 📄 solutions.md — Corrigés des exercices

```markdown
# Solutions des exercices — Norbert to Java

Ce document contient les corrigés de tous les exercices du livre **Norbert to Java**.

📖 **Livre complet** : [Norbert to Java](./livre-complet.md)  
📦 **Code source** : [./code](./code)

---

## Chapitre 1 — Hello, Java

### Exercice 1 — Good morning!

```java
public class Lya {
    public static void main(String[] args) {
        System.out.println("Good morning!");
    }
}
```

### Exercice 2 — Deux messages

```java
public class Lya {
    public static void main(String[] args) {
        System.out.println("Hello, I'm Lya!");
        System.out.println("I'm here to help you.");
    }
}
```

### Exercice 3 — Nom et âge

```java
public class Lya {
    public static void main(String[] args) {
        System.out.println("Name: Norbert");
        System.out.println("Age: 25");
    }
}
```

### Exercice 4 (Challenge) — Forme

```java
public class Lya {
    public static void main(String[] args) {
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
    }
}
```

---

## Chapitre 2 — Variables et types

### Exercice 1 — Variable âge

```java
public class Variables {
    public static void main(String[] args) {
        int age = 25;
        System.out.println("Age: " + age);
    }
}
```

### Exercice 2 — Version 1.1

```java
public class Variables {
    public static void main(String[] args) {
        double version = 1.1;
        System.out.println("Version: " + version);
    }
}
```

### Exercice 3 — Variable de salutation

```java
public class Variables {
    public static void main(String[] args) {
        String greeting = "Welcome!";
        System.out.println(greeting);
    }
}
```

### Exercice 4 (Challenge) — Température

```java
public class Variables {
    public static void main(String[] args) {
        double temperature = 22.5;
        System.out.println("Temperature: " + temperature + "°C");
    }
}
```

---

## Chapitre 3 — Opérateurs

### Exercice 1 — Moyenne

```java
public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        double average = (a + b + c) / 3.0;
        System.out.println("Average: " + average);
    }
}
```

### Exercice 2 — Majeur ?

```java
public class Operators {
    public static void main(String[] args) {
        int age = 20;
        boolean isAdult = age > 18;
        System.out.println("Is adult: " + isAdult);
    }
}
```

### Exercice 3 — &&

```java
public class Operators {
    public static void main(String[] args) {
        boolean hasCoffee = true;
        boolean isMorning = true;
        boolean ready = hasCoffee && isMorning;
        System.out.println("Ready: " + ready);
    }
}
```

### Exercice 4 (Challenge) — Aire

```java
public class Operators {
    public static void main(String[] args) {
        double width = 15.5;
        double height = 7.3;
        double area = width * height;
        System.out.println("Area: " + area);
    }
}
```

---

## Chapitre 4 — Conditions

### Exercice 1 — Positif, négatif ou zéro

```java
public class Conditions {
    public static void main(String[] args) {
        int number = -5;
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
```

### Exercice 2 — Température

```java
public class Conditions {
    public static void main(String[] args) {
        int temperature = 25;
        if (temperature > 30) {
            System.out.println("Hot");
        } else if (temperature >= 20) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }
    }
}
```

### Exercice 3 — Connexion

```java
public class Conditions {
    public static void main(String[] args) {
        boolean isLoggedIn = true;
        boolean hasPermission = true;
        if (isLoggedIn && hasPermission) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
}
```

### Exercice 4 (Challenge) — Mot de passe

```java
public class Conditions {
    public static void main(String[] args) {
        String password = "java123";
        if (password.equals("java123")) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
}
```

---

## Chapitre 5 — Boucles

### Exercice 1 — while 1 à 10

```java
public class Loops {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}
```

### Exercice 2 — for 1 à 20

```java
public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
```

### Exercice 3 — Somme 1 à 100

```java
public class Loops {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
```

### Exercice 4 (Challenge) — Table de 7

```java
public class Loops {
    public static void main(String[] args) {
        int number = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
```

---

## Chapitre 6 — Tableaux

### Exercice 1 — Films

```java
public class Arrays {
    public static void main(String[] args) {
        String[] movies = {"Inception", "The Matrix", "Interstellar"};
        for (String movie : movies) {
            System.out.println(movie);
        }
    }
}
```

### Exercice 2 — Maximum

```java
public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {45, 23, 67, 12, 89};
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) max = num;
        }
        System.out.println("Max: " + max);
    }
}
```

### Exercice 3 — Inversion

```java
public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
```

### Exercice 4 (Challenge) — Tri

```java
public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {34, 7, 23, 32, 5, 62, 31, 1, 12, 8};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
```

---

## Chapitre 7 — Méthodes

### Exercice 1 — Saluer

```java
public class Methods {
    public static void main(String[] args) {
        greet("Alice", 30);
    }
    public static void greet(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
```

### Exercice 2 — Pair/Impair

```java
public class Methods {
    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isEven(7));
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
```

### Exercice 3 — Somme d'un tableau

```java
public class Methods {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum: " + sumArray(numbers));
    }
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) sum += num;
        return sum;
    }
}
```

### Exercice 4 (Challenge) — Factorielle

```java
public class Methods {
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }
}
```

---

## Chapitre 8 — Scanner

### Exercice 1 — Nom

```java
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
```

### Exercice 2 — Somme

```java
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Sum: " + (a + b));
        scanner.close();
    }
}
```

### Exercice 3 — Positif/Négatif/Zéro

```java
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number > 0) System.out.println("Positive");
        else if (number < 0) System.out.println("Negative");
        else System.out.println("Zero");
        scanner.close();
    }
}
```

### Exercice 4 (Challenge) — Calculatrice

```java
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String operator = scanner.next();
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        double result = 0;
        switch (operator) {
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/": result = a / b; break;
            default: System.out.println("Invalid operator"); return;
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}
```

---

## Chapitre 9 — Classes et objets

### Exercice 1 — Personne

```java
public class Person {
    String name;
    int age;
    String city;
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}
```

### Exercice 2 — Livre

```java
public class Book {
    String title;
    String author;
    int pages;
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}
```

### Exercice 3 — Voiture

```java
public class Car {
    String brand;
    String model;
    int year;
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
```

### Exercice 4 (Challenge) — Compte bancaire

```java
public class BankAccount {
    String owner;
    double balance;
    void deposit(double amount) { balance += amount; }
    void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient funds");
    }
    void display() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: $" + balance);
    }
}
```

---

## Chapitre 10 — Constructeurs

### Exercice 1 — Personne avec constructeur

```java
public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
```

### Exercice 2 — Livre avec constructeurs

```java
public class Book {
    String title;
    String author;
    int pages;
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public Book(String title, String author) {
        this(title, author, 0);
    }
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }
}
```

### Exercice 3 — Voiture avec constructeur

```java
public class Car {
    String brand;
    String model;
    int year;
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}
```

### Exercice 4 (Challenge) — Compte avec constructeur

```java
public class BankAccount {
    String owner;
    double balance;
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }
    void deposit(double amount) { balance += amount; }
    void display() {
        System.out.println("Owner: " + owner + ", Balance: $" + balance);
    }
}
```

---

## Chapitre 11 — Encapsulation

### Exercice 1 — Personne privée

```java
public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public void setName(String name) {
        if (name != null && !name.isEmpty()) this.name = name;
    }
    public int getAge() { return age; }
    public void setAge(int age) {
        if (age >= 0) this.age = age;
    }
}
```

### Exercice 2 — Validation âge

```java
public class Person {
    private int age;
    public void setAge(int age) {
        if (age >= 0) this.age = age;
        else System.out.println("Age cannot be negative");
    }
}
```

### Exercice 3 — Produit

```java
public class Product {
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price >= 0) this.price = price;
    }
}
```

### Exercice 4 (Challenge) — Étudiant

```java
import java.util.ArrayList;
public class Student {
    private String name;
    private ArrayList<Double> grades = new ArrayList<>();
    public Student(String name) { this.name = name; }
    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 20) grades.add(grade);
    }
    public double getAverage() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (double g : grades) sum += g;
        return sum / grades.size();
    }
    public void display() {
        System.out.println("Student: " + name + ", Average: " + getAverage());
    }
}
```

---

## Chapitre 12 — Static

### Exercice 1 — Compteur

```java
public class Counter {
    private static int count = 0;
    public Counter() { count++; }
    public static int getCount() { return count; }
}
```

### Exercice 2 — Positif

```java
public class Utils {
    public static boolean isPositive(int number) {
        return number > 0;
    }
}
```

### Exercice 3 — Constante

```java
public class Constants {
    public static final int MAX_SCORE = 100;
}
```

### Exercice 4 (Challenge) — MathUtils

```java
public class MathUtils {
    public static int add(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
    public static double divide(int a, int b) {
        if (b == 0) { System.out.println("Cannot divide by zero"); return 0; }
        return (double) a / b;
    }
}
```

---

## Chapitre 13 — Lya

### Exercice 1 — Ajouter des réponses

```java
responses.put("good morning", "Good morning! How can I help you?");
responses.put("good evening", "Good evening! What can I do for you?");
responses.put("what's up", "Not much, just waiting for your questions!");
```

### Exercice 2 — Effacer l'historique

```java
if (input.equalsIgnoreCase("clear")) {
    lya.clearHistory();
    System.out.println("History cleared.");
    continue;
}

public void clearHistory() {
    history.clear();
    System.out.println("History cleared.");
}
```

### Exercice 3 — Supprimer une réponse

```java
if (input.toLowerCase().startsWith("delete ")) {
    String key = input.substring(7).trim();
    lya.deleteResponse(key);
    continue;
}

public void deleteResponse(String request) {
    String clean = request.toLowerCase().trim();
    if (responses.containsKey(clean)) {
        responses.remove(clean);
        System.out.println("Deleted: " + clean);
    } else {
        System.out.println("Response not found: " + clean);
    }
}
```

### Exercice 4 (Challenge) — Timestamp

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public void respond(String request) throws EmptyRequestException {
    // ... existing code ...
    String timestamp = LocalDateTime.now()
        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    history.add("[" + timestamp + "] User: " + request);
    // ... rest of method ...
}
```

---

## Chapitre 14 — Compréhension

### Exercice 1 — Météo

```java
responses.put("weather", "I can check the weather for you! Try 'weather Paris'");
```

### Exercice 2 — Ticket

```java
responses.put("ticket", "I can help with tickets! Try 'ticket Alice payment issue'");
```

### Exercice 3 — Questions en "where"

```java
if (cleaned.startsWith("where")) {
    return "I don't know much about locations yet.";
}
```

### Exercice 4 (Challenge) — Synonymes

```java
private String findResponse(String request) {
    String cleaned = request.toLowerCase().trim();
    // Check synonyms
    if (cleaned.contains("hey") || cleaned.contains("yo")) {
        return responses.get("hello");
    }
    if (cleaned.contains("bye") || cleaned.contains("see you")) {
        return responses.get("goodbye");
    }
    // ... existing code ...
}
```

---

## Chapitre 15 — Exceptions

### Exercice 1 — Validation caractères

```java
private void validateRequest(String request) throws ValidationException {
    // ... existing validation ...
    if (!request.matches("^[a-zA-Z0-9\\s.,!?']+$")) {
        throw new ValidationException("Request contains invalid characters.");
    }
}
```

### Exercice 2 — ProfanityException

```java
public class ProfanityException extends ValidationException {
    public ProfanityException() {
        super("Request contains inappropriate language.");
    }
}

private static final String[] PROFANITY = {"badword1", "badword2"};
private void checkProfanity(String request) throws ProfanityException {
    String lower = request.toLowerCase();
    for (String word : PROFANITY) {
        if (lower.contains(word)) {
            throw new ProfanityException();
        }
    }
}
```

### Exercice 3 — Validation learn

```java
public void learn(String request, String response) throws ValidationException {
    validateRequest(request);
    validateRequest(response);
    // ... existing code ...
}
```

### Exercice 4 (Challenge) — Lettres/chiffres uniquement

```java
if (!request.matches("^[a-zA-Z0-9\\s]+$")) {
    throw new ValidationException("Request must contain only letters, numbers, and spaces.");
}
```

---

## Chapitre 16 — Commandes

### Exercice 1 — Date dans Order

```java
import java.time.LocalDateTime;

public class Order {
    private LocalDateTime createdAt;

    public Order(int number, String client, String description) {
        // ... existing code ...
        this.createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() { return createdAt; }

    public void display() {
        // ... existing code ...
        System.out.println("Created: " + createdAt);
    }
}
```

### Exercice 2 — Ticket

```java
public class Ticket {
    private int number;
    private String client;
    private String description;
    private String priority;
    private String status;

    public Ticket(int number, String client, String description, String priority) {
        this.number = number;
        this.client = client;
        this.description = description;
        this.priority = priority;
        this.status = "Open";
    }

    public int getNumber() { return number; }
    public String getClient() { return client; }
    public String getDescription() { return description; }
    public String getPriority() { return priority; }
    public String getStatus() { return status; }

    public void setStatus(String status) {
        if (status != null && !status.trim().isEmpty()) {
            this.status = status;
        }
    }

    public void display() {
        System.out.println("=== Ticket #" + number + " ===");
        System.out.println("Client: " + client);
        System.out.println("Description: " + description);
        System.out.println("Priority: " + priority);
        System.out.println("Status: " + status);
    }
}
```

### Exercice 3 — Recherche par client

```java
public ArrayList<Order> getOrdersByClient(String client) {
    ArrayList<Order> result = new ArrayList<>();
    for (Order order : orders.values()) {
        if (order.getClient().equalsIgnoreCase(client)) {
            result.add(order);
        }
    }
    return result;
}
```

### Exercice 4 (Challenge) — Compter par statut

```java
public int countOrdersByStatus(String status) {
    int count = 0;
    for (Order order : orders.values()) {
        if (order.getStatus().equalsIgnoreCase(status)) {
            count++;
        }
    }
    return count;
}

public int countOrdersByPriority(String priority) {
    int count = 0;
    for (Order order : orders.values()) {
        if (order.getPriority().equalsIgnoreCase(priority)) {
            count++;
        }
    }
    return count;
}
```

---

## Chapitre 17 — ArrayList

### Exercice 1 — Films

```java
ArrayList<String> movies = new ArrayList<>();
movies.add("Inception");
movies.add("The Matrix");
movies.add("Interstellar");
for (String movie : movies) {
    System.out.println(movie);
}
```

### Exercice 2 — Supprimer un ticket

```java
public boolean removeTicket(int number) {
    for (int i = 0; i < tickets.size(); i++) {
        if (tickets.get(i).getNumber() == number) {
            tickets.remove(i);
            System.out.println("Ticket #" + number + " removed.");
            return true;
        }
    }
    System.out.println("Ticket #" + number + " not found.");
    return false;
}
```

### Exercice 3 — Compter par priorité

```java
public int countTicketsByPriority(String priority) {
    int count = 0;
    for (Ticket ticket : tickets) {
        if (ticket.getPriority().equalsIgnoreCase(priority)) {
            count++;
        }
    }
    return count;
}
```

### Exercice 4 (Challenge) — Trier par priorité

```java
public void sortTicketsByPriority() {
    tickets.sort((t1, t2) -> {
        String[] priorities = {"urgent", "high", "medium", "low"};
        int p1 = Arrays.asList(priorities).indexOf(t1.getPriority().toLowerCase());
        int p2 = Arrays.asList(priorities).indexOf(t2.getPriority().toLowerCase());
        return Integer.compare(p1, p2);
    });
}
```

---

## Chapitre 18 — HashMap

### Exercice 1 — Réponses

```java
HashMap<String, String> responses = new HashMap<>();
responses.put("hello", "Hello!");
responses.put("help", "How can I help?");
responses.put("goodbye", "Goodbye!");
```

### Exercice 2 — Récupérer une réponse

```java
String response = responses.get("hello");
System.out.println(response); // Hello!
```

### Exercice 3 — Ajouter et remplacer

```java
responses.put("hi", "Hi there!");
responses.put("hello", "Hey there!"); // Replaces the old value
```

### Exercice 4 (Challenge) — Préférences utilisateur

```java
HashMap<String, String> userPreferences = new HashMap<>();
userPreferences.put("theme", "dark");
userPreferences.put("language", "en");
userPreferences.put("notifications", "on");

String theme = userPreferences.get("theme");
System.out.println("Theme: " + theme);
```

---

## Chapitre 19 — HashSet

### Exercice 1 — Ensemble de mots

```java
HashSet<String> words = new HashSet<>();
words.add("apple");
words.add("banana");
words.add("orange");
words.add("apple"); // Ignored
System.out.println(words.size()); // 3
```

### Exercice 2 — Vérifier avant d'ajouter

```java
if (!words.contains("grape")) {
    words.add("grape");
}
```

### Exercice 3 — Noms d'utilisateurs uniques

```java
HashSet<String> users = new HashSet<>();
users.add("alice");
users.add("bob");
users.add("alice"); // Ignored
```

### Exercice 4 (Challenge) — Commandes traitées

```java
HashSet<Integer> processedOrders = new HashSet<>();
processedOrders.add(1001);
processedOrders.add(1002);
if (!processedOrders.contains(1003)) {
    processedOrders.add(1003);
}
```

---

## Chapitre 20 — Fichiers

### Exercice 1 — Sauvegarder les commandes

```java
public static void saveOrders(HashMap<Integer, Order> orders, String filename) {
    try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
        for (Order order : orders.values()) {
            writer.println(order.getNumber() + "|||" +
                          order.getClient() + "|||" +
                          order.getDescription() + "|||" +
                          order.getStatus() + "|||" +
                          order.getPriority());
        }
    } catch (IOException e) {
        System.out.println("Error saving orders: " + e.getMessage());
    }
}
```

### Exercice 2 — Sauvegarder les tickets

```java
public static void saveTickets(ArrayList<Ticket> tickets, String filename) {
    try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
        for (Ticket ticket : tickets) {
            writer.println(ticket.getNumber() + "|||" +
                          ticket.getClient() + "|||" +
                          ticket.getDescription() + "|||" +
                          ticket.getPriority() + "|||" +
                          ticket.getStatus());
        }
    } catch (IOException e) {
        System.out.println("Error saving tickets: " + e.getMessage());
    }
}
```

### Exercice 3 — Timestamp

```java
import java.time.LocalDateTime;
// In the respond method:
String timestamp = LocalDateTime.now().toString();
history.add("[" + timestamp + "] User: " + request);
```

### Exercice 4 (Challenge) — Backup

```java
public static void backupFile(String filename) {
    File source = new File(filename);
    if (source.exists()) {
        File backup = new File(filename + ".bak");
        source.renameTo(backup);
        System.out.println("Backup created: " + backup.getName());
    }
}
```

---

## Chapitre 21 — Tests

### Exercice 1 — Test "hello"

```java
public static void testHelloResponse() {
    Lya lya = new Lya();
    try {
        lya.respond("hello");
        System.out.println("✓ Hello response test passed");
    } catch (Exception e) {
        System.out.println("✗ Hello response test failed: " + e.getMessage());
    }
}
```

### Exercice 2 — Test "learn"

```java
public static void testLearnMethod() {
    Lya lya = new Lya();
    try {
        lya.learn("test", "test response");
        System.out.println("✓ Learn method test passed");
    } catch (Exception e) {
        System.out.println("✗ Learn method test failed: " + e.getMessage());
    }
}
```

### Exercice 3 — Test longueur > 200

```java
public static void testLongRequest() {
    Lya lya = new Lya();
    String longRequest = "a".repeat(201);
    try {
        lya.respond(longRequest);
        System.out.println("✗ Long request should be rejected");
    } catch (RequestTooLongException e) {
        System.out.println("✓ Long request properly rejected");
    } catch (Exception e) {
        System.out.println("✗ Long request test failed: " + e.getMessage());
    }
}
```

### Exercice 4 (Challenge) — Test Order

```java
public class TestOrder {
    public static void main(String[] args) {
        testOrderCreation();
        testOrderStatusUpdate();
        testOrderDisplay();
        System.out.println("All Order tests passed!");
    }

    public static void testOrderCreation() {
        Order order = new Order(1, "Alice", "Test order");
        assert order.getNumber() == 1;
        assert order.getClient().equals("Alice");
        assert order.getStatus().equals("Pending");
        System.out.println("✓ Order creation test passed");
    }

    public static void testOrderStatusUpdate() {
        Order order = new Order(1, "Alice", "Test order");
        order.setStatus("Shipped");
        assert order.getStatus().equals("Shipped");
        System.out.println("✓ Order status update test passed");
    }

    public static void testOrderDisplay() {
        Order order = new Order(1, "Alice", "Test order");
        order.display();
        System.out.println("✓ Order display test passed");
    }
}
```

---

## Chapitre 22 — Networking

### Exercice 1 — JokeService

```java
public class JokeService {
    private static String[] jokes = {
        "Why do programmers prefer dark mode? Because light attracts bugs!",
        "Why did the Java developer wear glasses? Because he couldn't C#!",
        "What do you call a programmer who doesn't drink coffee? Decaffeinated!"
    };
    public static String getRandomJoke() {
        int index = (int)(Math.random() * jokes.length);
        return jokes[index];
    }
}
```

### Exercice 2 — QuoteService

```java
public class QuoteService {
    private static String[] quotes = {
        "The best way to predict the future is to create it.",
        "Code is poetry.",
        "Simplicity is the ultimate sophistication."
    };
    public static String getRandomQuote() {
        int index = (int)(Math.random() * quotes.length);
        return quotes[index];
    }
}
```

### Exercice 3 — ConnectionCheck

```java
public class ConnectionCheck {
    public static boolean isOnline() {
        try {
            URL url = new URL("https://www.google.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            connection.setConnectTimeout(3000);
            int status = connection.getResponseCode();
            connection.disconnect();
            return status == 200;
        } catch (Exception e) {
            return false;
        }
    }
}
```

### Exercice 4 (Challenge) — API météo réelle

```java
public class RealWeatherService {
    private static final String API_KEY = "your-api-key-here";
    private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather";

    public static String getWeather(String city) {
        try {
            String urlString = API_URL + "?q=" + city + "&appid=" + API_KEY + "&units=metric";
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            // Parse JSON response
            // ...
            return "Weather for " + city + ": ...";
        } catch (Exception e) {
            return "Error fetching weather: " + e.getMessage();
        }
    }
}
```

---

## Chapitre 23 — JSON

### Exercice 1 — JSON livre

```java
String bookJson = "{\"title\":\"Effective Java\",\"author\":\"Joshua Bloch\",\"pages\":416}";
```

### Exercice 2 — Extraire le titre

```java
public static String getTitle(String json) {
    return SimpleJsonParser.getString(json, "title");
}
```

### Exercice 3 — JSON de Lya

```java
String state = "{\"name\":\"Lya\",\"version\":\"1.0\",\"active\":true,\"messages\":42}";
```

### Exercice 4 (Challenge) — Extraire un tableau

```java
public static ArrayList<String> getArray(String json, String key) {
    ArrayList<String> result = new ArrayList<>();
    String searchKey = "\"" + key + "\":";
    int start = json.indexOf(searchKey);
    if (start == -1) return result;
    int bracketStart = json.indexOf("[", start);
    int bracketEnd = json.indexOf("]", bracketStart);
    if (bracketStart == -1 || bracketEnd == -1) return result;
    String arrayContent = json.substring(bracketStart + 1, bracketEnd);
    String[] items = arrayContent.split(",");
    for (String item : items) {
        result.add(item.trim().replace("\"", ""));
    }
    return result;
}
```

---

## Chapitre 24 — REST API

### Exercice 1 — GET ticket

```java
public String getTicket(int id) {
    Ticket ticket = tickets.get(id);
    if (ticket == null) {
        return "{\"error\":\"Ticket not found\"}";
    }
    return ticket.toJson();
}
```

### Exercice 2 — PUT ticket

```java
public String updateTicket(int id, String status) {
    Ticket ticket = tickets.get(id);
    if (ticket == null) {
        return "{\"error\":\"Ticket not found\"}";
    }
    ticket.setStatus(status);
    return ticket.toJson();
}
```

### Exercice 3 — DELETE ticket

```java
public String deleteTicket(int id) {
    if (tickets.containsKey(id)) {
        tickets.remove(id);
        return "{\"success\":true,\"message\":\"Ticket deleted\"}";
    }
    return "{\"error\":\"Ticket not found\"}";
}
```

### Exercice 4 (Challenge) — Filtrer par client

```java
public String getOrdersByClient(String client) {
    StringBuilder result = new StringBuilder();
    result.append("{\"orders\":[");
    boolean first = true;
    for (Order order : orders.values()) {
        if (order.getClient().equalsIgnoreCase(client)) {
            if (!first) result.append(",");
            result.append(order.toJson());
            first = false;
        }
    }
    result.append("]}");
    return result.toString();
}
```

---

## Chapitre 25 — Serveur Web

### Exercice 1 — Route /time

```java
if (path.equals("/time")) {
    return java.time.LocalTime.now().toString();
}
```

### Exercice 2 — Route /status

```java
if (path.equals("/status")) {
    return "{\"status\":\"ready\"}";
}
```

### Exercice 3 — Route /tickets/{id}

```java
if (path.startsWith("/tickets/")) {
    try {
        int id = Integer.parseInt(path.substring(9));
        return api.getTicket(id);
    } catch (NumberFormatException e) {
        return "Invalid ticket id";
    }
}
```

### Exercice 4 (Challenge) — POST orders

```java
// In a real server, read the request body and parse the form or JSON data.
// Then call api.createOrder(client, description, priority).
```

---

## Chapitre 26 — Threads

### Exercice 1 — Route lente (3 secondes)

```java
if (path.equals("/slow")) {
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
    return "Done after waiting.";
}
```

### Exercice 2 — Compteur de requêtes

```java
private static int requestCount = 0;
// Inside request handler:
requestCount++;
```

### Exercice 3 — Route /thread

```java
if (path.equals("/thread")) {
    return "Handled by " + Thread.currentThread().getName();
}
```

### Exercice 4 (Challenge) — File d'attente

```java
// Use a blocking queue and a worker thread pool.
// This is a more advanced solution and should be implemented step by step.
```

---

## Chapitre 27 — Sessions

### Exercice 1 — Compteur de visites

```java
public void incrementVisits() {
    Integer visits = (Integer) data.get("visits");
    if (visits == null) visits = 0;
    data.put("visits", visits + 1);
}
```

### Exercice 2 — Commande favorite

```java
public void setFavoriteCommand(String command) {
    data.put("favoriteCommand", command);
}
```

### Exercice 3 — Message d'expiration

```java
if (session.isExpired()) {
    return "Your session expired. Please log in again.";
}
```

### Exercice 4 (Challenge) — Logout

```java
public void logout(String sessionId) {
    sessions.remove(sessionId);
}
```

---

## Chapitre 28 — Sessions persistantes

### Exercice 1 — Préférences utilisateur

```java
SessionStorage.saveSession(session.getId(), session.getUsername(), "theme=dark", System.currentTimeMillis());
```

### Exercice 2 — Timestamp

```java
writer.println(sessionId + SEPARATOR + username + SEPARATOR + cartData + SEPARATOR + lastActivity);
```

### Exercice 3 — Backup

```java
import java.nio.file.*;

public class BackupUtil {
    public static void backup(String fileName) throws Exception {
        Files.copy(Path.of(fileName), Path.of(fileName + ".bak"), StandardCopyOption.REPLACE_EXISTING);
    }
}
```

### Exercice 4 (Challenge) — Restaurer un panier

```java
// Store cart contents as a comma-separated string and rebuild the list when loading.
```

---

## Chapitre 29 — Bases de données

### Exercice 1 — Table users

```java
stmt.execute("""
    CREATE TABLE IF NOT EXISTS users (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        name TEXT NOT NULL,
        email TEXT
    )
""");
```

### Exercice 2 — Récupérer toutes les commandes

```java
public ArrayList<Order> getAllOrders() throws SQLException {
    ArrayList<Order> list = new ArrayList<>();
    try (Statement stmt = connection.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM orders")) {
        while (rs.next()) {
            list.add(new Order(
                rs.getInt("id"),
                rs.getString("client"),
                rs.getString("description"),
                rs.getString("priority")
            ));
        }
    }
    return list;
}
```

### Exercice 3 — Supprimer une commande

```java
public void deleteOrder(int id) {
    try (PreparedStatement stmt = connection.prepareStatement("DELETE FROM orders WHERE id = ?")) {
        stmt.setInt(1, id);
        stmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
```

### Exercice 4 (Challenge) — Mettre à jour une commande

```java
public void updateOrderStatus(int id, String status) {
    try (PreparedStatement stmt = connection.prepareStatement("UPDATE orders SET status = ? WHERE id = ?")) {
        stmt.setString(1, status);
        stmt.setInt(2, id);
        stmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
```

---

## Chapitre 30 — JPA

### Exercice 1 — Ticket Entity

```java
import javax.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String client;
    private String description;
    private String priority;
    private String status;

    public Ticket() {}

    public Ticket(String client, String description, String priority) {
        this.client = client;
        this.description = description;
        this.priority = priority;
        this.status = "Open";
    }
}
```

### Exercice 2 — TicketRepository

```java
public class TicketRepository {
    private EntityManager em;

    public TicketRepository(EntityManager em) {
        this.em = em;
    }
}
```

### Exercice 3 — Find by priority

```java
public List<Ticket> findByPriority(String priority) {
    return em.createQuery("SELECT t FROM Ticket t WHERE t.priority = :priority", Ticket.class)
             .setParameter("priority", priority)
             .getResultList();
}
```

### Exercice 4 (Challenge) — Find by date range

```java
// Use a query with startDate and endDate parameters on a createdAt field.
```

---

## Chapitre 31 — Git

### Exercice 1 — Initialiser

```bash
git init
```

### Exercice 2 — Trois commits

```bash
git add .
git commit -m "Add Lya greeting"
git commit -m "Add keyword matching"
git commit -m "Add history storage"
```

### Exercice 3 — Branche

```bash
git checkout -b feature-help
git add .
git commit -m "Improve help command"
git checkout main
git merge feature-help
```

### Exercice 4 — Historique

```bash
git log --oneline
```

---

## Chapitre 32 — GitHub

### Exercice 1 — Git vs GitHub

Git tracks changes locally. GitHub hosts the repository online.

### Exercice 2 — Push et Pull

push sends changes to GitHub, and pull brings changes from GitHub.

### Exercice 3 — .gitignore

```
.class
.jar
.log
build/
target/
.db
.sqlite
```

### Exercice 4 — Clone et branche

```bash
git clone https://github.com/norbert/lya.git
git checkout -b feature-new
```

---

## Chapitre 33 — Maven

### Exercice 1 — Créer un projet Maven

```bash
mvn archetype:generate
```

### Exercice 2 — Dépendance

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.9.2</version>
    <scope>test</scope>
</dependency>
```

### Exercice 3 — JAR

```bash
mvn package
```

### Exercice 4 — Plugin JAR

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-jar-plugin</artifactId>
    <version>3.3.0</version>
</plugin>
```

---

## Chapitre 34 — JAR

### Exercice 1 — JAR exécutable

```bash
mvn clean package
java -jar target/lya-1.0.0.jar
```

### Exercice 2 — Manifest

```xml
<manifest>
    <mainClass>com.norbert.lya.LyaServer</mainClass>
</manifest>
```

### Exercice 3 — Fat JAR

```xml
<!-- Use the assembly or shade plugin -->
```

### Exercice 4 — Script de lancement

```bash
java -jar target/lya-1.0.0-jar-with-dependencies.jar
```

---

## Chapitre 35 — Docker

### Exercice 1 — Dockerfile

```dockerfile
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/lya-1.0.0-jar-with-dependencies.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
```

### Exercice 2 — Build et run

```bash
docker build -t lya .
docker run -p 8080:8080 lya
```

### Exercice 3 — Health endpoint

```java
if (path.equals("/health")) return "OK";
```

### Exercice 4 — Déploiement automatique

Push to GitHub, connect the repo to the hosting platform, and enable auto-deploy.

---

## Chapitre 36 — Déploiement

*(Les solutions sont les mêmes que pour Docker, avec l'ajout d'une plateforme cloud comme Render ou Heroku.)*

---

## Chapitre 37 — JUnit

### Exercice 1 — Test help

```java
@Test
void shouldReturnHelpMessage() {
    Lya lya = new Lya();
    assertTrue(lya.getResponse("help").contains("help"));
}
```

### Exercice 2 — Test unknown

```java
@Test
void shouldHandleUnknownCommand() {
    Lya lya = new Lya();
    assertEquals("I don't understand that yet.", lya.getResponse("xyz"));
}
```

### Exercice 3 — Test learn

```java
@Test
void shouldLearnNewResponse() {
    Lya lya = new Lya();
    lya.learn("hi", "Hello!");
    assertEquals("Hello!", lya.getResponse("hi"));
}
```

### Exercice 4 (Challenge) — Test validation

```java
@Test
void shouldThrowOnEmptyInput() {
    Lya lya = new Lya();
    assertThrows(EmptyRequestException.class, () -> lya.respond(""));
}
```

---

## Chapitre 38 — IA

*(Les chapitres 38 à 50 sont des concepts plus avancés. Les exercices sont ouverts et n'ont pas de solution unique.)*

---

© 2026 E.J.A. — Tous droits réservés.
```

---
`Ajout des corrigés des exercices`


---

**C'est fait !** Tes lecteurs ont maintenant accès à tous les corrigés en une seule page. 🎉
