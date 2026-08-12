Parfait ! Voici **la version anglaise complète** de `solutions.md` avec tous les corrigés des exercices, prête à être copiée-collée sur ton dépôt GitHub.

---

# 📄 solutions.md — Exercise Solutions for Norbert to Java

```markdown
# Exercise Solutions — Norbert to Java

This document contains the complete solutions to all exercises from the book **Norbert to Java**.

📖 **Full book**: [Norbert to Java](./livre-complet.md)  
📦 **Source code**: [./code](./code)

---

## How to Use This Document

1. **Try the exercise yourself first** — The exercises are designed to be solved independently.
2. **If you get stuck** — Look at the solution to understand where you went wrong.
3. **Compare approaches** — Your solution might be different from mine. That's normal! There are often multiple ways to solve a problem.

---

## Table of Contents

- [Chapter 1 — Hello, Java](#chapter-1--hello-java)
- [Chapter 2 — Variables and Types](#chapter-2--variables-and-types)
- [Chapter 3 — Operators](#chapter-3--operators)
- [Chapter 4 — Conditions](#chapter-4--conditions)
- [Chapter 5 — Loops](#chapter-5--loops)
- [Chapter 6 — Arrays](#chapter-6--arrays)
- [Chapter 7 — Methods](#chapter-7--methods)
- [Chapter 8 — Scanner and Input](#chapter-8--scanner-and-input)
- [Chapter 9 — Classes and Objects](#chapter-9--classes-and-objects)
- [Chapter 10 — Constructors](#chapter-10--constructors)
- [Chapter 11 — Encapsulation](#chapter-11--encapsulation)
- [Chapter 12 — Static](#chapter-12--static)
- [Chapter 13 — Lya Assistant](#chapter-13--lya-assistant)
- [Chapter 14 — Understanding Requests](#chapter-14--understanding-requests)
- [Chapter 15 — Exceptions and Validation](#chapter-15--exceptions-and-validation)
- [Chapter 16 — Orders and Data Management](#chapter-16--orders-and-data-management)
- [Chapter 17 — ArrayList](#chapter-17--arraylist)
- [Chapter 18 — HashMap](#chapter-18--hashmap)
- [Chapter 19 — HashSet](#chapter-19--hashset)
- [Chapter 20 — File I/O](#chapter-20--file-io)
- [Chapter 21 — Testing](#chapter-21--testing)
- [Chapter 22 — Networking](#chapter-22--networking)
- [Chapter 23 — JSON](#chapter-23--json)
- [Chapter 24 — REST API](#chapter-24--rest-api)
- [Chapter 25 — Web Server](#chapter-25--web-server)
- [Chapter 26 — Threads](#chapter-26--threads)
- [Chapter 27 — Sessions](#chapter-27--sessions)
- [Chapter 28 — Persistent Sessions](#chapter-28--persistent-sessions)
- [Chapter 29 — Databases](#chapter-29--databases)
- [Chapter 30 — JPA](#chapter-30--jpa)
- [Chapter 31 — Git](#chapter-31--git)
- [Chapter 32 — GitHub](#chapter-32--github)
- [Chapter 33 — Maven](#chapter-33--maven)
- [Chapter 34 — JAR Files](#chapter-34--jar-files)
- [Chapter 35 — Docker](#chapter-35--docker)
- [Chapter 36 — Deployment](#chapter-36--deployment)
- [Chapter 37 — JUnit Testing](#chapter-37--junit-testing)
- [Chapter 38 — AI and Future](#chapter-38--ai-and-future)

---

## Chapter 1 — Hello, Java

### Exercise 1 — Good morning!

```java
public class Lya {
    public static void main(String[] args) {
        System.out.println("Good morning!");
    }
}
```

### Exercise 2 — Two messages

```java
public class Lya {
    public static void main(String[] args) {
        System.out.println("Hello, I'm Lya!");
        System.out.println("I'm here to help you.");
    }
}
```

### Exercise 3 — Name and age

```java
public class Lya {
    public static void main(String[] args) {
        System.out.println("Name: Norbert");
        System.out.println("Age: 25");
    }
}
```

### Exercise 4 (Challenge) — Shape

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

## Chapter 2 — Variables and Types

### Exercise 1 — Age variable

```java
public class Variables {
    public static void main(String[] args) {
        int age = 25;
        System.out.println("Age: " + age);
    }
}
```

### Exercise 2 — Version 1.1

```java
public class Variables {
    public static void main(String[] args) {
        double version = 1.1;
        System.out.println("Version: " + version);
    }
}
```

### Exercise 3 — Greeting variable

```java
public class Variables {
    public static void main(String[] args) {
        String greeting = "Welcome!";
        System.out.println(greeting);
    }
}
```

### Exercise 4 (Challenge) — Temperature

```java
public class Variables {
    public static void main(String[] args) {
        double temperature = 22.5;
        System.out.println("Temperature: " + temperature + "°C");
    }
}
```

---

## Chapter 3 — Operators

### Exercise 1 — Average

```java
public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        double average = (a + b + c) / 3.0;
        System.out.println("Average: " + average);
    }
}
```

### Exercise 2 — Adult check

```java
public class Operators {
    public static void main(String[] args) {
        int age = 20;
        boolean isAdult = age >= 18;
        System.out.println("Is adult: " + isAdult);
    }
}
```

### Exercise 3 — AND operator

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

### Exercise 4 (Challenge) — Area

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

## Chapter 4 — Conditions

### Exercise 1 — Positive, negative, or zero

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

### Exercise 2 — Temperature check

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

### Exercise 3 — Login check

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

### Exercise 4 (Challenge) — Password check

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

## Chapter 5 — Loops

### Exercise 1 — while loop 1 to 10

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

### Exercise 2 — for loop 1 to 20

```java
public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
```

### Exercise 3 — Sum of 1 to 100

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

### Exercise 4 (Challenge) — Multiplication table of 7

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

## Chapter 6 — Arrays

### Exercise 1 — Favorite movies

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

### Exercise 2 — Maximum value

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

### Exercise 3 — Reverse array

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

### Exercise 4 (Challenge) — Sort array

```java
public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {34, 7, 23, 32, 5, 62, 31, 1, 12, 8};
        
        // Bubble sort
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

