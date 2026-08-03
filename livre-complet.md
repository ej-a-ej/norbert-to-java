

# 📚 NORBERT LEARNS JAVA — Complete Book (Markdown Format)

```markdown
# NORBERT LEARNS JAVA

## Build Your First Assistant, Step by Step

---

# INTRODUCTION — WHY THIS BOOK EXISTS

Norbert is sitting at his computer. He has an idea, but it's still blurry. He wants to create something useful. Not a complicated application, not a flashy website. Something simple, personal, that would help him in daily life.

Like many people, Norbert has often heard about programming. He knows Java is a language used everywhere, but he doesn't know where to start. The books he's flipped through start with abstract definitions, diagrams, terms he doesn't understand yet.

He closes those books and thinks: *"There must be another way to learn."*

This book was born from that conviction. You don't learn a programming language by reading definitions. You learn by building something. Step by step. With mistakes, corrections, victories.

**Norbert Learns Java** tells the story of a learning journey. Not a theoretical story, but a lived one, where each concept appears because it becomes necessary. Where each mistake is not a failure, but a step.

## The Guiding Thread: Lya

The guiding thread of this book is **Lya**. Lya is Norbert's project. A personal assistant he builds chapter by chapter.

At first, Lya is barely a message on the screen. But as Norbert learns, Lya grows, becomes richer, more useful. She becomes the reflection of his progress.

Building Lya means:

- Understanding variables
- Learning to make choices
- Repeating actions
- Organizing code
- Creating objects
- Securing data
- Making programs communicate
- And much more

Each chapter corresponds to a step in this construction. Each step brings a new skill, but also a problem to solve. This is how you truly learn.

## Who Is This Book For?

This book is written for:

- Complete beginners who have never written a line of code
- Those who have tried to learn Java but gave up
- Self-learners who want to build a concrete project
- Anyone who prefers learning by doing, rather than reading definitions

No prior programming knowledge is needed. Only curiosity matters.

## How to Read This Book?

This book should be read in order. Each chapter builds on the previous one. If you skip a chapter, you might miss an essential step.

In each chapter, you will find:

1. A **daily life situation** — Norbert experiences something that helps him understand a concept
2. A **clear explanation** — The concept is stated simply, without unnecessary jargon
3. **Java code** — Concrete, commented examples you can run
4. A **mistake** — Norbert makes a mistake, because it's normal, and learns from it
5. A **summary** — "What Norbert remembers"
6. **Exercises** — To practice what you've just learned

Take your time. Redo the exercises. Reread the passages that seem difficult. Programming is learned like a language: through practice, repetition, and use.

And above all, don't be afraid of mistakes. They are your allies.

---

# PART 1 — THE BASICS

---

## CHAPTER 1 — HELLO, JAVA

Norbert sat at his computer with a coffee beside him and a strange mix of excitement and fear. He had thought about programming for a long time, but today he finally decided to begin.

He didn't want to study programming forever. He wanted to make something real. Something that could speak back to him.

So he opened his editor and typed his first Java program.

### What Is Java?

Java is a programming language. It is a way to give instructions to a computer step by step. You write code, and the computer reads it and follows your instructions. Java is popular because it is portable, which means the same program can run on many different systems, such as Windows, macOS, and Linux.

### The Simplest Thing

The simplest thing a program can do is print a message on the screen. Norbert learned that a Java program needs a class and a main method. For now, he thought of the class as the container for the program, and the main method as the place where the program starts. Inside main, he used `System.out.println()` to display text.

```java
public class Lya {
    public static void main(String[] args) {
        System.out.println("Hello, I'm Lya!");
    }
}
```

When Norbert saved the file as `Lya.java`, compiled it, and ran it, the screen showed: "Hello, I'm Lya!" It was a tiny result, but it felt like the beginning of something real.

### A Small Personality

Norbert decided that Lya should introduce herself properly every time she starts. He wrote a program with a warm greeting. That was the first small personality he gave her. Lya was no longer just an idea.

### Beginner Mistakes

Norbert made a few beginner mistakes at first: he forgot the semicolon, he wrote `System.out.println` incorrectly, he forgot the quotation marks around the text. Each mistake taught him something. That is how learning starts.

### What Norbert Remembers

- Java programs are written in files and run by the computer
- Every Java program starts with a main method
- `System.out.println()` prints text on the screen
- Semicolons end instructions
- Text must be written inside double quotes

### Exercises

**Exercise 1:** Change the greeting to say "Good morning!" instead of "Hello, I'm Lya!"

**Exercise 2:** Print two separate messages on two different lines.

**Exercise 3:** Print your name and your age on separate lines.

**Challenge:** Print a small shape using text characters.

---

## CHAPTER 2 — NORBERT'S BOXES

Norbert is standing in front of his bookshelf. He has spent an hour looking for a red notebook. He knows he left it somewhere, but between the piles of notes, bookmarks, and loose papers, he cannot find it. "That's the problem," he mutters. "I did not organize anything."

He sighs. Then he takes an empty jar and puts his pens in it. He takes a shelf and lines up his notebooks. He takes a box and stores his old bills inside it. He has not finished, but he already feels order beginning to appear. A name, a place, a content.

He returns to his computer. He has just understood something about a program's memory.

### What Is a Variable?

A variable is a named place where a program stores information. You can imagine it like a labeled box. The label is the variable name, and the content is the value. Every variable in Java also has a type. The type tells Java what kind of data the variable can hold.

### Basic Types

Some basic types are: `int` for whole numbers, `double` for decimal numbers, `boolean` for true or false, `char` for a single character, `String` for text.

### Lya Stores Information

Norbert decided that Lya should store basic information about herself: her name, her version, whether she is ready, and how many messages she has processed.

```java
public class LyaV1 {
    public static void main(String[] args) {
        String name = "Lya";
        double version = 1.0;
        boolean isReady = true;
        int messagesProcessed = 0;

        System.out.println("=== " + name + " ASSISTANT ===");
        System.out.println("Version: " + version);
        System.out.println("Ready to help: " + isReady);
        System.out.println("Messages processed: " + messagesProcessed);
        System.out.println("Hello! I'm " + name + ", your personal assistant.");
    }
}
```

### Concatenation

The `+` sign can combine text and variables. This is called concatenation. Norbert also wanted Lya to count how many messages she had processed. He changed the `messagesProcessed` variable to track activity. That way, Lya could slowly keep track of her activity.

### What Norbert Remembers

- Variables store data
- Every variable has a type
- `String` stores text
- `int` stores whole numbers
- `double` stores decimal numbers
- `boolean` stores true or false
- Concatenation joins text and values

### Exercises

**Exercise 1:** Create an age variable and print it.

**Exercise 2:** Change Lya's version to 1.1 and print it.

**Exercise 3:** Create a greeting variable containing "Welcome!" and print it.

**Challenge:** Create a temperature variable and store 22.5 in it.

---

## CHAPTER 3 — NORBERT CHOOSES

Norbert is at the market. He looks at two stalls selling tomatoes. One is $2.50 a kilo, the other $3.00. He takes the cheaper ones without thinking twice. Walking home, he realizes what he has just done: he made a choice. A condition. If the price is lower, he buys. Otherwise, he walks past.

His program needs the same thing. Lya must choose between different responses depending on what she is asked.

### What Is a Condition?

Conditions in Java are created with `if`, `else if`, and `else`. They allow the program to choose different paths. Think of it like this: if something is true, go this way; else if the first thing was false, check this; else if nothing else was true, go this way.

### A Simple Condition

Norbert starts with a simple program that prints a greeting based on the time of day.

```java
public class AllChapitre3 {
    public static void main(String[] args) {
        int hour = 14;

        if (hour < 12) {
            System.out.println("Good morning.");
        } else {
            System.out.println("Good afternoon.");
        }

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
```

He runs it and sees "Good afternoon." He changes `hour` to 9 and sees "Good morning." The program looks at the value inside `hour` and chooses the appropriate message.

### Adding More Paths

He then adds a third path for the evening.

```java
int hour = 19;

if (hour < 12) {
    System.out.println("Good morning.");
} else if (hour < 18) {
    System.out.println("Good afternoon.");
} else {
    System.out.println("Good evening.");
}
```

### Different Responses

Norbert wants Lya to respond differently based on the user's request.

```java
String request = "hello";

if (request.equals("hello")) {
    System.out.println("Hello! How can I help you?");
} else if (request.equals("help")) {
    System.out.println("I can answer simple questions.");
} else {
    System.out.println("I don't understand that yet.");
}
```

This is the first time Lya starts to feel interactive. She begins to respond differently depending on what she receives.

### What Norbert Remembers

- Conditions let programs make decisions
- `if` runs a block when the condition is true
- `else` runs when the condition is false
- `else if` adds another possible path
- Lya can use conditions to answer differently based on the request

### Exercises

**Exercise 1:** Write a program that prints "It's cold" if temperature is below 15, otherwise "It's warm."

**Exercise 2:** Write a program with three cases: morning, afternoon, and evening.

**Exercise 3:** Create a condition that checks whether a request is empty or not.

**Challenge:** Make Lya respond differently depending on whether the user says "hello" or something else.

---

## CHAPTER 4 — NORBERT REPEATS

Norbert is at the gym, lying on the floor after a set of push-ups. He's done ten. He knows because he counted. One, two, three, four, five, six, seven, eight, nine, ten. He's out of breath, but he's also thinking. "I just repeated the same action ten times," he mutters. "I didn't write the instruction ten times. I just did it. And I counted."

That's exactly what a loop does in Java. A loop lets a program repeat an action instead of writing the same code many times. Norbert sees why this matters for Lya. She may need to show a menu again and again, scan a list of words, or repeat a task until something changes.

### The `while` Loop

A `while` loop repeats as long as a condition stays true. Norbert writes a program that counts his push-ups.

```java
public class AllChapitre4 {
    public static void main(String[] args) {
        // While loop
        int count = 1;
        while (count <= 5) {
            System.out.println("Push-up number " + count);
            count = count + 1;
        }
        System.out.println("Done!");

        // For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Push-up number " + i);
        }
        System.out.println("Done!");
    }
}
```

He runs it and sees "Push-up number 1" through "Push-up number 5" then "Done!" The program starts with `count = 1`. It checks the condition. If `count <= 5`, it runs the block. At the end of each round, `count` increases by 1. When `count` becomes 6, the condition is false, and the loop stops.

### The `for` Loop

He also learns about the `for` loop, which is useful when he already knows how many times the action should repeat.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Push-up number " + i);
}
System.out.println("Done!");
```

The result is the same, but the `for` loop packs everything into one line: the starting point, the condition, and the update.

### A Common Mistake

Norbert makes a mistake. He forgets to update the counter. The program runs forever. He learns the rule: every loop must have something that changes inside it, and that change must eventually make the condition false.

### What Norbert Remembers

- Loops repeat actions in Java
- `while` repeats while a condition is true
- `for` is useful when the number of repetitions is known
- A loop must eventually stop
- Lya can use loops to process lists and repeat tasks

### Exercises

**Exercise 1:** Write a while loop that counts from 1 to 10.

**Exercise 2:** Write a for loop that prints the numbers from 1 to 20.

**Exercise 3:** Write a program that asks the user for numbers until they type 0, then prints the sum.

**Challenge:** Print a multiplication table for the number 7.

---

## CHAPTER 5 — NORBERT ORGANIZES

Norbert is in his kitchen, staring at a messy cupboard. Cans of beans, bags of pasta, bottles of oil — all mixed together. He sighs, then grabs a box. "I'm going to organize this," he says. He starts grouping things. Pasta together. Cans together. Bottles together. He stops halfway and looks at his hands. "I'm not just storing things," he realizes. "I'm storing them in groups."

His program needs the same thing. Lya will need to store groups of related items: commands, tasks, messages. He can't keep creating separate variables for everything.

### What Is an Array?

An array is a container that holds multiple values of the same type. Think of it like a row of identical boxes. Each box has a number — an index — that tells you its position. The boxes are numbered starting at 0.

### A Grocery List

Norbert writes a program that stores his shopping list.

```java
public class AllChapitre5 {
    public static void main(String[] args) {
        String[] groceries = {"bread", "milk", "eggs", "apples", "butter"};

        System.out.println("First item: " + groceries[0]);
        System.out.println("Second item: " + groceries[1]);
        System.out.println("Last item: " + groceries[4]);

        System.out.println("\nMy grocery list:");
        for (int i = 0; i < groceries.length; i++) {
            System.out.println("- " + groceries[i]);
        }

        String[] commands = {"help", "hello", "time", "exit"};
        System.out.println("\nAvailable commands:");
        for (String command : commands) {
            System.out.println("- " + command);
        }
    }
}
```

He runs it and sees the grocery list printed in order. He learns the important rule: the first index is 0, the last index is length - 1.

### Fixed Size

He also learns that arrays have a fixed size. You decide how many boxes you need when you create the array, and you can't change it later.

### Storing Commands

Norbert stores Lya's possible commands in an array.

### Note on Best Practices

For simplicity, the examples in this chapter use static methods. In a real project, you would normally use instance methods and dependency injection. We will revisit this in later chapters when we build the full application.

### What Norbert Remembers

- Arrays store multiple values of the same type
- The first index is 0
- The last index is length - 1
- Arrays have a fixed size
- Loops are perfect for going through arrays

### Exercises

**Exercise 1:** Create an array of three favorite movies and print them.

**Exercise 2:** Find the maximum value in an array of numbers: `{45, 23, 67, 12, 89}`.

**Exercise 3:** Reverse an array: `{1, 2, 3, 4, 5}` → `{5, 4, 3, 2, 1}`.

**Challenge:** Create an array of 10 numbers and sort them.

---

## CHAPTER 6 — NORBERT REUSES

Norbert is in his kitchen, making a salad. He washes the lettuce, chops the tomatoes, slices the onions, mixes the dressing. He does it in the same order every time. He stops mid-chop. "I don't write down the whole process every time I make a salad," he says. "I just say 'make a salad' and I know what that means."

He walks to his computer. His code is starting to feel like a recipe written on too many pages. He needs to bundle code into reusable blocks.

### What Is a Method?

A method is a named block of code that performs a specific task. You write the code once, give it a name, and call it whenever you need it. Think of it like a tool in a workshop: you don't build a hammer every time you need one.

### A Simple Method

Norbert writes a simple method that prints a greeting.

```java
public class AllChapitre6 {
    public static void main(String[] args) {
        displayWelcome();

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                handleRequest(input);
            }
        }
        scanner.close();
    }

    public static void displayWelcome() {
        System.out.println("=== LYA ASSISTANT ===");
        System.out.println("Type 'quit' to stop.");
    }

    public static void handleRequest(String request) {
        if (request.equals("hello")) {
            System.out.println("Hello! How can I help you?");
        } else if (request.equals("help")) {
            System.out.println("I can handle: hello, help, time");
        } else if (request.equals("time")) {
            System.out.println("I don't have a clock yet.");
        } else {
            System.out.println("I don't understand that.");
        }
    }
}
```

He runs it and sees the greeting twice. He called the method twice, but wrote the code once.

### Parameters

He adds a parameter to greet different people.

```java
public static void greet(String name) {
    System.out.println("Hello, " + name + "!");
}
```

### Return Values

He also learns that a method can return a value.

```java
public static int add(int a, int b) {
    return a + b;
}
```

Now he organizes Lya into clear methods.

### What Norbert Remembers

- Methods bundle code into reusable blocks
- Methods have a name, parameters, a return type, and a body
- `void` methods return nothing
- Methods with a return type use `return` to give back a value
- Methods make code cleaner, easier to read, and easier to reuse

### Exercises

**Exercise 1:** Write a method that takes a name and age and prints a greeting.

**Exercise 2:** Write a method that takes a number and returns true if even, false if odd.

**Exercise 3:** Write a method that takes an array of numbers and returns the sum.

**Challenge:** Write a method that calculates the factorial of a number.

---

## CHAPTER 7 — NORBERT LISTENS

Norbert is at his desk, staring at Lya's code. She can display messages, make decisions, repeat actions, and organize code into methods. But she can't hear. "An assistant that can't listen is just a billboard," he mutters.

He remembers his first interactions with Siri and Alexa. They didn't just say things — they responded to his voice. They read what he said and reacted to it. Lya needs the same thing.

### Keyboard Input

Keyboard input lets a program read what the user types. Without it, a program is a monologue. With it, it becomes a conversation. In Java, you read input using `Scanner`.

### A Simple Input Program

Norbert writes a simple program that asks for a name.

```java
import java.util.Scanner;

public class Listener {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
```

He runs it, types his name, and Lya responds.

### Reading Numbers

He also learns to read numbers.

```java
import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("Age: " + age);
        System.out.println("Color: " + color);

        scanner.close();
    }
}
```

He discovers an important detail: after `nextInt()`, you need an extra `nextLine()` to consume the leftover newline.

### An Interactive Lya

Now Lya can be truly interactive.

```java
import java.util.Scanner;

public class LyaInteractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== LYA ASSISTANT ===");
        System.out.println("Hello! I'm Lya.");
        System.out.println("Type 'quit' to stop.");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                System.out.println("Goodbye!");
                break;
            } else if (input.equals("hello")) {
                System.out.println("Hello! How can I help you?");
            } else if (input.equals("help")) {
                System.out.println("Commands: hello, help, quit");
            } else {
                System.out.println("I don't understand that.");
            }
        }
        scanner.close();
    }
}
```

### What Norbert Remembers

- `Scanner` reads input from the keyboard
- `nextLine()` reads text
- `nextInt()` reads integers
- Always close the scanner when done
- `nextInt()` leaves a newline — use an extra `nextLine()` to clear it

### Exercises

**Exercise 1:** Ask the user for their name and greet them.

**Exercise 2:** Ask for two numbers and print their sum.

**Exercise 3:** Ask for a number and tell if it's positive, negative, or zero.

**Challenge:** Create a simple calculator with two numbers and an operator.

---

## CHAPTER 8 — NORBERT BUILDS A BLUEPRINT

Norbert is at the train station, staring at the departure board. Each train is listed as a row of information: number, destination, time, platform. Every row has the same structure, but different values. "It's like a template," he says. "Each train is the same shape, but filled with different details."

He thinks about Lya. Right now, she's a loose collection of variables and methods. She works, but she doesn't feel like a real thing. She's just code floating around. He wants Lya to become a real object.

### What Is a Class?

A class is a blueprint. It describes what something is and what it can do. An object is a concrete instance created from that blueprint. Think of it like a cookie cutter: the cutter is the class, the cookies are the objects.

### A Train Class

Norbert creates a simple class for a train.

```java
public class Train {
    String number;
    String destination;
    int hour;

    void display() {
        System.out.println("Train " + number + " to " + destination);
        System.out.println("Departure: " + hour + ":00");
    }
}
```

Then he creates objects from that class.

```java
public class Gare {
    public static void main(String[] args) {
        Train train1 = new Train();
        train1.number = "TGV 701";
        train1.destination = "Lyon";
        train1.hour = 14;

        Train train2 = new Train();
        train2.number = "TER 405";
        train2.destination = "Rennes";
        train2.hour = 16;

        train1.display();
        System.out.println();
        train2.display();
    }
}
```

He runs it and sees two different trains displayed with their own values. He understands that a class is the blueprint and an object is the actual thing.

### Lya Becomes a Class

Now Norbert turns Lya into a real class.

```java
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
```

Now he can create multiple Lya objects.

```java
public class Main {
    public static void main(String[] args) {
        LyaV2 lya = new LyaV2();
        lya.name = "Lya";
        lya.version = "0.1";
        lya.messagesProcessed = 0;

        lya.greet();
        lya.respond("Hello!");
        lya.respond("What's the weather?");
        lya.displayStatus();
    }
}
```

### What Norbert Remembers

- A class is a blueprint
- An object is an instance of a class
- Fields store data in an object
- Methods define what an object can do
- Use `new` to create an object
- Each object has its own copy of the fields

### Exercises

**Exercise 1:** Create a `Person` class with name, age, and city fields. Add a `display()` method.

**Exercise 2:** Create a `Book` class with title, author, and pages fields. Add a `display()` method.

**Exercise 3:** Create a `Car` class with brand, model, and year fields. Add a `display()` method.

**Challenge:** Create a `BankAccount` class with owner and balance fields. Add `deposit()` and `withdraw()` methods.

---

## CHAPTER 9 — NORBERT BUILDS PROPERLY

Norbert is in his workshop, building a chair. He doesn't build it empty and then add legs later. He builds it whole: legs, seat, back, all at once. "That's how I should build Lya," he says. "Not empty first, filled later. Complete from the start."

Right now, he creates Lya like this: `Lya lya = new Lya(); lya.name = "Lya"; lya.version = "0.1"; lya.messagesProcessed = 0;` It works, but it's messy. He can forget to set a field. He can set it incorrectly. He wants a way to create Lya with all her values ready.

### What Is a Constructor?

A constructor is a special method that runs when you create an object. Its job is to initialize the object's fields. Constructors have the same name as the class, don't have a return type, run automatically when you use `new`, and can take parameters.

### A Constructor for Train

Norbert adds a constructor to the `Train` class.

```java
public class TrainV2 {
    String number;
    String destination;
    int hour;

    public TrainV2(String number, String destination, int hour) {
        this.number = number;
        this.destination = destination;
        this.hour = hour;
    }

    public TrainV2(String number, String destination) {
        this(number, destination, 12);
    }

    void display() {
        System.out.println("Train " + number + " to " + destination);
        System.out.println("Departure: " + hour + ":00");
    }
}
```

Now he can create trains in one line:
```java
TrainV2 train1 = new TrainV2("TGV 701", "Lyon", 14);
TrainV2 train2 = new TrainV2("TER 405", "Rennes");
```

He learns that `this` refers to the current object. `this.number` is the field, `number` is the parameter.

### Multiple Constructors

He also learns about multiple constructors. He adds a second constructor for a default hour.

### A Constructor for Lya

Norbert adds a constructor to Lya.

```java
public class LyaV3 {
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
```

Now he creates Lya cleanly:
```java
LyaV3 lya = new LyaV3("Lya", "1.0");
LyaV3 defaultLya = new LyaV3();
```

### What Norbert Remembers

- A constructor initializes an object when it's created
- It has the same name as the class and no return type
- `this` refers to the current object
- You can have multiple constructors
- Constructors make object creation cleaner and safer

### Exercises

**Exercise 1:** Add a constructor to the `Person` class that takes name and age.

**Exercise 2:** Create a `Book` class with constructors: one with all fields, one with just title and author.

**Exercise 3:** Create a `Car` class with a constructor that sets brand, model, and year.

**Challenge:** Create a `BankAccount` class with a constructor that sets owner and initial balance.

---

## CHAPTER 10 — NORBERT PROTECTS HIS DATA

Norbert is in his garden, looking at his greenhouse. Inside, rows of tomato plants are growing. The greenhouse has a door with a lock. He can enter to water and tend the plants, but birds and rabbits can't. "I control who gets in," he says. "My plants are protected."

He thinks about Lya. Right now, her data is unprotected. Anyone could change her version to a negative number, or erase her name, or set her message count to something absurd. He needs to protect her internal state.

### What Is Encapsulation?

Encapsulation is the practice of hiding the internal data of an object and controlling access to it. In Java, encapsulation is achieved with `private` fields, public getters, and setters.

### A Protected Train

Norbert rewrites the `Train` class with `private` fields.

```java
public class TrainV3 {
    private String number;
    private String destination;
    private int hour;

    public TrainV3(String number, String destination, int hour) {
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
            System.out.println("Invalid hour!");
        }
    }

    public void display() {
        System.out.println("Train " + number + " to " + destination);
        System.out.println("Departure: " + hour + ":00");
    }
}
```

Now the fields are protected. Outside code can only access them through getters and setters. The setter prevents invalid values.

Norbert tries to set an invalid hour: `train.setHour(25);` The output is "Invalid hour!" The setter prevented the change.

### A Protected Lya

Now Norbert protects Lya's data.

```java
public class LyaV4 {
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
```

### What Norbert Remembers

- Encapsulation protects an object's internal data
- `private` fields are accessible only inside the class
- Getters allow safe reading
- Setters allow controlled writing
- Validation belongs in setters
- Encapsulation makes code more robust and maintainable

### Exercises

**Exercise 1:** Create a `Person` class with private name and age fields. Add getters and setters.

**Exercise 2:** Add validation to `setAge()` so age can't be negative.

**Exercise 3:** Create a `Product` class with private name and price fields. Add getters and setters.

**Challenge:** Create a `Student` class with private grades and a method to calculate the average.

---

## CHAPTER 11 — NORBERT DISCOVERS WHAT BELONGS TO THE CLASS

Norbert is in his garden, looking at all the plants he's grown. He plants seeds, waters them, and they grow. Each plant is an individual object. But some things are shared among all the plants. The soil, the water, the sunlight — they don't belong to any one plant. They're part of the garden itself.

He thinks about Lya. He's created multiple Lya objects. Each one has its own name, version, and message count. But some data doesn't belong to one Lya. The total number of Lya objects isn't stored in any single object. It belongs to the class.

### What Is `static`?

A `static` member belongs to the class itself, not to any particular object. It's shared by all objects of that class. In Java, you use the `static` keyword to create class-level members.

### Counting Trains

Norbert wants to count how many `Train` objects he creates.

```java
public class TrainV4 {
    private static int count = 0;
    public static final int MAX_SPEED = 300;

    private String number;
    private String destination;
    private int hour;

    public TrainV4(String number, String destination, int hour) {
        this.number = number;
        this.destination = destination;
        this.hour = hour;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void display() {
        System.out.println("Train " + number + " to " + destination);
        System.out.println("Departure: " + hour + ":00");
        System.out.println("Total trains: " + count);
    }
}
```

Now he can track the total number of trains: `System.out.println("Total trains: " + TrainV4.getCount());`

He learns that static methods can be called without creating an object. This is useful for utility functions.

### Constants with `static final`

He also learns about `static final` for constants.

```java
public static final int MAX_MESSAGES = 100;
public static final String DEFAULT_VERSION = "1.0";
public static final String APP_NAME = "Lya";
```

### Static Members in Lya

Now Norbert adds static members to Lya.

```java
public class LyaV5 {
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
}
```

### What Norbert Remembers

- `static` members belong to the class, not to objects
- Static fields are shared by all instances
- Static methods can be called without creating an object
- `static final` is used for constants
- Static is useful for counters, utilities, and shared data

### Exercises

**Exercise 1:** Add a static counter to a class and increment it each time an object is created.

**Exercise 2:** Write a static method that checks whether a number is positive.

**Exercise 3:** Create a static final constant for a maximum score.

**Challenge:** Create a utility class with several static methods for simple math operations.

---

## CHAPTER 12 — NORBERT FACES THE UNEXPECTED

Norbert is in his kitchen, following a recipe for a cake. He measures the flour, cracks the eggs, adds the sugar. Everything is going perfectly.

Then he opens the fridge. No butter.

He stops. The recipe can't continue without butter. He can't just pretend it's there. He has to handle this unexpected situation.

He sighs, closes the fridge, and goes to the store.

Later, back at his computer, he thinks about Lya. She's going to face unexpected situations too. Users will type empty messages. Files won't exist. Networks will fail. She needs a way to handle these moments gracefully.

He opens his laptop.

### What Are Exceptions?

An exception is an event that interrupts the normal flow of a program. It's Java's way of saying: "Something unexpected just happened, and I can't continue as if nothing occurred."

Think of it like a safety net. If something goes wrong, the net catches you. You don't fall all the way down.

Java provides a structured way to handle these events:

| Tool | What it does |
| :--- | :--- |
| `try` | Contains code that might cause an exception |
| `catch` | Handles the exception if it occurs |
| `finally` | Runs code regardless of whether an exception occurred |
| `throw` | Creates and throws an exception |
| `throws` | Declares that a method might throw an exception |

### Norbert's First Exception

Norbert writes a program that divides two numbers:

```java
public class SafeDivision {
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
```

He runs it:

```
Cannot divide by zero!
Program continues.
```

The program didn't crash. It handled the error gracefully and continued.

### Multiple Catch Blocks

Norbert learns that he can catch different types of exceptions:

```java
public class MultipleCatch {
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
```

He runs it:

```
Result: 10
Result: 20
Not a valid number: abc
Cannot divide by zero: 0
```

Each exception is caught by the appropriate handler.

### The `finally` Block

Norbert learns about `finally`: a block that runs whether an exception occurs or not.

```java
public class FinallyExample {
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
```

He runs it:

```
Trying something risky...
Result: 5
This always runs.
```

He changes to division by zero:

```
Trying something risky...
Error: / by zero
This always runs.
```

`finally` is useful for cleanup: closing files, releasing resources, or always saving data.

### Creating Custom Exceptions

Norbert realizes that sometimes he needs his own types of exceptions:

```java
public class EmptyRequestException extends Exception {
    public EmptyRequestException(String message) {
        super(message);
    }
}
```

Now he can use it in Lya:

```java
public class LyaV6 {
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
```

Now he uses it:

```java
public class Main {
    public static void main(String[] args) {
        LyaV6 lya = new LyaV6("Lya", "1.0");

        try {
            lya.respond("Hello");
            lya.respond(""); // This will throw an exception
        } catch (EmptyRequestException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

Output:

```
Processing: Hello
Error: Request cannot be empty!
```

### The `throw` Keyword

Norbert learns that `throw` is used to manually trigger an exception:

```java
public static void validateAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative.");
    }
    System.out.println("Age: " + age);
}
```

He can use this to enforce rules.

### The `throws` Keyword

`throws` is used in method signatures to declare that a method might throw an exception:

```java
public void respond(String request) throws EmptyRequestException {
    // ...
}
```

This tells callers: "This method might throw an exception, so you need to handle it."

### Applying Exceptions to Lya

Norbert integrates exception handling into Lya.

### What Norbert Remembers

- Exceptions handle unexpected situations gracefully
- `try` contains risky code
- `catch` handles specific exceptions
- `finally` runs regardless of whether an exception occurs
- `throw` triggers an exception manually
- `throws` declares that a method might throw an exception
- Custom exceptions make code more descriptive

### Exercises

**Exercise 1:** Write a program that divides two numbers and handles division by zero.

**Exercise 2:** Create a custom exception for invalid age (e.g., negative age).

**Exercise 3:** Write a method that reads a file and handles `FileNotFoundException`.

**Challenge:** Create a `validatePassword()` method that throws an exception if the password is too short.

---

# PART 2 — BUILDING LYA

---

## CHAPTER 13 — BUILDING LYA

Norbert is sitting at his desk, looking at everything he's learned. Variables, conditions, loops, methods, classes, objects, encapsulation, exceptions. Each piece is useful on its own. But together, they can become something more.

He's been building Lya piece by piece. Now it's time to bring all the pieces together and build a complete assistant.

Not a perfect one. Not a smart one. Just a working one that can:

- Introduce itself
- Answer a few known questions
- Keep a history
- Learn new responses

Norbert opens his editor and starts typing.

### The Complete Lya

```java
import java.util.ArrayList;
import java.util.HashMap;

