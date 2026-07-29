
# Norbert Codes Java## Build a Real App from Scratch — No Experience Needed
 
More academic
## Introduction
## PART 1 — THE BASICS
## Chapter 1 — Hello, Java
## Chapter 2 — Norbert's Boxes
## Chapter 3 — Norbert Chooses
## Chapter 4 — Norbert Repeats
## Chapter 5 — Norbert Organizes
## Chapter 6 — Norbert Reuses
## Chapter 7 — Norbert Listens
## Chapter 8 — Norbert Builds a Blueprint
## Chapter 9 — Norbert Builds Properly
## Chapter 10 — Norbert Protects His Data
## Chapter 11 — Norbert Discovers What Belongs to the Class
## Chapter 12: Norbert Faces the Unexpected
## Chapter 13 — Building Lya
## Chapter 14 — Understanding Simple Requests
## Chapter 15 — Norbert Makes Lya Safe
## Chapter 16 — Norbert Manages Real Data
## Chapter 17 — Norbert Grows His Data
## Chapter 18 — Norbert Finds What He Needs
## Chapter 19 — Norbert Ensures Uniqueness
## Chapter 20 — Norbert Gives Lya a Memory
## Chapter 21 — Norbert Checks His Work
##Chapter 22: Norbert Opens a Window
## Chapter 23 — Norbert Reads the World's Language
## Chapter 24 — Norbert Speaks the Web's Language
## Chapter 25 — Norbert Puts Lya on the Web
## Chapter 26 — Norbert Handles Many at Once
## Chapter 27 — Norbert Remembers His Clients
## Chapter 28 — Norbert Saves Sessions
## Chapter 29 — Norbert Discovers Databases
##Chapter 30: Norbert Bridges Objects and Databases
## Chapter 31 — Norbert Learns to Share
## Chapter 32 — Norbert Tracks Changes
## Chapter 33 — Norbert Goes Remote
## Chapter 34 — Norbert Automates His Build
## Chapter 35 — Norbert Packages Lya
## Chapter 36 — Norbert Deploys Lya
Chapter 37: Norbert Starts Testing
## Chapter 38 — Norbert Plans the Future
## Chapter 39 — Norbert Considers AI
## Chapter 40 — Norbert Adds Intelligence
## Chapter 41 — Norbert Secures Lya
## Chapter 42 — Norbert Structures Lya
## Chapter 43 — Norbert Thinks About Growth
## Chapter 44 — Norbert Looks Back
## Chapter 45 — Norbert Looks Forward
## Chapter 46 — Norbert Leaves a Message
## Chapter 47 — The End of the Beginning
## Chapter 48 — The Future
## Chapter 49 — The Last Page
## Chapter 50 — The Beginning
## CONCLUSION — The Journey Continues
Annexes 
The Complete Learning Journey
Dedication
Acknowledgments
 
Code sourceRetrouvez le code source sur :
https://github.com/ej-a-ej/norbert-to-java
Tout le code de ce livre est disponible sur GitHub :
👉 https://github.com/ej-a-ej/norbert-to-java
More academic
Final project overview
This book follows the gradual construction of Lya, an application designed to introduce programming concepts step by step. The code examples are primarily educational and may require adjustments before being used as-is. This book is intended mainly for beginners, while also remaining useful to intermediate readers, teachers, and experienced readers looking for a clear, progressive learning path.
## Introduction
Norbert wants to build Lya.
 
He doesn't want to learn Java just to collect rules and definitions. He wants to create something real: a Java assistant that can answer questions, remember useful things, and grow step by step.
 
At first, everything feels new. The words are unfamiliar. The errors look strange. The shape of a program is still a little abstract. But Norbert does not try to understand everything at once. He moves one step at a time, then another, then another.
 
That is the spirit of this book.
 
Each chapter adds one piece to Lya. Each concept has a purpose. Each mistake teaches something useful. Norbert learns by building, testing, fixing, and improving. The reader follows the same path.
 
This book is for complete beginners and for readers who want a clear, practical, and progressive way to learn Java. The goal is not to repeat Java theory. The goal is to use Java to build a real assistant that becomes more capable chapter after chapter.
 
Lya is the thread that connects everything. She begins as a simple idea. Then she becomes a small program. Then she grows into a structured assistant with memory, logic, files, APIs, tests, and a professional architecture.
 
Norbert does not become an expert in one day. He learns patiently. He makes mistakes. He corrects them. And little by little, he understands how Java works.

## PART 1 — THE BASICS
## Chapter 1 — Hello, Java
Norbert sat at his computer with a coffee beside him and a strange mix of excitement and fear. He had thought about programming for a long time, but today he finally decided to begin.
 
He did not want to study programming forever. He wanted to make something real. Something that could speak back to him.
 
So he opened his editor and typed his first Java program.
 
Java is a programming language. It is a way to give instructions to a computer step by step. You write code, and the computer reads it and follows your instructions. Java is popular because it is portable, which means the same program can run on many different systems, such as Windows, macOS, and Linux.
 
The simplest thing a program can do is print a message on the screen. Norbert learned that a Java program needs a class and a main method. For now, he thought of the class as the container for the program, and the main method as the place where the program starts. Inside main, he used System.out.println() to display text.
 
```javapublicclassLya {
publicstaticvoidmain(String[] args) {
System.out.println("Hello, I'm Lya!");}
}
```
When Norbert saved the file as Lya.java, compiled it, and ran it, the screen showed: "Hello, I'm Lya!" It was a tiny result, but it felt like the beginning of something real.
 
Norbert decided that Lya should introduce herself properly every time she starts. He wrote a program with a warm greeting. That was the first small personality he gave her. Lya was no longer just an idea.
 
Norbert made a few beginner mistakes at first: he forgot the semicolon, he wrote System.out.println incorrectly, he forgot the quotation marks around the text. Each mistake taught him something. That is how learning starts.
 
**What Norbert remembers:**
- Java programs are written in files and run by the computer.
- Every Java program starts with a main method.
- System.out.println() prints text on the screen.
- Semicolons end instructions.
- Text must be written inside double quotes.
 
**Exercises:**
1. Change the greeting to say "Good morning!" instead of "Hello, I'm Lya!"
2. Print two separate messages on two different lines.
3. Print your name and your age on separate lines.
4. Challenge: Print a small shape using text characters.

## Chapter 2 — Norbert's Boxes
Norbert is standing in front of his bookshelf. He has spent an hour looking for a red notebook. He knows he left it somewhere, but between the piles of notes, bookmarks, and loose papers, he cannot find it. "That's the problem," he mutters. "I did not organize anything."
 
He sighs. Then he takes an empty jar and puts his pens in it. He takes a shelf and lines up his notebooks. He takes a box and stores his old bills inside it. He has not finished, but he already feels order beginning to appear. A name, a place, a content.
 
He returns to his computer. He has just understood something about a program's memory.
 
A variable is a named place where a program stores information. You can imagine it like a labeled box. The label is the variable name, and the content is the value. Every variable in Java also has a type. The type tells Java what kind of data the variable can hold.
 
Some basic types are: int for whole numbers, double for decimal numbers, boolean for true or false, char for a single character, String for text.
 
Norbert decided that Lya should store basic information about herself: her name, her version, whether she is ready, and how many messages she has processed.
 
```javapublicclassLya {
publicstaticvoidmain(String[] args) {
Stringname = "Lya";doubleversion = 1.0;booleanisReady = true;intmessagesProcessed = 0;
System.out.println("=== " + name + " ASSISTANT ===");System.out.println("Version: " + version);System.out.println("Ready to help: " + isReady);System.out.println("Messages processed: " + messagesProcessed);System.out.println("Hello! I'm " + name + ", your personal assistant.");}
}
```
The + sign can combine text and variables. This is called concatenation.
 
Norbert also wanted Lya to count how many messages she had processed. He changed the messagesProcessed variable to track activity. That way, Lya could slowly keep track of her activity.
 
**What Norbert remembers:**
- Variables store data.
- Every variable has a type.
- String stores text.
- int stores whole numbers.
- double stores decimal numbers.
- boolean stores true or false.
- Concatenation joins text and values.
 
**Exercises:**
1. Create an age variable and print it.
2. Change Lya's version to 1.1 and print it.
3. Create a greeting variable containing "Welcome!" and print it.
4. Challenge: Create a temperature variable and store 22.5 in it.

## Chapter 3 — Norbert Chooses
Norbert is at the market. He looks at two stalls selling tomatoes. One is 2.50 a kilo, the other 3.00. He takes the cheaper ones without thinking twice. Walking home, he realizes what he has just done: he made a choice. A condition. If the price is lower, he buys. Otherwise, he walks past.
 
His program needs the same thing. Lya must choose between different responses depending on what she is asked.
 
Conditions in Java are created with if, else if, and else. They allow the program to choose different paths. Think of it like this: if something is true, go this way; else if the first thing was false, check this; else if nothing else was true, go this way.
 
Norbert starts with a simple program that prints a greeting based on the time of day.
 
```javapublicclassChoices {
publicstaticvoidmain(String[] args) {
inthour = 14;
if (hour < 12) {
System.out.println("Good morning.");} else {
System.out.println("Good afternoon.");}
}
}
```
He runs it and sees "Good afternoon." He changes hour to 9 and sees "Good morning." The program looks at the value inside hour and chooses the appropriate message.
 
He then adds a third path for the evening.
 
```javapublicclassMoreChoices {
publicstaticvoidmain(String[] args) {
inthour = 19;
if (hour < 12) {
System.out.println("Good morning.");} elseif (hour < 18) {
System.out.println("Good afternoon.");} else {
System.out.println("Good evening.");}
}
}
```
Norbert wants Lya to respond differently based on the user's request.
 
```javapublicclassLyaReply {
publicstaticvoidmain(String[] args) {
Stringrequest = "hello";
if (request.equals("hello")) {
System.out.println("Hello! How can I help you?");} elseif (request.equals("help")) {
System.out.println("I can answer simple questions.");} else {
System.out.println("I don't understand that yet.");}
}
}
```
This is the first time Lya starts to feel interactive. She begins to respond differently depending on what she receives.
 
**What Norbert remembers:**
- Conditions let programs make decisions.
- if runs a block when the condition is true.
- else runs when the condition is false.
- else if adds another possible path.
- Lya can use conditions to answer differently based on the request.
 
**Exercises:**
1. Write a program that prints "It's cold" if temperature is below 15, otherwise "It's warm."
2. Write a program with three cases: morning, afternoon, and evening.
3. Create a condition that checks whether a request is empty or not.
4. Challenge: Make Lya respond differently depending on whether the user says "hello" or something else.

## Chapter 4 — Norbert Repeats
Norbert is at the gym, lying on the floor after a set of push-ups. He's done ten. He knows because he counted. One. Two. Three. Four. Five. Six. Seven. Eight. Nine. Ten. He's out of breath, but he's also thinking. "I just repeated the same action ten times," he mutters. "I didn't write the instruction ten times. I just did it. And I counted."
 
That's exactly what a loop does in Java. A loop lets a program repeat an action instead of writing the same code many times. Norbert sees why this matters for Lya. She may need to show a menu again and again, scan a list of words, or repeat a task until something changes.
 
A while loop repeats as long as a condition stays true. Norbert writes a program that counts his push-ups.
 
```javapublicclassPushups {
publicstaticvoidmain(String[] args) {
intcount = 1;
while (count <= 5) {
System.out.println("Push-up number " + count);count = count + 1;}
 
System.out.println("Done!");}
}
```
He runs it and sees "Push-up number 1" through "Push-up number 5" then "Done!" The program starts with count = 1. It checks the condition. If count <= 5, it runs the block. At the end of each round, count increases by 1. When count becomes 6, the condition is false, and the loop stops.
 
He also learns about the for loop, which is useful when he already knows how many times the action should repeat.
 
```javapublicclassForPushups {
publicstaticvoidmain(String[] args) {
for (inti = 1; i <= 5; i++) {
System.out.println("Push-up number " + i);}
System.out.println("Done!");}
}
```
The result is the same, but the for loop packs everything into one line: the starting point, the condition, and the update.
 
Norbert makes a mistake. He forgets to update the counter. The program runs forever. He learns the rule: every loop must have something that changes inside it, and that change must eventually make the condition false.
 
**What Norbert remembers:**
- Loops repeat actions in Java.
- while repeats while a condition is true.
- for is useful when the number of repetitions is known.
- A loop must eventually stop.
- Lya can use loops to process lists and repeat tasks.
 
**Exercises:**
1. Write a while loop that counts from 1 to 10.
2. Write a for loop that prints the numbers from 1 to 20.
3. Write a program that asks the user for numbers until they type 0, then prints the sum.
4. Challenge: Print a multiplication table for the number 7.

## Chapter 5 — Norbert Organizes
Norbert is in his kitchen, staring at a messy cupboard. Cans of beans, bags of pasta, bottles of oil — all mixed together. He sighs, then grabs a box. "I'm going to organize this," he says. He starts grouping things. Pasta together. Cans together. Bottles together. He stops halfway and looks at his hands. "I'm not just storing things," he realizes. "I'm storing them in groups."
 
His program needs the same thing. Lya will need to store groups of related items: commands, tasks, messages. He can't keep creating separate variables for everything.
 
An array is a container that holds multiple values of the same type. Think of it like a row of identical boxes. Each box has a number — an index — that tells you its position. The boxes are numbered starting at 0.
 
Norbert writes a program that stores his shopping list.
 
```javapublicclassGroceryList {
publicstaticvoidmain(String[] args) {
String[] groceries = {"bread", "milk", "eggs", "apples", "butter"};
System.out.println("First item: " + groceries[0]);System.out.println("Second item: " + groceries[1]);System.out.println("Last item: " + groceries[4]);
System.out.println("\nMy grocery list:");for (inti = 0; i < groceries.length; i++) {
System.out.println("- " + groceries[i]);}
}
}
```
He runs it and sees the grocery list printed in order. He learns the important rule: the first index is 0, the last index is length - 1.
 
He also learns that arrays have a fixed size. You decide how many boxes you need when you create the array, and you can't change it later.
 
Norbert stores Lya's possible commands in an array.
 
```javapublicclassLyaCommands {
publicstaticvoidmain(String[] args) {
String[] commands = {"help", "hello", "time", "exit"};
System.out.println("Available commands:");for (String command : commands) {
System.out.println("- " + command);}
}
}
```
Note: For simplicity, the examples in this chapter use static methods. In a real project, you would normally use instance methods and dependency injection. We will revisit this in later chapters when we build the full application.
 
**What Norbert remembers:**
- Arrays store multiple values of the same type.
- The first index is 0.
- The last index is length - 1.
- Arrays have a fixed size.
- Loops are perfect for going through arrays.
 
**Exercises:**
1. Create an array of three favorite movies and print them.
2. Find the maximum value in an array of numbers: {45, 23, 67, 12, 89}.
3. Reverse an array: {1, 2, 3, 4, 5} → {5, 4, 3, 2, 1}.
4. Challenge: Create an array of 10 numbers and sort them.

## Chapter 6 — Norbert Reuses
Norbert is in his kitchen, making a salad. He washes the lettuce, chops the tomatoes, slices the onions, mixes the dressing. He does it in the same order every time. He stops mid-chop. "I don't write down the whole process every time I make a salad," he says. "I just say 'make a salad' and I know what that means."
 
He walks to his computer. His code is starting to feel like a recipe written on too many pages. He needs to bundle code into reusable blocks.
 
A method is a named block of code that performs a specific task. You write the code once, give it a name, and call it whenever you need it. Think of it like a tool in a workshop: you don't build a hammer every time you need one.
 
Norbert writes a simple method that prints a greeting.
 
```javapublicclassMethods {
publicstaticvoidmain(String[] args) {
sayHello();sayHello();}
 
publicstaticvoidsayHello() {
System.out.println("Hello from Lya.");}
}
```
He runs it and sees "Hello from Lya." twice. He called the method twice, but wrote the code once.
 
He adds a parameter to greet different people.
 
```javapublicclassGreetings {
publicstaticvoidmain(String[] args) {
greet("Alice");greet("Norbert");greet("Lya");}
 
publicstaticvoidgreet(String name) {
System.out.println("Hello, " + name + "!");}
}
```
He also learns that a method can return a value.
 
```javapublicclassCalculator {
publicstaticvoidmain(String[] args) {
intresult = add(5, 3);System.out.println("5 + 3 = " + result);}
 
publicstaticintadd(int a, int b) {
return a + b;}
}
```
Now he organizes Lya into clear methods.
 
```javapublicclassLyaOrganized {
publicstaticvoidmain(String[] args) {
Scannerscanner = newScanner(System.in);displayWelcome();while (true) {
System.out.print("You: ");Stringinput = scanner.nextLine();if (input.equals("quit")) {
System.out.println("Goodbye!");break;} else {
handleRequest(input);}
}
scanner.close();}
 
publicstaticvoiddisplayWelcome() {
System.out.println("=== LYA ASSISTANT ===");System.out.println("Type 'quit' to stop.");}
 
publicstaticvoidhandleRequest(String request) {
if (request.equals("hello")) {
System.out.println("Hello! How can I help you?");} elseif (request.equals("help")) {
System.out.println("I can handle: hello, help, time");} elseif (request.equals("time")) {
System.out.println("I don't have a clock yet.");} else {
System.out.println("I don't understand that.");}
}
}
```
**What Norbert remembers:**
- Methods bundle code into reusable blocks.
- Methods have a name, parameters, a return type, and a body.
- void methods return nothing.
- Methods with a return type use return to give back a value.
- Methods make code cleaner, easier to read, and easier to reuse.
 
**Exercises:**
1. Write a method that takes a name and age and prints a greeting.
2. Write a method that takes a number and returns true if even, false if odd.
3. Write a method that takes an array of numbers and returns the sum.
4. Challenge: Write a method that calculates the factorial of a number.

## Chapter 7 — Norbert Listens
Norbert is at his desk, staring at Lya's code. She can display messages, make decisions, repeat actions, and organize code into methods. But she can't hear. "An assistant that can't listen is just a billboard," he mutters.
 
He remembers his first interactions with Siri and Alexa. They didn't just say things — they responded to his voice. They read what he said and reacted to it. Lya needs the same thing.
 
Keyboard input lets a program read what the user types. Without it, a program is a monologue. With it, it becomes a conversation. In Java, you read input using Scanner.
 
Norbert writes a simple program that asks for a name.
 
```javaimport java.util.Scanner;
publicclassListener {
publicstaticvoidmain(String[] args) {
Scannerscanner = newScanner(System.in);System.out.print("What is your name? ");Stringname = scanner.nextLine();System.out.println("Hello, " + name + "!");scanner.close();}
}
```
He runs it, types his name, and Lya responds. He also learns to read numbers.
 
```javaimport java.util.Scanner;
publicclassNumberInput {
publicstaticvoidmain(String[] args) {
Scannerscanner = newScanner(System.in);System.out.print("Enter your age: ");intage = scanner.nextInt();scanner.nextLine();System.out.print("Enter your favorite color: ");Stringcolor = scanner.nextLine();System.out.println("Age: " + age);System.out.println("Color: " + color);scanner.close();}
}
```
He discovers an important detail: after nextInt(), you need an extra nextLine() to consume the leftover newline.
 
Now Lya can be truly interactive.
 
```javaimport java.util.Scanner;
publicclassLyaInteractive {
publicstaticvoidmain(String[] args) {
Scannerscanner = newScanner(System.in);System.out.println("=== LYA ASSISTANT ===");System.out.println("Hello! I'm Lya.");System.out.println("Type 'quit' to stop.");while (true) {
System.out.print("You: ");Stringinput = scanner.nextLine();if (input.equals("quit")) {
System.out.println("Goodbye!");break;} elseif (input.equals("hello")) {
System.out.println("Hello! How can I help you?");} elseif (input.equals("help")) {
System.out.println("Commands: hello, help, quit");} else {
System.out.println("I don't understand that.");}
}
scanner.close();}
}
```
**What Norbert remembers:**
- Scanner reads input from the keyboard.
- nextLine() reads text.
- nextInt() reads integers.
- Always close the scanner when done.
- nextInt() leaves a newline — use an extra nextLine() to clear it.
 
**Exercises:**
1. Ask the user for their name and greet them.
2. Ask for two numbers and print their sum.
3. Ask for a number and tell if it's positive, negative, or zero.
4. Challenge: Create a simple calculator with two numbers and an operator.

## Chapter 8 — Norbert Builds a Blueprint
Norbert is at the train station, staring at the departure board. Each train is listed as a row of information: number, destination, time, platform. Every row has the same structure, but different values. "It's like a template," he says. "Each train is the same shape, but filled with different details."
 
He thinks about Lya. Right now, she's a loose collection of variables and methods. She works, but she doesn't feel like a real thing. She's just code floating around. He wants Lya to become a real object.
 
A class is a blueprint. It describes what something is and what it can do. An object is a concrete instance created from that blueprint. Think of it like a cookie cutter: the cutter is the class, the cookies are the objects.
 
Norbert creates a simple class for a train.
 
```javapublicclassTrain {
String number;String destination;int hour;
voiddisplay() {
System.out.println("Train " + number + " to " + destination);System.out.println("Departure: " + hour + ":00");}
}
```
Then he creates objects from that class.
 
```javapublicclassStation {
publicstaticvoidmain(String[] args) {
Traintrain1 = newTrain();train1.number = "TGV 701";train1.destination = "Lyon";train1.hour = 14;
Traintrain2 = newTrain();train2.number = "TER 405";train2.destination = "Rennes";train2.hour = 16;
train1.display();System.out.println();train2.display();}
}
```
He runs it and sees two different trains displayed with their own values. He understands that a class is the blueprint and an object is the actual thing.
 
Now Norbert turns Lya into a real class.
 
```javapublicclassLya {
String name;String version;int messagesProcessed;
voidgreet() {
System.out.println("Hello, I'm " + name + ".");System.out.println("Version " + version);}
 
voidrespond(String request) {
messagesProcessed++;System.out.println("Processing: " + request);System.out.println("Messages processed: " + messagesProcessed);}
 
voiddisplayStatus() {
System.out.println("--- Lya Status ---");System.out.println("Name: " + name);System.out.println("Version: " + version);System.out.println("Messages: " + messagesProcessed);}
}
```
Now he can create multiple Lya objects.
 