## Chapter 7 — Methods

### Exercise 1 — Greeting with name and age

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

### Exercise 2 — Even or odd

```java
public class Methods {
    public static void main(String[] args) {
        System.out.println(isEven(4)); // true
        System.out.println(isEven(7)); // false
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
```

### Exercise 3 — Sum of array

```java
public class Methods {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum: " + sumArray(numbers));
    }
    
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
```

### Exercise 4 (Challenge) — Factorial

```java
public class Methods {
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }
    
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
```

---

## Chapter 8 — Scanner and Input

### Exercise 1 — Ask for name

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

### Exercise 2 — Sum of two numbers

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

### Exercise 3 — Positive, negative, or zero (with input)

```java
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        
        scanner.close();
    }
}
```

### Exercise 4 (Challenge) — Simple calculator

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
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero!");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                scanner.close();
                return;
        }
        
        System.out.println("Result: " + result);
        scanner.close();
    }
}
```

---

## Chapter 9 — Classes and Objects

### Exercise 1 — Person class

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

### Exercise 2 — Book class

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

### Exercise 3 — Car class

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

### Exercise 4 (Challenge) — BankAccount class

```java
public class BankAccount {
    String owner;
    double balance;
    
    void deposit(double amount) {
        balance += amount;
    }
    
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    void display() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: $" + balance);
    }
}
```

---

## Chapter 10 — Constructors

### Exercise 1 — Person with constructor

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

### Exercise 2 — Book with multiple constructors

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

### Exercise 3 — Car with constructor

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

### Exercise 4 (Challenge) — BankAccount with constructor

```java
public class BankAccount {
    String owner;
    double balance;
    
    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }
    
    void deposit(double amount) {
        balance += amount;
    }
    
    void display() {
        System.out.println("Owner: " + owner + ", Balance: $" + balance);
    }
}
```

---

## Chapter 11 — Encapsulation

### Exercise 1 — Private Person

```java
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
```

### Exercise 2 — Age validation

```java
public class Person {
    private int age;
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }
}
```

### Exercise 3 — Product with validation

```java
public class Product {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
}
```

### Exercise 4 (Challenge) — Student with grades

```java
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades = new ArrayList<>();
    
    public Student(String name) {
        this.name = name;
    }
    
    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 20) {
            grades.add(grade);
        }
    }
    
    public double getAverage() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.size();
    }
    
    public void display() {
        System.out.println("Student: " + name + ", Average: " + getAverage());
    }
}
```

---

## Chapter 12 — Static

### Exercise 1 — Counter

```java
public class Counter {
    private static int count = 0;
    