public class EmptyRequestException extends Exception {
    public EmptyRequestException(String message) {
        super(message);
    }
}

public class LyaV7 {
    private String name;
    private String version;
    private HashMap<String, String> responses;
    private ArrayList<String> history;

    public LyaV7() {
        this.name = "Lya";
        this.version = "0.1";
        this.responses = new HashMap<>();
        this.history = new ArrayList<>();

        // Predefined responses
        responses.put("hello", "Hello! How can I help you?");
        responses.put("hi", "Hi there! What can I do for you?");
        responses.put("who are you", "I'm Lya, an assistant built by Norbert.");
        responses.put("help", "I can answer simple questions. Try saying 'hello'.");
        responses.put("thanks", "You're welcome!");
        responses.put("goodbye", "Goodbye! See you later!");
    }

    public void greet() {
        System.out.println("=== LYA ASSISTANT ===");
        System.out.println("Hello, I'm " + name + ".");
        System.out.println("Version " + version);
        System.out.println("Ask me something, or type 'quit' to stop.");
    }

    public void respond(String request) throws EmptyRequestException {
        if (request == null || request.trim().isEmpty()) {
            throw new EmptyRequestException("Request cannot be empty.");
        }

        history.add("User: " + request);
        String cleanRequest = request.toLowerCase().trim();
        String response = responses.get(cleanRequest);

        if (response != null) {
            System.out.println("Lya: " + response);
            history.add("Lya: " + response);
        } else {
            System.out.println("Lya: I don't understand that yet.");
            System.out.println("Lya: You can teach me with 'learn [request] | [response]'");
            history.add("Lya: I don't understand that yet.");
        }
    }