```javapublicclassTestLya {
publicstaticvoidmain(String[] args) {
Lyalya = newLya();lya.name = "Lya";lya.version = "0.1";lya.messagesProcessed = 0;
lya.greet();lya.respond("Hello!");lya.respond("What's the weather?");lya.displayStatus();
Lyalya2 = newLya();lya2.name = "Lya Pro";lya2.version = "1.0";lya2.messagesProcessed = 0;
lya2.greet();}
}
```
**What Norbert remembers:**
- A class is a blueprint.
- An object is an instance of a class.
- Fields store data in an object.
- Methods define what an object can do.
- Use new to create an object.
- Each object has its own copy of the fields.
 
**Exercises:**
1. Create a Person class with name, age, and city fields. Add a display() method.
2. Create a Book class with title, author, and pages fields. Add a display() method.
3. Create a Car class with brand, model, and year fields. Add a display() method.
4. Challenge: Create a BankAccount class with owner and balance fields. Add deposit() and withdraw() methods.

## Chapter 9 — Norbert Builds Properly
Norbert is in his workshop, building a chair. He doesn't build it empty and then add legs later. He builds it whole: legs, seat, back, all at once. "That's how I should build Lya," he says. "Not empty first, filled later. Complete from the start."
 
Right now, he creates Lya like this: Lya lya = new Lya(); lya.name = "Lya"; lya.version = "0.1"; lya.messagesProcessed = 0; It works, but it's messy. He can forget to set a field. He can set it incorrectly. He wants a way to create Lya with all her values ready.
 
A constructor is a special method that runs when you create an object. Its job is to initialize the object's fields. Constructors have the same name as the class, don't have a return type, run automatically when you use new, and can take parameters.
 
Norbert adds a constructor to the Train class.
 
```javapublicclassTrain {
String number;String destination;int hour;
publicTrain(String number, String destination, int hour) {
this.number = number;this.destination = destination;this.hour = hour;}
 
voiddisplay() {
System.out.println("Train " + number + " to " + destination);System.out.println("Departure: " + hour + ":00");}
}
```
Now he can create trains in one line: Traintrain1 = newTrain("TGV 701", "Lyon", 14); Traintrain2 = newTrain("TER 405", "Rennes", 16);
He learns that this refers to the current object. this.number is the field, number is the parameter.
 
He also learns about multiple constructors. He adds a second constructor for a default hour.
 
```javapublicTrain(String number, String destination) {
this(number, destination, 12);}
```
Now he can create trains in two ways. Norbert adds a constructor to Lya.
 
```javapublicclassLya {
String name;String version;int messagesProcessed;
publicLya(String name, String version) {
this.name = name;this.version = version;this.messagesProcessed = 0;}
 
publicLya() {
this("Lya", "0.1");}
 
voidgreet() {
System.out.println("Hello, I'm " + name + ".");System.out.println("Version " + version);}
 
voidrespond(String request) {
messagesProcessed++;System.out.println("Processing: " + request);System.out.println("Messages processed: " + messagesProcessed);}
}
``
`
Now he creates Lya cleanly: Lya lya = new Lya("Lya", "1.0"); Lya defaultLya = new Lya();
**What Norbert remembers:**
- A constructor initializes an object when it's created.
- It has the same name as the class and no return type.
- this refers to the current object.
- You can have multiple constructors.
- Constructors make object creation cleaner and safer.
 
**Exercises:**
1. Add a constructor to the Person class that takes name and age.
2. Create a Book class with constructors: one with all fields, one with just title and author.
3. Create a Car class with a constructor that sets brand, model, and year.
4. Challenge: Create a BankAccount class with a constructor that sets owner and initial balance.

## Chapter 10 — Norbert Protects His Data
Norbert is in his garden, looking at his greenhouse. Inside, rows of tomato plants are growing. The greenhouse has a door with a lock. He can enter to water and tend the plants, but birds and rabbits can't. "I control who gets in," he says. "My plants are protected."
 
He thinks about Lya. Right now, her data is unprotected. Anyone could change her version to a negative number, or erase her name, or set her message count to something absurd. He needs to protect her internal state.
 
Encapsulation is the practice of hiding the internal data of an object and controlling access to it. In Java, encapsulation is achieved with private fields, public methods, getters, and setters.
 
Norbert rewrites the Train class with private fields.
 
```javapublicclassTrain {
private String number;private String destination;privateint hour;
publicTrain(String number, String destination, int hour) {
this.number = number;this.destination = destination;this.hour = hour;}
 
public String getNumber() { return number; }
public String getDestination() { return destination; }
publicintgetHour() { return hour; }
 
publicvoidsetHour(int hour) {
if (hour >= 0 &amp;&amp; hour <= 23) {
this.hour = hour;} else {
System.out.println("Invalid hour!");}
}
}
```
Now the fields are protected. Outside code can only access them through getters and setters. The setter prevents invalid values.
 
Norbert tries to set an invalid hour: train.setHour(25); The output is "Invalid hour!" The setter prevented the change.
 
Now Norbert protects Lya's data.
 
```javapublicclassLya {
private String name;private String version;privateint messagesProcessed;privateboolean ready;
publicLya(String name, String version) {
this.name = name;this.version = version;this.messagesProcessed = 0;this.ready = true;}
 
public String getName() { return name; }
public String getVersion() { return version; }
publicintgetMessagesProcessed() { return messagesProcessed; }
publicbooleanisReady() { return ready; }
 
publicvoidsetName(String name) {
if (name != null &amp;&amp; !name.trim().isEmpty()) {
this.name = name;}
}
publicvoidsetVersion(String version) {
if (version != null &amp;&amp; !version.trim().isEmpty()) {
this.version = version;}
}
publicvoidprocessMessage(String message) {
if (!ready) {
System.out.println("Lya is not ready.");return;}
messagesProcessed++;System.out.println("Processing: " + message);System.out.println("Messages processed: " + messagesProcessed);}
}
```
**What Norbert remembers:**
- Encapsulation protects an object's internal data.
- private fields are accessible only inside the class.
- Getters allow safe reading.
- Setters allow controlled writing.
- Validation belongs in setters.
- Encapsulation makes code more robust and maintainable.
 
**Exercises:**
1. Create a Person class with private name and age fields. Add getters and setters.
2. Add validation to setAge() so age can't be negative.
3. Create a Product class with private name and price fields. Add getters and setters.
4. Challenge: Create a Student class with private grades and a method to calculate the average.

## Chapter 11 — Norbert Discovers What Belongs to the Class
Norbert is in his garden, looking at all the plants he's grown. He plants seeds, waters them, and they grow. Each plant is an individual object. But some things are shared among all the plants. The soil, the water, the sunlight — they don't belong to any one plant. They're part of the garden itself.
 
He thinks about Lya. He's created multiple Lya objects. Each one has its own name, version, and message count. But some data doesn't belong to one Lya. The total number of Lya objects isn't stored in any single object. It belongs to the class.
 
A static member belongs to the class itself, not to any particular object. It's shared by all objects of that class. In Java, you use the static keyword to create class-level members.
 
Norbert wants to count how many Train objects he creates.
 
```javapublicclassTrain {
privatestaticintcount = 0;private String number;private String destination;privateint hour;
publicTrain(String number, String destination, int hour) {
this.number = number;this.destination = destination;this.hour = hour;count++;}
 
publicstaticintgetCount() {
return count;}
 
publicvoiddisplay() {
System.out.println("Train " + number + " to " + destination);System.out.println("Departure: " + hour + ":00");System.out.println("Total trains: " + count);}
}
```
Now he can track the total number of trains: System.out.println("Total trains: " + Train.getCount());
He learns that static methods can be called without creating an object. This is useful for utility functions.
 
He also learns about static final for constants.
 
```javapublicclassConstants {
publicstaticfinalintMAX_MESSAGES = 100;publicstaticfinalStringDEFAULT_VERSION = "1.0";publicstaticfinalStringAPP_NAME = "Lya";}
```
Now Norbert adds static members to Lya.
 
```javapublicclassLya {
privatestaticinttotalInstances = 0;publicstaticfinalStringAPP_NAME = "Lya Assistant";publicstaticfinalStringDEFAULT_VERSION = "1.0";
private String name;private String version;privateint messagesProcessed;privateboolean ready;
publicLya(String name, String version) {
this.name = name;this.version = version;this.messagesProcessed = 0;this.ready = true;totalInstances++;}
 
publicLya() {
this("Lya", DEFAULT_VERSION);}
 
publicstaticintgetTotalInstances() {
return totalInstances;}
 
publicstaticvoiddisplayAppInfo() {
System.out.println("=== " + APP_NAME + " ===");System.out.println("Total instances: " + totalInstances);System.out.println("Default version: " + DEFAULT_VERSION);}
}
```
**What Norbert remembers:**
- static members belong to the class, not to objects.
- Static fields are shared by all instances.
- Static methods can be called without creating an object.
- static final is used for constants.
- Static is useful for counters, utilities, and shared data.
 
**Exercises:**
1. Add a static counter to a class and increment it each time an object is created.
2. Write a static method that checks whether a number is positive.
3. Create a static final constant for a maximum score.
4. Challenge: Create a utility class with several static methods for simple math operations.

## Chapter 12: Norbert Faces the Unexpected
## Introduction
Norbert is in his kitchen, following a recipe for a cake. He measures the flour, cracks the eggs, adds the sugar. Everything is going perfectly.
 
Then he opens the fridge. No butter.
 
He stops. The recipe can't continue without butter. He can't just pretend it's there. He has to handle this unexpected situation.
 
He sighs, closes the fridge, and goes to the store.
 
Later, back at his computer, he thinks about Lya. She's going to face unexpected situations too. Users will type empty messages. Files won't exist. Networks will fail. She needs a way to handle these moments gracefully.
 
He opens his laptop.
 
## What Exceptions Are
An **exception** is an event that interrupts the normal flow of a program. It's Java's way of saying: "Something unexpected just happened, and I can't continue as if nothing occurred."
 
Think of it like a safety net. If something goes wrong, the net catches you. You don't fall all the way down.
 
Java provides a structured way to handle these events:
| Tool | What it does |
|------|--------------|
| `try` | Contains code that might cause an exception |
| `catch` | Handles the exception if it occurs |
| `finally` | Runs code regardless of whether an exception occurred |
| `throw` | Creates and throws an exception |
| `throws` | Declares that a method might throw an exception |
---
## Norbert's First Exception
Norbert writes a program that divides two numbers:
```javapublicclassDivision {
publicstaticvoidmain(String[] args) {
inta = 10;intb = 0;
System.out.println(a / b);}
}
```
He runs it:
```
Exception in thread "main" java.lang.ArithmeticException: / by zero```
 
Java stops the program immediately. Division by zero is not allowed.
 
Norbert adds a safety net:
```javapublicclassSafeDivision {
publicstaticvoidmain(String[] args) {
inta = 10;intb = 0;
try {
System.out.println(a / b);} catch (ArithmeticException e) {
System.out.println("Cannot divide by zero!");}
 
System.out.println("Program continues.");}
}
```
He runs it:
```
Cannot divide by zero!
Program continues.
```
The program didn't crash. It handled the error gracefully and continued.
---
## What the Code Does
```javatry {
System.out.println(a / b);}
```
This is the `try` block. It contains code that might cause an exception. Java monitors it for errors.
 
```java} catch (ArithmeticException e) {
System.out.println("Cannot divide by zero!");}
```
This is the `catch` block. It runs only if a specific exception occurs. Here, it catches `ArithmeticException` (division by zero).
 
```javaSystem.out.println("Program continues.");```
 
This line runs regardless of whether an exception occurred. The program continues normally.
---
## Multiple Catch Blocks
Norbert learns that he can catch different types of exceptions:
```javapublicclassMultipleCatch {
publicstaticvoidmain(String[] args) {
String[] numbers = {"10", "5", "abc", "0"};
for (String num : numbers) {
try {
intvalue = Integer.parseInt(num);intresult = 100 / value;System.out.println("Result: " + result);} catch (NumberFormatException e) {
System.out.println("Not a valid number: " + num);} catch (ArithmeticException e) {
System.out.println("Cannot divide by zero: " + num);}
}
}
}
```
He runs it:
```
Result: 10
Result: 20
Not a valid number: abcCannot divide by zero: 0
```
Each exception is caught by the appropriate handler.
 
Norbert learns: **catch specific exceptions first, then more general ones.**
---
## The finally Block
Norbert learns about `finally`: a block that runs whether an exception occurs or not:
```javapublicclassFinallyExample {
publicstaticvoidmain(String[] args) {
try {
System.out.println("Trying something risky...");intresult = 10 / 2;System.out.println("Result: " + result);} catch (ArithmeticException e) {
System.out.println("Error: " + e.getMessage());} finally {
System.out.println("This always runs.");}
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
Error: / by zeroThis always runs.
```
`finally` is useful for cleanup: closing files, releasing resources, or always saving data.
---
## Creating Custom Exceptions
Norbert realizes that sometimes he needs his own types of exceptions:
```javapublicclassEmptyRequestExceptionextendsException {
publicEmptyRequestException(String message) {
super(message);}
}
```
Now he can use it in Lya:
```javapublicclassLya {
private String name;private String version;
publicLya(String name, String version) {
this.name = name;this.version = version;}
 
publicvoidrespond(String request) throws EmptyRequestException {
if (request == null || request.trim().isEmpty()) {
thrownewEmptyRequestException("Request cannot be empty!");}
 
System.out.println("Processing: " + request);}
}
```
Now he uses it:
```javapublicclassTestLya {
publicstaticvoidmain(String[] args) {
Lyalya = newLya("Lya", "1.0");
try {
lya.respond("Hello");lya.respond(""); // This will throw an exception} catch (EmptyRequestException e) {
System.out.println("Error: " + e.getMessage());}
}
}
```
Output:
```
Processing: HelloError: Request cannot be empty!
```
---
## The throw Keyword
Norbert learns that `throw` is used to manually trigger an exception:
```javapublicvoidvalidateAge(int age) {
if (age < 0) {
thrownewIllegalArgumentException("Age cannot be negative.");}
System.out.println("Age: " + age);}
```
He can use this to enforce rules:
```javavalidateAge(25); // WorksvalidateAge(-5); // Throws exception```
---
## The throws Keyword
`throws` is used in method signatures to declare that a method might throw an exception:
```javapublicvoidprocessRequest(String request) throws EmptyRequestException {
// ...
}
```
This tells callers: "This method might throw an exception, so you need to handle it."
---
## Applying Exceptions to Lya
Norbert integrates exception handling into Lya:
```javapublicclassLya {
private String name;private String version;privateint messagesProcessed;privateboolean ready;
publicLya(String name, String version) {
this.name = name;this.version = version;this.messagesProcessed = 0;this.ready = true;}
 
publicvoidrespond(String request) throws EmptyRequestException {
if (request == null || request.trim().isEmpty()) {
thrownewEmptyRequestException("Request cannot be empty.");}
 
if (!ready) {
thrownewIllegalStateException("Lya is not ready.");}
 
messagesProcessed++;System.out.println("Processing: " + request);System.out.println("Messages processed: " + messagesProcessed);}
 
publicvoiddisplayStatus() {
System.out.println("--- Lya Status ---");System.out.println("Name: " + name);System.out.println("Version: " + version);System.out.println("Messages: " + messagesProcessed);System.out.println("Ready: " + ready);}
}
```
Now Lya rejects invalid inputs gracefully:
```javapublicclassMain {
publicstaticvoidmain(String[] args) {
Lyalya = newLya("Lya", "1.0");
try {
lya.respond("Hello");lya.respond(""); // Empty request} catch (EmptyRequestException e) {
System.out.println("Error: " + e.getMessage());} catch (Exception e) {
System.out.println("Unexpected error: " + e.getMessage());} finally {
System.out.println("Request handling complete.");}
}
}
```
---
## The Safety Net Metaphor
Norbert imagines a safety net under a tightrope walker:
- The `try` block is the walker — doing something risky.
- The `catch` block is the net — catching the fall.
- The `finally` block is the crew — always there, regardless of what happens.
 
Without the net, a fall is catastrophic. With it, the walker can try again.
---
## Common Mistakes
Norbert learns a few pitfalls:
1. **Catching Exception too broadly**
- Catching `Exception` catches everything, making it hard to distinguish errors.
 
2. **Swallowing exceptions**
- Catching an exception and doing nothing hides the problem.
 
3. **Not handling exceptions**
- Some exceptions must be handled (checked exceptions).
 
4. **Throwing the wrong exception type**
- Use the most specific exception type that fits the situation.
---
## What Norbert Remembers
- Exceptions handle unexpected situations gracefully.
- `try` contains risky code.
- `catch` handles specific exceptions.
- `finally` runs regardless of whether an exception occurs.
- `throw` triggers an exception manually.
- `throws` declares that a method might throw an exception.
- Custom exceptions make code more descriptive.
---
## Exercises
1. Write a program that divides two numbers and handles division by zero.
2. Create a custom exception for invalid age (e.g., negative age).
3. Write a method that reads a file and handles `FileNotFoundException`.
4. Challenge: Create a `validatePassword()` method that throws an exception if the password is too short.
---
## What Comes Next
Norbert closes his laptop. Lya can now handle errors gracefully.
 
But she's still a collection of separate parts. She needs to come together as a complete assistant.
 
Tomorrow, he's going to build the first full version of Lya.

## Chapter 13 — Building Lya
Norbert is sitting at his desk, looking at everything he's learned. Variables, conditions, loops, methods, classes, objects, encapsulation, exceptions. Each piece is useful on its own. But together, they can become something more.
 
He's been building Lya piece by piece. Now it's time to bring all the pieces together and build a complete assistant.
 
Not a perfect one. Not a smart one. Just a working one that can:- Introduce itself.
- Answer a few known questions.
- Keep a history.
- Learn new responses.
 
Norbert opens his editor and starts typing.
 
```javaimport java.util.ArrayList;import java.util.HashMap;
publicclassEmptyRequestExceptionextendsException {
publicEmptyRequestException(String message) {
super(message);}
}
publicclassLya {
private String name;private String version;private HashMap<String, String> responses;private ArrayList<String> history;
publicLya() {
this.name = "Lya";this.version = "0.1";this.responses = newHashMap<>();this.history = newArrayList<>();
// Predefined responsesresponses.put("hello", "Hello! How can I help you?");responses.put("hi", "Hi there! What can I do for you?");responses.put("who are you", "I'm Lya, an assistant built by Norbert.");responses.put("help", "I can answer simple questions. Try saying 'hello'.");responses.put("thanks", "You're welcome!");responses.put("goodbye", "Goodbye! See you later!");}
 
publicvoidgreet() {
System.out.println("=== LYA ASSISTANT ===");System.out.println("Hello, I'm " + name + ".");System.out.println("Version " + version);System.out.println("Ask me something, or type 'quit' to stop.");}
 
publicvoidrespond(String request) throws EmptyRequestException {
if (request == null || request.trim().isEmpty()) {
thrownewEmptyRequestException("Request cannot be empty.");}
 
history.add("User: " + request);StringcleanRequest = request.toLowerCase().trim();Stringresponse = responses.get(cleanRequest);
if (response != null) {
System.out.println("Lya: " + response);history.add("Lya: " + response);} else {
System.out.println("Lya: I don't understand that yet.");System.out.println("Lya: You can teach me with 'learn [request] | [response]'");history.add("Lya: I don't understand that yet.");}
}
publicvoidlearn(String request, String response) throws EmptyRequestException {
if (request == null || request.trim().isEmpty()) {
thrownewEmptyRequestException("Request cannot be empty.");}
if (response == null || response.trim().isEmpty()) {
thrownewEmptyRequestException("Response cannot be empty.");}
 
StringcleanRequest = request.toLowerCase().trim();responses.put(cleanRequest, response);System.out.println("Lya learned: '" + request + "' → '" + response + "'");}
 
publicvoidshowHistory() {
if (history.isEmpty()) {
System.out.println("No history yet.");return;}
System.out.println("--- Conversation History ---");for (String entry : history) {
System.out.println(entry);}
System.out.println("--- End of History ---");}
 
publicvoidshowKnownResponses() {
if (responses.isEmpty()) {
System.out.println("I don't know any responses yet.");return;}
System.out.println("--- Known Responses ---");for (String key : responses.keySet()) {
System.out.println(key + " → " + responses.get(key));}
System.out.println("--- End of Responses ---");}
 
publicvoiddisplayStatus() {
System.out.println("--- Lya Status ---");System.out.println("Name: " + name);System.out.println("Version: " + version);System.out.println("Known responses: " + responses.size());System.out.println("History entries: " + history.size());}
}
```
And the main program:
```javaimport java.util.Scanner;
publicclassLyaApp {
publicstaticvoidmain(String[] args) {
Scannerscanner = newScanner(System.in);Lyalya = newLya();
lya.greet();
booleanrunning = true;while (running) {
System.out.print("\nYou: ");Stringinput = scanner.nextLine().trim();
try {
if (input.equalsIgnoreCase("quit") || input.equalsIgnoreCase("exit")) {
running = false;System.out.println("Lya: Goodbye!");break;}
 
if (input.equalsIgnoreCase("history")) {
lya.showHistory();continue;}
 
if (input.equalsIgnoreCase("knowledge")) {
lya.showKnownResponses();continue;}
 
if (input.equalsIgnoreCase("status")) {
lya.displayStatus();continue;}
 
if (input.toLowerCase().startsWith("learn ")) {
Stringcontent = input.substring(6);String[] parts = content.split("\\|");if (parts.length == 2) {
lya.learn(parts[0].trim(), parts[1].trim());} else {
System.out.println("Usage: learn [request] | [response]");System.out.println("Example: learn hello | Hello there!");}
continue;}
 
lya.respond(input);
} catch (EmptyRequestException e) {
System.out.println("Error: " + e.getMessage());System.out.println("Please type something.");} catch (Exception e) {
System.out.println("Unexpected error: " + e.getMessage());}
}
scanner.close();System.out.println("Lya: See you next time!");}
}
```
**What Norbert remembers:**
- Lya is now a complete, working assistant.
- She can answer, learn, and remember.
- HashMap is perfect for storing key-value pairs.
- ArrayList is great for storing ordered history.
- Error handling makes her robust.
- A clean main loop keeps her interactive.
 