    public Counter() {
        count++;
    }
    
    public static int getCount() {
        return count;
    }
}
```

### Exercise 2 — Positive checker

```java
public class Utils {
    public static boolean isPositive(int number) {
        return number > 0;
    }
}
```

### Exercise 3 — Constant

```java
public class Constants {
    public static final int MAX_SCORE = 100;
}
```

### Exercise 4 (Challenge) — MathUtils

```java
public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return (double) a / b;
    }
}
```

---

## Chapter 13 — Lya Assistant

### Exercise 1 — Add more responses

```java
responses.put("good morning", "Good morning! How can I help you?");
responses.put("good evening", "Good evening! What can I do for you?");
responses.put("what's up", "Not much, just waiting for your questions!");
```

### Exercise 2 — Clear history

```java
// In the main loop:
if (input.equalsIgnoreCase("clear")) {
    lya.clearHistory();
    System.out.println("History cleared.");
    continue;
}

// In the Lya class:
public void clearHistory() {
    history.clear();
    System.out.println("History cleared.");
}
```

### Exercise 3 — Delete a response

```java
// In the main loop:
if (input.toLowerCase().startsWith("delete ")) {
    String key = input.substring(7).trim();
    lya.deleteResponse(key);
    continue;
}

// In the Lya class:
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

### Exercise 4 (Challenge) — Timestamp in history

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

## Chapter 14 — Understanding Requests

### Exercise 1 — Weather keyword

```java
responses.put("weather", "I can check the weather for you! Try 'weather Paris'");
```

### Exercise 2 — Ticket keyword

```java
responses.put("ticket", "I can help with tickets! Try 'ticket Alice payment issue'");
```

### Exercise 3 — "Where" questions

```java
if (cleaned.startsWith("where")) {
    return "I don't know much about locations yet.";
}
```

### Exercise 4 (Challenge) — Synonyms

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

## Chapter 15 — Exceptions and Validation

### Exercise 1 — Validate characters

```java
private void validateRequest(String request) throws ValidationException {
    // ... existing validation ...
    
    if (!request.matches("^[a-zA-Z0-9\\s.,!?']+$")) {
        throw new ValidationException("Request contains invalid characters.");
    }
}
```

### Exercise 2 — Profanity check

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

### Exercise 3 — Validate learn method

```java
public void learn(String request, String response) throws ValidationException {
    validateRequest(request);
    validateRequest(response);
    // ... existing code ...
}
```

### Exercise 4 (Challenge) — Letters and spaces only

```java
if (!request.matches("^[a-zA-Z0-9\\s]+$")) {
    throw new ValidationException("Request must contain only letters, numbers, and spaces.");
}
```

---

## Chapter 16 — Orders and Data Management

### Exercise 1 — Date in Order

```java
import java.time.LocalDateTime;

public class Order {
    private LocalDateTime createdAt;
    
    public Order(int number, String client, String description) {
        // ... existing code ...
        this.createdAt = LocalDateTime.now();
    }
    
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    
    public void display() {
        // ... existing code ...
        System.out.println("Created: " + createdAt);
    }
}
```

### Exercise 2 — Ticket class

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

### Exercise 3 — Search by client

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

### Exercise 4 (Challenge) — Count by status

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

## Chapter 17 — ArrayList

### Exercise 1 — Favorite movies

```java
import java.util.ArrayList;

public class Movies {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Inception");
        movies.add("The Matrix");
        movies.add("Interstellar");
        
        for (String movie : movies) {
            System.out.println(movie);
        }
    }
}
```

### Exercise 2 — Remove a ticket

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

### Exercise 3 — Count by priority

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

### Exercise 4 (Challenge) — Sort by priority

```java
import java.util.Arrays;

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

## Chapter 18 — HashMap

### Exercise 1 — Keyword-response map

```java
import java.util.HashMap;

public class Responses {
    public static void main(String[] args) {
        HashMap<String, String> responses = new HashMap<>();
        responses.put("hello", "Hello!");
        responses.put("help", "How can I help?");
        responses.put("goodbye", "Goodbye!");
    }
}
```

### Exercise 2 — Retrieve a response

```java
String response = responses.get("hello");
System.out.println(response); // Hello!
```

### Exercise 3 — Add and replace

```java
responses.put("hi", "Hi there!");
responses.put("hello", "Hey there!"); // Replaces the old value
```

### Exercise 4 (Challenge) — User preferences

```java
HashMap<String, String> userPreferences = new HashMap<>();
userPreferences.put("theme", "dark");
userPreferences.put("language", "en");
userPreferences.put("notifications", "on");