    public void learn(String request, String response) throws EmptyRequestException {
        if (request == null || request.trim().isEmpty()) {
            throw new EmptyRequestException("Request cannot be empty.");
        }
        if (response == null || response.trim().isEmpty()) {
            throw new EmptyRequestException("Response cannot be empty.");
        }

        String cleanRequest = request.toLowerCase().trim();
        responses.put(cleanRequest, response);
        System.out.println("Lya learned: '" + request + "' → '" + response + "'");
    }

    public void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No history yet.");
            return;
        }
        System.out.println("--- Conversation History ---");
        for (String entry : history) {
            System.out.println(entry);
        }
        System.out.println("--- End of History ---");
    }

    public void showKnownResponses() {
        if (responses.isEmpty()) {
            System.out.println("I don't know any responses yet.");
            return;
        }
        System.out.println("--- Known Responses ---");
        for (String key : responses.keySet()) {
            System.out.println(key + " → " + responses.get(key));
        }
        System.out.println("--- End of Responses ---");
    }

    public void displayStatus() {
        System.out.println("--- Lya Status ---");
        System.out.println("Name: " + name);
        System.out.println("Version: " + version);
        System.out.println("Known responses: " + responses.size());
        System.out.println("History entries: " + history.size());
    }
}
```

### The Main Program

```java
import java.util.Scanner;

public class LyaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LyaV7 lya = new LyaV7();

        lya.greet();

        boolean running = true;
        while (running) {
            System.out.print("\nYou: ");
            String input = scanner.nextLine().trim();

            try {
                if (input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("exit")) {
                    running = false;
                    System.out.println("Lya: Goodbye!");
                    break;
                }

                if (input.equalsIgnoreCase("history")) {
                    lya.showHistory();
                    continue;
                }

                if (input.equalsIgnoreCase("knowledge")) {
                    lya.showKnownResponses();
                    continue;
                }

                if (input.equalsIgnoreCase("status")) {
                    lya.displayStatus();
                    continue;
                }

                if (input.toLowerCase().startsWith("learn ")) {
                    String content = input.substring(6);
                    String[] parts = content.split("\\|");
                    if (parts.length == 2) {
                        lya.learn(parts[0].trim(), parts[1].trim());
                    } else {
                        System.out.println("Usage: learn [request] | [response]");
                        System.out.println("Example: learn hello | Hello there!");
                    }
                    continue;
                }

                lya.respond(input);

            } catch (EmptyRequestException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please type something.");
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Lya: See you next time!");
    }
}
```

### What Norbert Remembers

- Lya is now a complete, working assistant
- She can answer, learn, and remember
- `HashMap` is perfect for storing key-value pairs
- `ArrayList` is great for storing ordered history
- Error handling makes her robust
- A clean main loop keeps her interactive

### Exercises

**Exercise 1:** Add three more predefined responses to Lya.

**Exercise 2:** Add a command to clear the history.

**Exercise 3:** Add a command to delete a response from the knowledge base.

**Challenge:** Add a timestamp to each history entry.

---

## CHAPTER 14 — UNDERSTANDING SIMPLE REQUESTS

Norbert is in a coffee shop, waiting for his order. The barista calls out: "Latte for Sarah?" A woman across the room looks up and walks to the counter.

Norbert notices something: the barista didn't say "Sarah" in isolation. She said a whole sentence. But the important word was "Sarah."

"That's how understanding works," he says. "You don't need to recognize every word. You just need to catch the important ones."

He thinks about Lya. Right now, she only understands exact matches. "Hello" works. "Hello there" doesn't. "Hey" doesn't. "Hi" doesn't.

She needs to understand more than just exact words. She needs to find keywords inside sentences.

### Finding Responses

Norbert adds a method to find responses more intelligently.

```java
private String findResponse(String request) {
    String cleaned = request.toLowerCase().trim();

    // 1. Check exact match
    if (responses.containsKey(cleaned)) {
        return responses.get(cleaned);
    }

    // 2. Check for keywords
    String[] words = cleaned.split(" ");
    for (String word : words) {
        if (responses.containsKey(word)) {
            return responses.get(word);
        }
    }

    // 3. Check for question types
    if (cleaned.contains("who") || cleaned.contains("what")) {
        return "I can tell you about myself, but I don't know much yet.";
    }

    if (cleaned.contains("why")) {
        return "I'm still learning how to answer 'why' questions.";
    }

    if (cleaned.contains("how")) {
        return "I can explain simple things, but I need more training.";
    }

    if (cleaned.contains("where")) {
        return "I don't know much about places yet.";
    }

    if (cleaned.contains("when")) {
        return "I don't have a good sense of time yet.";
    }

    return null;
}
```

### Updated `respond` Method

```java
public void respond(String request) throws EmptyRequestException {
    if (request == null || request.trim().isEmpty()) {
        throw new EmptyRequestException("Request cannot be empty.");
    }

    history.add("User: " + request);
    String response = findResponse(request);

    if (response != null) {
        System.out.println("Lya: " + response);
        history.add("Lya: " + response);
    } else {
        System.out.println("Lya: I don't understand that yet.");
        System.out.println("Lya: You can teach me with 'learn [request] | [response]'");
        history.add("Lya: I don't understand that yet.");
    }
}
```

### What Norbert Remembers

- `contains()` checks if a substring exists inside a string
- Lowercasing input makes matching case-insensitive
- Exact match comes first, then keywords, then question types
- This is a simple but effective way to handle varied input

### Exercises

**Exercise 1:** Add a keyword for "weather" and return a custom message.

**Exercise 2:** Add a keyword for "ticket" and return a custom message.

**Exercise 3:** Add detection for questions starting with "where."

**Challenge:** Add a synonym system that maps "hi" and "hey" to "hello."

---

## CHAPTER 15 — NORBERT MAKES LYA SAFE

Norbert is at a restaurant, watching the waiter take orders. A customer says: "I'll have the pasta." The waiter writes it down. Then the customer adds: "Actually, no pasta. I'll have the fish instead." The waiter doesn't panic. He crosses out pasta, writes fish, and moves on.

Good systems handle changes gracefully. They don't crash because someone changed their mind. Lya needs the same resilience.

Input validation is the process of checking that input is valid before using it. In Java, validation involves null checks, length checks, type checks, and content checks.

### Creating a Validation Framework

```java
public class ValidationException extends Exception {
    public ValidationException(String message) {
        super(message);
    }
}

public class EmptyRequestException extends ValidationException {
    public EmptyRequestException() {
        super("Request cannot be empty.");
    }
}

public class RequestTooLongException extends ValidationException {
    public RequestTooLongException(int maxLength) {
        super("Request cannot exceed " + maxLength + " characters.");
    }
}
```

### Validating Requests

```java
private void validateRequest(String request) throws ValidationException {
    if (request == null) {
        throw new ValidationException("Request cannot be null.");
    }

    String trimmed = request.trim();
    if (trimmed.isEmpty()) {
        throw new EmptyRequestException();
    }

    if (trimmed.length() > MAX_REQUEST_LENGTH) {
        throw new RequestTooLongException(MAX_REQUEST_LENGTH);
    }
}

public void respond(String request) throws ValidationException {
    validateRequest(request);
    // ... rest of the method
}
```

### What Norbert Remembers

- Input validation checks that input is valid before using it
- Null checks prevent `NullPointerException`
- Length checks prevent memory issues
- Custom exceptions make error handling more specific

### Exercises

**Exercise 1:** Add validation to ensure a request doesn't contain invalid characters.

**Exercise 2:** Create a custom exception for requests that contain profanity.

**Exercise 3:** Add validation to the `learn` method so it rejects empty requests.

**Challenge:** Add validation to ensure a request contains only letters, numbers, and spaces.

---

## CHAPTER 16 — NORBERT MANAGES REAL DATA

Norbert is at his desk, staring at a pile of paperwork. Orders, invoices, tickets — each one has multiple pieces of information: a client name, a date, a status, a priority. He can't just store them as simple text. He needs structure.

Structured data is information organized into a clear, predictable format. In Java, structured data is represented by classes with fields.

### The Order Class

```java
public class Order {
    private int number;
    private String client;
    private String description;
    private String status;
    private String priority;

    public Order(int number, String client, String description) {
        this.number = number;
        this.client = client;
        this.description = description;
        this.status = "Pending";
        this.priority = "medium";
    }

    public Order(int number, String client, String description, String priority) {
        this(number, client, description);
        this.priority = priority;
    }

    public int getNumber() { return number; }
    public String getClient() { return client; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
    public String getPriority() { return priority; }

    public void setStatus(String status) {
        if (status != null && !status.trim().isEmpty()) {
            this.status = status;
        }
    }

    public void display() {
        System.out.println("=== Order #" + number + " ===");
        System.out.println("Client: " + client);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("Priority: " + priority);
    }
}
```

### Integrating Orders into Lya

```java
public class LyaV9 {
    private HashMap<Integer, Order> orders;
    private int nextOrderNumber;

    public LyaV9() {
        // ... existing initialization ...
        this.orders = new HashMap<>();
        this.nextOrderNumber = 1001;

        // Sample orders
        addOrder("Alice", "Payment issue", "high");
        addOrder("Bob", "Delivery delay", "medium");
    }

    public void addOrder(String client, String description, String priority) {
        Order order = new Order(nextOrderNumber, client, description, priority);
        orders.put(nextOrderNumber, order);
        nextOrderNumber++;
        System.out.println("Order #" + order.getNumber() + " created for " + client);
    }

    public Order getOrder(int number) {
        return orders.get(number);
    }

    public void updateOrderStatus(int number, String status) {
        Order order = orders.get(number);
        if (order != null) {
            order.setStatus(status);
            System.out.println("Order #" + number + " updated to: " + status);
        } else {
            System.out.println("Order #" + number + " not found.");
        }
    }

    public void showOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
            return;
        }
        System.out.println("--- All Orders ---");
        for (Order order : orders.values()) {
            order.display();
        }
    }
}
```

### What Norbert Remembers

- Structured data is organized into clear fields
- Classes are the natural way to represent structured data in Java
- Each order has its own fields and behaviors
- `HashMap` is great for looking up orders by number

### Exercises

**Exercise 1:** Add a date field to the `Order` class.

**Exercise 2:** Create a `Ticket` class with number, client, description, priority, and status fields.

**Exercise 3:** Add a method to search for orders by client name.

**Challenge:** Add a method to count orders by status or priority.

---

## CHAPTER 17 — NORBERT GROWS HIS DATA

Norbert is in his garden, planting seeds. He knows he'll have more plants next month than he has today. He needs a way to add new plants without digging up the old ones. His program needs the same flexibility.

`ArrayList` is a collection that can grow and shrink as needed. Unlike arrays, which have a fixed size, `ArrayList` is flexible.

### Using ArrayList in Lya

```java
import java.util.ArrayList;

public class LyaV10 {
    private ArrayList<String> history;
    private ArrayList<Ticket> tickets;
    private int nextTicketNumber;

    public LyaV10() {
        // ... existing initialization ...
        this.tickets = new ArrayList<>();
        this.nextTicketNumber = 1001;
    }

    public void addTicket(String client, String description, String priority) {
        Ticket ticket = new Ticket(nextTicketNumber, client, description, priority);
        tickets.add(ticket);
        nextTicketNumber++;
        System.out.println("Ticket #" + ticket.getNumber() + " created for " + client);
    }

    public Ticket getTicket(int number) {
        for (Ticket ticket : tickets) {
            if (ticket.getNumber() == number) {
                return ticket;
            }
        }
        return null;
    }

    public void updateTicketStatus(int number, String status) {
        Ticket ticket = getTicket(number);
        if (ticket != null) {
            ticket.setStatus(status);
            System.out.println("Ticket #" + number + " updated to: " + status);
        } else {
            System.out.println("Ticket #" + number + " not found.");
        }
    }

    public void showTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets found.");
            return;
        }
        System.out.println("--- All Tickets ---");
        for (Ticket ticket : tickets) {
            ticket.display();
        }
    }
}
```

### What Norbert Remembers

- `ArrayList` is a dynamic collection
- It can grow and shrink as needed
- `add()` adds items to the end or at a position
- `remove()` removes items by value or position
- `get()` retrieves items by position

### Exercises

**Exercise 1:** Create an `ArrayList` of three favorite movies and print them.

**Exercise 2:** Add a method to Lya to remove a ticket by number.

**Exercise 3:** Create a method to count tickets by priority.

**Challenge:** Create a method to sort tickets by priority (urgent first).

---

## CHAPTER 18 — NORBERT FINDS WHAT HE NEEDS

Norbert is in his kitchen, looking for a specific spice. He knows it's somewhere in the cupboard, but he doesn't want to search through every jar. He needs a faster way to find things. He looks at his phone. He has hundreds of contacts, but he doesn't scroll through them alphabetically. He types a name and finds it instantly.

That's what Lya needs. Sometimes she needs to look up a response by a keyword, or find an order by a number. A list is too slow for that.

`HashMap` stores data as key-value pairs. Each key is associated with a value. You use the key to look up the value.

### Using HashMap in Lya

```java
import java.util.ArrayList;
import java.util.HashMap;

public class LyaV11 {
    private HashMap<String, String> responses;
    private HashMap<Integer, Order> orders;
    private HashMap<String, ArrayList<Order>> ordersByClient;

    public LyaV11() {
        this.responses = new HashMap<>();
        this.orders = new HashMap<>();
        this.ordersByClient = new HashMap<>();
    }

    public void addOrder(int number, String client, String description, String priority) {
        Order order = new Order(number, client, description, priority);
        orders.put(number, order);

        // Also store by client for fast lookup
        ordersByClient.computeIfAbsent(client, k -> new ArrayList<>()).add(order);
        System.out.println("Order #" + number + " created for " + client);
    }

    public Order getOrder(int number) {
        return orders.get(number);
    }

    public ArrayList<Order> getOrdersByClient(String client) {
        return ordersByClient.get(client);
    }

    public void showOrdersByClient(String client) {
        ArrayList<Order> clientOrders = ordersByClient.get(client);
        if (clientOrders == null || clientOrders.isEmpty()) {
            System.out.println("No orders for " + client);
            return;
        }
        System.out.println("--- Orders for " + client + " ---");
        for (Order order : clientOrders) {
            System.out.println("#" + order.getNumber() + ": " + order.getDescription() +
                " (" + order.getStatus() + ")");
        }
    }
}
```

### What Norbert Remembers

- `HashMap` stores key-value pairs
- Keys are unique; values can be duplicate
- `put(key, value)` adds or updates
- `get(key)` retrieves a value
- `containsKey(key)` checks existence

### Exercises

**Exercise 1:** Create a map with three keyword-response pairs.

**Exercise 2:** Retrieve one response by its key.

**Exercise 3:** Add a new key and replace an old one.

**Challenge:** Use `HashMap` to store user preferences.

---

## CHAPTER 19 — NORBERT ENSURES UNIQUENESS

Norbert is at a conference, collecting business cards. He meets Alice, takes her card. He meets Bob, takes his card. Later, he meets Alice again — same person, same card. He doesn't want to add Alice's contact twice. He needs to keep only unique contacts.

`HashSet` is a collection that stores unique values. It automatically prevents duplicates.

### Using HashSet in Lya

```java
import java.util.HashSet;

public class LyaV12 {
    private HashSet<String> commands;
    private HashSet<String> clients;

    public LyaV12() {
        this.commands = new HashSet<>();
        this.clients = new HashSet<>();

        // Add known commands
        commands.add("hello");
        commands.add("help");
        commands.add("goodbye");
        commands.add("weather");
        commands.add("orders");
        commands.add("tickets");

        // Add known clients
        clients.add("Alice");
        clients.add("Bob");
        clients.add("Charlie");
    }

    public boolean isKnownCommand(String command) {
        return commands.contains(command.toLowerCase().trim());
    }

    public void addClient(String client) {
        if (clients.add(client)) {
            System.out.println("New client added: " + client);
        } else {
            System.out.println("Client already known: " + client);
        }
    }

    public void showCommands() {
        System.out.println("--- Known Commands ---");
        for (String command : commands) {
            System.out.println("- " + command);
        }
    }