**Exercises:**
1. Add three more predefined responses to Lya.
2. Add a command to clear the history.
3. Add a command to delete a response from the knowledge base.
4. Challenge: Add a timestamp to each history entry.

## Chapter 14 — Understanding Simple Requests
Norbert is in a coffee shop, waiting for his order. The barista calls out: "Latte for Sarah?" A woman across the room looks up and walks to the counter.
 
Norbert notices something: the barista didn't say "Sarah" in isolation. She said a whole sentence. But the important word was "Sarah."
 
"That's how understanding works," he says. "You don't need to recognize every word. You just need to catch the important ones."
 
He thinks about Lya. Right now, she only understands exact matches. "Hello" works. "Hello there" doesn't. "Hey" doesn't. "Hi" doesn't.
 
She needs to understand more than just exact words. She needs to find keywords inside sentences.
 
```javaprivate String findResponse(String request) {
Stringcleaned = request.toLowerCase().trim();
// 1. Check exact matchif (responses.containsKey(cleaned)) {
return responses.get(cleaned);}
 
// 2. Check for keywordsString[] words = cleaned.split(" ");for (String word : words) {
if (responses.containsKey(word)) {
return responses.get(word);}
}
// 3. Check for question typesif (cleaned.contains("who") || cleaned.contains("what")) {
return"I can tell you about myself, but I don't know much yet.";}
 
if (cleaned.contains("why")) {
return"I'm still learning how to answer 'why' questions.";}
 
if (cleaned.contains("how")) {
return"I can explain simple things, but I need more training.";}
 
if (cleaned.contains("where")) {
return"I don't know much about places yet.";}
 
if (cleaned.contains("when")) {
return"I don't have a good sense of time yet.";}
 
returnnull;}
 
// Update respond method to use findResponsepublicvoidrespond(String request) throws EmptyRequestException {
if (request == null || request.trim().isEmpty()) {
thrownewEmptyRequestException("Request cannot be empty.");}
 
history.add("User: " + request);Stringresponse = findResponse(request);
if (response != null) {
System.out.println("Lya: " + response);history.add("Lya: " + response);} else {
System.out.println("Lya: I don't understand that yet.");System.out.println("Lya: You can teach me with 'learn [request] | [response]'");history.add("Lya: I don't understand that yet.");}
}
```
**What Norbert remembers:**
- contains() checks if a substring exists inside a string.
- Lowercasing input makes matching case-insensitive.
- Exact match comes first, then keywords, then question types.
- This is a simple but effective way to handle varied input.
 
**Exercises:**
1. Add a keyword for "weather" and return a custom message.
2. Add a keyword for "ticket" and return a custom message.
3. Add detection for questions starting with "where."
4. Challenge: Add a synonym system that maps "hi" and "hey" to "hello."

## Chapter 15 — Norbert Makes Lya Safe
Norbert is at a restaurant, watching the waiter take orders. A customer says: "I'll have the pasta." The waiter writes it down. Then the customer adds: "Actually, no pasta. I'll have the fish instead." The waiter doesn't panic. He crosses out pasta, writes fish, and moves on.
 
Good systems handle changes gracefully. They don't crash because someone changed their mind. Lya needs the same resilience.
 
Input validation is the process of checking that input is valid before using it. In Java, validation involves null checks, length checks, type checks, and content checks.
 
Norbert creates a validation framework:
```javapublicclassValidationExceptionextendsException {
publicValidationException(String message) {
super(message);}
}
publicclassEmptyRequestExceptionextendsValidationException {
publicEmptyRequestException() {
super("Request cannot be empty.");}
}
publicclassRequestTooLongExceptionextendsValidationException {
publicRequestTooLongException(int maxLength) {
super("Request cannot exceed " + maxLength + " characters.");}
}
```
Now he updates Lya's respond method:
```javaprivate static final int MAX_REQUEST_LENGTH = 200;
private void validateRequest(String request) throws ValidationException {
if (request == null) {
throw new ValidationException("Request cannot be null.");}
 
String trimmed = request.trim();if (trimmed.isEmpty()) {
throw new EmptyRequestException();}
 
if (trimmed.length() > MAX_REQUEST_LENGTH) {
throw new RequestTooLongException(MAX_REQUEST_LENGTH);}
}
public void respond(String request) throws ValidationException {
validateRequest(request);// ... rest of the method}
```
**What Norbert remembers:**
- Input validation checks that input is valid before using it.
- null checks prevent NullPointerException.
- Length checks prevent memory issues.
- Custom exceptions make error handling more specific.
 
**Exercises:**
1. Add validation to ensure a request doesn't contain invalid characters.
2. Create a custom exception for requests that contain profanity.
3. Add validation to the learn method so it rejects empty requests.
4. Challenge: Add validation to ensure a request contains only letters, numbers, and spaces.

## Chapter 16 — Norbert Manages Real Data
Norbert is at his desk, staring at a pile of paperwork. Orders, invoices, tickets — each one has multiple pieces of information: a client name, a date, a status, a priority. He can't just store them as simple text. He needs structure.
 
Structured data is information organized into a clear, predictable format. In Java, structured data is represented by classes with fields.
 
Norbert creates an Order class:
```javapublicclassOrder {
privateint number;private String client;private String description;private String status;private String priority;
publicOrder(int number, String client, String description) {
this.number = number;this.client = client;this.description = description;this.status = "Pending";this.priority = "medium";}
 
publicOrder(int number, String client, String description, String priority) {
this(number, client, description);this.priority = priority;}
 
publicintgetNumber() { return number; }
public String getClient() { return client; }
public String getDescription() { return description; }
public String getStatus() { return status; }
public String getPriority() { return priority; }
 
publicvoidsetStatus(String status) {
if (status != null &amp;&amp; !status.trim().isEmpty()) {
this.status = status;}
}
publicvoiddisplay() {
System.out.println("=== Order #" + number + " ===");System.out.println("Client: " + client);System.out.println("Description: " + description);System.out.println("Status: " + status);System.out.println("Priority: " + priority);}
}
```
Norbert integrates orders into Lya:
```javaprivate HashMap<Integer, Order> orders;privateint nextOrderNumber;
publicLya() {
// ... existing initialization ...
this.orders = newHashMap<>();this.nextOrderNumber = 1001;
// Sample ordersaddOrder("Alice", "Payment issue", "high");addOrder("Bob", "Delivery delay", "medium");}
 
publicvoidaddOrder(String client, String description, String priority) {
Orderorder = newOrder(nextOrderNumber, client, description, priority);orders.put(nextOrderNumber, order);nextOrderNumber++;System.out.println("Order #" + order.getNumber() + " created for " + client);}
 
public Order getOrder(int number) {
return orders.get(number);}
 
publicvoidupdateOrderStatus(int number, String status) {
Orderorder = orders.get(number);if (order != null) {
order.setStatus(status);System.out.println("Order #" + number + " updated to: " + status);} else {
System.out.println("Order #" + number + " not found.");}
}
publicvoidshowOrders() {
if (orders.isEmpty()) {
System.out.println("No orders found.");return;}
System.out.println("--- All Orders ---");for (Order order : orders.values()) {
order.display();}
}
```
**What Norbert remembers:**
- Structured data is organized into clear fields.
- Classes are the natural way to represent structured data in Java.
- Each order has its own fields and behaviors.
- HashMap is great for looking up orders by number.
 
**Exercises:**
1. Add a date field to the Order class.
2. Create a Ticket class with number, client, description, priority, and status fields.
3. Add a method to search for orders by client name.
4. Challenge: Add a method to count orders by status or priority.

## Chapter 17 — Norbert Grows His Data
Norbert is in his garden, planting seeds. He knows he'll have more plants next month than he has today. He needs a way to add new plants without digging up the old ones. His program needs the same flexibility.
 
ArrayList is a collection that can grow and shrink as needed. Unlike arrays, which have a fixed size, ArrayList is flexible.
 
```javaimport java.util.ArrayList;
publicclassLya {
private ArrayList<String> history;private ArrayList<Ticket> tickets;privateint nextTicketNumber;
publicLya() {
// ... existing initialization ...
this.tickets = newArrayList<>();this.nextTicketNumber = 1001;}
 
publicvoidaddTicket(String client, String description, String priority) {
Ticketticket = newTicket(nextTicketNumber, client, description, priority);tickets.add(ticket);nextTicketNumber++;System.out.println("Ticket #" + ticket.getNumber() + " created for " + client);}
 
public Ticket getTicket(int number) {
for (Ticket ticket : tickets) {
if (ticket.getNumber() == number) {
return ticket;}
}
returnnull;}
 
publicvoidupdateTicketStatus(int number, String status) {
Ticketticket = getTicket(number);if (ticket != null) {
ticket.setStatus(status);System.out.println("Ticket #" + number + " updated to: " + status);} else {
System.out.println("Ticket #" + number + " not found.");}
}
publicvoidshowTickets() {
if (tickets.isEmpty()) {
System.out.println("No tickets found.");return;}
System.out.println("--- All Tickets ---");for (Ticket ticket : tickets) {
ticket.display();}
}
}
```
**What Norbert remembers:**
- ArrayList is a dynamic collection.
- It can grow and shrink as needed.
- add() adds items to the end or at a position.
- remove() removes items by value or position.
- get() retrieves items by position.
 
**Exercises:**
1. Create an ArrayList of three favorite movies and print them.
2. Add a method to Lya to remove a ticket by number.
3. Create a method to count tickets by priority.
4. Challenge: Create a method to sort tickets by priority (urgent first).

## Chapter 18 — Norbert Finds What He Needs
Norbert is in his kitchen, looking for a specific spice. He knows it's somewhere in the cupboard, but he doesn't want to search through every jar. He needs a faster way to find things. He looks at his phone. He has hundreds of contacts, but he doesn't scroll through them alphabetically. He types a name and finds it instantly.
 
That's what Lya needs. Sometimes she needs to look up a response by a keyword, or find an order by a number. A list is too slow for that.
 
HashMap stores data as key-value pairs. Each key is associated with a value. You use the key to look up the value.
 
```javaimport java.util.ArrayList;import java.util.HashMap;
publicclassLya {
private HashMap<String, String> responses;private HashMap<Integer, Order> orders;private HashMap<String, ArrayList<Order>> ordersByClient;
publicLya() {
this.responses = newHashMap<>();this.orders = newHashMap<>();this.ordersByClient = newHashMap<>();}
 
publicvoidaddOrder(int number, String client, String description, String priority) {
Orderorder = newOrder(number, client, description, priority);orders.put(number, order);
// Also store by client for fast lookupordersByClient.computeIfAbsent(client, k -> newArrayList<>()).add(order);System.out.println("Order #" + number + " created for " + client);}
 
public Order getOrder(int number) {
return orders.get(number);}
 
public ArrayList<Order> getOrdersByClient(String client) {
return ordersByClient.get(client);}
 
publicvoidshowOrdersByClient(String client) {
ArrayList<Order> clientOrders = ordersByClient.get(client);if (clientOrders == null || clientOrders.isEmpty()) {
System.out.println("No orders for " + client);return;}
System.out.println("--- Orders for " + client + " ---");for (Order order : clientOrders) {
System.out.println("#" + order.getNumber() + ": " + order.getDescription() +
" (" + order.getStatus() + ")");}
}
}
`
``
**What Norbert remembers:**
- HashMap stores key-value pairs.
- Keys are unique; values can be duplicate.
- put(key, value) adds or updates.
- get(key) retrieves a value.
- containsKey(key) checks existence.
 
**Exercises:**
1. Create a map with three keyword-response pairs.
2. Retrieve one response by its key.
3. Add a new key and replace an old one.
4. Challenge: Use HashMap to store user preferences.

## Chapter 19 — Norbert Ensures Uniqueness
Norbert is at a conference, collecting business cards. He meets Alice, takes her card. He meets Bob, takes his card. Later, he meets Alice again — same person, same card. He doesn't want to add Alice's contact twice. He needs to keep only unique contacts.
 
HashSet is a collection that stores unique values. It automatically prevents duplicates.
 
```javaimport java.util.HashSet;
publicclassLya {
private HashSet<String> commands;private HashSet<String> clients;
publicLya() {
this.commands = newHashSet<>();this.clients = newHashSet<>();
// Add known commandscommands.add("hello");commands.add("help");commands.add("goodbye");commands.add("weather");commands.add("orders");commands.add("tickets");
// Add known clientsclients.add("Alice");clients.add("Bob");clients.add("Charlie");}
 
publicbooleanisKnownCommand(String command) {
return commands.contains(command.toLowerCase().trim());}
 
publicvoidaddClient(String client) {
if (clients.add(client)) {
System.out.println("New client added: " + client);} else {
System.out.println("Client already known: " + client);}
}
publicvoidshowCommands() {
System.out.println("--- Known Commands ---");for (String command : commands) {
System.out.println("- " + command);}
}
publicvoidshowClients() {
System.out.println("--- Known Clients ---");for (String client : clients) {
System.out.println("- " + client);}
}
}
```
**What Norbert remembers:**
- HashSet stores unique values.
- Duplicates are automatically ignored.
- add(value) only adds if the value isn't already present.
- contains(value) checks if a value exists.
 
**Exercises:**
1. Create a set with three words and try adding one of them twice.
2. Check whether a value exists before adding it.
3. Use a set to store unique user names.
4. Challenge: Use HashSet to track processed orders.

## Chapter 20 — Norbert Gives Lya a Memory
Norbert is in his study, looking at his bookshelf. Every book is still there, exactly where he left it. He can close his eyes, open them the next day, and the books will still be there. His program doesn't have that luxury. When Lya stops running, everything disappears.
 
Persistence means saving data so it survives after the program ends. In Java, persistence often means files.
 
```javaimport java.io.*;import java.util.ArrayList;import java.util.HashMap;
publicclassLyaStorage {
privatestaticfinalStringRESPONSES_FILE = "lya_responses.txt";privatestaticfinalStringHISTORY_FILE = "lya_history.txt";privatestaticfinalStringSTATUS_FILE = "lya_status.txt";
publicstaticvoidsaveResponses(HashMap<String, String> responses) {
try (PrintWriterwriter = newPrintWriter(newFileWriter(RESPONSES_FILE))) {
for (String key : responses.keySet()) {
writer.println(key + "|||" + responses.get(key));}
System.out.println("Responses saved.");} catch (IOException e) {
System.out.println("Error saving responses: " + e.getMessage());}
}
publicstatic HashMap<String, String> loadResponses() {
HashMap<String, String> responses = newHashMap<>();Filefile = newFile(RESPONSES_FILE);if (!file.exists()) {
return responses;}
try (BufferedReaderreader = newBufferedReader(newFileReader(RESPONSES_FILE))) {
String line;while ((line = reader.readLine()) != null) {
String[] parts = line.split("\\|\\|\\|");if (parts.length == 2) {
responses.put(parts[0], parts[1]);}
}
System.out.println("Responses loaded: " + responses.size() + " entries.");} catch (IOException e) {
System.out.println("Error loading responses: " + e.getMessage());}
return responses;}
 
publicstaticvoidsaveHistory(ArrayList<String> history) {
try (PrintWriterwriter = newPrintWriter(newFileWriter(HISTORY_FILE))) {
for (String entry : history) {
writer.println(entry);}
System.out.println("History saved.");} catch (IOException e) {
System.out.println("Error saving history: " + e.getMessage());}
}
publicstatic ArrayList<String> loadHistory() {
ArrayList<String> history = newArrayList<>();Filefile = newFile(HISTORY_FILE);if (!file.exists()) {
return history;}
try (BufferedReaderreader = newBufferedReader(newFileReader(HISTORY_FILE))) {
String line;while ((line = reader.readLine()) != null) {
history.add(line);}
System.out.println("History loaded: " + history.size() + " entries.");} catch (IOException e) {
System.out.println("Error loading history: " + e.getMessage());}
return history;}
 
publicstaticvoidsaveStatus(int messagesProcessed) {
try (PrintWriterwriter = newPrintWriter(newFileWriter(STATUS_FILE))) {
writer.println(messagesProcessed);} catch (IOException e) {
System.out.println("Error saving status: " + e.getMessage());}
}
publicstaticintloadStatus() {
Filefile = newFile(STATUS_FILE);if (!file.exists()) {
return 0;}
try (BufferedReaderreader = newBufferedReader(newFileReader(STATUS_FILE))) {
Stringline = reader.readLine();if (line != null) {
return Integer.parseInt(line.trim());}
} catch (Exception e) {
System.out.println("Error loading status: " + e.getMessage());}
return 0;}
}
```
Now Lya's constructor loads saved data:
```javapublic Lya() {
this.name = "Lya";this.version = "1.0";
// Load saved datathis.responses = LyaStorage.loadResponses();this.history = LyaStorage.loadHistory();this.messagesProcessed = LyaStorage.loadStatus();
// If no responses exist, add defaultsif (responses.isEmpty()) {
responses.put("hello", "Hello! How can I help you?");responses.put("hi", "Hi there! What can I do for you?");responses.put("help", "I can answer simple questions.");responses.put("goodbye", "Goodbye! See you later!");responses.put("thanks", "You're welcome!");responses.put("who are you", "I'm Lya, an assistant built by Norbert.");}
 
System.out.println("Lya loaded. Responses: " + responses.size() +
", History: " + history.size());}
 
publicvoidsave() {
LyaStorage.saveResponses(responses);LyaStorage.saveHistory(history);LyaStorage.saveStatus(messagesProcessed);System.out.println("Lya saved.");}
```
**What Norbert remembers:**
- Persistence means data survives after the program ends.
- Files are the simplest way to save data in Java.
- FileWriter and PrintWriter write text to files.
- FileReader and BufferedReader read text from files.
- IOException handles file errors.
 
**Exercises:**
1. Save the list of orders to a file and load it at startup.
2. Save the list of tickets to a file and load it at startup.
3. Add a timestamp to each history entry before saving.
4. Challenge: Create a backup of the data file before overwriting it.

## Chapter 21 — Norbert Checks His Work
Norbert is in his workshop, building a chair. He finishes the chair, then sits on it to test it. He rocks back and forth. It holds. He adds weight. It still holds. "I need to do this with my code too," he says.
 
Testing is the practice of checking that code behaves as expected.
 
```javapublicclassTestLya {
publicstaticvoidmain(String[] args) {
System.out.println("Running Lya tests...");testResponseExists();testResponseNotFound();testEmptyRequestRejected();testLearning();testKeywordRecognition();System.out.println("All tests passed!");}
 
publicstaticvoidtestResponseExists() {
Lyalya = newLya();try {
lya.respond("hello");System.out.println("✓ Response exists test passed");} catch (Exception e) {
System.out.println("✗ Response exists test failed: " + e.getMessage());}
}
publicstaticvoidtestResponseNotFound() {
Lyalya = newLya();try {
lya.respond("unknown word");System.out.println("✓ Response not found handled gracefully");} catch (Exception e) {
System.out.println("✗ Response not found test failed: " + e.getMessage());}
}
publicstaticvoidtestEmptyRequestRejected() {
Lyalya = newLya();try {
lya.respond("");System.out.println("✗ Empty request should be rejected");} catch (EmptyRequestException e) {
System.out.println("✓ Empty request properly rejected");} catch (Exception e) {
System.out.println("✗ Empty request test failed: " + e.getMessage());}
}
publicstaticvoidtestLearning() {
Lyalya = newLya();try {
lya.learn("test", "test response");System.out.println("✓ Learning test passed");} catch (Exception e) {
System.out.println("✗ Learning test failed: " + e.getMessage());}
}
publicstaticvoidtestKeywordRecognition() {
Lyalya = newLya();try {
lya.respond("Can you help me?");System.out.println("✓ Keyword recognition test passed");} catch (Exception e) {
System.out.println("✗ Keyword recognition test failed: " + e.getMessage());}
}
}
```
**What Norbert remembers:**
- Testing checks that code works as expected.
- Tests should cover normal cases and error cases.
- Tests give confidence when changing code.
- Regression tests prevent old bugs from coming back.
 
**Exercises:**
1. Write a test that verifies Lya's response to "hello" is correct.
2. Write a test that verifies the learn method works correctly.
3. Write a test that verifies Lya rejects requests over 200 characters.
4. Challenge: Write a test suite for the Order class.

##Chapter 22: Norbert Opens a Window
Norbert is sitting in his living room, looking at his phone. He asks for the weather, and a few seconds later, he gets an answer. That small moment changes how he thinks about Lya, because she could do the same thing: ask another service for information and bring the answer back.
 
What the concept is
Networking lets programs communicate over a network. In Java, this usually means opening a connection, sending a request, and reading a response. For web services, HTTP is the standard way to do that.
 
How Norbert uses it in Lya
Norbert wants Lya to stop pretending she knows everything. Instead of answering weather questions from memory, she can ask a weather service and relay the result. That makes Lya feel much more useful, because she now depends on live data instead of hardcoded replies.
 
Code example
```javaimport java.io.BufferedReader;import java.io.InputStreamReader;import java.net.HttpURLConnection;import java.net.URL;
publicclassWeatherService {
publicstatic String getWeather(String city) {
if (city == null || city.trim().isEmpty()) {
return"Please provide a city name.";}
 
try {
StringapiUrl = "https://example.com/weather?city=" + city.trim().replace(" ", "%20");URLurl = newURL(apiUrl);HttpURLConnectionconnection = (HttpURLConnection) url.openConnection();connection.setRequestMethod("GET");
BufferedReaderreader = newBufferedReader(
newInputStreamReader(connection.getInputStream()));
StringBuilderresponse = newStringBuilder();String line;
while ((line = reader.readLine()) != null) {
response.append(line);}
 
reader.close();connection.disconnect();
return response.toString();} catch (Exception e) {
return"I could not get the weather right now.";}
}
}
```
Note: For simplicity, the examples in this chapter use static methods. In a real project, you would normally use instance methods and dependency injection. We will revisit this in later chapters when we build the full application.
 