String theme = userPreferences.get("theme");
System.out.println("Theme: " + theme);
```

---

## Chapter 19 — HashSet

### Exercise 1 — Set of words

```java
import java.util.HashSet;

public class WordSet {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("apple"); // Ignored
        
        System.out.println(words.size()); // 3
    }
}
```

### Exercise 2 — Check before adding

```java
if (!words.contains("grape")) {
    words.add("grape");
}
```

### Exercise 3 — Unique usernames

```java
HashSet<String> users = new HashSet<>();
users.add("alice");
users.add("bob");
users.add("alice"); // Ignored
```

### Exercise 4 (Challenge) — Processed orders

```java
HashSet<Integer> processedOrders = new HashSet<>();
processedOrders.add(1001);
processedOrders.add(1002);

if (!processedOrders.contains(1003)) {
    processedOrders.add(1003);
}
```

---

## Chapter 20 — File I/O

### Exercise 1 — Save orders to file

```java
import java.io.*;
import java.util.HashMap;

public class OrderStorage {
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
}
```

### Exercise 2 — Save tickets to file

```java
import java.io.*;
import java.util.ArrayList;

public class TicketStorage {
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
}
```

### Exercise 3 — Timestamp in history

```java
import java.time.LocalDateTime;

// In the respond method:
String timestamp = LocalDateTime.now().toString();
history.add("[" + timestamp + "] User: " + request);
```

### Exercise 4 (Challenge) — Backup file

```java
import java.io.File;

public class BackupUtil {
    public static void backupFile(String filename) {
        File source = new File(filename);
        if (source.exists()) {
            File backup = new File(filename + ".bak");
            source.renameTo(backup);
            System.out.println("Backup created: " + backup.getName());
        }
    }
}
```

---

## Chapter 21 — Testing

### Exercise 1 — Test "hello" response

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

### Exercise 2 — Test "learn" method

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

### Exercise 3 — Test long request (> 200 chars)

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

### Exercise 4 (Challenge) — Order test suite

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

## Chapter 22 — Networking

### Exercise 1 — Joke service

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

### Exercise 2 — Quote service

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

### Exercise 3 — Connection check

```java
import java.net.HttpURLConnection;
import java.net.URL;

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

### Exercise 4 (Challenge) — Real weather API

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RealWeatherService {
    private static final String API_KEY = "your-api-key-here";
    private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather";
    
    public static String getWeather(String city) {
        try {
            String urlString = API_URL + "?q=" + city + "&appid=" + API_KEY + "&units=metric";
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            connection.disconnect();
            
            // Parse the JSON response
            // For a complete solution, you would extract temperature and weather description
            
            return "Weather for " + city + ": Check the JSON response - " + response.toString();
            
        } catch (Exception e) {
            return "Error fetching weather: " + e.getMessage();
        }
    }
}
```

---

## Chapter 23 — JSON

### Exercise 1 — Book JSON

```java
String bookJson = "{\"title\":\"Effective Java\",\"author\":\"Joshua Bloch\",\"pages\":416}";
```

### Exercise 2 — Extract title

```java
public static String getTitle(String json) {
    return SimpleJsonParser.getString(json, "title");
}
```

### Exercise 3 — Lya state JSON

```java
String state = "{\"name\":\"Lya\",\"version\":\"1.0\",\"active\":true,\"messages\":42}";
```

### Exercise 4 (Challenge) — Extract array from JSON

```java
import java.util.ArrayList;

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

## Chapter 24 — REST API

### Exercise 1 — GET ticket

```java
public String getTicket(int id) {
    Ticket ticket = tickets.get(id);
    if (ticket == null) {
        return "{\"error\":\"Ticket not found\"}";
    }
    return ticket.toJson();
}
```

### Exercise 2 — PUT ticket

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

### Exercise 3 — DELETE ticket

```java
public String deleteTicket(int id) {
    if (tickets.containsKey(id)) {
        tickets.remove(id);
        return "{\"success\":true,\"message\":\"Ticket deleted\"}";
    }
    return "{\"error\":\"Ticket not found\"}";
}
```

### Exercise 4 (Challenge) — Orders filtered by client

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