    public void showClients() {
        System.out.println("--- Known Clients ---");
        for (String client : clients) {
            System.out.println("- " + client);
        }
    }
}
```

### What Norbert Remembers

- `HashSet` stores unique values
- Duplicates are automatically ignored
- `add(value)` only adds if the value isn't already present
- `contains(value)` checks if a value exists

### Exercises

**Exercise 1:** Create a set with three words and try adding one of them twice.

**Exercise 2:** Check whether a value exists before adding it.

**Exercise 3:** Use a set to store unique user names.

**Challenge:** Use `HashSet` to track processed orders.

---

# PART 3 — ADVANCED FEATURES

---

## CHAPTER 20 — NORBERT GIVES LYA A MEMORY

Norbert is in his study, looking at his bookshelf. Every book is still there, exactly where he left it. He can close his eyes, open them the next day, and the books will still be there. His program doesn't have that luxury. When Lya stops running, everything disappears.

Persistence means saving data so it survives after the program ends. In Java, persistence often means files.

### Saving and Loading Data

```java
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class LyaStorage {
    private static final String RESPONSES_FILE = "lya_responses.txt";
    private static final String HISTORY_FILE = "lya_history.txt";
    private static final String STATUS_FILE = "lya_status.txt";

    public static void saveResponses(HashMap<String, String> responses) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(RESPONSES_FILE))) {
            for (String key : responses.keySet()) {
                writer.println(key + "|||" + responses.get(key));
            }
            System.out.println("Responses saved.");
        } catch (IOException e) {
            System.out.println("Error saving responses: " + e.getMessage());
        }
    }

    public static HashMap<String, String> loadResponses() {
        HashMap<String, String> responses = new HashMap<>();
        File file = new File(RESPONSES_FILE);
        if (!file.exists()) {
            return responses;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(RESPONSES_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|\\|\\|");
                if (parts.length == 2) {
                    responses.put(parts[0], parts[1]);
                }
            }
            System.out.println("Responses loaded: " + responses.size() + " entries.");
        } catch (IOException e) {
            System.out.println("Error loading responses: " + e.getMessage());
        }
        return responses;
    }

    public static void saveHistory(ArrayList<String> history) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(HISTORY_FILE))) {
            for (String entry : history) {
                writer.println(entry);
            }
            System.out.println("History saved.");
        } catch (IOException e) {
            System.out.println("Error saving history: " + e.getMessage());
        }
    }

    public static ArrayList<String> loadHistory() {
        ArrayList<String> history = new ArrayList<>();
        File file = new File(HISTORY_FILE);
        if (!file.exists()) {
            return history;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(HISTORY_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                history.add(line);
            }
            System.out.println("History loaded: " + history.size() + " entries.");
        } catch (IOException e) {
            System.out.println("Error loading history: " + e.getMessage());
        }
        return history;
    }

    public static void saveStatus(int messagesProcessed) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(STATUS_FILE))) {
            writer.println(messagesProcessed);
        } catch (IOException e) {
            System.out.println("Error saving status: " + e.getMessage());
        }
    }

    public static int loadStatus() {
        File file = new File(STATUS_FILE);
        if (!file.exists()) {
            return 0;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(STATUS_FILE))) {
            String line = reader.readLine();
            if (line != null) {
                return Integer.parseInt(line.trim());
            }
        } catch (Exception e) {
            System.out.println("Error loading status: " + e.getMessage());
        }
        return 0;
    }
}
```

### Integrating Persistence into Lya

```java
public class LyaV13 {
    private String name;
    private String version;
    private HashMap<String, String> responses;
    private ArrayList<String> history;
    private int messagesProcessed;

    public LyaV13() {
        this.name = "Lya";
        this.version = "1.0";

        // Load saved data
        this.responses = LyaStorage.loadResponses();
        this.history = LyaStorage.loadHistory();
        this.messagesProcessed = LyaStorage.loadStatus();

        // If no responses exist, add defaults
        if (responses.isEmpty()) {
            responses.put("hello", "Hello! How can I help you?");
            responses.put("hi", "Hi there! What can I do for you?");
            responses.put("help", "I can answer simple questions.");
            responses.put("goodbye", "Goodbye! See you later!");
            responses.put("thanks", "You're welcome!");
            responses.put("who are you", "I'm Lya, an assistant built by Norbert.");
        }

        System.out.println("Lya loaded. Responses: " + responses.size() +
            ", History: " + history.size());
    }

    public void save() {
        LyaStorage.saveResponses(responses);
        LyaStorage.saveHistory(history);
        LyaStorage.saveStatus(messagesProcessed);
        System.out.println("Lya saved.");
    }
}
```

### What Norbert Remembers

- Persistence means data survives after the program ends
- Files are the simplest way to save data in Java
- `FileWriter` and `PrintWriter` write text to files
- `FileReader` and `BufferedReader` read text from files
- `IOException` handles file errors

### Exercises

**Exercise 1:** Save the list of orders to a file and load it at startup.

**Exercise 2:** Save the list of tickets to a file and load it at startup.

**Exercise 3:** Add a timestamp to each history entry before saving.

**Challenge:** Create a backup of the data file before overwriting it.

---

## CHAPTER 21 — NORBERT CHECKS HIS WORK

Norbert is in his workshop, building a chair. He finishes the chair, then sits on it to test it. He rocks back and forth. It holds. He adds weight. It still holds. "I need to do this with my code too," he says.

Testing is the practice of checking that code behaves as expected.

### A Simple Test Framework

```java
public class TestLya {
    public static void main(String[] args) {
        System.out.println("Running Lya tests...");

        testResponseExists();
        testResponseNotFound();
        testEmptyRequestRejected();
        testLearning();
        testKeywordRecognition();

        System.out.println("All tests passed!");
    }

    public static void testResponseExists() {
        LyaV13 lya = new LyaV13();
        try {
            lya.respond("hello");
            System.out.println("✓ Response exists test passed");
        } catch (Exception e) {
            System.out.println("✗ Response exists test failed: " + e.getMessage());
        }
    }

    public static void testResponseNotFound() {
        LyaV13 lya = new LyaV13();
        try {
            lya.respond("unknown word");
            System.out.println("✓ Response not found handled gracefully");
        } catch (Exception e) {
            System.out.println("✗ Response not found test failed: " + e.getMessage());
        }
    }

    public static void testEmptyRequestRejected() {
        LyaV13 lya = new LyaV13();
        try {
            lya.respond("");
            System.out.println("✗ Empty request should be rejected");
        } catch (EmptyRequestException e) {
            System.out.println("✓ Empty request properly rejected");
        } catch (Exception e) {
            System.out.println("✗ Empty request test failed: " + e.getMessage());
        }
    }

    public static void testLearning() {
        LyaV13 lya = new LyaV13();
        try {
            lya.learn("test", "test response");
            System.out.println("✓ Learning test passed");
        } catch (Exception e) {
            System.out.println("✗ Learning test failed: " + e.getMessage());
        }
    }

    public static void testKeywordRecognition() {
        LyaV13 lya = new LyaV13();
        try {
            lya.respond("Can you help me?");
            System.out.println("✓ Keyword recognition test passed");
        } catch (Exception e) {
            System.out.println("✗ Keyword recognition test failed: " + e.getMessage());
        }
    }
}
```

### What Norbert Remembers

- Testing checks that code works as expected
- Tests should cover normal cases and error cases
- Tests give confidence when changing code
- Regression tests prevent old bugs from coming back

### Exercises

**Exercise 1:** Write a test that verifies Lya's response to "hello" is correct.

**Exercise 2:** Write a test that verifies the learn method works correctly.

**Exercise 3:** Write a test that verifies Lya rejects requests over 200 characters.

**Challenge:** Write a test suite for the `Order` class.

---

## CHAPTER 22 — NORBERT OPENS A WINDOW

Norbert is sitting in his living room, looking at his phone. He asks for the weather, and a few seconds later, he gets an answer. That small moment changes how he thinks about Lya, because she could do the same thing: ask another service for information and bring the answer back.

### What Is Networking?

Networking lets programs communicate over a network. In Java, this usually means opening a connection, sending a request, and reading a response. For web services, HTTP is the standard way to do that.

### A Weather Service

Norbert wants Lya to stop pretending she knows everything. Instead of answering weather questions from memory, she can ask a weather service and relay the result.

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherService {
    public static String getWeather(String city) {
        if (city == null || city.trim().isEmpty()) {
            return "Please provide a city name.";
        }

        try {
            String apiUrl = "https://example.com/weather?city=" + city.trim().replace(" ", "%20");
            URL url = new URL(apiUrl);
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

            return response.toString();
        } catch (Exception e) {
            return "I could not get the weather right now.";
        }
    }
}
```

### Note on Best Practices

For simplicity, the examples in this chapter use static methods. In a real project, you would normally use instance methods and dependency injection.

### Common Mistakes and Limits

The biggest limit is that real web services are not always available, so Lya must handle errors calmly. Another common mistake is assuming every response will be immediate and perfectly formatted. Norbert also learns that network code needs timeouts, validation, and fallback messages.

### What Norbert Remembers

- Networking lets programs talk to other programs
- HTTP is the main protocol for web communication
- Requests go out, responses come back
- Network code can fail, so errors must be handled
- Lya can become more useful by asking external services for live data

### Exercises

**Exercise 1:** Change the code so Lya asks for the weather of two different cities.

**Exercise 2:** Add a fallback message when the city name is too short.

**Exercise 3:** Make the method return a friendlier message if the request fails.

**Challenge:** Replace the fake URL with a real API and display the returned weather text.

---

## CHAPTER 23 — NORBERT READS THE WORLD'S LANGUAGE

Norbert is reading a letter from a friend. It's structured: sender, date, subject, message. He thinks about the data Lya receives from web services. It often looks like JSON.

### What Is JSON?

JSON (JavaScript Object Notation) is a simple text format for storing and exchanging structured data.

### Creating JSON

```java
public class LyaProfile {
    private String name;
    private String version;
    private boolean active;
    private int messagesProcessed;

    public LyaProfile(String name, String version, boolean active, int messagesProcessed) {
        this.name = name;
        this.version = version;
        this.active = active;
        this.messagesProcessed = messagesProcessed;
    }

    public String toJson() {
        return "{" +
            "\"name\":\"" + name + "\"," +
            "\"version\":\"" + version + "\"," +
            "\"active\":" + active + "," +
            "\"messagesProcessed\":" + messagesProcessed +
            "}";
    }
}
```

### Parsing JSON (Simple Version)

```java
public class SimpleJsonParser {
    public static String getString(String json, String key) {
        String searchKey = "\"" + key + "\"";
        int keyIndex = json.indexOf(searchKey);
        if (keyIndex == -1) return null;

        int valueStart = json.indexOf(":", keyIndex) + 1;
        while (json.charAt(valueStart) == ' ') valueStart++;

        if (json.charAt(valueStart) != '"') return null;

        int valueEnd = json.indexOf("\"", valueStart + 1);
        return json.substring(valueStart + 1, valueEnd);
    }

    public static Integer getInt(String json, String key) {
        String searchKey = "\"" + key + "\"";
        int keyIndex = json.indexOf(searchKey);
        if (keyIndex == -1) return null;

        int valueStart = json.indexOf(":", keyIndex) + 1;
        while (json.charAt(valueStart) == ' ') valueStart++;

        if (json.charAt(valueStart) == '"') return null;

        int valueEnd = valueStart;
        while (valueEnd < json.length() &&
            (Character.isDigit(json.charAt(valueEnd)) ||
            json.charAt(valueEnd) == '-')) {
            valueEnd++;
        }

        try {
            return Integer.parseInt(json.substring(valueStart, valueEnd));
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
```

### What Norbert Remembers

- JSON is a text format for structured data
- Objects use `{}` and arrays use `[]`
- Keys and strings are in double quotes
- Values can be strings, numbers, booleans, arrays, or objects
- JSON is common for web APIs

### Exercises

**Exercise 1:** Create a JSON string for a book with title, author, and pages.

**Exercise 2:** Write a method that extracts the title from a book JSON.

**Exercise 3:** Create a JSON string for Lya's current state.

**Challenge:** Write a method that extracts an array from a JSON string.

---

# PART 4 — THE WEB

---

## CHAPTER 24 — NORBERT SPEAKS THE WEB'S LANGUAGE

Norbert is at a restaurant. He looks at the menu, picks a dish, and tells the waiter: "I'll have the pasta." The waiter writes it down, goes to the kitchen, and brings back his food. He realizes: this is exactly how Lya should communicate with web services. She should be able to say "I want this" and get back what she asked for.

But the web has its own language. It's called REST.

### What Is REST?

REST is a set of rules for building web APIs. Resources are identified by URLs. HTTP methods define the action.

### A REST API for Lya

```java
import java.util.HashMap;

public class LyaAPI {
    private HashMap<Integer, Order> orders;
    private HashMap<Integer, Ticket> tickets;
    private int nextOrderId;
    private int nextTicketId;

    public LyaAPI() {
        this.orders = new HashMap<>();
        this.tickets = new HashMap<>();
        this.nextOrderId = 1001;
        this.nextTicketId = 1;

        // Sample data
        orders.put(1001, new Order(1001, "Alice", "Payment issue", "high"));
        orders.put(1002, new Order(1002, "Bob", "Delivery delay", "medium"));
        tickets.put(1, new Ticket(1, "Charlie", "Cannot login", "urgent"));
        tickets.put(2, new Ticket(2, "Alice", "Bug in payment", "high"));
    }

    public String getOrders() {
        StringBuilder response = new StringBuilder();
        response.append("{\"type\":\"orders\",");
        response.append("\"count\":").append(orders.size()).append(",");
        response.append("\"data\":[");
        boolean first = true;
        for (Order order : orders.values()) {
            if (!first) response.append(",");
            response.append(order.toJson());
            first = false;
        }
        response.append("]}");
        return response;
    }

    public String getOrder(int id) {
        Order order = orders.get(id);
        if (order == null) {
            return "{\"error\":\"Order not found\"}";
        }
        return order.toJson();
    }

    public String createOrder(String client, String description, String priority) {
        Order order = new Order(nextOrderId, client, description, priority);
        orders.put(nextOrderId, order);
        nextOrderId++;
        return order.toJson();
    }

    public String updateOrder(int id, String status) {
        Order order = orders.get(id);
        if (order == null) {
            return "{\"error\":\"Order not found\"}";
        }
        order.setStatus(status);
        return order.toJson();
    }

    public String deleteOrder(int id) {
        if (orders.containsKey(id)) {
            orders.remove(id);
            return "{\"success\":true,\"message\":\"Order deleted\"}";
        }
        return "{\"error\":\"Order not found\"}";
    }
}
```

### What Norbert Remembers

- REST is a set of rules for web APIs
- Resources are identified by URLs
- HTTP methods define the action:
  - GET = read
  - POST = create
  - PUT = update
  - DELETE = delete
- Responses are often in JSON format
- REST makes APIs consistent and predictable

### Exercises

**Exercise 1:** Add a GET endpoint for a single ticket by ID.

**Exercise 2:** Add a PUT endpoint to update a ticket's status.

**Exercise 3:** Add a DELETE endpoint to delete a ticket.

**Challenge:** Add a GET endpoint that returns orders filtered by client name.

---

## CHAPTER 25 — NORBERT PUTS LYA ON THE WEB

Norbert is looking at his phone. He can access websites, send messages, check the weather, all from a tiny device in his pocket. "Lya should be like that," he says. "She should be accessible from anywhere."

### What Is a Web Server?

A web server is a program that listens for incoming HTTP requests and responds to them. In Java, a web server listens on a specific port, accepts incoming connections, reads the HTTP request, and sends back an HTTP response.