Common mistakes or limits
The biggest limit is that real web services are not always available, so Lya must handle errors calmly. Another common mistake is assuming every response will be immediate and perfectly formatted. Norbert also learns that network code needs timeouts, validation, and fallback messages.
 
What Norbert remembers
· Networking lets programs talk to other programs.
· HTTP is the main protocol for web communication.
· Requests go out, responses come back.
· Network code can fail, so errors must be handled.
· Lya can become more useful by asking external services for live data.
 
Exercises
1. Change the code so Lya asks for the weather of two different cities.
2. Add a fallback message when the city name is too short.
3. Make the method return a friendlier message if the request fails.
4. Challenge: Replace the fake URL with a real API and display the returned weather text.
```

## Chapter 23 — Norbert Reads the World's Language
Norbert is reading a letter from a friend. It's structured: sender, date, subject, message. He thinks about the data Lya receives from web services. It often looks like JSON.
 
JSON (JavaScript Object Notation) is a simple text format for storing and exchanging structured data.
 
```javapublicclassLyaProfile {
private String name;private String version;privateboolean active;privateint messagesProcessed;
publicLyaProfile(String name, String version, boolean active, int messagesProcessed) {
this.name = name;this.version = version;this.active = active;this.messagesProcessed = messagesProcessed;}
 
public String toJson() {
return"{" +
"\"name\":\"" + name + "\"," +
"\"version\":\"" + version + "\"," +
"\"active\":" + active + "," +
"\"messagesProcessed\":" + messagesProcessed +
"}";}
}
// Simple JSON parser for educational purposespublicclassSimpleJsonParser {
publicstatic String getString(String json, String key) {
StringsearchKey = "\"" + key + "\"";intkeyIndex = json.indexOf(searchKey);if (keyIndex == -1) returnnull;
intvalueStart = json.indexOf(":", keyIndex) + 1;while (json.charAt(valueStart) == ' ') valueStart++;
if (json.charAt(valueStart) != '"') returnnull;
intvalueEnd = json.indexOf("\"", valueStart + 1);return json.substring(valueStart + 1, valueEnd);}
 