## Chapter 25 — Web Server

### Exercise 1 — Route /time

```java
if (path.equals("/time")) {
    return java.time.LocalTime.now().toString();
}
```

### Exercise 2 — Route /status

```java
if (path.equals("/status")) {
    return "{\"status\":\"ready\"}";
}
```

### Exercise 3 — Route /tickets/{id}

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

### Exercise 4 (Challenge) — POST orders

```java
// In a real server, read the request body and parse the form or JSON data.
// Then call api.createOrder(client, description, priority).
// This would require parsing the HTTP request body.
```

---

## Chapter 26 — Threads

### Exercise 1 — Slow route (3 seconds)

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

### Exercise 2 — Request counter

```java
private static int requestCount = 0;

// Inside request handler:
requestCount++;
```

### Exercise 3 — Route /thread

```java
if (path.equals("/thread")) {
    return "Handled by " + Thread.currentThread().getName();
}
```

### Exercise 4 (Challenge) — Queue system

```java
// Use a blocking queue and a worker thread pool.
// This is a more advanced solution and should be implemented step by step.
import java.util.concurrent.*;

public class QueueServer {
    private static final int MAX_WORKERS = 5;
    private static final LinkedBlockingQueue<Runnable> taskQueue = 
        new LinkedBlockingQueue<>();
    private static final ThreadPoolExecutor executor = 
        new ThreadPoolExecutor(MAX_WORKERS, MAX_WORKERS, 60L, 
            TimeUnit.SECONDS, taskQueue);
}
```

---

## Chapter 27 — Sessions

### Exercise 1 — Visit counter

```java
public void incrementVisits() {
    Integer visits = (Integer) data.get("visits");
    if (visits == null) visits = 0;
    data.put("visits", visits + 1);
}
```

### Exercise 2 — Favorite command

```java
public void setFavoriteCommand(String command) {
    data.put("favoriteCommand", command);
}
```

### Exercise 3 — Expiration message

```java
if (session.isExpired()) {
    return "Your session expired. Please log in again.";
}
```

### Exercise 4 (Challenge) — Logout

```java
public void logout(String sessionId) {
    if (sessionId != null && sessions.containsKey(sessionId)) {
        sessions.remove(sessionId);
        System.out.println("Session " + sessionId + " logged out.");
    }
}
```

---

## Chapter 28 — Persistent Sessions

### Exercise 1 — User preferences

```java
SessionStorage.saveSession(session.getId(), session.getUsername(), 
    "theme=dark", System.currentTimeMillis());
```

### Exercise 2 — Timestamp in session file

```java
writer.println(sessionId + SEPARATOR + username + SEPARATOR + 
    cartData + SEPARATOR + lastActivity);
```

### Exercise 3 — Backup file

```java
import java.nio.file.*;

public class BackupUtil {
    public static void backup(String fileName) throws Exception {
        Files.copy(Path.of(fileName), Path.of(fileName + ".bak"), 
            StandardCopyOption.REPLACE_EXISTING);
    }
}
```

### Exercise 4 (Challenge) — Restore cart

```java
// Store cart contents as a comma-separated string and rebuild the list when loading.
String[] cartItems = cartData.split(",");
ArrayList<String> cart = new ArrayList<>();
for (String item : cartItems) {
    if (!item.isEmpty()) {
        cart.add(item);
    }
}
session.setData("cart", cart);
```

---

## Chapter 29 — Databases

### Exercise 1 — Users table

```java
stmt.execute("""
    CREATE TABLE IF NOT EXISTS users (
        id INTEGER PRIMARY KEY AUTOINCREMENT,
        name TEXT NOT NULL,
        email TEXT
    )
""");
```

### Exercise 2 — Get all orders

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

### Exercise 3 — Delete an order

```java
public void deleteOrder(int id) throws SQLException {
    try (PreparedStatement stmt = connection.prepareStatement(
            "DELETE FROM orders WHERE id = ?")) {
        stmt.setInt(1, id);
        stmt.executeUpdate();
    }
}
```

### Exercise 4 (Challenge) — Update an order

```java
public void updateOrderStatus(int id, String status) throws SQLException {
    try (PreparedStatement stmt = connection.prepareStatement(
            "UPDATE orders SET status = ? WHERE id = ?")) {
        stmt.setString(1, status);
        stmt.setInt(2, id);
        stmt.executeUpdate();
    }
}
```

---

