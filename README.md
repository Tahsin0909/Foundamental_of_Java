# Fundamental of Java ☕️

This repository is my learning journey while studying **Java fundamentals from beginner level**.

The goal is simple:

> Learn one concept at a time, practice it with a small problem, and build a strong Java foundation before moving to advanced topics.

If you are also a beginner, you can follow this repository **day by day** and practice the problems in the same order.

---

## 🎯 Learning Goal

This repository focuses on the Java fundamentals that are important before moving into bigger topics such as:

- Advanced OOP
- Data Structures & Algorithms
- Java Collections
- Exception Handling
- File Handling
- JDBC
- Spring Boot

I am keeping the learning path practical. Each day has:

1. **What to learn**
2. **What to practice**
3. **A small real-world problem**
4. **My solution/code**

Try to solve the problem yourself before looking at the solution.

---

# 📚 Learning Roadmap

| Day | Topic | Main Practice |
|---|---|---|
| Day 01 | Strings — Part 1 | Full Name Formatter |
| Day 02 | Strings — Part 2 | Username Cleaner |
| Day 03 | Java Math & Booleans | BMI Calculator |
| Day 04 | If...Else | Grade Classifier |
| Day 05 | Switch | Day Planner |
| Day 06 | While & Do-While | Number Guesser |
| Day 07 | For & For-Each | Multiplication Table |
| Day 08 | Arrays | Student Score Summary |
| Day 09 | Methods | Mini Calculator |
| Day 10 | OOP — Classes & Objects | Bank Account |

---

# 🗓️ Day 01 — Strings Part 1

### Learn

Start with the basic Java `String` type.

Topics:

- String declaration
- Creating a String variable
- String concatenation using `+`
- Combining numbers and Strings
- `.length()`
- Storing Strings in variables
- Printing Strings using `System.out.println()`

### Example

```java
String firstName = "Tahsin";
String lastName = "Dev";

String fullName = firstName + " " + lastName;

System.out.println("Full name: " + fullName);
System.out.println("Characters: " + fullName.length());
```

### Practice

**Problem: Full Name Formatter**

Create two String variables:

```java
firstName
lastName
```

Concatenate them with a space and print:

```text
Full name: Tahsin Dev
```

Then print the total character count of the full name.

### Hint

```java
String full = firstName + " " + lastName;
```

Use:

```java
full.length()
```

### Goal

By the end of Day 01, you should understand:

- How to create a String
- How to combine Strings
- How numbers and Strings work together with `+`
- How to find the length of a String

---

# 🗓️ Day 02 — Strings Part 2

### Learn

- Special characters: `\n`, `\t`, `\"`
- `indexOf()`
- `substring()`
- `toUpperCase()`
- `toLowerCase()`
- `replace()`
- `trim()`
- `contains()`

### Practice

**Problem: Username Cleaner**

Start with:

```java
String username = "  Tahsin Dev  ";
```

Clean it by:

1. Removing extra spaces
2. Converting it to lowercase
3. Replacing spaces with `_`
4. Checking whether it contains `"a"`

Expected result:

```text
tahsin_dev
true
```

---

# 🗓️ Day 03 — Java Math & Booleans

### Learn

- `Math.max()`
- `Math.min()`
- `Math.sqrt()`
- `Math.pow()`
- `Math.round()`
- `Math.random()`
- `boolean`
- Boolean expressions

### Practice

**Problem: BMI Calculator**

Create:

```java
double weight;
double height;
```

Calculate:

```text
BMI = weight / (height * height)
```

Round the BMI and create a Boolean variable:

```java
boolean isOverweight = bmi > 25;
```

Print both values.

---

# 🗓️ Day 04 — If...Else

### Learn

- `if`
- `else`
- `else if`
- Ternary operator `?:`
- Nested `if`
- `&&`
- `||`
- `!`

### Practice

**Problem: Grade Classifier**

Create an integer `score`.

Use:

```text
90+  → A
80–89 → B
70–79 → C
60–69 → D
Below 60 → F
```

Then use a ternary operator to determine:

```text
Pass
Fail
```

---

# 🗓️ Day 05 — Switch

### Learn

- `switch`
- `case`
- `break`
- `default`
- Switch with Strings
- Fall-through behavior

### Practice

**Problem: Day Planner**

Create:

```java
String day = "Monday";
```

Use a switch to print a task for each day.

Example:

```text
Monday → Plan the week!
Tuesday → Practice Java!
```

Also add a `default` case:

```text
Enjoy your day!
```

---

# 🗓️ Day 06 — While & Do-While Loops