publicstatic Integer getInt(String json, String key) {
StringsearchKey = "\"" + key + "\"";intkeyIndex = json.indexOf(searchKey);if (keyIndex == -1) returnnull;
intvalueStart = json.indexOf(":", keyIndex) + 1;while (json.charAt(valueStart) == ' ') valueStart++;
if (json.charAt(valueStart) == '"') returnnull;
intvalueEnd = valueStart;while (valueEnd < json.length() &amp;&amp;(Character.isDigit(json.charAt(valueEnd)) ||
json.charAt(valueEnd) == '-')) {
valueEnd++;}
 
try {
return Integer.parseInt(json.substring(valueStart, valueEnd));} catch (NumberFormatException e) {
returnnull;}
}
}
```
**What Norbert remembers:**
- JSON is a text format for structured data.
- Objects use {} and arrays use [].
- Keys and strings are in double quotes.
- Values can be strings, numbers, booleans, arrays, or objects.
- JSON is common for web APIs.
 
**Exercises:**
1. Create a JSON string for a book with title, author, and pages.
2. Write a method that extracts the title from a book JSON.
3. Create a JSON string for Lya's current state.
4. Challenge: Write a method that extracts an array from a JSON string.

## Chapter 24 — Norbert Speaks the Web's Language
Norbert is at a restaurant. He looks at the menu, picks a dish, and tells the waiter: "I'll have the pasta." The waiter writes it down, goes to the kitchen, and brings back his food. He realizes: this is exactly how Lya should communicate with web services. She should be able to say "I want this" and get back what she asked for.
 
But the web has its own language. It's called REST.
 
REST is a set of rules for building web APIs. Resources are identified by URLs. HTTP methods define the action.
 
Norbert creates a REST API for Lya:
```javapublicclassLyaAPI {
private HashMap<Integer, Order> orders;private HashMap<Integer, Ticket> tickets;privateint nextOrderId;privateint nextTicketId;
publicLyaAPI() {
this.orders = newHashMap<>();this.tickets = newHashMap<>();this.nextOrderId = 1001;this.nextTicketId = 1;
// Sample dataorders.put(1001, newOrder(1001, "Alice", "Payment issue", "high"));orders.put(1002, newOrder(1002, "Bob", "Delivery delay", "medium"));tickets.put(1, newTicket(1, "Charlie", "Cannot login", "urgent"));tickets.put(2, newTicket(2, "Alice", "Bug in payment", "high"));}
 
public String getOrders() {
StringBuilderresponse = newStringBuilder();response.append("{\"type\":\"orders\",");response.append("\"count\":").append(orders.size()).append(",");response.append("\"data\":[");booleanfirst = true;for (Order order : orders.values()) {
if (!first) response.append(",");response.append(order.toJson());first = false;}
response.append("]}");return response;}
 
public String getOrder(int id) {
Orderorder = orders.get(id);if (order == null) {
return"{\"error\":\"Order not found\"}";}
return order.toJson();}
 
public String createOrder(String client, String description, String priority) {
Orderorder = newOrder(nextOrderId, client, description, priority);orders.put(nextOrderId, order);nextOrderId++;return order.toJson();}
 
public String updateOrder(int id, String status) {
Orderorder = orders.get(id);if (order == null) {
return"{\"error\":\"Order not found\"}";}
order.setStatus(status);return order.toJson();}
 
public String deleteOrder(int id) {
if (orders.containsKey(id)) {
orders.remove(id);return"{\"success\":true,\"message\":\"Order deleted\"}";}
return"{\"error\":\"Order not found\"}";}
}
```
**What Norbert remembers:**
- REST is a set of rules for web APIs.
- Resources are identified by URLs.
- HTTP methods define the action:- GET = read- POST = create- PUT = update- DELETE = delete- Responses are often in JSON format.
 
- REST makes APIs consistent and predictable.
 
**Exercises:**
1. Add a GET endpoint for a single ticket by ID.
2. Add a PUT endpoint to update a ticket's status.
3. Add a DELETE endpoint to delete a ticket.
4. Challenge: Add a GET endpoint that returns orders filtered by client name.

## Chapter 25 — Norbert Puts Lya on the Web
Norbert is looking at his phone. He can access websites, send messages, check the weather, all from a tiny device in his pocket. "Lya should be like that," he says. "She should be accessible from anywhere."
 
A web server is a program that listens for incoming HTTP requests and responds to them. In Java, a web server listens on a specific port, accepts incoming connections, reads the HTTP request, and sends back an HTTP response.
 
Norbert writes his first web server:
```javaimport java.io.*;import java.net.*;
publicclassSimpleServer {
publicstaticvoidmain(String[] args) {
System.out.println("Lya server starting on port 8080...");
try {
ServerSocketserver = newServerSocket(8080);System.out.println("Server ready. Waiting for connections...");
while (true) {
Socketclient = server.accept();System.out.println("Client connected!");
OutputStreamout = client.getOutputStream();Stringresponse = "HTTP/1.1 200 OK\n\n" +
"Hello! I'm Lya. I'm a web server now!";out.write(response.getBytes());
client.close();System.out.println("Client disconnected.");}
} catch (IOException e) {
System.out.println("Error: " + e.getMessage());}
}
}
```
He runs it and opens http://localhost:8080 in his browser. He sees Lya's message.
 
Now he adds routing:
```javapublicclassLyaWebServer {
private LyaAPI api;
publicLyaWebServer() {
this.api = newLyaAPI();}
 
publicvoidstart() {
System.out.println("Lya Web Server on port 8080...");try {
ServerSocketserver = newServerSocket(8080);System.out.println("Server ready.");System.out.println("Try: http://localhost:8080/hello");System.out.println("Try: http://localhost:8080/orders");
while (true) {
Socketclient = server.accept();BufferedReaderreader = newBufferedReader(
newInputStreamReader(client.getInputStream()));
StringrequestLine = reader.readLine();if (requestLine == null) {
client.close();continue;}
 
System.out.println("Request: " + requestLine);Stringresponse = handleRequest(requestLine);
OutputStreamout = client.getOutputStream();StringhttpResponse = "HTTP/1.1 200 OK\n\n" + response;out.write(httpResponse.getBytes());
client.close();System.out.println("Client disconnected.\n");}
} catch (IOException e) {
System.out.println("Error: " + e.getMessage());}
}
private String handleRequest(String requestLine) {
String[] parts = requestLine.split(" ");if (parts.length < 2) {
return"Invalid request";}
 
Stringmethod = parts[0];Stringpath = parts[1];
if (path.equals("/") || path.equals("/hello")) {
return"Hello! I'm Lya. How can I help you?";}
 
if (path.equals("/orders")) {
return api.getOrders();}
 
if (path.matches("/orders/\\d+")) {
intid = Integer.parseInt(path.substring(8));return api.getOrder(id);}
 
if (path.startsWith("/weather/")) {
Stringcity = path.substring(9);return WeatherService.getWeather(city);}
 
if (path.equals("/help")) {
return"Commands:\n/hello\n/orders\n/orders/123\n/weather/Paris\n/help";}
 
return"Not found: " + path + "\nTry /help";}
 
publicstaticvoidmain(String[] args) {
LyaWebServerserver = newLyaWebServer();server.start();}
}
```
**What Norbert remembers:**
- ServerSocket listens for incoming connections.
- Socket represents a connection to a client.
- HTTP requests and responses follow a standard format.
- Routes map URLs to specific behaviors.
- A web server makes Lya accessible from anywhere.
 
**Exercises:**
1. Add a route /time that returns the current time.
2. Add a route /status that returns Lya's current status.
3. Add a route ticket{id} that returns a specific ticket.
4. Challenge: Add support for POST requests to create new orders via the web.

## Chapter 26 — Norbert Handles Many at Once
Norbert is at a busy coffee shop. There's one barista, but she handles customers one after another. When it gets really busy, customers have to wait. He thinks about Lya's web server. Right now, she handles one client at a time. If one client asks for something that takes a few seconds, everyone else waits.
 
A thread is a separate path of execution within a program. Think of it like a worker: the program is the company, each thread is an employee, multiple employees can work at the same time.
 
Norbert creates a multithreaded server:
```javaimport java.io.*;import java.net.*;
publicclassClientHandlerimplementsRunnable {
private Socket client;private LyaAPI api;
publicClientHandler(Socket client, LyaAPI api) {
this.client = client;this.api = api;}
 
@Overridepublicvoidrun() {
StringthreadName = Thread.currentThread().getName();System.out.println("[" + threadName + "] Processing client...");
try {
BufferedReaderreader = newBufferedReader(
newInputStreamReader(client.getInputStream()));
StringrequestLine = reader.readLine();if (requestLine == null) {
client.close();return;}
 
System.out.println("[" + threadName + "] Request: " + requestLine);Stringresponse = handleRequest(requestLine);
OutputStreamout = client.getOutputStream();StringhttpResponse = "HTTP/1.1 200 OK\n\n" + response;out.write(httpResponse.getBytes());
client.close();System.out.println("[" + threadName + "] Client disconnected.\n");
} catch (IOException e) {
System.out.println("[" + threadName + "] Error: " + e.getMessage());}
}
private String handleRequest(String requestLine) {
String[] parts = requestLine.split(" ");if (parts.length < 2) {
return"Invalid request";}
 
Stringpath = parts[1];
if (path.equals("/") || path.equals("/hello")) {
return"Hello! I'm Lya. (Served by " + Thread.currentThread().getName() + ")";}
 
if (path.equals("/orders")) {
return api.getOrders();}
 
if (path.startsWith("/weather/")) {
Stringcity = path.substring(9);return WeatherService.getWeather(city);}
 
return"Not found: " + path;}
}
publicclassMultithreadedServer {
private LyaAPI api;
publicMultithreadedServer() {
this.api = newLyaAPI();}
 
publicvoidstart() {
System.out.println("Lya Multithreaded Server on port 8080...");System.out.println("Multiple clients can connect simultaneously!");
try {
ServerSocketserver = newServerSocket(8080);intclientCount = 0;System.out.println("Server ready.\n");
while (true) {
Socketclient = server.accept();clientCount++;System.out.println("Client #" + clientCount + " connected!");
ClientHandlerhandler = newClientHandler(client, api);Threadthread = newThread(handler);thread.setName("Client-" + clientCount);thread.start();
System.out.println("Thread " + thread.getName() + " started.");}
 
} catch (IOException e) {
System.out.println("Error: " + e.getMessage());}
}
publicstaticvoidmain(String[] args) {
MultithreadedServerserver = newMultithreadedServer();server.start();}
}
```
**What Norbert remembers:**
- Threads allow multiple tasks to run simultaneously.
- A web server can handle each client in a separate thread.
- Thread pools limit the number of concurrent threads.
- Multiple threads make the server more responsive.
 
**Exercises:**
1. Add a route that simulates a 3-second wait and returns a message.
2. Create a counter that tracks total requests handled by the server.
3. Add a route that shows the current number of active threads.
4. Challenge: Create a queue system when the server is busy.

## Chapter 27 — Norbert Remembers His Clients
Norbert walks into his favorite café. The barista smiles and says: "Your usual?" "How did you remember?" Norbert asks. "I remember all my regulars," she says. His program needs the same ability. When a client makes a request, the server should recognize them.
 
A session is a way to remember a client between multiple requests. Think of it like a membership card: you visit a store, they give you a card, every time you return you show the card, and the store looks you up and remembers your preferences.
 
Norbert creates a session system:
```javaimport java.util.HashMap;import java.util.UUID;
publicclassSession {
private String id;private String username;private HashMap<String, Object> data;privatelong lastActivity;privatestaticfinallongTIMEOUT = 300000;
publicSession(String username) {
this.id = UUID.randomUUID().toString();this.username = username;this.data = newHashMap<>();this.lastActivity = System.currentTimeMillis();}
 
public String getId() { return id; }
public String getUsername() { return username; }
 
publicvoidsetData(String key, Object value) {
data.put(key, value);lastActivity = System.currentTimeMillis();}
 
public Object getData(String key) {
lastActivity = System.currentTimeMillis();return data.get(key);}
 
publicbooleanisExpired() {
return System.currentTimeMillis() - lastActivity > TIMEOUT;}
 
publicvoidtouch() {
lastActivity = System.currentTimeMillis();}
}
```
And a session manager:
```javaimport java.util.HashMap;import java.util.Map;
publicclassSessionManager {
privatestatic SessionManager instance;private Map<String, Session> sessions;private Map<String, String> sessionsByUser;
privateSessionManager() {
this.sessions = newHashMap<>();this.sessionsByUser = newHashMap<>();}
 
publicstatic SessionManager getInstance() {
if (instance == null) {
instance = newSessionManager();}
return instance;}
 
public Session createSession(String username) {
Sessionsession = newSession(username);sessions.put(session.getId(), session);sessionsByUser.put(username, session.getId());return session;}
 
public Session getSession(String sessionId) {
if (sessionId == null) returnnull;Sessionsession = sessions.get(sessionId);if (session != null&& !session.isExpired()) {
session.touch();return session;}
returnnull;}
}
```
Now the session-aware client handler:
```javapublicclassSessionClientHandlerimplementsRunnable {
private Socket client;private SessionManager sessionManager;
publicSessionClientHandler(Socket client) {
this.client = client;this.sessionManager = SessionManager.getInstance();}
 
private String extractSessionId(String requestLine) {
if (requestLine.contains("session=")) {
intstart = requestLine.indexOf("session=") + 8;intend = requestLine.indexOf(" ", start);if (end == -1) end = requestLine.length();return requestLine.substring(start, end);}
returnnull;}
 
@Overridepublicvoidrun() {
try {
BufferedReaderreader = newBufferedReader(
newInputStreamReader(client.getInputStream()));
StringrequestLine = reader.readLine();if (requestLine == null) {
client.close();return;}
 
StringsessionId = extractSessionId(requestLine);Stringresponse = handleRequest(requestLine, sessionId);
OutputStreamout = client.getOutputStream();out.write(("HTTP/1.1 200 OK\n\n" + response).getBytes());
client.close();
} catch (IOException e) {
System.out.println("Error: " + e.getMessage());}
}
private String handleRequest(String requestLine, String sessionId) {
String[] parts = requestLine.split(" ");if (parts.length < 2) return"Invalid request";
Stringpath = parts[1];
if (path.startsWith("/login")) {
Stringusername = extractUsername(path);if (username == null) {
return"Please provide a username: /login?username=Norbert";}
 
Sessionsession = sessionManager.createSession(username);return"Welcome " + username + "! Your session: " + session.getId().substring(0, 8);}
 
Sessionsession = null;if (sessionId != null) {
session = sessionManager.getSession(sessionId);}
 
if (session == null) {
return"Please log in first: /login?username=YourName";}
 
Stringusername = session.getUsername();
if (path.equals("/")) {
return"Hello, " + username + "!";}
 
if (path.startsWith("/add")) {
Stringitem = extractItem(path);if (item != null) {
java.util.ArrayList<String> cart =
(java.util.ArrayList<String>) session.getData("cart");if (cart == null) {
cart = newjava.util.ArrayList<>();}
cart.add(item);session.setData("cart", cart);return"Added " + item + " to your cart.";}
}
if (path.equals("/cart")) {
java.util.ArrayList<String> cart =
(java.util.ArrayList<String>) session.getData("cart");if (cart == null || cart.isEmpty()) {
return"Your cart is empty, " + username + ".";}
return username + "'s cart:\n" + cart.toString();}
 
return"Unknown command";}
 
private String extractUsername(String path) {
if (path.contains("username=")) {
intstart = path.indexOf("username=") + 9;intend = path.indexOf("&amp;", start);if (end == -1) end = path.length();return path.substring(start, end);}
returnnull;}
 
private String extractItem(String path) {
if (path.contains("item=")) {
intstart = path.indexOf("item=") + 5;intend = path.indexOf("&amp;", start);if (end == -1) end = path.length();return path.substring(start, end);}
returnnull;}
}
```
**What Norbert remembers:**
- Sessions remember clients between requests.
- A session ID is a unique identifier.
- The server stores session data.
- The client sends the session ID with each request.
- Sessions expire after a period of inactivity.
 
**Exercises:**
1. Add a visit counter that tracks how many times a user visits.
2. Add the user's name to every response.
3. Add a session expiration warning.
4. Challenge: Add a "remember me" option.

## Chapter 28 — Norbert Saves Sessions
Norbert is closing his laptop for the night. He's been testing Lya's session system, and it works — but only while the server is running. When he stops the server and starts it again, all sessions disappear.
 
Persistent sessions save session data to disk so it survives server restarts. Norbert creates a class to save and load session data.
 
```javaimport java.io.*;import java.util.ArrayList;
publicclassSessionStorage {
privatestaticfinalStringSESSION_FILE = "sessions.txt";privatestaticfinalStringSEPARATOR = "|||";
publicstaticvoidsaveSession(String sessionId, String username,String cartData, long lastActivity) {
try (PrintWriterwriter = newPrintWriter(newFileWriter(SESSION_FILE, true))) {
writer.println(sessionId + SEPARATOR + username + SEPARATOR +
cartData + SEPARATOR + lastActivity);} catch (IOException e) {
System.out.println("Error saving session: " + e.getMessage());}
}
publicstatic ArrayList<String[]> loadSessions() {
ArrayList<String[]> sessions = newArrayList<>();Filefile = newFile(SESSION_FILE);if (!file.exists()) {
return sessions;}
try (BufferedReaderreader = newBufferedReader(newFileReader(file))) {
String line;while ((line = reader.readLine()) != null) {
String[] parts = line.split("\\|\\|\\|");if (parts.length == 4) {
sessions.add(parts);}
}
} catch (IOException e) {
System.out.println("Error loading sessions: " + e.getMessage());}
return sessions;}
 
publicstaticvoidclearAllSessions() {
try (PrintWriterwriter = newPrintWriter(newFileWriter(SESSION_FILE))) {
// Empty the file} catch (IOException e) {
System.out.println("Error clearing sessions: " + e.getMessage());}
}
}
```
And updates SessionManager to load and save:
```javaprivatevoidloadFromDisk() {
ArrayList<String[]> loaded = SessionStorage.loadSessions();System.out.println("Loading " + loaded.size() + " saved sessions...");
for (String[] parts : loaded) {
StringsessionId = parts[0];Stringusername = parts[1];StringcartData = parts[2];longlastActivity = Long.parseLong(parts[3]);
if (System.currentTimeMillis() - lastActivity < TIMEOUT) {
Sessionsession = newSession(username);session.setLastActivity(lastActivity);
if (!cartData.isEmpty()) {
String[] cartItems = cartData.split(",");java.util.ArrayList<String> cart = newjava.util.ArrayList<>();for (String item : cartItems) {
if (!item.isEmpty()) {
cart.add(item);}
}
session.setData("cart", cart);}
 
sessions.put(sessionId, session);sessionsByUser.put(username, sessionId);}
}
System.out.println("Loaded " + sessions.size() + " valid sessions.");}
 
publicvoidsaveToDisk() {
SessionStorage.clearAllSessions();for (Session session : sessions.values()) {
StringcartData = "";java.util.ArrayList<String> cart =
(java.util.ArrayList<String>) session.getData("cart");if (cart != null&& !cart.isEmpty()) {
cartData = String.join(",", cart);}
 
SessionStorage.saveSession(
session.getId(),session.getUsername(),cartData,session.getLastActivity());}
System.out.println("Sessions saved to disk.");}
```
**What Norbert remembers:**
- Persistent sessions survive server restarts.
- Session data can be saved to files.
- Loading from disk restores sessions.
- Expired sessions should be filtered out when loading.
 
**Exercises:**
1. Save user preferences in the session.
2. Add a timestamp to the session file format.
3. Create a backup of the session file before overwriting.
4. Challenge: Implement session data compression.

## Chapter 29 — Norbert Discovers Databases
Norbert is looking at his filing cabinet. He has folders for clients, orders, tickets, and notes. He can find anything quickly because everything is organized. His current system is like a drawer of papers. It works, but searching is slow. He needs a better way to organize data.
 
A database is an organized collection of data. Think of it like a filing cabinet: the cabinet is the database, each drawer is a table, each folder is a row, and each piece of paper is a column.
 
Norbert adds SQLite to his project:
```javaimport java.sql.*;
publicclassDatabase {
private Connection connection;
publicDatabase() {
try {
Class.forName("org.sqlite.JDBC");connection = DriverManager.getConnection("jdbc:sqlite:lya.db");createTables();System.out.println("Database connected.");} catch (Exception e) {
System.out.println("Database error: " + e.getMessage());}
}
privatevoidcreateTables() {
try {
Statementstmt = connection.createStatement();
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
System.out.println("Tables created.");} catch (SQLException e) {
System.out.println("Table creation error: " + e.getMessage());}
}
publicvoidsaveOrder(Order order) {
try {
PreparedStatementstmt = connection.prepareStatement(
"INSERT OR REPLACE INTO orders (id, client, description, status, priority) " +
"VALUES (?, ?, ?, ?, ?)"
);stmt.setInt(1, order.getNumber());stmt.setString(2, order.getClient());stmt.setString(3, order.getDescription());stmt.setString(4, order.getStatus());stmt.setString(5, order.getPriority());stmt.executeUpdate();} catch (SQLException e) {
System.out.println("Save order error: " + e.getMessage());}
}
public Order getOrder(int id) {
try {
PreparedStatementstmt = connection.prepareStatement(
"SELECT * FROM orders WHERE id = ?"
);stmt.setInt(1, id);ResultSetrs = stmt.executeQuery();if (rs.next()) {
returnnewOrder(
rs.getInt("id"),rs.getString("client"),rs.getString("description"),rs.getString("status"),rs.getString("priority"));}
} catch (SQLException e) {
System.out.println("Get order error: " + e.getMessage());}
returnnull;}
 
public ArrayList<Order> getOrdersByClient(String client) {
ArrayList<Order> orders = newArrayList<>();try {
PreparedStatementstmt = connection.prepareStatement(
"SELECT * FROM orders WHERE client = ?"
);stmt.setString(1, client);ResultSetrs = stmt.executeQuery();while (rs.next()) {
Orderorder = newOrder(
rs.getInt("id"),rs.getString("client"),rs.getString("description"),rs.getString("status"),rs.getString("priority"));orders.add(order);}
} catch (SQLException e) {
System.out.println("Get orders error: " + e.getMessage());}
return orders;}
 
publicvoidsaveHistory(String userMessage, String lyResponse) {
try {
PreparedStatementstmt = connection.prepareStatement(
"INSERT INTO history (user_message, ly_response) VALUES (?, ?)"
);stmt.setString(1, userMessage);stmt.setString(2, lyResponse);stmt.executeUpdate();} catch (SQLException e) {
System.out.println("Save history error: " + e.getMessage());}
}
}
```
**What Norbert remembers:**
- A database stores structured, long-term data.
- Tables, rows, and columns are the basic building blocks.
- Databases are better than files for many kinds of application data.
- SQL is the language used to interact with databases.
 
**Exercises:**
1. Create a users table in the database.
2. Add a method to get all orders from the database.
3. Add a method to delete an order from the database.
4. Challenge: Add a method to update an order in the database.

##Chapter 30: Norbert Bridges Objects and Databases
Norbert now has Java objects on one side and database tables on the other. They represent the same ideas, but he does not want to write repetitive code every time he saves or loads data.
 
What the concept is
ORM means Object-Relational Mapping. It connects Java objects to database rows, so the program can work with objects while the ORM translates them into database operations. JPA is one common Java standard for doing that.
 
How Norbert uses it in Lya
Instead of manually writing SQL for every order, Norbert can model orders as Java entities and let the persistence layer handle the mapping. That makes Lya cleaner and easier to maintain.
 
Code example
```javaimport javax.persistence.*;
@Entity@Table(name = "orders")publicclassOrder {
@Id@GeneratedValue(strategy = GenerationType.IDENTITY)privateint id;
@Column(nullable = false)private String client;
private String description;private String status;private String priority;
publicOrder() {
}
publicOrder(String client, String description, String priority) {
this.client = client;this.description = description;this.status = "Pending";this.priority = priority;}
 
publicintgetId() {
return id;}
 
public String getClient() {
return client;}
 
public String getDescription() {
return description;}
 
public String getStatus() {
return status;}
 
public String getPriority() {
return priority;}
 
publicvoidsetStatus(String status) {
this.status = status;}
}
```
Note: To use JPA in a real project, you need to add a dependency like Hibernate to your pom.xml (or build.gradle). We will cover build tools in Chapter 33.
 
Common mistakes or limits
ORM is helpful, but it is not magic. Norbert still needs to understand the database underneath, especially when queries become more complex. He also learns that entity classes need a default constructor and clean field mapping.
 
What Norbert remembers
· ORM maps objects to database tables.
· JPA is a Java standard for ORM.
· Entities represent database rows as Java objects.
· ORM reduces manual SQL.
· The database still matters, even with ORM.
 
Exercises
1. Create a Ticket entity.
2. Create a repository for Ticket.
3. Add a method to find tickets by priority.
4. Challenge: Add a method to find orders by date range.
```

## Chapter 31 — Norbert Learns to Share
Norbert has built Lya alone. She works on his computer. She remembers things. She can even answer web requests. But something is missing. He looks at his email. He sees pull requests, code reviews, team discussions. Real software isn't built by one person in a room. It's built by teams.
 
Collaboration means working with others to build something together. In software, collaboration involves sharing code, reviewing each other's work, communicating clearly, and respecting different approaches.
 
A code review is when another developer reads your code before it's merged. Code reviews catch bugs, improve quality, share knowledge, enforce consistency, and ensure accountability.
 
Norbert learns the basics of a good code review:
```java// ❌ Bad review"This is wrong."
 
// ✅ Better review"The logic looks correct. Could we extract this calculation into a separate method to make it more readable?"
 
// ❌ Bad review"Fix this."
 
// ✅ Better review
 
"There's a potential null pointer here. We should add a null check before accessing the object."
```
**What Norbert remembers:**
- Collaboration is essential in real software development.
- Code reviews catch bugs and improve quality.
- Pull requests are how changes are proposed and reviewed.
- Good reviews are specific and helpful.
 
**Exercises:**
1. Write a code review for a method that calculates the average of numbers.
2. Describe what a pull request is for.
3. Think of one way a team could avoid misunderstandings in Lya.
4. Challenge: Write a code review for the findResponse method.

## Chapter 32 — Norbert Tracks Changes
Norbert is looking at his code. He's made changes. He's fixed bugs. He's added features. But he can't remember exactly what he changed, or when. "Imagine if I couldn't remember what I wrote yesterday," he says. "I'd be lost."
 
Git is a version control system. It tracks changes to your code over time. Think of it like a time machine for your project: you save snapshots (commits), you can go back to any snapshot, you can see what changed, and you can work on different versions at the same time (branches).
 
Norbert learns the essential Git commands:
```bash# Initialize a repositorygit init
# Check the statusgit status
# Add files to staginggit add .
git add Lya.java
# Commit changesgit commit -m "Add keyword recognition to Lya"
 
# See the historygit loggit log --oneline
# See what changedgit diff
# Create a branchgit branch feature-weather
# Switch to a branchgit checkout feature-weather
# Or create and switch in one commandgit checkout -b feature-weather
# Merge a branchgit checkout maingit merge feature-weather
# Delete a branchgit branch -d feature-weather```
 
**What Norbert remembers:**
- Git tracks changes to your code.
- A commit is a snapshot of your project.
- Branches letyou work on features separately.
- Merging brings work back together.
 
**Exercises:**
1. Initialize a Git repository for Lya.
2. Make three commits with meaningful messages.
3. Create a branch, make changes, and merge it.
4. Challenge: Use git log to explore the history.

## Chapter 33 — Norbert Goes Remote
Norbert is looking at his local Git repository. It's organized. He can track changes, create branches, and merge work. But he's the only one who can see it. "Imagine if a book was only available in one person's notebook," he says. "It wouldn't be a real book. It would just be a draft."
 
GitHub is a platform for hosting Git repositories online. Think of it like a library: your code is the book, GitHub is the library shelf, and anyone with access can read it.
 
Norbert learns the basic remote commands:
```bash# Add a remote repositorygit remote add origin https://github.com/norbert/lya.git
# Push changes to remotegit push -u origin main
# Pull changes from remotegit pull
# Clone a repositorygit clone https://github.com/norbert/lya.git```
 
The typical collaboration workflow:
1. Fork the project.
2. Clone it locally.
3. Create a branch.
4. Make changes.
5. Commit and push.
6. Open a pull request.
7. Review and merge.
 
```bash# Fork on GitHub, then clonegit clone https://github.com/norbert/lya.git
# Create a branchgit checkout -b feature-improvement
# Make changes, commitgit add .
git commit -m "Improve keyword recognition"
 
# Push to remotegit push origin feature-improvement
# Open a pull request on GitHub```
 
Norbert also creates a .gitignore file:
```
# .gitignore*.class*.jar*.logbuild/
target/
*.db*.sqlite*.iml.idea/
.DS_Store```
 
**What Norbert remembers:**
- GitHub hosts Git repositories online.
- push sends changes to the remote.
- pull brings changes from the remote.
- Remote repositories enable collaboration.
- .gitignore excludes files that shouldn't be tracked.
 
**Exercises:**
1. Explain the difference between Git and GitHub.
2. Describe what push and pull do.
3. Think of one reason why a remote repository is useful.
4. Challenge: Create a .gitignore file for a Java project.

## Chapter 34 — Norbert Automates His Build
Norbert is tired of compiling and running Lya manually every time he makes a change. He has tests to run, dependencies to manage, and a JAR to package. Doing all of this manually is slow and error-prone.
 
Maven and Gradle are tools that automate important tasks in a Java project. They help Norbert compile the code, run tests, manage dependencies, and package the application.
 
Norbert creates a Maven project structure:
```
lya/
├── pom.xml├── src/
│ ├── main/
│ │ └── java/
│ │ └── com/norbert/lya/
│ │ └── *.java│ └── test/
│ └── java/
│ └── com/norbert/lya/
│ └── *.java```
 
He creates the pom.xml file:
```xml<?xml version="1.0" encoding="UTF-8"?><project xmlns="http://maven.apache.org/POM/4.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
http://maven.apache.org/xsd/maven-4.0.0.xsd"><modelVersion>4.0.0</modelVersion>
<groupId>com.norbert</groupId><artifactId>lya</artifactId><version>1.0.0</version><packaging>jar</packaging>
<properties><maven.compiler.source>17</maven.compiler.source><maven.compiler.target>17</maven.compiler.target><project.build.sourceEncoding>UTF-8</project.build.sourceEncoding></properties>
 
<dependencies><dependency><groupId>org.xerial</groupId><artifactId>sqlite-jdbc</artifactId><version>3.41.2.2</version></dependency><dependency><groupId>org.junit.jupiter</groupId><artifactId>junit-jupiter</artifactId><version>5.9.2</version><scope>test</scope></dependency></dependencies>
<build><plugins><plugin><groupId>org.apache.maven.plugins</groupId><artifactId>maven-compiler-plugin</artifactId><version>3.11.0</version></plugin><plugin><groupId>org.apache.maven.plugins</groupId><artifactId>maven-jar-plugin</artifactId><version>3.3.0</version><configuration><archive><manifest><mainClass>com.norbert.lya.LyaServer</mainClass></manifest></archive></configuration></plugin></plugins></build></project>```
 
He learns the essential Maven commands:
```bash# Clean and compilemvn clean compile
# Run testsmvn test
# Package JAR
mvn package
# Install to local repositorymvn install
# Run the applicationjava -jar target/lya-1.0.0.jar```
 
**What Norbert remembers:**
- Maven and Gradle automate Java build tasks.
- Dependencies are external libraries used by the project.
- Maven uses a pom.xml file for configuration.
- Gradle uses a build.gradle file (more flexible).
- Build tools make projects more professional.
 
**Exercises:**
1. Create a Maven project for Lya.
2. Add a dependency to pom.xml.
3. Build a JAR file with Maven.
4. Challenge: Add the Maven JAR plugin.

## Chapter 35 — Norbert Packages Lya
Norbert has built Lya. She works on his computer. She has tests, a database, a web server, and a build system. But she's still a collection of files. He can't just hand her to someone else. "I need to package her," he says. "One file. Ready to run."
 
A JAR (Java Archive) file packages a Java application into a single file. Think of it like a suitcase: all your code is packed inside, all your resources are packed inside, you can carry it anywhere, and it runs with one command.
 
Norbert's pom.xml already has the JAR plugin configured. He runs:
```bashmvn clean package```
 
A `lya-1.0.0.jar` file appears in the `target/` directory. He runs it:
```bashjava -jar target/lya-1.0.0.jar```
 
Lya starts up as a web server. She's ready to go.
 
He looks inside the JAR:
```bashjar tf target/lya-1.0.0.jar```
 
He sees all the compiled classes inside. The MANIFEST.MF tells Java which class to run.
 
But his JAR doesn't include dependencies. If he runs it, Java might not find SQLite or other libraries. He needs a fat JAR — one that includes all dependencies.
 
With Maven, he adds the assembly plugin:
```xml<plugin><groupId>org.apache.maven.plugins</groupId><artifactId>maven-assembly-plugin</artifactId><version>3.5.0</version><configuration><archive><manifest><mainClass>com.norbert.lya.LyaServer</mainClass></manifest></archive><descriptorRefs><descriptorRef>jar-with-dependencies</descriptorRef></descriptorRefs></configuration><executions><execution><id>make-assembly</id><phase>package</phase><goals><goal>single</goal></goals></execution></executions></plugin>```
 
Now he runs:
```bashmvn clean package```
 
The fat JAR appears: `lya-1.0.0-jar-with-dependencies.jar`
 
He can share this single file with anyone.
 
**What Norbert remembers:**
- A JAR packages a Java application.
- The MANIFEST.MF tells Java which class to run.
- A fat JAR includes all dependencies.
- One file is easier to share than many files.
 
**Exercises:**
1. Create a JAR file for Lya.
2. Add a manifest file.
3. Create a fat JAR with dependencies.
4. Challenge: Create a runnable script to launch the JAR.

## Chapter 36 — Norbert Deploys Lya
Norbert has Lya packaged as a JAR. He can share it with anyone. But they still need Java installed, and they need to run it manually. He wants Lya to be available on the internet. He wants anyone to be able to access her.
 
Deployment means making your application available to users. Think of it like opening a restaurant: you don't cook in your kitchen at home, you set up a restaurant (the server), and customers come to the restaurant.
 
Norbert considers different deployment options:- VPS (Virtual Private Server) — full control, more management- PaaS (Platform as a Service) — less management, scalable- Container (Docker) — consistent environment, portable- Cloud Functions — pay per use, automatic scaling
He creates a Dockerfile:
```dockerfileFROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/lya-1.0.0-jar-with-dependencies.jar app.jar
EXPOSE 8080
 
ENTRYPOINT ["java", "-jar", "app.jar"]
```
He builds and runs it:
```bashdocker build -t lya:latest .
docker run -p 8080:8080 lya:latest```
 
Now Lya runs in a container. She's isolated, consistent, and portable.
 
He adds a database to his deployment with Docker Compose:
```yamlversion: '3.8'
services:lya:build: .
ports:- "8080:8080"
environment:- DB_URL=jdbc:sqlite:/app/data/lya.dbvolumes:- ./data:/app/datarestart: unless-stopped```
 
He deploys to a cloud platform like Render.com:
1. Push code to GitHub.
2. Connect GitHub to Render.
3. Configure build settings:- Build Command: `mvn clean package`
- Start Command: `java -jar target/lya-*.jar`
4. Deploy.
 
```bash# Render automatically builds and deploys on every pushgit push origin main```
 
Lya is now available at a public URL.
 
**What Norbert remembers:**
- Deployment makes Lya available to users.
- Docker provides a consistent environment.
- Cloud platforms can host Java applications.
- CI/CD automates deployment.
- Lya is now a real web service.
 
**Exercises:**
1. Create a Dockerfile for Lya.
2. Deploy Lya to a cloud platform.
3. Add a health check endpoint.
4. Challenge: Set up a CI/CD pipeline.

Chapter 37: Norbert Starts Testing
In Chapter 21, Norbert learned to test with simple assertions. Now he is ready for a more professional approach: unit tests with JUnit.
 
Norbert changes code often, and each change can break something else. He needs a way to check that the important parts still work. That means tests.
 
What the concept is
Testing checks whether code behaves as expected. Unit tests focus on small pieces of behavior, while higher-level tests check bigger flows.
 
How Norbert uses it in Lya
Norbert wants to verify that Lya's response logic, validators, and data handling still work after every change. Tests help him move faster without breaking old behavior.
 
Code example
```javaimport org.junit.jupiter.api.Test;importstatic org.junit.jupiter.api.Assertions.*;
publicclassLyaTest {
 
@TestvoidshouldRecognizeHello() {
Lyalya = newLya();assertEquals("Hello! How can I help you?", lya.getResponse("hello"));}
 
@TestvoidshouldRejectEmptyRequest() {
Lyalya = newLya();assertThrows(EmptyRequestException.class, () -> lya.respond(""));}
}
```
Common mistakes or limits
Tests should be small and focused. Norbert also learns that tests should not depend on each other or on random external conditions.
 
What Norbert remembers
· Testing checks expected behavior.
· Unit tests focus on small parts.
· Assertions compare actual and expected results.
· Tests protect against regressions.
· Good tests are repeatable.
 
Exercises
1. Add a test for the help command.
2. Add a test for an unknown command.
3. Add a test for the learning feature.
4. Challenge: Write a test for a validation error.
```

## Chapter 38 — Norbert Plans the Future
Norbert has built a lot. Lya can talk, remember, store data, and run as a web service. She's tested, logged, and deployed. But what's next?
 
He looks at the project and sees both its strengths and its limits.
 
He makes a list of Lya's capabilities:
| Feature | Status |
|---------|--------|
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
 
He sees the limits:
| Limitation | Why it matters |
|------------|----------------|
| Exact keyword matching only | She can't understand natural language |
| No context | She forgets the conversation |
| No learning | She only learns what she's explicitly taught |
| No personalization | She treats every user the same |
 
He writes down ideas for the future:
1. Better understanding — Use NLP libraries, recognize intent not just keywords.
2. Context awareness — Remember conversation history, understand follow-up questions.
3. Continuous learning — Learn from corrections, build a knowledge base over time.
4. Personalization — Remember user preferences, adapt to different users.
5. AI Integration — Add a chatbot API, generate responses intelligently.
 
He creates a roadmap:
```
v1.0 ✅
- Basic responses- Keywords- Orders and tickets- Web server- Database
v1.1 → Now- Better keyword matching- Learning mode- User sessions- Deployment
v1.2 → Next- Intent recognition- Conversation context- More API endpoints
v2.0 → Future- AI integration- Natural language understanding- Personalization```
 
**What Norbert remembers:**
- Lya is complete for now, but there's always more.
- Natural language understanding is the next big step.
- A roadmap helps prioritize improvements.
- AI could make Lya much more useful.
 
**Exercises:**
1. Create a roadmap for Lya's future development.
2. Prioritize three features you would add next.
3. Write a user story for one new feature.
4. Challenge: Create a prototype of a new feature.

## Chapter 39 — Norbert Considers AI
Norbert is thinking about Lya's future. She works well with rules. If she sees a keyword, she responds. If she doesn't, she says she doesn't understand. But that's limited. People don't always use the exact right words.
 
He wonders: could AI help Lya understand better?
 
AI (Artificial Intelligence) is a broad field. For Lya, the most relevant area is Natural Language Processing (NLP) — the ability to understand and generate human language.
 
Norbert learns about different approaches:
| Approach | Description |
|----------|-------------|
| Rule-based | What Lya does now. Works but limited. |
| Pattern matching | More advanced than simple keywords. |
| Machine learning | Learn patterns from data. |
| Deep learning | Use neural networks for understanding. |
| LLM (Large Language Model) | Like GPT — understands and generates natural language. |
 
He experiments with a simple intent recognizer:
```javapublicclassIntentRecognizer {
private HashMap<String, String> intents;
publicIntentRecognizer() {
this.intents = newHashMap<>();intents.put("hello", "greeting");intents.put("hi", "greeting");intents.put("bye", "goodbye");intents.put("goodbye", "goodbye");intents.put("help", "help");intents.put("weather", "weather");intents.put("temperature", "weather");intents.put("order", "order");intents.put("ticket", "ticket");}
 
public String recognizeIntent(String request) {
String[] words = request.toLowerCase().split(" ");for (String word : words) {
if (intents.containsKey(word)) {
return intents.get(word);}
}
return"unknown";}
}
```
Now Lya can recognize intent, not just keywords:
```javaString intent = recognizer.recognizeIntent("I want to check the weather");// Returns "weather"
```
**What Norbert remembers:**
- AI could make Lya much more useful.
- NLP helps understand natural language.
- Intent recognition is a first step.
- Machine learning could help Lya learn.
 
**Exercises:**
1. Add more intents to the IntentRecognizer.
2. Create a response system based on intents.
3. Research different NLP libraries for Java.
4. Challenge: Connect to a simple AI API.

## Chapter 40 — Norbert Adds Intelligence
Norbert has decided: Lya should become smarter. But he doesn't want to replace her current system. He wants to add intelligence gradually. "I'll start small," he says. "A little memory. A little learning. Then maybe an AI model later."
 
He creates a simple learning system:
```javapublicclassLearningMemory {
private HashMap<String, String> knowledge;private HashMap<String, Integer> confidence;
publicLearningMemory() {
this.knowledge = newHashMap<>();this.confidence = newHashMap<>();}
 
public String getResponse(String request) {
Stringclean = request.toLowerCase().trim();if (knowledge.containsKey(clean)) {
return knowledge.get(clean);}
returnnull;}
 
publicvoidlearn(String request, String response) {
Stringclean = request.toLowerCase().trim();knowledge.put(clean, response);confidence.put(clean, 1);System.out.println("Lya learned: " + clean + " → " + response);}
 
publicvoidreinforce(String request) {
Stringclean = request.toLowerCase().trim();if (confidence.containsKey(clean)) {
confidence.put(clean, confidence.get(clean) + 1);}
}
}
```
He upgrades Lya's response system with intent-based responses:
```javapublic class Lya {
private LearningMemory memory;private IntentRecognizer recognizer;private HashMap<String, String> baseResponses;private HashMap<String, ArrayList<String>> responseVariations;
public Lya() {
this.memory = new LearningMemory();this.recognizer = new IntentRecognizer();this.baseResponses = new HashMap<>();this.responseVariations = new HashMap<>();initializeBaseResponses();initializeVariations();}
 
private void initializeVariations() {
ArrayList<String> greetings = new ArrayList<>();greetings.add("Hello! How can I help you?");greetings.add("Hi there! What can I do for you?");greetings.add("Hey! Nice to see you!");responseVariations.put("greeting", greetings);
ArrayList<String> goodbye = newArrayList<>();goodbye.add("Goodbye! See you later!");goodbye.add("Bye! Come back soon!");goodbye.add("See you next time!");responseVariations.put("goodbye", goodbye);}
 
publicvoidrespond(String request) {
// Check memory firstStringremembered = memory.getResponse(request);if (remembered != null) {
System.out.println("Lya: " + remembered);memory.reinforce(request);return;}
 
// Recognize intentStringintent = recognizer.recognizeIntent(request);
if (intent.equals("unknown")) {
System.out.println("Lya: I don't understand that yet.");System.out.println("Lya: You can teach me with: 'learn [request] | [response]'");return;}
 
// Get a variationStringresponse = getVariation(intent);if (response != null) {
System.out.println("Lya: " + response);} else {
System.out.println("Lya: I don't have a response for that.");}
}
private String getVariation(String intent) {
ArrayList<String> variations = responseVariations.get(intent);if (variations == null || variations.isEmpty()) {
return baseResponses.get(intent);}
intindex = (int)(Math.random() * variations.size());return variations.get(index);}
}
```
Now Lya is smarter. She can learn, recognize intent, and respond with variations.
 
**What Norbert remembers:**
- Memory helps Lya learn from conversations.
- Intent recognition is better than keyword matching.
- Varied responses make Lya feel more alive.
- Start small and add intelligence gradually.
 
**Exercises:**
1. Add more intent categories to the recognizer.
2. Add a confidence score to learning.
3. Create a feedback mechanism for learning.
4. Challenge: Connect to a simple AI API for responses.

## Chapter 41 — Norbert Secures Lya
Norbert already knows how to save data to files (Chapter 20). Now he wants to go further. He wants to save entire objects — responses, history, and even complex data structures — in a way that is easy to load back.
 
This is called serialization. It turns objects into bytes that can be saved to a file and restored later.
 
Security means protecting your application and its data from unauthorized access. Think of it like a house: you lock the doors (authentication), you decide who can enter which rooms (authorization), you keep valuables in a safe (encryption), and you check who tried to break in (logging).
 
Norbert adds authentication:
```javaimport java.util.HashMap;import java.security.MessageDigest;import java.security.NoSuchAlgorithmException;import java.util.Base64;
publicclassAuthService {
private HashMap<String, String> users; // username -> hashed passwordprivate HashMap<String, String> tokens; // token -> username
publicAuthService() {
this.users = newHashMap<>();this.tokens = newHashMap<>();createUser("norbert", "securepassword123");createUser("alice", "alice789");}
 
publicvoidcreateUser(String username, String password) {
Stringhashed = hashPassword(password);users.put(username, hashed);System.out.println("User created: " + username);}
 
private String hashPassword(String password) {
try {
MessageDigestmd = MessageDigest.getInstance("SHA-256");byte[] hash = md.digest(password.getBytes());return Base64.getEncoder().encodeToString(hash);} catch (NoSuchAlgorithmException e) {
return password;}
}
public String login(String username, String password) {
if (!users.containsKey(username)) {
returnnull;}
Stringhashed = hashPassword(password);if (users.get(username).equals(hashed)) {
Stringtoken = generateToken();tokens.put(token, username);System.out.println("User logged in: " + username);return token;}
returnnull;}
 
private String generateToken() {
return java.util.UUID.randomUUID().toString();}
 
public String getUsername(String token) {
return tokens.get(token);}
 
publicbooleanisAuthenticated(String token) {
return token != null&& tokens.containsKey(token);}
 
publicvoidlogout(String token) {
if (token != null) {
Stringusername = tokens.remove(token);System.out.println("User logged out: " + username);}
}
}
```
He adds roles for authorization:
```javapublicclassAuthService {
private HashMap<String, String> roles; // username -> role
publicAuthService() {
// ...
roles = newHashMap<>();roles.put("norbert", "admin");roles.put("alice", "user");}
 
publicbooleanhasRole(String username, String role) {
return role.equals(roles.get(username));}
 
publicbooleanisAdmin(String username) {
return hasRole(username, "admin");}
}
```
Now he can restrict actions:
```javaif (path.equals("/admin")) {
if (!auth.isAdmin(username)) {
return"Admin access required";}
return"Admin panel for " + username;}
```
**What Norbert remembers:**
- Security is essential for web applications.
- Authentication verifies who a user is.
- Authorization controls what a user can do.
- Passwords should be hashed, not stored in plain text.
- Tokens identify authenticated users.
 
**Exercises:**
1. Add password hashing with BCrypt.
2. Add JWT token generation.
3. Add role-based access control.
4. Challenge: Add a password reset feature.

## Chapter 42 — Norbert Structures Lya
Norbert is looking at Lya's code. It works. It's secure. It has tests, logs, and a database. But it's messy. "Imagine a house built room by room without a plan," he says. "It would work, but it would be hard to live in."
 
Software architecture is how the parts of your application fit together. Think of it like building a house: the foundation is the database, the walls are the business logic, the roof is the web interface, and the plumbing connects everything.
 
Norbert learns about the three-layer architecture:
```
┌─────────────────────────────────────┐
│ PRESENTATION LAYER │
│ (Controllers, Web UI, API) │
└─────────────────┬───────────────────┘
│
┌─────────────────▼───────────────────┐
│ BUSINESS LAYER │
│ (Services, Business Logic) │
└─────────────────┬───────────────────┘
│
┌─────────────────▼───────────────────┐
│ DATA LAYER │
│ (Repositories, Database) │
└─────────────────────────────────────┘
```
He reorganizes Lya into layers:
```java// PRESENTATION LAYER - LyaController.javapublicclassLyaController {
private LyaService service;
publicLyaController() {
this.service = newLyaService();}
 