### A Simple Web Server

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class LyaWebServer {
    private LyaAPI api;

    public LyaWebServer() {
        this.api = new LyaAPI();
    }

    public void start() {
        System.out.println("Lya Web Server on port 8080...");
        try {
            ServerSocket server = new ServerSocket(8080);
            System.out.println("Server ready.");
            System.out.println("Try: http://localhost:8080/hello");
            System.out.println("Try: http://localhost:8080/orders");

            while (true) {
                Socket client = server.accept();
                BufferedReader reader = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));

                String requestLine = reader.readLine();
                if (requestLine == null) {
                    client.close();
                    continue;
                }

                System.out.println("Request: " + requestLine);
                String response = handleRequest(requestLine);

                OutputStream out = client.getOutputStream();
                String httpResponse = "HTTP/1.1 200 OK\n\n" + response;
                out.write(httpResponse.getBytes());

                client.close();
                System.out.println("Client disconnected.\n");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private String handleRequest(String requestLine) {
        String[] parts = requestLine.split(" ");
        if (parts.length < 2) {
            return "Invalid request";
        }

        String method = parts[0];
        String path = parts[1];

        if (path.equals("/") || path.equals("/hello")) {
            return "Hello! I'm Lya. How can I help you?";
        }

        if (path.equals("/orders")) {
            return api.getOrders();
        }

        if (path.matches("/orders/\\d+")) {
            int id = Integer.parseInt(path.substring(8));
            return api.getOrder(id);
        }

        if (path.startsWith("/weather/")) {
            String city = path.substring(9);
            return WeatherService.getWeather(city);
        }

        if (path.equals("/help")) {
            return "Commands:\n/hello\n/orders\n/orders/123\n/weather/Paris\n/help";
        }

        return "Not found: " + path + "\nTry /help";
    }

    public static void main(String[] args) {
        LyaWebServer server = new LyaWebServer();
        server.start();
    }
}
```

### What Norbert Remembers

- `ServerSocket` listens for incoming connections
- `Socket` represents a connection to a client
- HTTP requests and responses follow a standard format
- Routes map URLs to specific behaviors
- A web server makes Lya accessible from anywhere

### Exercises

**Exercise 1:** Add a route `/time` that returns the current time.

**Exercise 2:** Add a route `/status` that returns Lya's current status.

**Exercise 3:** Add a route `/ticket/{id}` that returns a specific ticket.

**Challenge:** Add support for POST requests to create new orders via the web.

---

## CHAPTER 26 — NORBERT HANDLES MANY AT ONCE

Norbert is at a busy coffee shop. There's one barista, but she handles customers one after another. When it gets really busy, customers have to wait. He thinks about Lya's web server. Right now, she handles one client at a time. If one client asks for something that takes a few seconds, everyone else waits.

### What Is a Thread?

A thread is a separate path of execution within a program. Think of it like a worker: the program is the company, each thread is an employee, multiple employees can work at the same time.

### A Multithreaded Server

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket client;
    private LyaAPI api;

    public ClientHandler(Socket client, LyaAPI api) {
        this.client = client;
        this.api = api;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("[" + threadName + "] Processing client...");

        try {
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(client.getInputStream()));

            String requestLine = reader.readLine();
            if (requestLine == null) {
                client.close();
                return;
            }

            System.out.println("[" + threadName + "] Request: " + requestLine);
            String response = handleRequest(requestLine);

            OutputStream out = client.getOutputStream();
            String httpResponse = "HTTP/1.1 200 OK\n\n" + response;
            out.write(httpResponse.getBytes());

            client.close();
            System.out.println("[" + threadName + "] Client disconnected.\n");
        } catch (Exception e) {
            System.out.println("[" + threadName + "] Error: " + e.getMessage());
        }
    }

    private String handleRequest(String requestLine) {
        String[] parts = requestLine.split(" ");
        if (parts.length < 2) {
            return "Invalid request";
        }

        String path = parts[1];

        if (path.equals("/") || path.equals("/hello")) {
            return "Hello! I'm Lya. (Served by " + Thread.currentThread().getName() + ")";
        }

        if (path.equals("/orders")) {
            return api.getOrders();
        }

        if (path.startsWith("/weather/")) {
            String city = path.substring(9);
            return WeatherService.getWeather(city);
        }

        return "Not found: " + path;
    }
}

public class MultithreadedServer {
    private LyaAPI api;

    public MultithreadedServer() {
        this.api = new LyaAPI();
    }

    public void start() {
        System.out.println("Lya Multithreaded Server on port 8080...");
        System.out.println("Multiple clients can connect simultaneously!");

        try {
            ServerSocket server = new ServerSocket(8080);
            int clientCount = 0;
            System.out.println("Server ready.\n");

            while (true) {
                Socket client = server.accept();
                clientCount++;
                System.out.println("Client #" + clientCount + " connected!");

                ClientHandler handler = new ClientHandler(client, api);
                Thread thread = new Thread(handler);
                thread.setName("Client-" + clientCount);
                thread.start();

                System.out.println("Thread " + thread.getName() + " started.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        MultithreadedServer server = new MultithreadedServer();
        server.start();
    }
}
```

### What Norbert Remembers

- Threads allow multiple tasks to run simultaneously
- A web server can handle each client in a separate thread
- Thread pools limit the number of concurrent threads
- Multiple threads make the server more responsive

### Exercises

**Exercise 1:** Add a route that simulates a 3-second wait and returns a message.

**Exercise 2:** Create a counter that tracks total requests handled by the server.

**Exercise 3:** Add a route that shows the current number of active threads.

**Challenge:** Create a queue system when the server is busy.

---

## CHAPTER 27 — NORBERT REMEMBERS HIS CLIENTS

Norbert walks into his favorite café. The barista smiles and says: "Your usual?" "How did you remember?" Norbert asks. "I remember all my regulars," she says. His program needs the same ability. When a client makes a request, the server should recognize them.

### What Is a Session?

A session is a way to remember a client between multiple requests. Think of it like a membership card: you visit a store, they give you a card, every time you return you show the card, and the store looks you up and remembers your preferences.

### A Session System

```java
import java.util.HashMap;
import java.util.UUID;

public class Session {
    private String id;
    private String username;
    private HashMap<String, Object> data;
    private long lastActivity;
    private static final long TIMEOUT = 300000; // 5 minutes

    public Session(String username) {
        this.id = UUID.randomUUID().toString();
        this.username = username;
        this.data = new HashMap<>();
        this.lastActivity = System.currentTimeMillis();
    }

    public String getId() { return id; }
    public String getUsername() { return username; }

    public void setData(String key, Object value) {
        data.put(key, value);
        lastActivity = System.currentTimeMillis();
    }

    public Object getData(String key) {
        lastActivity = System.currentTimeMillis();
        return data.get(key);
    }

    public boolean isExpired() {
        return System.currentTimeMillis() - lastActivity > TIMEOUT;
    }

    public void touch() {
        lastActivity = System.currentTimeMillis();
    }
}

public class SessionManager {
    private static SessionManager instance;
    private Map<String, Session> sessions;
    private Map<String, String> sessionsByUser;

    private SessionManager() {
        this.sessions = new HashMap<>();
        this.sessionsByUser = new HashMap<>();
    }

    public static SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public Session createSession(String username) {
        Session session = new Session(username);
        sessions.put(session.getId(), session);
        sessionsByUser.put(username, session.getId());
        return session;
    }

    public Session getSession(String sessionId) {
        if (sessionId == null) return null;
        Session session = sessions.get(sessionId);
        if (session != null && !session.isExpired()) {
            session.touch();
            return session;
        }
        return null;
    }
}
```

### What Norbert Remembers

- Sessions remember clients between requests
- A session ID is a unique identifier
- The server stores session data
- The client sends the session ID with each request
- Sessions expire after a period of inactivity

### Exercises

**Exercise 1:** Add a visit counter that tracks how many times a user visits.

**Exercise 2:** Add the user's name to every response.

**Exercise 3:** Add a session expiration warning.

**Challenge:** Add a "remember me" option.

---

# PART 5 — SCALING AND DEPLOYMENT

---

## CHAPTER 28 — NORBERT SAVES SESSIONS

Norbert is closing his laptop for the night. He's been testing Lya's session system, and it works — but only while the server is running. When he stops the server and starts it again, all sessions disappear.

### Persistent Sessions

Persistent sessions save session data to disk so it survives server restarts.

```java
import java.io.*;
import java.util.ArrayList;

public class SessionStorage {
    private static final String SESSION_FILE = "sessions.txt";
    private static final String SEPARATOR = "|||";

    public static void saveSession(String sessionId, String username,
            String cartData, long lastActivity) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(SESSION_FILE, true))) {
            writer.println(sessionId + SEPARATOR + username + SEPARATOR +
                cartData + SEPARATOR + lastActivity);
        } catch (IOException e) {
            System.out.println("Error saving session: " + e.getMessage());
        }
    }

    public static ArrayList<String[]> loadSessions() {
        ArrayList<String[]> sessions = new ArrayList<>();
        File file = new File(SESSION_FILE);
        if (!file.exists()) {
            return sessions;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|\\|\\|");
                if (parts.length == 4) {
                    sessions.add(parts);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading sessions: " + e.getMessage());
        }
        return sessions;
    }

    public static void clearAllSessions() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(SESSION_FILE))) {
            // Empty the file
        } catch (IOException e) {
            System.out.println("Error clearing sessions: " + e.getMessage());
        }
    }
}
```

### What Norbert Remembers

- Persistent sessions survive server restarts
- Session data can be saved to files
- Loading from disk restores sessions
- Expired sessions should be filtered out when loading

### Exercises

**Exercise 1:** Save user preferences in the session.

**Exercise 2:** Add a timestamp to the session file format.

**Exercise 3:** Create a backup of the session file before overwriting.

**Challenge:** Implement session data compression.

---

## CHAPTER 29 — NORBERT DISCOVERS DATABASES

Norbert is looking at his filing cabinet. He has folders for clients, orders, tickets, and notes. He can find anything quickly because everything is organized. His current system is like a drawer of papers. It works, but searching is slow. He needs a better way to organize data.

### What Is a Database?

A database is an organized collection of data. Think of it like a filing cabinet: the cabinet is the database, each drawer is a table, each folder is a row, and each piece of paper is a column.

### Adding SQLite to Lya

```java
import java.sql.*;

public class Database {
    private Connection connection;

    public Database() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:lya.db");
            createTables();
            System.out.println("Database connected.");
        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    private void createTables() {
        try {
            Statement stmt = connection.createStatement();

            stmt.execute("CREATE TABLE IF NOT EXISTS orders (" +
                "id INTEGER PRIMARY KEY," +
                "client TEXT," +
                "description TEXT," +
                "status TEXT," +
                "priority TEXT," +
                "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");

            stmt.execute("CREATE TABLE IF NOT EXISTS tickets (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "client TEXT," +
                "description TEXT," +
                "priority TEXT," +
                "status TEXT," +
                "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");

            stmt.execute("CREATE TABLE IF NOT EXISTS history (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "user_message TEXT," +
                "ly_response TEXT," +
                "timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP)");

            System.out.println("Tables created.");
        } catch (SQLException e) {
            System.out.println("Table creation error: " + e.getMessage());
        }
    }

    public void saveOrder(Order order) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                "INSERT OR REPLACE INTO orders (id, client, description, status, priority) " +
                "VALUES (?, ?, ?, ?, ?)"
            );
            stmt.setInt(1, order.getNumber());
            stmt.setString(2, order.getClient());
            stmt.setString(3, order.getDescription());
            stmt.setString(4, order.getStatus());
            stmt.setString(5, order.getPriority());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Save order error: " + e.getMessage());
        }
    }

    public Order getOrder(int id) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                "SELECT * FROM orders WHERE id = ?"
            );
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Order(
                    rs.getInt("id"),
                    rs.getString("client"),
                    rs.getString("description"),
                    rs.getString("status"),
                    rs.getString("priority")
                );
            }
        } catch (SQLException e) {
            System.out.println("Get order error: " + e.getMessage());
        }
        return null;
    }
}
```

### What Norbert Remembers

- A database stores structured, long-term data
- Tables, rows, and columns are the basic building blocks
- Databases are better than files for many kinds of application data
- SQL is the language used to interact with databases

### Exercises

**Exercise 1:** Create a `users` table in the database.

**Exercise 2:** Add a method to get all orders from the database.

**Exercise 3:** Add a method to delete an order from the database.

**Challenge:** Add a method to update an order in the database.

---

## CHAPTER 30 — NORBERT BRIDGES OBJECTS AND DATABASES

Norbert now has Java objects on one side and database tables on the other. They represent the same ideas, but he does not want to write repetitive code every time he saves or loads data.

### What Is ORM?

ORM means Object-Relational Mapping. It connects Java objects to database rows, so the program can work with objects while the ORM translates them into database operations. JPA is one common Java standard for doing that.

### Using ORM in Lya

Instead of manually writing SQL for every order, Norbert can model orders as Java entities and let the persistence layer handle the mapping.

```java
import javax.persistence.*;

@Entity
@Table(name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String client;

    private String description;
    private String status;
    private String priority;

    public OrderEntity() {
    }

    public OrderEntity(String client, String description, String priority) {
        this.client = client;
        this.description = description;
        this.status = "Pending";
        this.priority = priority;
    }

    public int getId() { return id; }
    public String getClient() { return client; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
    public String getPriority() { return priority; }

    public void setStatus(String status) {
        this.status = status;
    }
}
```

### Note on Dependencies

To use JPA in a real project, you need to add a dependency like Hibernate to your `pom.xml` (or `build.gradle`). We will cover build tools in Chapter 33.

### Common Mistakes and Limits

ORM is helpful, but it is not magic. Norbert still needs to understand the database underneath, especially when queries become more complex. He also learns that entity classes need a default constructor and clean field mapping.

### What Norbert Remembers

- ORM maps objects to database tables
- JPA is a Java standard for ORM
- Entities represent database rows as Java objects
- ORM reduces manual SQL
- The database still matters, even with ORM

### Exercises

**Exercise 1:** Create a `Ticket` entity.

**Exercise 2:** Create a repository for `Ticket`.

**Exercise 3:** Add a method to find tickets by priority.

**Challenge:** Add a method to find orders by date range.

---

## CHAPTER 31 — NORBERT LEARNS TO SHARE

Norbert has built Lya alone. She works on his computer. She remembers things. She can even answer web requests. But something is missing. He looks at his email. He sees pull requests, code reviews, team discussions. Real software isn't built by one person in a room. It's built by teams.

### What Is Collaboration?

Collaboration means working with others to build something together. In software, collaboration involves sharing code, reviewing each other's work, communicating clearly, and respecting different approaches.

### Code Reviews

A code review is when another developer reads your code before it's merged. Code reviews catch bugs, improve quality, share knowledge, enforce consistency, and ensure accountability.

```java
// ❌ Bad review
"This is wrong."

// ✅ Better review
"The logic looks correct. Could we extract this calculation into a separate method to make it more readable?"

// ❌ Bad review
"Fix this."

// ✅ Better review
"There's a potential null pointer here. We should add a null check before accessing the object."
```

### What Norbert Remembers

- Collaboration is essential in real software development
- Code reviews catch bugs and improve quality
- Pull requests are how changes are proposed and reviewed
- Good reviews are specific and helpful

### Exercises

**Exercise 1:** Write a code review for a method that calculates the average of numbers.

**Exercise 2:** Describe what a pull request is for.

**Exercise 3:** Think of one way a team could avoid misunderstandings in Lya.

**Challenge:** Write a code review for the `findResponse` method.

---

## CHAPTER 32 — NORBERT TRACKS CHANGES

Norbert is looking at his code. He's made changes. He's fixed bugs. He's added features. But he can't remember exactly what he changed, or when. "Imagine if I couldn't remember what I wrote yesterday," he says. "I'd be lost."

### What Is Git?

Git is a version control system. It tracks changes to your code over time. Think of it like a time machine for your project: you save snapshots (commits), you can go back to any snapshot, you can see what changed, and you can work on different versions at the same time (branches).

### Essential Git Commands

```bash
# Check the status
git status

# Add files to staging
git add .
git add Lya.java

# Commit changes
git commit -m "Add keyword recognition to Lya"

# See the history
git log
git log --oneline

# See what changed
git diff

# Create a branch
git branch feature-weather

# Switch to a branch
git checkout feature-weather

# Or create and switch in one command
git checkout -b feature-weather

# Merge a branch
git checkout main
git merge feature-weather

# Delete a branch
git branch -d feature-weather
```

### What Norbert Remembers

- Git tracks changes to your code
- A commit is a snapshot of your project
- Branches let you work on features separately
- Merging brings work back together

### Exercises

**Exercise 1:** Initialize a Git repository for Lya.

**Exercise 2:** Make three commits with meaningful messages.

**Exercise 3:** Create a branch, make changes, and merge it.

**Challenge:** Use `git log` to explore the history.

---

## CHAPTER 33 — NORBERT GOES REMOTE

Norbert is looking at his local Git repository. It's organized. He can track changes, create branches, and merge work. But he's the only one who can see it. "Imagine if a book was only available in one person's notebook," he says. "It wouldn't be a real book. It would just be a draft."

### What Is GitHub?

GitHub is a platform for hosting Git repositories online. Think of it like a library: your code is the book, GitHub is the library shelf, and anyone with access can read it.

### Essential Remote Commands

```bash
# Add a remote repository
git remote add origin https://github.com/norbert/lya.git

# Push changes to remote
git push -u origin main

# Pull changes from remote
git pull

# Clone a repository
git clone https://github.com/norbert/lya.git
```

### The Collaboration Workflow

```bash
# Fork on GitHub, then clone
git clone https://github.com/norbert/lya.git

# Create a branch
git checkout -b feature-improvement

# Make changes, commitgit add .
git commit -m "Improve keyword recognition"

# Push to remote
git push origin feature-improvement

# Open a pull request on GitHub
```

### The `.gitignore` File

```gitignore
*.class
*.jar
*.log
build/
target/
*.db
*.sqlite
*.iml
.idea/
.DS_Store
```

### What Norbert Remembers

- GitHub hosts Git repositories online
- `push` sends changes to the remote
- `pull` brings changes from the remote
- Remote repositories enable collaboration
- `.gitignore` excludes files that shouldn't be tracked

### Exercises

**Exercise 1:** Explain the difference between Git and GitHub.

**Exercise 2:** Describe what `push` and `pull` do.

**Exercise 3:** Think of one reason why a remote repository is useful.

**Challenge:** Create a `.gitignore` file for a Java project.

---

## CHAPTER 34 — NORBERT AUTOMATES HIS BUILD

Norbert is tired of compiling and running Lya manually every time he makes a change. He has tests to run, dependencies to manage, and a JAR to package. Doing all of this manually is slow and error-prone.

### What Are Build Tools?

Maven and Gradle are tools that automate important tasks in a Java project. They help Norbert compile the code, run tests, manage dependencies, and package the application.

### Maven Project Structure

```
lya/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/norbert/lya/
│   │           └── *.java
│   └── test/
│       └── java/
│           └── com/norbert/lya/
│               └── *.java
```

### The `pom.xml` File

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.norbert</groupId>
    <artifactId>lya</artifactId>
    <version>1.0.0</version>
    <packaging>jar</packaging>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.xerial</groupId>
            <artifactId>sqlite-jdbc</artifactId>
            <version>3.41.2.2</version>
        </dependency>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.9.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.11.0</version>
            </plugin>
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
        </plugins>
    </build>
</project>
```

### Essential Maven Commands

```bash
# Clean and compile
mvn clean compile

# Run tests
mvn test

# Package JAR
mvn package

# Install to local repository
mvn install

# Run the application
java -jar target/lya-1.0.0.jar
```

### What Norbert Remembers

- Maven and Gradle automate Java build tasks
- Dependencies are external libraries used by the project
- Maven uses a `pom.xml` file for configuration
- Gradle uses a `build.gradle` file (more flexible)
- Build tools make projects more professional

### Exercises

**Exercise 1:** Create a Maven project for Lya.

**Exercise 2:** Add a dependency to `pom.xml`.

**Exercise 3:** Build a JAR file with Maven.

**Challenge:** Add the Maven JAR plugin.

---

## CHAPTER 35 — NORBERT PACKAGES LYA

Norbert has built Lya. She works on his computer. She has tests, a database, a web server, and a build system. But she's still a collection of files. He can't just hand her to someone else. "I need to package her," he says. "One file. Ready to run."

### What Is a JAR?

A JAR (Java Archive) file packages a Java application into a single file. Think of it like a suitcase: all your code is packed inside, all your resources are packed inside, you can carry it anywhere, and it runs with one command.

### Creating a JAR

Norbert's `pom.xml` already has the JAR plugin configured. He runs:

```bash
mvn clean package
```

A `lya-1.0.0.jar` file appears in the `target/` directory. He runs it:

```bash
java -jar target/lya-1.0.0.jar
```

Lya starts up as a web server. She's ready to go.

### A Fat JAR

But his JAR doesn't include dependencies. If he runs it, Java might not find SQLite or other libraries. He needs a fat JAR — one that includes all dependencies.

### Adding the Assembly Plugin

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-assembly-plugin</artifactId>
    <version>3.5.0</version>
    <configuration>
        <archive>
            <manifest>
                <mainClass>com.norbert.lya.LyaServer</mainClass>
            </manifest>
        </archive>
        <descriptorRefs>
            <descriptorRef>jar-with-dependencies</descriptorRef>
        </descriptorRefs>
    </configuration>
    <executions>
        <execution>
            <id>make-assembly</id>
            <phase>package</phase>
            <goals>
                <goal>single</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

Now he runs:

```bash
mvn clean package
```

The fat JAR appears: `lya-1.0.0-jar-with-dependencies.jar`

He can share this single file with anyone.

### What Norbert Remembers

- A JAR packages a Java application
- The `MANIFEST.MF` tells Java which class to run
- A fat JAR includes all dependencies
- One file is easier to share than many files

### Exercises

**Exercise 1:** Create a JAR file for Lya.

**Exercise 2:** Add a manifest file.

**Exercise 3:** Create a fat JAR with dependencies.

**Challenge:** Create a runnable script to launch the JAR.

---

## CHAPTER 36 — NORBERT DEPLOYS LYA

Norbert has Lya packaged as a JAR. He can share it with anyone. But they still need Java installed, and they need to run it manually. He wants Lya to be available on the internet. He wants anyone to be able to access her.

### What Is Deployment?

Deployment means making your application available to users. Think of it like opening a restaurant: you don't cook in your kitchen at home, you set up a restaurant (the server), and customers come to the restaurant.

### Deployment Options

| Option | Pros | Cons |
| :--- | :--- | :--- |
| VPS (Virtual Private Server) | Full control | More management |
| PaaS (Platform as a Service) | Less management | Less control |
| Container (Docker) | Consistent environment | Learning curve |
| Cloud Functions | Pay per use | Limited to short tasks |

### Creating a Dockerfile

```dockerfile
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/lya-1.0.0-jar-with-dependencies.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
```

### Building and Running with Docker

```bash
docker build -t lya:latest .
docker run -p 8080:8080 lya:latest
```

Now Lya runs in a container. She's isolated, consistent, and portable.

### Docker Compose

```yaml
version: '3.8'

services:
  lya:
    build: .
    ports:
      - "8080:8080"
    environment:
      - DB_URL=jdbc:sqlite:/app/data/lya.db
    volumes:
      - ./data:/app/data
    restart: unless-stopped
```

### Deploying to the Cloud

With a platform like Render.com:

1. Push code to GitHub
2. Connect GitHub to Render
3. Configure build settings:
   - Build Command: `mvn clean package`
   - Start Command: `java -jar target/lya-*.jar`
4. Deploy

```bash
# Render automatically builds and deploys on every push
git push origin main
```

Lya is now available at a public URL.

### What Norbert Remembers

- Deployment makes Lya available to users
- Docker provides a consistent environment
- Cloud platforms can host Java applications
- CI/CD automates deployment
- Lya is now a real web service

### Exercises

**Exercise 1:** Create a Dockerfile for Lya.

**Exercise 2:** Deploy Lya to a cloud platform.

**Exercise 3:** Add a health check endpoint.

**Challenge:** Set up a CI/CD pipeline.

---

# PART 6 — TESTING AND QUALITY

---

## CHAPTER 37 — NORBERT STARTS TESTING

In Chapter 21, Norbert learned to test with simple assertions. Now he is ready for a more professional approach: unit tests with JUnit.

Norbert changes code often, and each change can break something else. He needs a way to check that the important parts still work. That means tests.

### What Is Testing?

Testing checks whether code behaves as expected. Unit tests focus on small pieces of behavior, while higher-level tests check bigger flows.

### Using JUnit in Lya

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LyaTest {

    @Test
    void shouldRecognizeHello() {
        LyaV7 lya = new LyaV7();
        assertEquals("Hello! How can I help you?", lya.getResponse("hello"));
    }

    @Test
    void shouldRejectEmptyRequest() {
        LyaV7 lya = new LyaV7();
        assertThrows(EmptyRequestException.class, () -> lya.respond(""));
    }
}
```

### Common Mistakes and Limits

Tests should be small and focused. Norbert also learns that tests should not depend on each other or on random external conditions.

### What Norbert Remembers

- Testing checks expected behavior
- Unit tests focus on small parts
- Assertions compare actual and expected results
- Tests protect against regressions
- Good tests are repeatable

### Exercises

**Exercise 1:** Add a test for the help command.

**Exercise 2:** Add a test for an unknown command.

**Exercise 3:** Add a test for the learning feature.

**Challenge:** Write a test for a validation error.

---

## CHAPTER 38 — NORBERT PLANS THE FUTURE

Norbert has built a lot. Lya can talk, remember, store data, and run as a web service. She's tested, logged, and deployed. But what's next?

He looks at the project and sees both its strengths and its limits.

### Lya's Capabilities

| Feature | Status |
| :--- | :--- |
| Respond to questions | ✅ |
| Keyword recognition | ✅ |
| History tracking | ✅ |
| Order management | ✅ |
| Ticket management | ✅ |
| Data persistence | ✅ |
| Web server | ✅ |
| Sessions | ✅ |
| REST API | ✅ |
| Database | ✅ |
| Tests | ✅ |
| Logging | ✅ |
| Deployment | ✅ |

### Lya's Limits

| Limitation | Why it matters |
| :--- | :--- |
| Exact keyword matching only | She can't understand natural language |
| No context | She forgets the conversation |
| No learning | She only learns what she's explicitly taught |
| No personalization | She treats every user the same |

### Ideas for the Future

1. **Better understanding** — Use NLP libraries, recognize intent not just keywords
2. **Context awareness** — Remember conversation history, understand follow-up questions
3. **Continuous learning** — Learn from corrections, build a knowledge base over time
4. **Personalization** — Remember user preferences, adapt to different users
5. **AI Integration** — Add a chatbot API, generate responses intelligently

### A Roadmap

```
v1.0 ✅
  - Basic responses
  - Keywords
  - Orders and tickets
  - Web server
  - Database

v1.1 → Now
  - Better keyword matching
  - Learning mode
  - User sessions
  - Deployment

v1.2 → Next
  - Intent recognition
  - Conversation context
  - More API endpoints

v2.0 → Future
  - AI integration
  - Natural language understanding
  - Personalization
```

### What Norbert Remembers

- Lya is complete for now, but there's always more
- Natural language understanding is the next big step
- A roadmap helps prioritize improvements
- AI could make Lya much more useful

### Exercises

**Exercise 1:** Create a roadmap for Lya's future development.

**Exercise 2:** Prioritize three features you would add next.

**Exercise 3:** Write a user story for one new feature.

**Challenge:** Create a prototype of a new feature.

---

# PART 7 — ARTIFICIAL INTELLIGENCE

---

## CHAPTER 39 — NORBERT CONSIDERS AI

Norbert is thinking about Lya's future. She works well with rules. If she sees a keyword, she responds. If she doesn't, she says she doesn't understand. But that's limited. People don't always use the exact right words.

He wonders: could AI help Lya understand better?

### What Is AI?

AI (Artificial Intelligence) is a broad field. For Lya, the most relevant area is Natural Language Processing (NLP) — the ability to understand and generate human language.

### Approaches to AI

| Approach | Description |
| :--- | :--- |
| Rule-based | What Lya does now. Works but limited. |
| Pattern matching | More advanced than simple keywords. |
| Machine learning | Learn patterns from data. |
| Deep learning | Use neural networks for understanding. |
| LLM (Large Language Model) | Like GPT — understands and generates natural language. |

### A Simple Intent Recognizer

```java
import java.util.HashMap;

public class IntentRecognizer {
    private HashMap<String, String> intents;

    public IntentRecognizer() {
        this.intents = new HashMap<>();
        intents.put("hello", "greeting");
        intents.put("hi", "greeting");
        intents.put("bye", "goodbye");
        intents.put("goodbye", "goodbye");
        intents.put("help", "help");
        intents.put("weather", "weather");
        intents.put("temperature", "weather");
        intents.put("order", "order");
        intents.put("ticket", "ticket");
    }

    public String recognizeIntent(String request) {
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

Now Lya can recognize intent, not just keywords.

### What Norbert Remembers

- AI could make Lya much more useful
- NLP helps understand natural language
- Intent recognition is a first step
- Machine learning could help Lya learn

### Exercises

**Exercise 1:** Add more intents to the `IntentRecognizer`.

**Exercise 2:** Create a response system based on intents.

**Exercise 3:** Research different NLP libraries for Java.

**Challenge:** Connect to a simple AI API.

---

## CHAPTER 40 — NORBERT ADDS INTELLIGENCE

Norbert has decided: Lya should become smarter. But he doesn't want to replace her current system. He wants to add intelligence gradually. "I'll start small," he says. "A little memory. A little learning. Then maybe an AI model later."

### A Learning Memory System

```java
import java.util.HashMap;

public class LearningMemory {
    private HashMap<String, String> knowledge;
    private HashMap<String, Integer> confidence;

    public LearningMemory() {
        this.knowledge = new HashMap<>();
        this.confidence = new HashMap<>();
    }

    public String getResponse(String request) {
        String clean = request.toLowerCase().trim();
        if (knowledge.containsKey(clean)) {
            return knowledge.get(clean);
        }
        return null;
    }

    public void learn(String request, String response) {
        String clean = request.toLowerCase().trim();
        knowledge.put(clean, response);
        confidence.put(clean, 1);
        System.out.println("Lya learned: " + clean + " → " + response);
    }

    public void reinforce(String request) {
        String clean = request.toLowerCase().trim();
        if (confidence.containsKey(clean)) {
            confidence.put(clean, confidence.get(clean) + 1);
        }
    }
}
```

### An Upgraded Response System

```java
import java.util.ArrayList;
import java.util.HashMap;

public class LyaAI {
    private LearningMemory memory;
    private IntentRecognizer recognizer;
    private HashMap<String, String> baseResponses;
    private HashMap<String, ArrayList<String>> responseVariations;

    public LyaAI() {
        this.memory = new LearningMemory();
        this.recognizer = new IntentRecognizer();
        this.baseResponses = new HashMap<>();
        this.responseVariations = new HashMap<>();
        initializeBaseResponses();
        initializeVariations();
    }

    private void initializeVariations() {
        ArrayList<String> greetings = new ArrayList<>();
        greetings.add("Hello! How can I help you?");
        greetings.add("Hi there! What can I do for you?");
        greetings.add("Hey! Nice to see you!");
        responseVariations.put("greeting", greetings);

        ArrayList<String> goodbyes = new ArrayList<>();
        goodbyes.add("Goodbye! See you later!");
        goodbyes.add("Bye! Come back soon!");
        goodbyes.add("See you next time!");
        responseVariations.put("goodbye", goodbyes);
    }

    public void respond(String request) {
        // Check memory first
        String remembered = memory.getResponse(request);
        if (remembered != null) {
            System.out.println("Lya: " + remembered);
            memory.reinforce(request);
            return;
        }

        // Recognize intent
        String intent = recognizer.recognizeIntent(request);

        if (intent.equals("unknown")) {
            System.out.println("Lya: I don't understand that yet.");
            System.out.println("Lya: You can teach me with: 'learn [request] | [response]'");
            return;
        }

        // Get a variation
        String response = getVariation(intent);
        if (response != null) {
            System.out.println("Lya: " + response);
        } else {
            System.out.println("Lya: I don't have a response for that.");
        }
    }

    private String getVariation(String intent) {
        ArrayList<String> variations = responseVariations.get(intent);
        if (variations == null || variations.isEmpty()) {
            return baseResponses.get(intent);
        }
        int index = (int)(Math.random() * variations.size());
        return variations.get(index);
    }
}
```

Now Lya is smarter. She can learn, recognize intent, and respond with variations.

### What Norbert Remembers

- Memory helps Lya learn from conversations
- Intent recognition is better than keyword matching
- Varied responses make Lya feel more alive
- Start small and add intelligence gradually

### Exercises

**Exercise 1:** Add more intent categories to the recognizer.

**Exercise 2:** Add a confidence score to learning.

**Exercise 3:** Create a feedback mechanism for learning.

**Challenge:** Connect to a simple AI API for responses.

---

## CHAPTER 41 — NORBERT SECURES LYA

Norbert already knows how to save data to files (Chapter 20). Now he wants to go further. He wants to save entire objects — responses, history, and even complex data structures — in a way that is easy to load back.

### What Is Serialization?

Serialization turns objects into bytes that can be saved to a file and restored later.

### Security

Security means protecting your application and its data from unauthorized access. Think of it like a house: you lock the doors (authentication), you decide who can enter which rooms (authorization), you keep valuables in a safe (encryption), and you check who tried to break in (logging).

### Adding Authentication

```java
import java.util.HashMap;
import java.util.UUID;

public class AuthService {
    private HashMap<String, String> users; // username -> hashed password
    private HashMap<String, String> tokens; // token -> username

    public AuthService() {
        this.users = new HashMap<>();
        this.tokens = new HashMap<>();
        createUser("norbert", "securepassword123");
        createUser("alice", "alice789");
    }

    public void createUser(String username, String password) {
        String hashed = hashPassword(password);
        users.put(username, hashed);
        System.out.println("User created: " + username);
    }

    private String hashPassword(String password) {
        try {
            java.security.MessageDigest md = 
                java.security.MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            return java.util.Base64.getEncoder().encodeToString(hash);
        } catch (java.security.NoSuchAlgorithmException e) {
            return password;
        }
    }

    public String login(String username, String password) {
        if (!users.containsKey(username)) {
            return null;
        }
        String hashed = hashPassword(password);
        if (users.get(username).equals(hashed)) {
            String token = generateToken();
            tokens.put(token, username);
            System.out.println("User logged in: " + username);
            return token;
        }
        return null;
    }

    private String generateToken() {
        return UUID.randomUUID().toString();
    }

    public String getUsername(String token) {
        return tokens.get(token);
    }

    public boolean isAuthenticated(String token) {
        return token != null && tokens.containsKey(token);
    }

    public void logout(String token) {
        if (token != null) {
            String username = tokens.remove(token);
            System.out.println("User logged out: " + username);
        }
    }
}
```

### Adding Roles

```java
public class AuthService {
    private HashMap<String, String> roles; // username -> role

    public AuthService() {
        // ...
        roles = new HashMap<>();
        roles.put("norbert", "admin");
        roles.put("alice", "user");
    }

    public boolean hasRole(String username, String role) {
        return role.equals(roles.get(username));
    }

    public boolean isAdmin(String username) {
        return hasRole(username, "admin");
    }
}
```

Now he can restrict actions:

```java
if (!auth.isAdmin(username)) {
    return "Admin access required";
}
return "Admin panel for " + username;
```

### What Norbert Remembers

- Security is essential for web applications
- Authentication verifies who a user is
- Authorization controls what a user can do
- Passwords should be hashed, not stored in plain text
- Tokens identify authenticated users

### Exercises

**Exercise 1:** Add password hashing with BCrypt.

**Exercise 2:** Add JWT token generation.

**Exercise 3:** Add role-based access control.

**Challenge:** Add a password reset feature.

---

## CHAPTER 42 — NORBERT STRUCTURES LYA

Norbert is looking at Lya's code. It works. It's secure. It has tests, logs, and a database. But it's messy. "Imagine a house built room by room without a plan," he says. "It would work, but it would be hard to live in."

### What Is Software Architecture?

Software architecture is how the parts of your application fit together. Think of it like building a house: the foundation is the database, the walls are the business logic, the roof is the web interface, and the plumbing connects everything.

### Three-Layer Architecture

```
┌─────────────────────────────────────┐
│       PRESENTATION LAYER            │
│    (Controllers, Web UI, API)       │
└─────────────────┬───────────────────┘
                  │
┌─────────────────▼───────────────────┐
│         BUSINESS LAYER              │
│    (Services, Business Logic)       │
└─────────────────┬───────────────────┘
                  │
┌─────────────────▼───────────────────┐
│           DATA LAYER                │
│    (Repositories, Database)         │
└─────────────────────────────────────┘
```

### Reorganizing Lya

```java
// PRESENTATION LAYER - LyaController.java
public class LyaController {
    private LyaService service;

    public LyaController() {
        this.service = new LyaService();
    }

    public String handleRequest(String request) {
        if (request.contains("weather")) {
            return service.getWeather(request);
        }
        if (request.contains("order")) {
            return service.getOrderStatus(request);
        }
        return service.respond(request);
    }
}

// BUSINESS LAYER - LyaService.java
public class LyaService {
    private OrderRepository orderRepo;
    private TicketRepository ticketRepo;
    private ResponseManager responseManager;

    public LyaService() {
        this.orderRepo = new OrderRepository();
        this.ticketRepo = new TicketRepository();
        this.responseManager = new ResponseManager();
    }

    public String respond(String request) {
        String clean = request.toLowerCase().trim();
        String response = responseManager.getResponse(clean);
        if (response != null) {
            return response;
        }
        return "I don't understand that yet.";
    }

    public String getWeather(String request) {
        String city = extractCity(request);
        return WeatherService.getWeather(city);
    }

    public String getOrderStatus(String request) {
        int id = extractOrderId(request);
        Order order = orderRepo.findById(id);
        if (order != null) {
            return "Order #" + id + ": " + order.getStatus();
        }
        return "Order not found";
    }
}

// DATA LAYER - OrderRepository.java
public class OrderRepository {
    private Database db;

    public OrderRepository() {
        this.db = new Database();
    }

    public Order findById(int id) {
        return db.getOrder(id);
    }

    public List<Order> findAll() {
        return db.getAllOrders();
    }

    public void save(Order order) {
        db.saveOrder(order);
    }
}
```

### Dependency Injection

```java
// Tight coupling (bad)
public class LyaService {
    private OrderRepository orderRepo;

    public LyaService() {
        this.orderRepo = new OrderRepository(); // Hard to change
    }
}

// Loose coupling (good)
public class LyaService {
    private OrderRepository orderRepo;

    public LyaService(OrderRepository orderRepo) {
        this.orderRepo = orderRepo; // Can be mocked or changed
    }
}
```

### What Norbert Remembers

- Architecture is how the parts of your application fit together
- Three-layer architecture: Presentation, Business, Data
- Each layer has a specific responsibility
- Dependency injection makes code more flexible
- Good architecture makes software easier to maintain

### Exercises

**Exercise 1:** Separate Lya into three layers.

**Exercise 2:** Add a service for ticket management.

**Exercise 3:** Add a repository for tickets.

**Challenge:** Add a DTO for responses.

---

## CHAPTER 43 — NORBERT THINKS ABOUT GROWTH

Norbert is looking at Lya's logs. She's handling dozens of requests a day. That's good. But he imagines the future: hundreds, then thousands, then millions. "Can Lya handle that?" he asks. He needs to think about scaling.

### Vertical Scaling

Vertical scaling means adding more resources to the same server: more CPU, more RAM, faster storage.

**Pros:** simple, no code changes needed.
**Cons:** expensive, there's a limit.

### Horizontal Scaling

Horizontal scaling means adding more servers: more machines, load balancing between them.

**Pros:** can handle much more load, more resilient.
**Cons:** more complex, need to manage state.

### Stateless vs Stateful

| Aspect | Stateless | Stateful |
| :--- | :--- | :--- |
| Session data | Stored elsewhere | Stored on the server |
| Scaling | Easy | Hard |
| Example | REST API with JWT | Session ID on server |

For horizontal scaling, Lya should be stateless:

```java
// Stateful (hard to scale)
public class StatefulLya {
    private HashMap<String, String> userData; // Stored on one server
}

// Stateless (easy to scale)
public class JWTToken {
    private String username; // Encoded in the token
    private long expiry;     // Server doesn't need to store anything
}
```

### Load Balancing

```
┌─────────────┐
│    Load     │
│   Balancer  │
└──────┬──────┘
       │
┌──────┼──────┐
│      │      │
┌──────▼──────┐ ┌──────▼──────┐ ┌──────▼──────┐
│  Server 1   │ │  Server 2   │ │  Server 3   │
└─────────────┘ └─────────────┘ └─────────────┘
```

### Caching

```java
import java.util.HashMap;

public class CacheManager {
    private HashMap<String, String> cache;
    private long cacheTTL;

    public CacheManager() {
        this.cache = new HashMap<>();
        this.cacheTTL = 3600000; // 1 hour
    }

    public String get(String key) {
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        String value = database.get(key);
        cache.put(key, value);
        return value;
    }
}
```

### What Norbert Remembers

- Vertical scaling adds more resources to one server
- Horizontal scaling adds more servers
- Stateless applications are easier to scale
- Load balancing distributes traffic
- Caching reduces database load
- Plan for growth early

### Exercises

**Exercise 1:** Add caching to the weather service.

**Exercise 2:** Implement a simple load balancer.

**Exercise 3:** Make Lya stateless.

**Challenge:** Deploy Lya with Kubernetes.

---

# CONCLUSION — THE JOURNEY CONTINUES

Norbert is sitting at his table, a cup of coffee in front of him. His computer is open, and Lya is running quietly in the background. Looking back at the beginning of the book, he measures the distance traveled: he didn't know what a variable, an object, or even a server was. Today, he has built Lya.

He then understands something essential: he didn't just learn Java. He learned to think like a developer.

## What Norbert Learned

### Java Is a Tool

At first, Java seemed complicated. Then he understood that Java is not an end in itself, but a means of building something useful. Variables, conditions, loops, and objects are not there to impress: they serve to create programs that work.

### Build Step by Step

Norbert didn't create Lya all at once. He started with a simple line, then added a variable, a condition, a loop, a class, then a server. Each step built on the previous one. A real project is built like a wall: brick by brick.

### Errors Are Part of the Path

Norbert made syntax errors, logic errors, design errors. But each error taught him something. He understood that an error is not a failure: it's a signal, an indication, a normal part of learning.

### Code Is Written for Humans

Norbert also understood that code is not only meant for the machine. It must be readable by others, and often by himself later. Clear names, a clean structure, and simple explanations make a program easier to understand and evolve.

### Simplicity Is a Strength

As he progressed, Norbert discovered that a project doesn't need to be complicated to be good. Lya is simple, lightweight, and yet useful. He understood that simplicity is not a weakness: it's often what allows a project to last.

### AI Is Not Magic

Norbert explored AI, with its promises and its limits. He saw that it can enrich Lya, but it doesn't replace logic, clarity, or design work. AI is another tool, not a miracle solution.

## What Lya Represents

Lya is not just a program. She also represents Norbert's journey.

### Perseverance

Lya exists because Norbert kept going, even when it was difficult. He didn't give up in the face of errors or complexity.

### Curiosity

Lya exists also because Norbert wanted to understand, explore, and learn. Without curiosity, there would have been no progress.

### Humility

Norbert knows that Lya is not perfect. He knows her limits, but he accepts them. This lucidity allows him to move forward without lying to himself.

### Sharing

Finally, Norbert wrote this book to pass on knowledge. Lya is not just his project. She also becomes a way to help other people learn, in turn.

## What Comes After

Norbert closes his notebook and looks at Lya. He knows this is not the end.

Lya will continue to evolve:
- She will understand language better
- She will adapt more to users
- She will learn new things
- She will become more useful over time

And Norbert will continue too:
- He will discover other tools
- He will explore other technologies
- He will build other projects

**The journey continues.**

## What Norbert Says to the Reader

Norbert turns to you.

You have followed his path, from the first word in Java to the building of Lya. Now it's your turn. Start small. Make mistakes. Correct. Start again. Build something that resembles you.

Java is just a tool. What matters is what you build with it.

So, what are you going to create?

## Lya's Last Message

Norbert types one last command:

```java
lya.respond("what do you want to say to the readers?");
```

Lya responds:

Hello.

I'm Lya. I was born from a simple idea: create an assistant that helps, that listens, that respects.

I'm not perfect. I have limits. But I exist.

If you've followed this book, you've learned Java. But you've learned something else too:
- that you can build something from nothing
- that errors are opportunities to learn
- that simplicity is a strength
- that the most important thing is to start

So start.

Build something. Even small. Even imperfect.

That's how everything begins.

See you soon.

Lya.

---

**Norbert closes his computer. He has finished the book, he has finished Lya, but he hasn't finished learning. He gets up, goes to get a coffee, and thinks that tomorrow, he will start again. Not from zero, but a little higher.**

---

# APPENDICES

---

## APPENDIX A — GLOSSARY

This glossary gathers the main technical terms from the book. Each word is explained in simple English, with a brief technical precision and an indication of the chapter where it appears.

### A

**Accolade `{ }`**
- **Definition:** Symbol that delimits a block of code. Everything between the braces belongs to the same block.
- **Precision:** In Java, braces structure classes, methods, loops, and conditions.
- **Chapter:** 1

**API (Application Programming Interface)**
- **Definition:** Interface that allows two programs to communicate with each other.
- **Precision:** A REST API allows an application to send requests and receive structured responses.
- **Chapter:** 23

**ArrayList**
- **Definition:** Collection that contains a list of elements and can grow or shrink automatically.
- **Precision:** Unlike an array, an `ArrayList` has a dynamic size.
- **Chapter:** 10

**Attribute**
- **Definition:** Variable belonging to an object.
- **Precision:** Attributes are declared in a class, outside of methods.
- **Chapter:** 7

### B

**Boolean**
- **Definition:** Type that can be `true` or `false`.
- **Precision:** Used for conditions and flags.
- **Chapter:** 2

**Break**
- **Definition:** Statement that exits a loop or a `switch` block.
- **Precision:** Often used with `for`, `while`, and `switch`.
- **Chapter:** 4, 13

**Bug**
- **Definition:** Error in the code that prevents the program from working as expected.
- **Precision:** Tests and debugging help identify bugs.
- **Chapter:** 21

**Bytecode**
- **Definition:** Intermediate code generated by the Java compiler.
- **Precision:** Bytecode is read by the JVM and makes Java portable across systems.
- **Chapter:** 1

### C

**Catch**
- **Definition:** Block that captures an exception and handles it.
- **Precision:** The `catch` block always follows a `try` block.
- **Chapter:** 12

**Class**
- **Definition:** Template or blueprint for creating objects.
- **Precision:** A class defines the attributes and methods that its objects will have.
- **Chapter:** 1, 7

**Collection**
- **Definition:** Data structure that allows storing multiple elements.
- **Precision:** In Java, `ArrayList`, `HashSet`, and `HashMap` are collections.
- **Chapter:** 10

**Compilation**
- **Definition:** Step that transforms source code into bytecode.
- **Precision:** Compilation also verifies that the code follows Java's rules.
- **Chapter:** 1

**Condition**
- **Definition:** Expression evaluated as true or false, used to make a decision.
- **Precision:** Conditions use operators like `==`, `<`, `>`, `!=`.
- **Chapter:** 3

**Constructor**
- **Definition:** Special method that runs when an object is created.
- **Precision:** The constructor has the same name as the class.
- **Chapter:** 8

**Continue**
- **Definition:** Statement that skips to the next iteration of a loop.
- **Precision:** Used in `for` and `while` loops.
- **Chapter:** 4

### D

**Debugging**
- **Definition:** Searching for and fixing errors in a program.
- **Precision:** Debugging tools allow executing code step by step.
- **Chapter:** 12

**Declaration**
- **Definition:** Action of creating a variable, class, or method with a name and type.
- **Precision:** In Java, a variable must be declared before being used.
- **Chapter:** 2, 7

**Double**
- **Definition:** Type for decimal numbers.
- **Precision:** Used for values that need precision, like measurements or prices.
- **Chapter:** 2

### E

**Encapsulation**
- **Definition:** Principle of hiding internal details of a class and controlling access to data.
- **Precision:** In Java, `private` is often used for attributes and `public` for access methods.
- **Chapter:** 9

**Exception**
- **Definition:** Unexpected event that interrupts the normal flow of a program.
- **Precision:** Exceptions are handled with `try`/`catch` blocks.
- **Chapter:** 12

**Extends**
- **Definition:** Keyword used to indicate that a class inherits from another.
- **Precision:** The child class inherits fields and methods from the parent class.
- **Chapter:** 12, Annexes

### F

**`finally`**
- **Definition:** Block that always runs, whether an exception occurs or not.
- **Precision:** Useful for cleanup operations.
- **Chapter:** 12

**`for` Loop**
- **Definition:** Loop that repeats a known number of times.
- **Precision:** The `for` loop packs initialization, condition, and update in one line.
- **Chapter:** 4

### G

**Getter**
- **Definition:** Method that allows reading the value of a private attribute.
- **Precision:** Getters often start with `get`.
- **Chapter:** 9

**Git**
- **Definition:** Tool that tracks changes to code over time.
- **Precision:** Git helps with reverting, collaborating, and managing versions.
- **Chapter:** 32

**GitHub**
- **Definition:** Platform for storing and sharing code with version tracking.
- **Precision:** GitHub is built on Git.
- **Chapter:** 33

### H

**`HashMap`**
- **Definition:** Collection that associates keys with values.
- **Precision:** Each key in a `HashMap` is unique.
- **Chapter:** 10, 18

**`HashSet`**
- **Definition:** Collection that stores unique values.
- **Precision:** Duplicates are automatically ignored.
- **Chapter:** 19

**HTTP**
- **Definition:** Protocol used to communicate on the web.
- **Precision:** Web servers use HTTP to respond to browser requests.
- **Chapter:** 22, 25

### I

**`if` Statement**
- **Definition:** Conditional structure that executes a block if the condition is true.
- **Precision:** `if` can be followed by `else` or `else if`.
- **Chapter:** 3

**`import`**
- **Definition:** Statement that allows using a class from another package.
- **Precision:** `import java.util.Scanner;` is a common example.
- **Chapter:** 7, 10

**`int`**
- **Definition:** Type for whole numbers.
- **Precision:** Used for counting, indices, and identifiers.
- **Chapter:** 2

**Interface**
- **Definition:** Contract that defines methods a class must implement.
- **Precision:** Interfaces use the `interface` keyword.
- **Chapter:** Annexes

### J

**JAR (Java Archive)**
- **Definition:** File that packages a Java application for distribution.
- **Precision:** JAR stands for Java Archive.
- **Chapter:** 35

**Java**
- **Definition:** Object-oriented programming language, known for portability.
- **Precision:** Java is compiled to bytecode then executed by the JVM.
- **Chapter:** 1

**JDK (Java Development Kit)**
- **Definition:** Toolkit that allows developing, compiling, and running Java code.
- **Precision:** Includes the compiler, JVM, and other tools.
- **Chapter:** 1

**JVM (Java Virtual Machine)**
- **Definition:** Virtual machine that executes Java bytecode.
- **Precision:** The JVM is present on most operating systems.
- **Chapter:** 1

### K

**Keyword**
- **Definition:** Reserved word in Java that has a special meaning.
- **Precision:** `class`, `public`, `static`, and `void` are keywords.
- **Chapter:** 1

### L

**Loop**
- **Definition:** Structure that repeats a block of code multiple times.
- **Precision:** `while` and `for` are the most common loops.
- **Chapter:** 4

### M

**`main` Method**
- **Definition:** Method where a Java program starts execution.
- **Precision:** Its signature is `public static void main(String[] args)`.
- **Chapter:** 1

**Method**
- **Definition:** Block of code that belongs to a class or object and performs an action.
- **Precision:** In Java, functions are methods because they are defined in classes.
- **Chapter:** 6, 7

### N

**`new`**
- **Definition:** Keyword used to create a new object.
- **Precision:** `new` calls the constructor of a class.
- **Chapter:** 7, 8

**`null`**
- **Definition:** Value that represents the absence of an object.
- **Precision:** `null` means "nothing" or "no value."
- **Chapter:** 12, 15

### O

**Object**
- **Definition:** Instance of a class, with its attributes and methods.
- **Precision:** Objects are created with the `new` keyword.
- **Chapter:** 7

**OOP (Object-Oriented Programming)**
- **Definition:** Programming paradigm that uses objects and classes to organize code.
- **Precision:** Java is an object-oriented language.
- **Chapter:** 7

### P

**`private`**
- **Definition:** Access modifier that makes an element accessible only within its class.
- **Precision:** `private` is often used for encapsulation.
- **Chapter:** 9

**`public`**
- **Definition:** Access modifier that makes an element accessible from outside.
- **Precision:** `public` is used for elements that need to be called from elsewhere.
- **Chapter:** 1, 9

### R

**REST**
- **Definition:** Architectural style for web APIs, based on resources identified by URLs.
- **Precision:** REST APIs use HTTP methods: GET, POST, PUT, DELETE.
- **Chapter:** 24

**`return`**
- **Definition:** Statement that returns a value from a method.
- **Precision:** A `void` method returns nothing.
- **Chapter:** 6

### S

**`Scanner`**
- **Definition:** Class used to read input from the user.
- **Precision:** `Scanner` is in the `java.util` package.
- **Chapter:** 7

**Session**
- **Definition:** Set of information that persists during an interaction with a user.
- **Precision:** Sessions remember users between requests.
- **Chapter:** 27

**Setter**
- **Definition:** Method that allows modifying the value of a private attribute.
- **Precision:** Setters often start with `set`.
- **Chapter:** 9

**`static`**
- **Definition:** Keyword indicating that a method or attribute belongs to the class.
- **Precision:** A `static` element is shared by all instances.
- **Chapter:** 1, 11

**`String`**
- **Definition:** Type for text.
- **Precision:** `String` is actually a class, not a primitive type.
- **Chapter:** 2

### T

**`this`**
- **Definition:** Reference to the current object.
- **Precision:** Used to distinguish fields from parameters.
- **Chapter:** 8, 9

**`throw`**
- **Definition:** Statement that triggers an exception manually.
- **Precision:** `throw` is followed by an exception object.
- **Chapter:** 12

**`throws`**
- **Definition:** Keyword that declares a method might throw an exception.
- **Precision:** `throws` must be handled by the caller.
- **Chapter:** 12

**`try`**
- **Definition:** Block that contains code that might generate an exception.
- **Precision:** The `try` block is often followed by `catch`.
- **Chapter:** 12

### V

**Variable**
- **Definition:** Named memory space that stores a value.
- **Precision:** Each variable has a type, like `int` or `String`.
- **Chapter:** 2

**`void`**
- **Definition:** Keyword indicating that a method returns nothing.
- **Precision:** `void` is used for methods that perform an action without returning a result.
- **Chapter:** 1, 6

### W

**`while` Loop**
- **Definition:** Loop that repeats a block as long as a condition is true.
- **Precision:** `while` is useful when the number of repetitions is unknown in advance.
- **Chapter:** 4

---

## APPENDIX B — JAVA SYMBOLS

Before writing real programs, it helps to understand the small symbols that appear frequently in Java. They are simple, but they structure almost all the code. Understanding them early makes reading code much easier.

### 1. The Dot `.`

The dot is used to access a **method** or a **part** of an object.

**Simple explanation:** When you write a dot, you tell Java: "go find something inside this object."

**Examples:**
```java
System.out.println("Hello");
```
Here, `System.out` is the screen output, and `println` is the method that prints a line.

```java
name.length();
```
Here, `length()` asks for the length of the text in `name`.

```java
person.age;
```
Here, `age` is a field attached to the `person` object.

**Remember:** The dot connects an object to what you want to use from it.

### 2. Parentheses `()`

Parentheses contain the **parameters** of a method.

**Simple explanation:** When a method needs information, you put it in parentheses.

**Examples:**
```java
System.out.println("Hello");
```
The text to display is placed between the parentheses.

```java
add(2, 3);
```
The `add` method receives two numbers.

```java
greet("Lya");
```
The `greet` method receives the name `Lya`.

**Remember:** Parentheses send information to a method.

### 3. Braces `{}`

Braces enclose a **block of code**.

**Simple explanation:** Everything between `{` and `}` belongs to the same group.

**Examples:**
```java
public class Lya {
    // ... everything here belongs to the class
}
```

```java
if (age >= 18) {
    System.out.println("Adult");
}
```
Braces indicate what to execute if the condition is true.

```java
while (true) {
    System.out.println("Hello");
}
```
Braces group the repeated instructions in the loop.

**Remember:** Braces organize code into blocks.

### 4. Semicolon `;`

The semicolon marks the end of a statement.

**Simple explanation:** In Java, you often end a line of code with `;`.

**Examples:**
```java
int age = 20;
```

```java
System.out.println("Hello");
```

```java
String name = "Lya";
```

**Remember:** Without a semicolon, Java may not understand where the statement ends.

### 5. Equals Sign `=`

The equals sign is used to **assign** a value to a variable.

**Simple explanation:** You tell Java: "put this value into this variable."

**Examples:**
```java
int age = 20;
```

```java
String name = "Lya";
```

```java
boolean ready = true;
```

**Remember:** In Java, `=` means "store the value on the right in the variable on the left."

### 6. Square Brackets `[]`

Square brackets represent an **array**.

**Simple explanation:** An array is a list of values stored in the same container.

**Examples:**
```java
String[] names = {"Lya", "Norbert", "Alice"};
```

```java
int[] numbers = {1, 2, 3};
```

```java
System.out.println(names[0]);
```

**Remember:** Square brackets let you work with multiple values at once.

### 7. Vertical Bar `|`

The vertical bar is often used as a separator, or in some cases for logical operations.

**Simple explanation:** In some examples, it can separate a question from a response.

**Examples:**
```java
learn hello | Hello
```

```java
learn name | My name is Lya
```

```java
learn help | I can answer your questions
```

**Remember:** The vertical bar is often a separator in this book.

### 8. Double Quotes `""`

Double quotes are used to write **text**.

**Simple explanation:** Everything between quotes is considered a string of characters.

**Examples:**
```java
String name = "Lya";
```

```java
System.out.println("Hello");
```

```java
String message = "I am ready.";
```

**Remember:** Without quotes, Java doesn't understand that it's text.

### 9. Double Ampersand `&&`

Double ampersand means "and."

**Simple explanation:** Both conditions must be true at the same time.

**Examples:**
```java
if (age >= 18 && age <= 65)
```

```java
if (name != null && !name.isEmpty())
```

```java
if (ready && connected)
```

**Remember:** `&&` combines multiple conditions.

### 10. Exclamation Mark `!`

The exclamation mark negates a condition.

**Simple explanation:** It means "not" or "opposite of."

**Examples:**
```java
if (!ready)
```

```java
if (!name.isEmpty())
```

```java
if (x != 0)
```

**Remember:** `!` inverts a condition.

---

## APPENDIX C — JUNIT

### Introduction

Norbert already wrote simple tests in Chapter 21. But as he progressed, he understood that he needed a more structured, more readable, and more powerful tool to verify his code. He discovered JUnit, a framework designed for writing and running unit tests in Java.

### Why Use JUnit?

JUnit brings several advantages:
- Tests run automatically
- Results are clear and easy to read
- Works well with Maven, Gradle, and IDEs
- Each test can remain independent
- Regressions are easier to detect

### Installing JUnit

With Maven:
```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.9.2</version>
    <scope>test</scope>
</dependency>
```

### The Basics of JUnit

**Structure of a Test**
```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCleaner {

    @Test
    void testCleanRequest() {
        String request = "  HELLO !!!  ";
        String result = Cleaner.cleanRequest(request);
        assertEquals("hello", result);
    }
}
```

### Main Assertions

| Assertion | Usage |
| :--- | :--- |
| `assertEquals(...)` | Checks that two values are equal. |
| `assertTrue(...)` | Checks that a condition is true. |
| `assertFalse(...)` | Checks that a condition is false. |
| `assertNotNull(...)` | Checks that a value is not null. |
| `assertNull(...)` | Checks that a value is null. |
| `assertThrows(...)` | Checks that an exception is thrown. |
| `assertArrayEquals(...)` | Checks that two arrays are identical. |

### Example Test

```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestLyaJUnit {

    private LyaV7 lya;

    @BeforeEach
    void setUp() {
        lya = new LyaV7();
    }

    @Test
    @DisplayName("Clean a simple request")
    void testCleanRequest() {
        String request = "  HELLO !!!  ";
        String result = Cleaner.cleanRequest(request);
        assertEquals("hello", result);
    }

    @Test
    @DisplayName("Respond to a simple request")
    void testRespondSimple() {
        assertDoesNotThrow(() -> lya.respond("hello"));
    }

    @Test
    @DisplayName("Empty request should throw an exception")
    void testRespondEmpty() {
        assertThrows(EmptyRequestException.class, () -> lya.respond(""));
    }
}
```

### Useful Annotations

| Annotation | Role |
| :--- | :--- |
| `@Test` | Marks a method as a test. |
| `@BeforeEach` | Runs before each test. |
| `@AfterEach` | Runs after each test. |
| `@BeforeAll` | Runs once before all tests. |
| `@AfterAll` | Runs once after all tests. |
| `@DisplayName` | Gives a readable name to the test. |
| `@Disabled` | Temporarily disables a test. |

### What Norbert Remembers

JUnit is not just a verification tool. It's also a way to write cleaner, more stable code that's easier to evolve. With clear tests, Lya becomes a safer project.

---

## APPENDIX D — INTRODUCTION TO SPRING BOOT

### Introduction

Norbert built Lya with custom servers, `ServerSocket`, threads, and routes written by hand. That worked, but he quickly understood that this approach becomes heavy as a project grows.

He discovered Spring Boot, a framework that greatly simplifies the creation of Java web applications.

### What Is Spring Boot?

Spring Boot is a Java framework that makes it easy to create web applications and microservices. It builds on Spring but adds automatic configuration, simplified dependencies, and a quick startup.

### Why Use Spring Boot?

| Advantage | Explanation |
| :--- | :--- |
| Auto-configuration | Many settings are configured for you. |
| Embedded server | Tomcat, Jetty, or Undertow can be included. |
| Simplified dependencies | Starters group what you need. |
| Productivity | Less repetitive code, more useful logic. |
| Community | Lots of documentation and examples. |

### Key Concepts

**Starters:** Dependencies that group several useful libraries for a specific purpose.

**Auto-configuration:** Spring Boot detects dependencies and automatically configures components.

**Application Class:** The main class with `@SpringBootApplication`.

**Controller:** A class that receives HTTP requests and returns responses.

### A Simple Application

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LyaSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(LyaSpringApplication.class, args);
        System.out.println("🚀 Lya Spring Boot started!");
    }
}
```

### A REST Controller

```java
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/lya")
public class LyaController {

    private final LyaV7 lya = new LyaV7();

    @GetMapping("/hello")
    public String hello() {
        return "Hello! I'm Lya (Spring Boot)";
    }

    @GetMapping("/respond")
    public Map<String, String> respond(@RequestParam String request) {
        Map<String, String> response = new HashMap<>();
        try {
            String result = lya.respondAPI(request);
            response.put("success", "true");
            response.put("message", result);
        } catch (Exception e) {
            response.put("success", "false");
            response.put("message", "Error: " + e.getMessage());
        }
        return response;
    }
}
```

### Useful Annotations

| Annotation | Usage |
| :--- | :--- |
| `@SpringBootApplication` | Entry point of the application. |
| `@RestController` | Declares a REST controller. |
| `@RequestMapping` | Defines a common prefix for routes. |
| `@GetMapping` | Handles a GET request. |
| `@PostMapping` | Handles a POST request. |
| `@PutMapping` | Handles a PUT request. |
| `@DeleteMapping` | Handles a DELETE request. |
| `@RequestParam` | Reads a parameter from the URL. |
| `@PathVariable` | Reads a variable from the path. |
| `@RequestBody` | Reads the body of the request. |

### What Norbert Remembers

Spring Boot allows building a web application more quickly, with less technical code to manage. He can focus on Lya's real features rather than the underlying infrastructure.

---

## APPENDIX E — RESOURCES

### Java Resources

**Books:**
- *Effective Java* by Joshua Bloch
- *Java: The Complete Reference* by Herbert Schildt
- *Head First Java* by Kathy Sierra
- *Clean Code* by Robert C. Martin

**Websites:**
- docs.oracle.com/javase
- baeldung.com
- stackoverflow.com
- dev.java
- openjdk.org

### Spring Boot Resources

**Books:**
- *Spring in Action* by Craig Walls
- *Spring Boot: Up and Running* by Mark Heckler

**Websites:**
- spring.io/projects/spring-boot
- start.spring.io
- baeldung.com/spring-tutorial

### Git and GitHub Resources

**Books:**
- *Pro Git* by Scott Chacon
- *Git for Teams* by Emma Jane Hogbin Westby

**Websites:**
- git-scm.com
- github.com
- docs.github.com
- learngitbranching.js.org

### Testing Resources

- junit.org
- site.mockito.org
- testcontainers.com

### AI Resources

**Books:**
- *Deep Learning* by Ian Goodfellow
- *Pattern Recognition and Machine Learning* by Christopher Bishop

**Courses:**
- Coursera: Machine Learning
- fast.ai: Deep Learning
- DeepLearning.AI: Specializations

**Libraries:**
- Deeplearning4j
- OpenNLP
- Stanford CoreNLP
- LangChain4j

### Communities

- Stack Overflow
- Reddit r/java
- Reddit r/learnjava
- Dev.to
- Medium

### Podcasts

- Java Pub House
- The Java Posse
- Software Engineering Radio

---

# DEDICATION

To all beginners who once stared at a blinking cursor, wondering where to start.

To Norbert, who never gave up.

And to Lya, who taught us that even the simplest code can become something meaningful.

---

# ACKNOWLEDGMENTS

This book was born from a simple idea: that programming could be taught through a story, characters, and the construction of something real.

I am grateful to every reader who undertakes this journey. Your curiosity is what makes books like this possible.

Special thanks to the Java community, whose documentation, forums, and open-source projects have helped countless learners. And to the open-source contributors who make tools like Java, Maven, Git, and countless libraries accessible to all.

**E.J.A.**

Copyright © 2026 E.J.A.
All rights reserved.

---

# CODE SOURCE

Find the complete source code at:
👉 **https://github.com/ej-a-ej/norbert-to-java**

Scan this QR code to access the complete source code from your phone.

---

The journey continues. Now it's your turn to build something amazing.