### Learn

- `while`
- `do-while`
- `break`
- `continue`
- Loop counters
- Avoiding infinite loops

### Practice

**Problem: Number Guesser**

Use:

```java
int secret = 7;
int[] guesses = {3, 9, 5, 7, 1};
```

Go through the guesses using a `while` loop.

Print each attempt.

Stop when the correct number is found.

Finally print the number of attempts.

---

# 🗓️ Day 07 — For & For-Each Loops

### Learn

- `for`
- Loop variable
- Nested loops
- `for-each`
- `break`
- `continue`

### Practice

**Problem: Multiplication Table**

Use nested loops to create a `5 × 5` multiplication table.

Example:

```text
1   2   3   4   5
2   4   6   8   10
3   6   9   12  15
...
```

Use `\t` to align the columns.

---

# 🗓️ Day 08 — Java Arrays

### Learn

- Array declaration
- Array initialization
- Array indexes
- `array.length`
- Looping through arrays
- 2D arrays
- `Arrays.sort()`

### Practice

**Problem: Student Score Summary**

Use:

```java
int[] scores = {85, 92, 78, 90, 65};
```

Find:

- Highest score
- Lowest score
- Total
- Average

### Bonus

Sort the array and print it.

---

# 🗓️ Day 09 — Java Methods

### Learn

- Creating methods
- Parameters
- Return values
- `void`
- Return types
- Method overloading
- Scope
- `static` methods

### Practice

**Problem: Mini Calculator**

Create four methods:

```java
add(double a, double b)
subtract(double a, double b)
multiply(double a, double b)
divide(double a, double b)
```

Each method should return a `double`.

Call them from `main()` and print the results.

---

# 🗓️ Day 10 — OOP: Classes & Objects

### Learn

- `class`
- Objects
- `new`
- Attributes
- Methods
- Constructors
- `this`
- Calling object methods

### Practice

**Problem: Bank Account**

Create a `BankAccount` class with:

```text
owner
balance
```

Add:

```text
constructor
deposit()
withdraw()
printBalance()
```

The withdraw method should reject the withdrawal when the balance is insufficient.

Create two account objects and test them.

---

# 🧠 How to Use This Repository

If you are learning Java from the beginning, follow this process every day:

### 1. Learn

Read/watch the basic concepts for the day's topic.

### 2. Write small examples

Don't immediately jump to the main problem.

For example, while learning Strings:

```java
String name = "Tahsin";

System.out.println(name);
System.out.println(name.length());
System.out.println(name.toUpperCase());
```

### 3. Solve the daily problem

Try to solve it without looking at the solution.

### 4. Make mistakes

Errors are part of learning.

Try to understand:

- What caused the error?
- What did Java expect?
- How did you fix it?

### 5. Make your own version

After solving the problem, change the values or add a small feature.

For example, after the BMI calculator, try adding:

```text
Underweight
Normal
Overweight
```

---

# 📁 Repository Structure

The Java files in this repository are small practice programs.

Examples:

```text
Foundamental_of_Java/
│
├── Main.java
├── UserNameCleaner.java
├── IndexString.java
├── BmiCalculator.java
├── Grade.java
├── NumberGuesser.java
├── MultiplicationTable.java
├── ScoreSummarry.java
├── Calculator.java
├── CoffeeShop.java
└── ReportCard.java
```

Each file represents a concept or a small exercise from the learning journey.

---

# 🚀 My Learning Journey

I am following a simple progression:

```text
Strings
   ↓
Math & Booleans
   ↓
Conditions
   ↓
Switch
   ↓
Loops
   ↓
Arrays
   ↓
Methods
   ↓
Classes & Objects
   ↓
More Java...
```

The purpose is not to learn everything quickly.

The purpose is to build the fundamentals properly.

---

# 🤝 For Other Beginners

If you are also learning Java, you can use this repository as a beginner-friendly roadmap.

You don't need to know advanced programming before starting.

Start with **Day 01**, solve the problem, and move to the next day only when you understand the previous concept.

**Learn → Practice → Make mistakes → Fix → Repeat.**

---

## ⭐ Progress

- [x] Day 01 — Strings Part 1
- [x] Day 02 — Strings Part 2
- [x] Day 03 — Math & Booleans
- [x] Day 04 — If...Else
- [x] Day 05 — Switch
- [x] Day 06 — While & Do-While
- [x] Day 07 — For & For-Each
- [x] Day 08 — Arrays
- [x] Day 09 — Methods
- [x] Day 10 — Classes & Objects

> This repository will continue to grow as I learn more Java.