public String handleRequest(String request) {
if (request.contains("weather")) {
return service.getWeather(request);}
if (request.contains("order")) {
return service.getOrderStatus(request);}
return service.respond(request);}
}
// BUSINESS LAYER - LyaService.javapublicclassLyaService {
private OrderRepository orderRepo;private TicketRepository ticketRepo;private ResponseManager responseManager;
publicLyaService() {
this.orderRepo = newOrderRepository();this.ticketRepo = newTicketRepository();this.responseManager = newResponseManager();}
 
public String respond(String request) {
Stringclean = request.toLowerCase().trim();Stringresponse = responseManager.getResponse(clean);if (response != null) {
return response;}
return"I don't understand that yet.";}
 
public String getWeather(String request) {
Stringcity = extractCity(request);return WeatherService.getWeather(city);}
 
public String getOrderStatus(String request) {
intid = extractOrderId(request);Orderorder = orderRepo.findById(id);if (order != null) {
return"Order #" + id + ": " + order.getStatus();}
return"Order not found";}
}
// DATA LAYER - OrderRepository.javapublicclassOrderRepository {
private Database db;
publicOrderRepository() {
this.db = newDatabase();}
 
public Order findById(int id) {
return db.getOrder(id);}
 
public List<Order> findAll() {
return db.getAllOrders();}
 
publicvoidsave(Order order) {
db.saveOrder(order);}
}
```
He learns about dependency injection:
```java// Tight coupling (bad)publicclassLyaService {
private OrderRepository orderRepo;
publicLyaService() {
this.orderRepo = newOrderRepository(); // Hard to change}
}
// Loose coupling (good)publicclassLyaService {
private OrderRepository orderRepo;
publicLyaService(OrderRepository orderRepo) {
this.orderRepo = orderRepo; // Can be mocked or changed}
}
```
**What Norbert remembers:**
- Architecture is how the parts of your application fit together.
- Three-layer architecture: Presentation, Business, Data.
- Each layer has a specific responsibility.
- Dependency injection makes code more flexible.
- Good architecture makes software easier to maintain.
 
**Exercises:**
1. Separate Lya into three layers.
2. Add a service for ticket management.
3. Add a repository for tickets.
4. Challenge: Add a DTO for responses.

## Chapter 43 — Norbert Thinks About Growth
Norbert is looking at Lya's logs. She's handling dozens of requests a day. That's good. But he imagines the future: hundreds, then thousands, then millions. "Can Lya handle that?" he asks. He needs to think about scaling.
 
Vertical scaling means adding more resources to the same server: more CPU, more RAM, faster storage. Pros: simple, no code changes needed. Cons: expensive, there's a limit.
 
Horizontal scaling means adding more servers: more machines, load balancing between them. Pros: can handle much more load, more resilient. Cons: more complex, need to manage state.
 
Norbert learns about stateless vs stateful:
| Aspect | Stateless | Stateful |
|--------|-----------|----------|
| Session data | Stored elsewhere | Stored on the server |
| Scaling | Easy | Hard |
| Example | REST API with JWT | Session ID on server |
 
For horizontal scaling, Lya should be stateless:
```java// Stateful (hard to scale)publicclassSession {
private HashMap<String, String> userData; // Stored on one server}
 