## Chapter 30 — JPA

### Exercise 1 — Ticket entity

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
    
    // Getters and setters
}
```

### Exercise 2 — TicketRepository

```java
import javax.persistence.EntityManager;

public class TicketRepository {
    private EntityManager em;
    
    public TicketRepository(EntityManager em) {
        this.em = em;
    }
    
    public void save(Ticket ticket) {
        em.persist(ticket);
    }
    
    public Ticket findById(int id) {
        return em.find(Ticket.class, id);
    }
}
```

### Exercise 3 — Find by priority

```java
import java.util.List;

public List<Ticket> findByPriority(String priority) {
    return em.createQuery("SELECT t FROM Ticket t WHERE t.priority = :priority", Ticket.class)
             .setParameter("priority", priority)
             .getResultList();
}
```

### Exercise 4 (Challenge) — Find by date range

```java
import java.time.LocalDateTime;
import java.util.List;

public List<Ticket> findByDateRange(LocalDateTime start, LocalDateTime end) {
    return em.createQuery("SELECT t FROM Ticket t WHERE t.createdAt BETWEEN :start AND :end", Ticket.class)
             .setParameter("start", start)
             .setParameter("end", end)
             .getResultList();
}
```

---

## Chapter 31 — Git

### Exercise 1 — Initialize

```bash
git init
```

### Exercise 2 — Three commits

```bash
git add .
git commit -m "Add Lya greeting"
git commit -m "Add keyword matching"
git commit -m "Add history storage"
```

### Exercise 3 — Branch

```bash
git checkout -b feature-help
git add .
git commit -m "Improve help command"
git checkout main
git merge feature-help
```

### Exercise 4 — History

```bash
git log --oneline
```

---

## Chapter 32 — GitHub

### Exercise 1 — Git vs GitHub

Git tracks changes locally. GitHub hosts the repository online and enables collaboration.

### Exercise 2 — Push and Pull

`git push` sends changes to GitHub, and `git pull` brings changes from GitHub to your local machine.

### Exercise 3 — .gitignore

```
.class
.jar
.log
build/
target/
.db
.sqlite
*.iml
.idea/
.DS_Store
```

### Exercise 4 — Clone and branch

```bash
git clone https://github.com/norbert/lya.git
git checkout -b feature-new
```

---

## Chapter 33 — Maven

### Exercise 1 — Create Maven project

```bash
mvn archetype:generate -DgroupId=com.norbert -DartifactId=lya -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

### Exercise 2 — Add dependency

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.9.2</version>
    <scope>test</scope>
</dependency>
```

### Exercise 3 — Build JAR

```bash
mvn package
```

### Exercise 4 — JAR plugin

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-jar-plugin</artifactId>
    <version>3.3.0</version>
    <configuration>
        <archive>
            <manifest>
                <mainClass>com.norbert.lya.LyaServer</mainClass>
            </manifest>
        </archive>
    </configuration>
</plugin>
```

---

## Chapter 34 — JAR Files

### Exercise 1 — Executable JAR

```bash
mvn clean package
java -jar target/lya-1.0.0.jar
```

### Exercise 2 — Manifest

```xml
<manifest>
    <mainClass>com.norbert.lya.LyaServer</mainClass>
</manifest>
```

### Exercise 3 — Fat JAR

```xml
<!-- Use the assembly or shade plugin -->
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-assembly-plugin</artifactId>
    <version>3.5.0</version>
    <configuration>
        <descriptorRefs>
            <descriptorRef>jar-with-dependencies</descriptorRef>
        </descriptorRefs>
        <archive>
            <manifest>
                <mainClass>com.norbert.lya.LyaServer</mainClass>
            </manifest>
        </archive>
    </configuration>
    <executions>
        <execution>
            <phase>package</phase>
            <goals>
                <goal>single</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

### Exercise 4 — Launch script

```bash
#!/bin/bash
java -jar target/lya-1.0.0-jar-with-dependencies.jar
```

---

## Chapter 35 — Docker

### Exercise 1 — Dockerfile

```dockerfile
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/lya-1.0.0-jar-with-dependencies.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
```

### Exercise 2 — Build and run

```bash
docker build -t lya:latest .
docker run -p 8080:8080 lya:latest
```

### Exercise 3 — Health endpoint

```java
if (path.equals("/health")) {
    return "OK";
}
```

### Exercise 4 — Auto-deployment

Push to GitHub, connect the repo to the hosting platform (Render, Heroku, etc.), and enable auto-deploy.

---

## Chapter 36 — Deployment

The solutions are the same as for Docker, with the addition of a cloud platform like Render, Heroku, or AWS.

### Render.com

1. Connect GitHub account
2. Select your repo
3. Build Command: `mvn clean package`
4. Start Command: `java -jar target/lya-*.jar`
5. Deploy

### Heroku

```bash
heroku create lya-app
git push heroku main
```

---

## Chapter 37 — JUnit Testing

### Exercise 1 — Test help

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LyaTest {
    
    @Test
    void shouldReturnHelpMessage() {
        Lya lya = new Lya();
        assertTrue(lya.getResponse("help").contains("help"));
    }
}
```