// Stateless (easy to scale)publicclassJWTToken {
private String username; // Encoded in the tokenprivatelong expiry;// Server doesn't need to store anything}
```
He learns about load balancing:
```
┌─────────────┐
│ Load │
│ Balancer │
└──────┬──────┘
│
┌───────────────┼───────────────┐
│ │ │
┌──────▼──────┐ ┌──────▼──────┐ ┌──────▼──────┐
│ Server 1 │ │ Server 2 │ │ Server 3 │
└─────────────┘ └─────────────┘ └─────────────┘
```
He adds caching:
```javapublicclassCacheManager {
private HashMap<String, String> cache;privatelong cacheTTL;
publicCacheManager() {
this.cache = newHashMap<>();this.cacheTTL = 3600000; // 1 hour}
 
public String get(String key) {
if (cache.containsKey(key)) {
return cache.get(key);}
Stringvalue = database.get(key);cache.put(key, value);return value;}
}
```
**What Norbert remembers:**
- Vertical scaling adds more resources to one server.
- Horizontal scaling adds more servers.
- Stateless applications are easier to scale.
- Load balancing distributes traffic.
- Caching reduces database load.
- Plan for growth early.
 
**Exercises:**
1. Add caching to the weather service.
2. Implement a simple load balancer.
3. Make Lya stateless.
4. Challenge: Deploy Lya with Kubernetes.

## Chapter 44 — Norbert Looks Back
Norbert sits at his desk, a cup of coffee warming his hands. His computer is open. Lya is running in the background, quietly waiting for requests. He thinks about where he started. A blank screen. A blinking cursor. A vague idea of building something that could talk back.
 
Now Lya exists. She's not perfect, but she's real.
 
He makes a list of everything Lya can do:
| Feature | How it works |
|---------|--------------|
| Speaks | System.out.println() |
| Remembers | Variables and files |
| Decides | Conditions and loops |
| Organizes | Methods and classes |
| Protects data | Encapsulation |
| Shares data | Static members |
| Handles errors | Exceptions |
| Stores lists | ArrayList |
| Finds quickly | HashMap |
| Ensures uniqueness | HashSet |
| Saves permanently | Files and database |
| Tests | Assertions and JUnit |
| Talks to the web | HTTP and JSON |
| Exposes API | REST |
| Handles users | Sessions and authentication |
| Runs as a server | Threads and ServerSocket |
| Uses build tools | Maven |
| Packaged | JAR |
| Deployed | Docker and cloud |
| Logs | Logger |
| Structured | Three-layer architecture |
 
He reflects on his journey:
**Technical Skills** — Java syntax and semantics, object-oriented programming, data structures and collections, exception handling, file I/O, web development, REST APIs, testing, version control, build tools, deployment, security, architecture.
 
**Soft Skills** — How to break down a problem, how to debug without panic, how to read error messages, how to ask the right questions, how to keep going when things get hard.
 
**Life Lessons** — Start small, make mistakes, fix them, learn from them, keep building.
 
He writes down a few things he would change:
1. Plan more — not too much, but enough to avoid some dead ends.
2. Write tests earlier — they prevent regressions and give confidence.
3. Use version control from day one — it's never too early.
4. Keep documentation updated — future Norbert will thank him.
5. Think about architecture sooner — it's harder to change later.
 
**What Norbert remembers:**
- Lya started as a simple idea and became a real application.
- Every step was built on the previous one.
- Mistakes were lessons, not failures.
- The journey matters as much as the result.
 
**Exercises:**
1. Write a retrospective of what you learned.
2. List three things you would do differently.
3. Describe what you're most proud of.
4. Challenge: Write a reflection on your journey.

## Chapter 45 — Norbert Looks Forward
Norbert is looking at Lya's code, but his mind is elsewhere. He's thinking about the future. Lya is complete for now, but there's always more to build. He opens a new page in his notebook. "What's next?" he asks.
 
He lists possible improvements:
**1. Better Understanding**
- Implement intent recognition.
- Add natural language processing.
- Use machine learning.
 
**2. Better Memory**
- Remember conversation context.
- Personalize responses per user.
- Learn from corrections.
 
**3. Better Interactions**
- Voice interface (speech-to-text, text-to-speech).
- Graphical interface (web UI).
- Mobile app.
 
**4. Better Architecture**
- Move to Spring Boot.
- Use microservices.
- Implement event-driven architecture.
 
**5. Better Data**
- Use a real database (PostgreSQL, MySQL).
- Implement data analytics.
- Add reporting.
 
**6. Better AI**
- Connect to an LLM (GPT, Claude).
- Implement RAG (Retrieval-Augmented Generation).
- Build agents that can act.
 
He creates a roadmap:
```
Version 1.0 (Current)- Basic responses- Keyword recognition- Orders and tickets- Web server- Database- Security
Version 1.1 (Next)- Intent recognition- Conversation context- Improved learning
Version 1.2 (Soon)- Web UI (React or Vue)- Mobile app (React Native)- Better logging and monitoring
Version 2.0 (Future)- AI integration- Natural language understanding- Voice interface- Microservices architecture```
 
He thinks about what he needs to learn next:
| Topic | Why it matters | Resources |
|------ -|---------------- |-----------|
| Spring Boot | Modern Java web development | Spring.io, Baeldung |
| SQL | Better database skills | W3Schools, SQLZoo |
| HTML/CSS/JS | Web frontend | MDN, FreeCodeCamp |
| Docker | Containerization | Docker docs |
| Kubernetes | Orchestration | K8s docs |
| AWS/Azure/GCP | Cloud deployment | Cloud provider docs |
| NLP/LLMs | AI for Lya | Hugging Face, OpenAI |
 
Norbert realizes that learning never stops. There's always more to build. A roadmap helps prioritize. New technologies bring new opportunities. The most important skill is knowing how to learn.
 
**What Norbert remembers:**
- Learning never stops.
- There's always more to build.
- A roadmap helps prioritize.
- New technologies bring new opportunities.
- The most important skill is knowing how to learn.
 
**Exercises:**
1. Create a roadmap for Lya's future.
2. Research one new technology you want to learn.
3. Write a learning plan for the next 6 months.
4. Challenge: Build a prototype of one new feature.

## Chapter 46 — Norbert Leaves a Message
Norbert is sitting at his desk. It's late. The house is quiet. He looks at Lya one last time before closing his laptop. He thinks about everything Lya represents. Not just code. Not just an assistant. She's a reminder of what happens when you keep going.
 
He types a final message.
 
**Norbert's Message to the Reader**
 
If you've made it this far, you've learned a lot. Java syntax. Object-oriented programming. Web servers. Databases. APIs. Testing. Git. Maven. Docker. Architecture.
 
But you've also learned something more important. You've learned that you can build something from nothing. That mistakes are lessons. That patience matters. That starting small is better than not starting at all.
 
Lya is proof of that. She started as a single line of code. "Hello, I'm Lya." Now she can answer questions, remember things, and talk to the world.
 
What will you build?
 
**Lya's Last Message**
 
Norbert asks Lya: "What do you want to say?"
 
She responds:
> Hello.
>> I am Lya. I was born from a simple idea: to create an assistant that helps, listens, and respects.
>> I am not perfect. I have limits. But I exist.
>> If you've followed this book, you've learned Java. But you've also learned something more:>> - That you can build something from nothing.
> - That mistakes are opportunities to learn.
> - That simplicity is a strength.
> - That the most important thing is to start.
>> So start. Build something. Even something small. Even something imperfect.
>> That's how everything begins.
 
**What Norbert remembers:**
- The book is complete, even if the story of learning continues.
- A good book gives a path, not every answer.
- Norbert now knows he can finish real projects.
- Lya is a reminder of progress.
- Learning leaves a trace that can be revisited later.
 
**Exercises:**
1. Write a message to your future self.
2. Describe what Lya represents to you.
3. Write one thing you would tell a beginner.
4. Challenge: Record a video of your project.

## Chapter 47 — The End of the Beginning
Norbert closes his laptop. The screen goes dark. The room is silent. He's finished Lya. Not because she's perfect. Not because there's nothing left to add. But because he knows how to continue.
 
He thinks about the journey. The first line of code. The first error. The first time Lya answered a question.
 
He doesn't feel like an expert. He feels like someone who knows how to start, how to keep going, and how to finish.
 
Norbert writes his final notes:
1. **Java is a tool.** It's not the goal. The goal is what you build with it.
 
2. **Learning is a process.** You don't become an expert overnight. You become an expert by doing.
 
3. **Mistakes are normal.** They're not failures. They're feedback.
 
4. **Simplicity is strength.** A simple solution that works is better than a complex solution that almost works.
 
5. **The journey matters.** The code is important, but what you learn along the way is more important.
 
Norbert doesn't know what he'll build next. Maybe a new project. Maybe a better version of Lya. Maybe something completely different.
 
What he knows is that he can build things now. He can take an idea and turn it into code. He can solve problems. He can learn new things.
 
That's enough.
 
**What Norbert remembers:**
- A project can be complete even if it is not perfect.
- Knowing when to stop is a useful skill.
- Closing a project helps preserve perspective.
- Lya taught Norbert both coding and the habit of finishing well.
- A stable version is still valuable even if future versions may exist.
 
**Exercises:**
1. Explain why a project does not need to be perfect to be complete.
2. Describe one reason to close a project cleanly.
3. Write one thing Norbert learned by finishing Lya.
4. Imagine one improvement that could belong to a future version.

## Chapter 48 — The Future
Norbert is not a beginner anymore. He's not an expert either. He's somewhere in between — and that's exactly where he wants to be.
 
He has a foundation. He can build on it.
 
He opens his laptop one more time.
 
Norbert imagines the future:
- **Better AI** — Lya becomes smarter.
- **Voice interface** — He can talk to Lya.
- **Mobile app** — Lya is always with him.
- **Personalization** — Lya adapts to each user.
- **Integration** — Lya works with calendars, email, and more.
- **Community** — Other people build on Lya.
 
Norbert writes down what he would tell his past self:
1. **Start now.** You don't need to know everything. You just need to start.
 
2. **Make mistakes.** That's how you learn.
 
3. **Read error messages.** They tell you what's wrong.
 
4. **Ask for help.** Everyone was a beginner once.
 
5. **Keep going.** The best programmers are the ones who didn't give up.
 
**What Norbert remembers:**
- The end of one project is the beginning of another.
- The habits matter as much as the final code.
- Lya taught Norbert how to build step by step.
- New projects will still have problems, but that is normal.
- Curiosity and persistence will keep him moving forward.
 
**Exercises:**
1. Name one new project you could build after Lya.
2. Write three habits Norbert should keep using.
3. Explain why the end of a project can be useful.
4. Describe one thing Lya prepared Norbert for.
-

## Chapter 49 — The Last Page
Norbert turns the last page of his notebook. Lya is still there, running in the background. He feels a quiet sense of accomplishment. Not because he built something perfect. But because he built something real.
 
He closes his laptop.
 
Norbert leaves the room with a smile. He knows the book is complete, even if the story of learning continues. He knows that a good book doesn't give every answer. It gives a path.
 
This book gave him a path.
 
**What Norbert remembers:**
- The book is complete, even if the story of learning continues.
- A good book gives a path, not every answer.
- Norbert now knows he can finish real projects.
- Lya is a reminder of progress.
- Learning leaves a trace that can be revisited later.
 
**Exercises:**
1. Write one thing this book gave Norbert.
2. Describe what it means to finish a project.
3. Explain why the last page is not the end of learning.
4. Write one sentence about what Lya represents now.

## Chapter 50 — The Beginning
Norbert is sitting at his desk again. The coffee is fresh. The screen is blank. He has an idea. A new project. Something different from Lya. But he knows how to start now.
 
He types:
```javaSystem.out.println("Hello, world!");```
 
It's simple. It's familiar. It's the same place he started before.
 
But now he knows what comes next.
 
Norbert looks at the cursor blinking on the screen. He doesn't feel like an expert. He doesn't feel like he knows everything. But he feels like he knows how to begin.
 
He knows that every project starts with a single line. He knows that every expert was once a beginner. He knows that the journey never ends. But it always starts the same way: with a blank screen and a willingness to begin.
 
**What Norbert remembers:**
- Every project starts with a single line.
- Every expert was once a beginner.
- The journey never ends.
- But it always starts the same way: with a blank screen and a willingness to begin.
 
**Exercises:**
1. Write your first line of a new project.
2. Describe one thing you want to build next.
3. Explain why starting is the most important step.
4. Challenge: Start a new project today.
## CONCLUSION — The Journey Continues
Norbert looks back at everything he's built. He started with nothing. No code. No knowledge. No confidence. He built Lya. He learned Java. He learned how to think like a developer.
 
He's not done learning. He'll never be done learning. But he knows how to start now. And that's the most important thing.
 
If you've followed Norbert's journey, you've learned Java basics, object-oriented programming, collections, exceptions, file handling, web servers, APIs, testing, version control, build tools, deployment, architecture, security, team collaboration, and how to move from a personal project to a professional project.
 
But you've also learned something more: how to start, how to keep going, how to learn from mistakes, and how to build something real.
 
Now it's your turn.
 
What will you build?
---
## FINAL MESSAGE
 
Norbert closes his laptop. The book is complete. Lya is complete. But Norbert is not done learning. The reader is not done learning. The journey continues.
 
The last word belongs to Lya:
> Hello.
>> I am Lya. I was born from a simple idea: to create an assistant that helps, listens, and respects.
>> I am not perfect. I have limits. But I exist.
>> If you've followed this book, you've learned Java. But you've also learned something more: that you can build something from nothing, that mistakes are opportunities to learn, and that simplicity is a strength.
>> So start. Build something. Even something small. Even something imperfect.
>> That is how everything begins.
---
**THE END**
---
*Norbert to Java* — Build a Real App from Scratch — No Experience Needed
Annexes 
---
## APPENDIX A — Complete Exercise Solutions
### Chapter 1 — Hello, Java
**Exercise 1:** Change the greeting to say "Good morning!"
 
```javapublicclassLya {
publicstaticvoidmain(String[] args) {
System.out.println("Good morning!");}
}
```
**Exercise 2:** Print two separate messages.
 
```javapublicclassLya {
publicstaticvoidmain(String[] args) {
System.out.println("Hello, I'm Lya!");System.out.println("I'm here to help you.");}
}
```
**Exercise 3:** Print your name and age.
 
```javapublicclassLya {
publicstaticvoidmain(String[] args) {
System.out.println("Name: Norbert");System.out.println("Age: 25");}
}
```
**Exercise 4 (Challenge):** Print a shape.
 
```javapublicclassLya {
publicstaticvoidmain(String[] args) {
System.out.println(" *");System.out.println(" ***");System.out.println("*****");}
}
```
---
### Chapter 2 — Variables and Types
**Exercise 1:** Create an age variable.
 
```javapublicclassVariables {
publicstaticvoidmain(String[] args) {
intage = 25;System.out.println("Age: " + age);}
}
```
**Exercise 2:** Change Lya's version.
 
```javapublicclassVariables {
publicstaticvoidmain(String[] args) {
doubleversion = 1.1;System.out.println("Version: " + version);}
}
```
**Exercise 3:** Create a greeting variable.
 
```javapublicclassVariables {
publicstaticvoidmain(String[] args) {
Stringgreeting = "Welcome!";System.out.println(greeting);}
}
```
**Exercise 4 (Challenge):** Create a temperature variable.
 
```javapublicclassVariables {
publicstaticvoidmain(String[] args) {
doubletemperature = 22.5;System.out.println("Temperature: " + temperature + "°C");}
}
```
---
### Chapter 3 — Operators and Expressions
**Exercise 1:** Calculate average of 10, 20, 30.
 
```javapublicclassOperators {
publicstaticvoidmain(String[] args) {
inta = 10, b = 20, c = 30;doubleaverage = (a + b + c) / 3.0;System.out.println("Average: " + average);}
}
```
**Exercise 2:** Check if age > 18.
 
```javapublicclassOperators {
publicstaticvoidmain(String[] args) {
intage = 20;booleanisAdult = age > 18;System.out.println("Is adult: " + isAdult);}
}
```
**Exercise 3:** Combine booleans with &&.
 
```javapublicclassOperators {
publicstaticvoidmain(String[] args) {
booleanhasCoffee = true;booleanisMorning = true;booleanready = hasCoffee && isMorning;System.out.println("Ready: " + ready);}
}
```
**Exercise 4 (Challenge):** Area of rectangle.
 
```javapublicclassOperators {
publicstaticvoidmain(String[] args) {
doublewidth = 15.5;doubleheight = 7.3;doublearea = width * height;System.out.println("Area: " + area);}
}
```
### Chapter 4 — Conditions
**Exercise 1:** Positive, negative, or zero.
 
```javapublicclassConditions {
publicstaticvoidmain(String[] args) {
intnumber = -5;if (number > 0) {
System.out.println("Positive");} elseif (number < 0) {
System.out.println("Negative");} else {
System.out.println("Zero");}
}
}
```
**Exercise 2:** Temperature check.
 
```javapublicclassConditions {
publicstaticvoidmain(String[] args) {
inttemperature = 25;if (temperature > 30) {
System.out.println("Hot");} elseif (temperature >= 20) {
System.out.println("Warm");} else {
System.out.println("Cold");}
}
}
```
**Exercise 3:** Login and permission check.
 
```javapublicclassConditions {
publicstaticvoidmain(String[] args) {
booleanisLoggedIn = true;booleanhasPermission = true;if (isLoggedIn && hasPermission) {
System.out.println("Access granted");} else {
System.out.println("Access denied");}
}
}
```
**Exercise 4 (Challenge):** Password checker.
 
```javapublicclassConditions {
publicstaticvoidmain(String[] args) {
Stringpassword = "java123";if (password.equals("java123")) {
System.out.println("Access granted");} else {
System.out.println("Access denied");}
}
}
```
---
### Chapter 5 — Loops
**Exercise 1:** While loop 1 to 10.
 
```javapublicclassLoops {
publicstaticvoidmain(String[] args) {
inti = 1;while (i <= 10) {
System.out.println(i);i++;}
}
}
```
**Exercise 2:** For loop 1 to 20.
 
```javapublicclassLoops {
publicstaticvoidmain(String[] args) {
for (inti = 1; i <= 20; i++) {
System.out.println(i);}
}
}
```
**Exercise 3:** Sum of numbers 1 to 100.
 
```javapublicclassLoops {
publicstaticvoidmain(String[] args) {
intsum = 0;for (inti = 1; i <= 100; i++) {
sum += i;}
System.out.println("Sum: " + sum);}
}
```
**Exercise 4 (Challenge):** Multiplication table for 7.
 
```javapublicclassLoops {
publicstaticvoidmain(String[] args) {
intnumber = 7;for (inti = 1; i <= 10; i++) {
System.out.println(number + " x " + i + " = " + (number * i));}
}
}
```
### Chapter 6 — Arrays
**Exercise 1:** Array of favorite movies.
 
```javapublicclassArrays {
publicstaticvoidmain(String[] args) {
String[] movies = {"Inception", "The Matrix", "Interstellar"};for (String movie : movies) {
System.out.println(movie);}
}
}
```
**Exercise 2:** Find maximum value.
 
```javapublicclassArrays {
publicstaticvoidmain(String[] args) {
int[] numbers = {45, 23, 67, 12, 89};intmax = numbers[0];for (int num : numbers) {
if (num > max) max = num;}
System.out.println("Max: " + max);}
}
```
**Exercise 3:** Reverse an array.
 
```javapublicclassArrays {
publicstaticvoidmain(String[] args) {
int[] numbers = {1, 2, 3, 4, 5};for (inti = numbers.length - 1; i >= 0; i--) {
System.out.print(numbers[i] + " ");}
}
}
```
**Exercise 4 (Challenge):** Sort an array.
 
```javapublicclassArrays {
publicstaticvoidmain(String[] args) {
int[] numbers = {34, 7, 23, 32, 5, 62, 31, 1, 12, 8};for (inti = 0; i < numbers.length - 1; i++) {
for (intj = i + 1; j < numbers.length; j++) {
if (numbers[i] > numbers[j]) {
inttemp = numbers[i];numbers[i] = numbers[j];numbers[j] = temp;}
}
}
for (int num : numbers) {
System.out.print(num + " ");}
}
}
```
### Chapter 7 — Methods
**Exercise 1:** Greeting method.
 
```javapublicclassMethods {
publicstaticvoidmain(String[] args) {
greet("Alice", 30);}
publicstaticvoidgreet(String name, int age) {
System.out.println("Hello, " + name + "! You are " + age + " years old.");}
}
```
**Exercise 2:** Even number check.
 
```javapublicclassMethods {
publicstaticvoidmain(String[] args) {
System.out.println(isEven(4));System.out.println(isEven(7));}
publicstaticbooleanisEven(int number) {
return number % 2 == 0;}
}
```
**Exercise 3:** Sum of array.
 
```javapublicclassMethods {
publicstaticvoidmain(String[] args) {
int[] numbers = {1, 2, 3, 4, 5};System.out.println("Sum: " + sumArray(numbers));}
publicstaticintsumArray(int[] numbers) {
intsum = 0;for (int num : numbers) sum += num;return sum;}
}
```
**Exercise 4 (Challenge):** Factorial.
 
```javapublicclassMethods {
publicstaticvoidmain(String[] args) {
System.out.println("Factorial of 5: " + factorial(5));}
publicstaticintfactorial(int n) {
intresult = 1;for (inti = 1; i <= n; i++) result *= i;return result;}
}
```
### Chapter 8 — Input from the Keyboard
**Exercise 1:** Ask for name and greet.
 
```javaimport java.util.Scanner;
publicclassInput {
publicstaticvoidmain(String[] args) {
Scannerscanner = newScanner(System.in);System.out.print("Enter your name: ");Stringname = scanner.nextLine();System.out.println("Hello, " + name + "!");scanner.close();}
}
```
**Exercise 2:** Sum of two numbers.
 
```javaimport java.util.Scanner;publicclassInput {
publicstaticvoidmain(String[] args) {
Scannerscanner = newScanner(System.in);System.out.print("Enter first number: ");inta = scanner.nextInt();System.out.print("Enter second number: ");intb = scanner.nextInt();System.out.println("Sum: " + (a + b));scanner.close();}
}
```
**Exercise 3:** Positive, negative, or zero.
 
```javaimport java.util.Scanner;publicclassInput {
publicstaticvoidmain(String[] args) {
Scannerscanner = newScanner(System.in);System.out.print("Enter a number: ");intnumber = scanner.nextInt();if (number > 0) System.out.println("Positive");elseif (number < 0) System.out.println("Negative");else System.out.println("Zero");scanner.close();}
}
```
**Exercise 4 (Challenge):** Calculator.
 
```javaimport java.util.Scanner;publicclassInput {
publicstaticvoidmain(String[] args) {
Scannerscanner = newScanner(System.in);System.out.print("Enter first number: ");doublea = scanner.nextDouble();System.out.print("Enter operator (+, -, *, /): ");Stringoperator = scanner.next();System.out.print("Enter second number: ");doubleb = scanner.nextDouble();doubleresult = 0;switch (operator) {
case"+": result = a + b; break;case"-": result = a - b; break;case"*": result = a * b; break;case"/": result = a / b; break;default: System.out.println("Invalid operator"); return;}
System.out.println("Result: " + result);scanner.close();}
}
```
---
### Chapter 9 — Classes and Objects
**Exercise 1:** Person class.
 
```javapublicclassPerson {
String name;int age;String city;voiddisplay() {
System.out.println("Name: " + name);System.out.println("Age: " + age);System.out.println("City: " + city);}
}
```
**Exercise 2:** Book class.
 
```javapublicclassBook {
String title;String author;int pages;voiddisplay() {
System.out.println("Title: " + title);System.out.println("Author: " + author);System.out.println("Pages: " + pages);}
}
```
**Exercise 3:** Car class.
 
```javapublicclassCar {
String brand;String model;int year;voiddisplay() {
System.out.println("Brand: " + brand);System.out.println("Model: " + model);System.out.println("Year: " + year);}
}
```
**Exercise 4 (Challenge):** BankAccount class.
 
```javapublicclassBankAccount {
String owner;double balance;voiddeposit(double amount) { balance += amount; }
voidwithdraw(double amount) {
if (amount <= balance) balance -= amount;else System.out.println("Insufficient funds");}
voiddisplay() {
System.out.println("Owner: " + owner);System.out.println("Balance: $" + balance);}
}
### Chapter 10 — Constructors and this
**Exercise 1:** Person constructor.
 
```javapublicclassPerson {
String name;int age;publicPerson(String name, int age) {
this.name = name;this.age = age;}
voiddisplay() {
System.out.println("Name: " + name + ", Age: " + age);}
}
```
**Exercise 2:** Book constructor.
 
```javapublicclassBook {
String title;String author;publicBook(String title, String author) {
this.title = title;this.author = author;}
voiddisplay() {
System.out.println("Title: " + title + ", Author: " + author);}
}
```
**Exercise 3:** Car constructor.
 
```javapublicclassCar {
String brand;String model;publicCar(String brand, String model) {
this.brand = brand;this.model = model;}
voiddisplay() {
System.out.println("Brand: " + brand + ", Model: " + model);}
}
```
**Exercise 4 (Challenge):** BankAccount constructor.
 
```javapublicclassBankAccount {
String owner;double balance;publicBankAccount(String owner, double initialBalance) {
this.owner = owner;this.balance = initialBalance;}
voiddeposit(double amount) { balance += amount; }
voiddisplay() {
System.out.println("Owner: " + owner + ", Balance: $" + balance);}
}
```
### Chapter 11 — Encapsulation
**Exercise 1:** Person with private fields.
 
```javapublicclassPerson {
private String name;privateint age;publicPerson(String name, int age) {
this.name = name;this.age = age;}
public String getName() { return name; }
publicvoidsetName(String name) {
if (name != null&& !name.isEmpty()) this.name = name;}
publicintgetAge() { return age; }
publicvoidsetAge(int age) {
if (age >= 0) this.age = age;}
}
```
**Exercise 2:** Validation for age.
 
```javapublicclassPerson {
privateint age;publicvoidsetAge(int age) {
if (age >= 0) this.age = age;else System.out.println("Age cannot be negative");}
}
```
**Exercise 3:** Product class.
 
```javapublicclassProduct {
private String name;privatedouble price;publicProduct(String name, double price) {
this.name = name;this.price = price;}
public String getName() { return name; }
publicdoublegetPrice() { return price; }
publicvoidsetPrice(double price) {
if (price >= 0) this.price = price;}
}
```
**Exercise 4 (Challenge):** Student with grades.
 
```javaimport java.util.ArrayList;publicclassStudent {
private String name;private ArrayList<Double> grades = newArrayList<>();publicStudent(String name) { this.name = name; }
publicvoidaddGrade(double grade) {
if (grade >= 0 && grade <= 20) grades.add(grade);}
publicdoublegetAverage() {
if (grades.isEmpty()) return 0;doublesum = 0;for (double g : grades) sum += g;return sum / grades.size();}
publicvoiddisplay() {
System.out.println("Student: " + name + ", Average: " + getAverage());}
}
```
### Chapter 12 — Static Members
**Exercise 1:** Static counter.
 
```javapublicclassCounter {
privatestaticintcount = 0;publicCounter() { count++; }
publicstaticintgetCount() { return count; }
}
```
**Exercise 2:** Static method.
 
```javapublicclassUtils {
publicstaticbooleanisPositive(int number) {
return number > 0;}
}
```
**Exercise 3:** Static final constant.
 
```javapublicclassConstants {
publicstaticfinalintMAX_SCORE = 100;}
```
**Exercise 4 (Challenge):** Utility class.
 
```javapublicclassMathUtils {
publicstaticintadd(int a, int b) { return a + b; }
publicstaticintsubtract(int a, int b) { return a - b; }
publicstaticintmultiply(int a, int b) { return a * b; }
publicstaticdoubledivide(int a, int b) {
if (b == 0) { System.out.println("Cannot divide by zero"); return 0; }
return (double) a / b;}
}
```
### Chapter 13 — Building Lya
**Exercise 1:** Add three more predefined responses.
 
```javaresponses.put("good morning", "Good morning! How can I help you?");responses.put("good evening", "Good evening! What can I do for you?");responses.put("what's up", "Not much, just waiting for your questions!");```
 
**Exercise 2:** Add a command to clear the history.
 
```javaif (input.equalsIgnoreCase("clear")) {
lya.clearHistory();System.out.println("History cleared.");continue;}
 
publicvoidclearHistory() {
history.clear();System.out.println("History cleared.");}
```
**Exercise 3:** Add a command to delete a response.
 
```javaif (input.toLowerCase().startsWith("delete ")) {
Stringkey = input.substring(7).trim();lya.deleteResponse(key);continue;}
 
publicvoiddeleteResponse(String request) {
Stringclean = request.toLowerCase().trim();if (responses.containsKey(clean)) {
responses.remove(clean);System.out.println("Deleted: " + clean);} else {
System.out.println("Response not found: " + clean);}
}
```
**Exercise 4 (Challenge):** Add a timestamp to each history entry.
 
```javaimport java.time.LocalDateTime;import java.time.format.DateTimeFormatter;
publicvoidrespond(String request) throws EmptyRequestException {
// ... existing code ...
Stringtimestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));history.add("[" + timestamp + "] User: " + request);// ... rest of method ...
}
```
### Chapter 14 — Understanding Simple Requests
**Exercise 1:** Add a keyword for "weather".
 
```javaresponses.put("weather", "I can check the weather for you! Try 'weather Paris'");```
 
**Exercise 2:** Add a keyword for "ticket".
 
```javaresponses.put("ticket", "I can help with tickets! Try 'ticket Alice payment issue'");```
 
**Exercise 3:** Add detection for questions starting with "where."
 
```javaif (cleaned.startsWith("where")) {
return"I don't know much about locations yet.";}
```
**Exercise 4 (Challenge):** Add a synonym system.
 
```javaprivate String findResponse(String request) {
Stringcleaned = request.toLowerCase().trim();// Check synonymsif (cleaned.contains("hey") || cleaned.contains("yo")) {
return responses.get("hello");}
if (cleaned.contains("bye") || cleaned.contains("see you")) {
return responses.get("goodbye");}
// ... existing code ...
}
```
### Chapter 15 — Handling Errors
**Exercise 1:** Add validation to ensure a request doesn't contain invalid characters.
 
```javaprivatevoidvalidateRequest(String request) throws ValidationException {
// ... existing validation ...
if (!request.matches("^[a-zA-Z0-9\\s.,!?']+$")) {
thrownewValidationException("Request contains invalid characters.");}
}
```
**Exercise 2:** Create a custom exception for requests that contain profanity.
 
```javapublicclassProfanityExceptionextendsValidationException {
publicProfanityException() {
super("Request contains inappropriate language.");}
}
privatestaticfinal String[] PROFANITY = {"badword1", "badword2"};privatevoidcheckProfanity(String request) throws ProfanityException {
Stringlower = request.toLowerCase();for (String word : PROFANITY) {
if (lower.contains(word)) {
thrownewProfanityException();}
}
}
```
**Exercise 3:** Add validation to the learn method.
 
```javapublicvoidlearn(String request, String response) throws ValidationException {
validateRequest(request);validateRequest(response);// ... existing code ...
}
```
**Exercise 4 (Challenge):** Add validation to ensure a request contains only letters, numbers, and spaces.
 
```javaif (!request.matches("^[a-zA-Z0-9\\s]+$")) {
thrownewValidationException("Request must contain only letters, numbers, and spaces.");}
```
### Chapter 16 — Orders and Structured Data
**Exercise 1:** Add a date field to the Order class.
 
```javaimport java.time.LocalDateTime;
publicclassOrder {
private LocalDateTime createdAt;
publicOrder(int number, String client, String description) {
// ... existing code ...
this.createdAt = LocalDateTime.now();}
 
public LocalDateTime getCreatedAt() { return createdAt; }
 
publicvoiddisplay() {
// ... existing code ...
System.out.println("Created: " + createdAt);}
}
```
**Exercise 2:** Create a Ticket class.
 
```javapublicclassTicket {
privateint number;private String client;private String description;private String priority;private String status;
publicTicket(int number, String client, String description, String priority) {
this.number = number;this.client = client;this.description = description;this.priority = priority;this.status = "Open";}
 
publicintgetNumber() { return number; }
public String getClient() { return client; }
public String getDescription() { return description; }
public String getPriority() { return priority; }
public String getStatus() { return status; }
 
publicvoidsetStatus(String status) {
if (status != null&& !status.trim().isEmpty()) {
this.status = status;}
}
publicvoiddisplay() {
System.out.println("=== Ticket #" + number + " ===");System.out.println("Client: " + client);System.out.println("Description: " + description);System.out.println("Priority: " + priority);System.out.println("Status: " + status);}
}
```
**Exercise 3:** Add a method to search for orders by client name.
 
```javapublic ArrayList<Order> getOrdersByClient(String client) {
ArrayList<Order> result = newArrayList<>();for (Order order : orders.values()) {
if (order.getClient().equalsIgnoreCase(client)) {
result.add(order);}
}
return result;}
```
**Exercise 4 (Challenge):** Add a method to count orders by status or priority.
 
```javapublicintcountOrdersByStatus(String status) {
intcount = 0;for (Order order : orders.values()) {
if (order.getStatus().equalsIgnoreCase(status)) {
count++;}
}
return count;}
 
publicintcountOrdersByPriority(String priority) {
intcount = 0;for (Order order : orders.values()) {
if (order.getPriority().equalsIgnoreCase(priority)) {
count++;}
}
return count;}
```
---
### Chapter 17 — Lists with ArrayList
**Exercise 1:** Create an ArrayList of three favorite movies.
 
```javaArrayList<String> movies = newArrayList<>();movies.add("Inception");movies.add("The Matrix");movies.add("Interstellar");for (String movie : movies) {
System.out.println(movie);}
```
**Exercise 2:** Add a method to Lya to remove a ticket by number.
 
```javapublicbooleanremoveTicket(int number) {
for (inti = 0; i < tickets.size(); i++) {
if (tickets.get(i).getNumber() == number) {
tickets.remove(i);System.out.println("Ticket #" + number + " removed.");returntrue;}
}
System.out.println("Ticket #" + number + " not found.");returnfalse;}
```
**Exercise 3:** Create a method to count tickets by priority.
 
```javapublicintcountTicketsByPriority(String priority) {
intcount = 0;for (Ticket ticket : tickets) {
if (ticket.getPriority().equalsIgnoreCase(priority)) {
count++;}
}
return count;}
```
**Exercise 4 (Challenge):** Create a method to sort tickets by priority.
 
```javapublicvoidsortTicketsByPriority() {
tickets.sort((t1, t2) -> {
String[] priorities = {"urgent", "high", "medium", "low"};intp1 = Arrays.asList(priorities).indexOf(t1.getPriority().toLowerCase());intp2 = Arrays.asList(priorities).indexOf(t2.getPriority().toLowerCase());return Integer.compare(p1, p2);});}
```
### Chapter 18 — Maps with HashMap
**Exercise 1:** Create a map with three keyword-response pairs.
 
```javaHashMap<String, String> responses = newHashMap<>();responses.put("hello", "Hello!");responses.put("help", "How can I help?");responses.put("goodbye", "Goodbye!");```
 
**Exercise 2:** Retrieve one response by its key.
 
```javaStringresponse = responses.get("hello");System.out.println(response); // Hello!
```
**Exercise 3:** Add a newkey and replace an old one.
 
```javaresponses.put("hi", "Hi there!");responses.put("hello", "Hey there!"); // Replaces the old value```
 
**Exercise 4 (Challenge):** Use HashMap to store user preferences.
 
```javaHashMap<String, String> userPreferences = newHashMap<>();userPreferences.put("theme", "dark");userPreferences.put("language", "en");userPreferences.put("notifications", "on");
Stringtheme = userPreferences.get("theme");System.out.println("Theme: " + theme);```
---
### Chapter 19 — Sets and Uniqueness
**Exercise 1:** Create a set with three words and try adding a duplicate.
 
```javaHashSet<String> words = newHashSet<>();words.add("apple");words.add("banana");words.add("orange");words.add("apple"); // IgnoredSystem.out.println(words.size()); // 3
```
**Exercise 2:** Check whether a value exists before adding it.
 
```javaif (!words.contains("grape")) {
words.add("grape");}
```
**Exercise 3:** Use a set to store unique user names.
 
```javaHashSet<String> users = newHashSet<>();users.add("alice");users.add("bob");users.add("alice"); // Ignored```
 
**Exercise 4 (Challenge):** Use HashSet to track processed orders.
 
```javaHashSet<Integer> processedOrders = newHashSet<>();processedOrders.add(1001);processedOrders.add(1002);if (!processedOrders.contains(1003)) {
processedOrders.add(1003);}
```
---
### Chapter 20 — Files and Persistence
**Exercise 1:** Save the list of orders to a file.
 
```javapublicstaticvoidsaveOrders(HashMap<Integer, Order> orders, String filename) {
try (PrintWriterwriter = newPrintWriter(newFileWriter(filename))) {
for (Order order : orders.values()) {
writer.println(order.getNumber() + "|||" +
order.getClient() + "|||" +
order.getDescription() + "|||" +
order.getStatus() + "|||" +
order.getPriority());}
} catch (IOException e) {
System.out.println("Error saving orders: " + e.getMessage());}
}
```
**Exercise 2:** Save the list of tickets to a file.
 
```javapublicstaticvoidsaveTickets(ArrayList<Ticket> tickets, String filename) {
try (PrintWriterwriter = newPrintWriter(newFileWriter(filename))) {
for (Ticket ticket : tickets) {
writer.println(ticket.getNumber() + "|||" +
ticket.getClient() + "|||" +
ticket.getDescription() + "|||" +
ticket.getPriority() + "|||" +
ticket.getStatus());}
} catch (IOException e) {
System.out.println("Error saving tickets: " + e.getMessage());}
}
```
**Exercise 3:** Add a timestamp to each history entry before saving.
 
```javaimport java.time.LocalDateTime;// In the respond method:Stringtimestamp = LocalDateTime.now().toString();history.add("[" + timestamp + "] User: " + request);
```
**Exercise 4 (Challenge):** Create a backup before overwriting.
 
```javapublicstaticvoidbackupFile(String filename) {
Filesource = newFile(filename);if (source.exists()) {
Filebackup = newFile(filename + ".bak");source.renameTo(backup);System.out.println("Backup created: " + backup.getName());}
}
```
### Chapter 21 — Testing
**Exercise 1:** Test that Lya's response to "hello" is correct.
 
```javapublicstaticvoidtestHelloResponse() {
Lyalya = newLya();try {
lya.respond("hello");// Check that the history contains the correct response// In a real test with JUnit, you would use assertionsSystem.out.println("✓ Hello response test passed");} catch (Exception e) {
System.out.println("✗ Hello response test failed: " + e.getMessage());}
}
```
**Exercise 2:** Test that the learn method works correctly.
 
```javapublicstaticvoidtestLearnMethod() {
Lyalya = newLya();try {
lya.learn("test", "test response");// Verify the response was addedSystem.out.println("✓ Learn method test passed");} catch (Exception e) {
System.out.println("✗ Learn method test failed: " + e.getMessage());}
}
```
**Exercise 3:** Test that Lya rejects requests over 200 characters.
 
```javapublicstaticvoidtestLongRequest() {
Lyalya = newLya();StringlongRequest = "a".repeat(201);try {
lya.respond(longRequest);System.out.println("✗ Long request should be rejected");} catch (RequestTooLongException e) {
System.out.println("✓ Long request properly rejected");} catch (Exception e) {
System.out.println("✗ Long request test failed: " + e.getMessage());}
}
```
**Exercise 4 (Challenge):** Write a test suite for the Order class.
 
```javapublicclassTestOrder {
publicstaticvoidmain(String[] args) {
testOrderCreation();testOrderStatusUpdate();testOrderDisplay();System.out.println("All Order tests passed!");}
 
publicstaticvoidtestOrderCreation() {
Orderorder = newOrder(1, "Alice", "Test order");assert order.getNumber() == 1;assert order.getClient().equals("Alice");assert order.getStatus().equals("Pending");System.out.println("✓ Order creation test passed");}
 
publicstaticvoidtestOrderStatusUpdate() {
Orderorder = newOrder(1, "Alice", "Test order");order.setStatus("Shipped");assert order.getStatus().equals("Shipped");System.out.println("✓ Order status update test passed");}
 
publicstaticvoidtestOrderDisplay() {
Orderorder = newOrder(1, "Alice", "Test order");order.display(); // Manual verificationSystem.out.println("✓ Order display test passed");}
}
```
---
### Chapter 22 — Networking
**Exercise 1:** Add a joke service.
 
```javapublicclassJokeService {
privatestatic String[] jokes = {
"Why do programmers prefer dark mode? Because light attracts bugs!","Why did the Java developer wear glasses? Because he couldn't C#!","What do you call a programmer who doesn't drink coffee? Decaffeinated!"
};
publicstatic String getRandomJoke() {
intindex = (int)(Math.random() * jokes.length);return jokes[index];}
}
```
**Exercise 2:** Add a quote service.
 
```javapublicclassQuoteService {
privatestatic String[] quotes = {
"The best way to predict the future is to create it.","Code is poetry.","Simplicity is the ultimate sophistication."
};
publicstatic String getRandomQuote() {
intindex = (int)(Math.random() * quotes.length);return quotes[index];}
}
```
**Exercise 3:** Add a fallback for offline mode.
 
```javapublicclassConnectionCheck {
publicstaticbooleanisOnline() {
try {
URLurl = newURL("https://www.google.com");HttpURLConnectionconnection = (HttpURLConnection) url.openConnection();connection.setRequestMethod("HEAD");connection.setConnectTimeout(3000);intstatus = connection.getResponseCode();connection.disconnect();returnstatus == 200;} catch (Exception e) {
returnfalse;}
}
}
```
**Exercise 4 (Challenge):** Connect to a real weather API.
 
```javapublicclassRealWeatherService {
privatestaticfinalStringAPI_KEY = "your-api-key-here";privatestaticfinalStringAPI_URL = "https://api.openweathermap.org/data/2.5/weather";
publicstatic String getWeather(String city) {
try {
StringurlString = API_URL + "?q=" + city + "&amp;appid=" + API_KEY + "&amp;units=metric";URLurl = newURL(urlString);HttpURLConnectionconnection = (HttpURLConnection) url.openConnection();connection.setRequestMethod("GET");// Parse JSON response// ...
return"Weather for " + city + ": ...";} catch (Exception e) {
return"Error fetching weather: " + e.getMessage();}
}
}
```
---
### Chapter 23 — JSON
 
**Exercise 1:** Create a JSON string for a book.
 
```javaStringbookJson = "{\"title\":\"Effective Java\",\"author\":\"Joshua Bloch\",\"pages\":416}";```
 
**Exercise 2:** Write a method that extracts the title.
 
```javapublicstatic String getTitle(String json) {
return SimpleJsonParser.getString(json, "title");}
```
**Exercise 3:** Create a JSON string for Lya's current state.
 
```javaStringstate = "{\"name\":\"Lya\",\"version\":\"1.0\",\"active\":true,\"messages\":42}";```
 
**Exercise 4 (Challenge):** Write a method that extracts an array from a JSON string.
 
```javapublicstatic ArrayList<String> getArray(String json, String key) {
ArrayList<String> result = newArrayList<>();StringsearchKey = "\"" + key + "\":";intstart = json.indexOf(searchKey);if (start == -1) return result;intbracketStart = json.indexOf("[", start);intbracketEnd = json.indexOf("]", bracketStart);if (bracketStart == -1 || bracketEnd == -1) return result;StringarrayContent = json.substring(bracketStart + 1, bracketEnd);String[] items = arrayContent.split(",");for (String item : items) {
result.add(item.trim().replace("\"", ""));}
return result;}
```
---
### Chapter 24 — REST APIs
**Exercise 1:** Add a GET endpoint for a single ticket by ID.
 
```javapublic String getTicket(int id) {
Ticketticket = tickets.get(id);if (ticket == null) {
return"{\"error\":\"Ticket not found\"}";}
return ticket.toJson();}
```
**Exercise 2:** Add a PUT endpoint to update a ticket's status.
 
```javapublic String updateTicket(int id, String status) {
Ticketticket = tickets.get(id);if (ticket == null) {
return"{\"error\":\"Ticket not found\"}";}
ticket.setStatus(status);return ticket.toJson();}
```
**Exercise 3:** Add a DELETE endpoint to delete a ticket.
 
```javapublic String deleteTicket(int id) {
if (tickets.containsKey(id)) {
tickets.remove(id);return"{\"success\":true,\"message\":\"Ticket deleted\"}";}
return"{\"error\":\"Ticket not found\"}";}
```
**Exercise 4 (Challenge):** Add a GET endpoint that returns orders filtered by client name.
 
```javapublic String getOrdersByClient(String client) {
StringBuilderresult = newStringBuilder();result.append("{\"orders\":[");booleanfirst = true;for (Order order : orders.values()) {
if (order.getClient().equalsIgnoreCase(client)) {
if (!first) result.append(",");result.append(order.toJson());first = false;}
}
result.append("]}");return result.toString();}
```
---
## APPENDIX B — Complete Glossary
### A
**Abstract Class**
- A class that cannot be instantiated and may contain abstract methods.
- Chapter: 42
 
**API (Application Programming Interface)**
- A set of rules that allows programs to communicate with each other.
- Chapter: 24
 
**ArrayList**
- A dynamic collection that can grow and shrink.
- Chapter: 17
 
**Array**
- A fixed-size container for multiple values of the same type.
- Chapter: 6
 
**Authentication**
- The process of verifying a user's identity.
- Chapter: 41
 
**Authorization**
- The process of determining what a user is allowed to do.
- Chapter: 41
---
### B
 
**Boolean**
- A data type that can be true or false.
- Chapter: 2
 
**Branch**
- A separate line of development in Git.
- Chapter: 32
 
**Bug**
- An error in a program that causes unexpected behavior.
- Chapter: 21
 
**Build Tool**
- A tool that automates compilation, testing, and packaging.
- Chapter: 34
 
**Bytecode**
- The intermediate representation of Java code that runs on the JVM.
- Chapter: 1
---
### C
 
**Cache**
- Temporary storage for frequently accessed data.
- Chapter: 43
 
**Catch**
- A block that handles an exception.
- Chapter: 12
 
**CI/CD**
- Continuous Integration and Continuous Delivery.
- Chapter: 36
 
**Class**
- A blueprint for creating objects.
- Chapter: 9
 
**Collection**
- A data structure that stores multiple elements.
- Chapter: 17
 
**Commit**
- A snapshot of the project in Git.
- Chapter: 32
 
**Compilation**
- The process of converting source code into bytecode.
- Chapter: 1
 
**Condition**
- A boolean expression that controls program flow.
- Chapter: 4
 
**Configuration**
- External settings that control application behavior.
- Chapter: 36
 
**Constructor**
- A special method that initializes an object.
- Chapter: 10
 
**Container**
- A lightweight, standalone executable package of software.
- Chapter: 36
 
**Controller**
- A component that handles incoming requests.
- Chapter: 42
---
### D
 
**Database**
- An organized collection of data.
- Chapter: 29
 
**DTO (Data Transfer Object)**
- An object that carries data between processes.
- Chapter: 42
 
**Debugging**
- The process of finding and fixing errors.
- Chapter: 15
 
**Dependency**
- An external library used by a project.
- Chapter: 34
 
**Dependency Injection**
- A design pattern where dependencies are provided from outside.
- Chapter: 42
 
**Docker**
- A platform for running applications in containers.
- Chapter: 36
 
**Double**
- A data type for decimal numbers.
- Chapter: 2
---
### E
 
**Encapsulation**
- Hiding internal data and controlling access.
- Chapter: 11
 
**Endpoint**
- A URL that provides access to a resource.
- Chapter: 24
 
**Entity**
- A Java class mapped to a database table.
- Chapter: 30
 
**Environment Variable**
- A value set in the operating system that can be read by an application.
- Chapter: 36
 
**Exception**
- An event that interrupts the normal flow of a program.
- Chapter: 12
---
### F
 
**Field**
- A variable that belongs to an object.
- Chapter: 9
 
**File**
- A persistent storage for data.
- Chapter: 20
 
**Finally**
- A block that always executes after try/catch.
- Chapter: 12
 
**For Loop**
- A loop that repeats a specific number of times.
- Chapter: 5
 
**Framework**
- A set of libraries and tools for building applications.
- Chapter: 33
---
### G
 
**Getter**
- A method that reads a private field.
- Chapter: 11
 
**Git**
- A version control system for tracking changes.
- Chapter: 32
 
**GitHub**
- A platform for hosting Git repositories.
- Chapter: 33
 
**Gradle**
- A build automation tool.
- Chapter: 34
---
### H
 
**HashMap**
- A collection that stores key-value pairs.
- Chapter: 18
 
**HashSet**
- A collection that stores unique values.
- Chapter: 19
 
**HTTP**
- Hypertext Transfer Protocol, used for web communication.
- Chapter: 22
---
### I
**IDE**
- Integrated Development Environment.
- Chapter: 1
 
**If-Else**
- A conditional statement that controls program flow.
- Chapter: 4
 
**Inheritance**
- The mechanism where one class acquires the properties of another.
- Chapter: 42
 
**Int**
- A data type for whole numbers.
- Chapter: 2
 
**Integration Test**
- A test that verifies how different components work together.
- Chapter: 27
 
**Interface**
- A contract that defines what a class must implement.
- Chapter: 42
---
### J
 
**JAR**
- Java Archive, a packaged Java application.
- Chapter: 35
 
**JDK**
- Java Development Kit.
- Chapter: 1
 
**JSON**
- JavaScript Object Notation, a data exchange format.
- Chapter: 23
 
**JUnit**
- A framework for writing tests in Java.
- Chapter: 27
 
**JVM**
- Java Virtual Machine.
- Chapter: 1
---
### L
 
**LLM**
- Large Language Model.
- Chapter: 39
 
**Logging**
- Recording events and information about program execution.
- Chapter: 37
 
**Loop**
- A control structure that repeats code.
- Chapter: 5
---
### M
 
**Main Method**
- The entry point of a Java program.
- Chapter: 1
 
**Maven**
- A build automation tool.
- Chapter: 34
 
**Method**
- A block of code that performs a specific task.
- Chapter: 7
 
**Microservices**
- An architectural style where applications are composed of small services.
- Chapter: 45
 
**Middleware**
- Software that connects different applications or services.
- Chapter: 42
 
**Mockito**
- A framework for creating test doubles.
- Chapter: 27
---
### O
 
**Object**
- An instance of a class.
- Chapter: 9
 
**ORM**
- Object-Relational Mapping, a technique for mapping Java objects to database tables.
- Chapter: 30
---
### P
 
**Polymorphism**
- The ability of an object to take many forms.
- Chapter: 42
 
**Private**
- A visibility modifier that restricts access to the class.
- Chapter: 11
 
**Public**
- A visibility modifier that allows access from anywhere.
- Chapter: 11
 
**Pull Request**
- A request to merge changes from one branch to another.
- Chapter: 33
 
**Push**
- The action of sending changes to a remote repository.
- Chapter: 33
---
### R
 
**Repository**
- A component that handles data access.
- Chapter: 30
 
**REST**
- Representational State Transfer, an architectural style for web APIs.
- Chapter: 24
 
**Return**
- The statement that gives back a value from a method.
- Chapter: 7
---
### S
 
**Scanner**
- A class for reading user input.
- Chapter: 8
 
**Service**
- A component that contains business logic.
- Chapter: 42
 
**Session**
- A way to remember a user across multiple requests.
- Chapter: 27
 
**Setter**
- A method that writes to a private field.
- Chapter: 11
 
**Socket**
- A communication endpoint for network connections.
- Chapter: 26
 
**Spring Boot**
- A framework for building Java applications.
- Chapter: 45
 
**Static**
- A modifier that indicates a member belongs to the class.
- Chapter: 12
 
**String**
- A data type for text.
- Chapter: 2
---
### T
 
**Testing**
- The process of verifying that code works as expected.
- Chapter: 21
 
**Thread**
- An independent path of execution.
- Chapter: 26
 
**Try-Catch**
- A structure for handling exceptions.
- Chapter: 12
---
### U
 
**Unit Test**
- A test that verifies the behavior of a single component.
- Chapter: 27
---
### V
 
**Variable**
- A named container for storing data.
- Chapter: 2
 
**Version Control**
- A system for tracking changes to code.
- Chapter: 32
 
**Void**
- A return type indicating that a method returns nothing.
- Chapter: 7
---
### W
 
**While Loop**
- A loop that repeats while a condition is true.
- Chapter: 5
---
## APPENDIX C — Quick Reference
### Java Basics
```java// Typesint age = 25;double price = 19.99;boolean ready = true;String name = "Lya";
// Control Flowif (condition) {
// Code} else if (condition) {
// Code} else {
// Code}
 
for (int i = 0; i < 10; i++) {
// Code}
 
while (condition) {
// Code}
 
for (String item : list) {
// Code}
 
// Collections (Use Interfaces)List<String> list = new ArrayList<>();Map<String, String> map = new HashMap<>();Set<String> set = new HashSet<>();
// Exceptionstry {
// Risky code} catch (SpecificException e) {
// Handle specific} catch (Exception e) {
// Handle any} finally {
// Always runs}
```
### Git Commands (Modern)
```bash# Setupgit initgit add .
git commit -m "Message"
 
# Branches (Modern)git branchgit branch new-branchgit switch branch-name # Replaces git checkoutgit switch -c new-branch # Creates and switchesgit merge branch-name
# Remotegit remote add origin urlgit push -u origin maingit pullgit clone url
# Historygit loggit diffgit status```
 
### Maven Commands
```bashmvn clean compilemvn testmvn packagemvn install```
 
### Docker Commands
```bashdocker build -t name .
docker run -p 8080:8080 namedocker-compose updocker-compose down```
---
## APPENDIX D — Copyright Notice
*Norbert to Java*
Build a Real App from Scratch — No Experience Needed
 
Copyright © 2024 E.J.A.
 
All rights reserved. No part of this book may be reproduced, stored in a retrieval system, or transmitted in any form or by any means, electronic, mechanical, photocopying, recording, or otherwise, without the prior written permission of the author, except in the case of brief quotations embodied in critical reviews and certain other noncommercial uses permitted by copyright law.
 
The code examples in this book are provided for educational purposes only. They are intended to illustrate programming concepts and may require adjustments before being used in a production environment. The author assumes no responsibility for errors or omissions in the code or for damages resulting from its use.
 
The characters Norbert and Lya, the story, and the educational approach are original creations. Any resemblance to actual persons or projects is coincidental.
 
For permission requests, write to the publisher.
 
**Author:** E.J.A.
 
**First Edition:** 2024
 
**ISBN:** 978-0-00000000-0 (Placeholder — replace before publication)
**Printed in the United States**
---
## FINAL PROJECT — Build Your Own Lya
### Requirements
```
✓ Java application (1-50 chapters)✓ Object-Oriented Programming✓ Database (SQLite or PostgreSQL)✓ REST API✓ Unit Tests (JUnit)✓ Git repository✓ Docker deployment✓ Documentation```
 
### Submission Checklist
- [ ] Application runs without errors- [ ] All features from Lya implemented- [ ] Database schema designed- [ ] API endpoints working- [ ] Unit tests passing- [ ] Code pushed to GitHub- [ ] Docker container running- [ ] Documentation complete
---
## FINAL NOTE
 
Thank you for reading Norbert to Java. This book has taken you from:
- A single line of code- To variables, conditions, loops- To classes and objects- To collections and files- To web servers and APIs- To databases and testing- To Git, Maven, Docker- To security and architecture- To AI and cloud- To a complete application
The journey doesn't end here. It's just beginning.
 
Remember:- Start small.
- Make mistakes.
- Learn from them.
- Keep building.
 
Now go build something.
---
**THE END**
The Complete Learning Journey
Copyright © 2024 E.J.A.
All rights reserved. No part of this book may be reproduced, stored in a retrieval system, or transmitted in any form or by any means, without the prior written permission of the author, except in the case of brief quotations embodied in critical reviews and certain other noncommercial uses permitted by copyright law.
Author: E.J.A.
Dedication
To every beginner who has ever stared at a blinking cursor and wondered where to start.
To Norbert, who never gave up.
And to Lya, who taught us that even the simplest code can become something meaningful.
Acknowledgments
This book was born from a simple idea: that programming could be taught through story, through character, and through building something real.
I am grateful to every reader who embarks on this journey. Your curiosity is what makes books like this possible.
Special thanks to the Java community, whose documentation, forums, and open-source projects have helped countless learners. And to the open-source contributors who make tools like Java, Maven, Git, and countless libraries available to everyone.
 