### Exercise 2 — Test unknown command

```java
@Test
void shouldHandleUnknownCommand() {
    Lya lya = new Lya();
    assertEquals("I don't understand that yet.", lya.getResponse("xyz"));
}
```

### Exercise 3 — Test learn

```java
@Test
void shouldLearnNewResponse() {
    Lya lya = new Lya();
    lya.learn("hi", "Hello!");
    assertEquals("Hello!", lya.getResponse("hi"));
}
```

### Exercise 4 (Challenge) — Test validation

```java
@Test
void shouldThrowOnEmptyInput() {
    Lya lya = new Lya();
    assertThrows(EmptyRequestException.class, () -> lya.respond(""));
}

@Test
void shouldThrowOnNullInput() {
    Lya lya = new Lya();
    assertThrows(EmptyRequestException.class, () -> lya.respond(null));
}
```

---

## Chapter 38 — AI and Future

Chapters 38+ cover more advanced concepts. The exercises are open-ended and don't have a single correct solution. Here are some possible approaches:

### Exercise 1 — Add intent recognition

```java
public class IntentRecognizer {
    private HashMap<String, String> intents = new HashMap<>();
    
    public IntentRecognizer() {
        intents.put("hello", "greeting");
        intents.put("help", "support");
        intents.put("weather", "weather");
        intents.put("order", "order");
        intents.put("ticket", "support");
    }
    
    public String recognize(String request) {
        String[] words = request.toLowerCase().split(" ");
        for (String word : words) {
            if (intents.containsKey(word)) {
                return intents.get(word);
            }
        }
        return "unknown";
    }
}
```

### Exercise 2 — Add confidence score

```java
public class LearningMemory {
    private HashMap<String, String> knowledge = new HashMap<>();
    private HashMap<String, Integer> confidence = new HashMap<>();
    
    public void learn(String request, String response) {
        knowledge.put(request, response);
        confidence.put(request, 1);
    }
    
    public void reinforce(String request) {
        confidence.put(request, confidence.getOrDefault(request, 0) + 1);
    }
    
    public int getConfidence(String request) {
        return confidence.getOrDefault(request, 0);
    }
}
```

### Exercise 3 — Feedback mechanism

```java
public void provideFeedback(String request, boolean wasHelpful) {
    if (wasHelpful) {
        reinforce(request);
    } else {
        confidence.put(request, Math.max(0, confidence.getOrDefault(request, 0) - 1));
        if (confidence.get(request) <= 0) {
            knowledge.remove(request);
            confidence.remove(request);
        }
    }
}
```

### Exercise 4 (Challenge) — AI API integration

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class AIAssistant {
    private static final String API_KEY = "your-api-key-here";
    private static final String API_URL = "https://api.openai.com/v1/completions";

    public String askAI(String question) {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Authorization", "Bearer " + API_KEY);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            String body = "{\"model\":\"gpt-3.5-turbo-instruct\",\"prompt\":\"" + question + "\",\"max_tokens\":150}";
            try (OutputStream os = connection.getOutputStream()) {
                os.write(body.getBytes());
                os.flush();
            }

            BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            connection.disconnect();

            // Parse JSON response
            String json = response.toString();
            // Extract the text from the "choices" array
            int start = json.indexOf("\"text\":\"") + 8;
            int end = json.indexOf("\"", start);
            if (start > 8 && end > start) {
                return json.substring(start, end);
            }
            return "Could not parse AI response";
        } catch (Exception e) {
            return "Error calling AI: " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        AIAssistant assistant = new AIAssistant();
        System.out.println(assistant.askAI("What is Java?"));
    }
}

© 2026 E.J.A. — All rights reserved.
```

---
