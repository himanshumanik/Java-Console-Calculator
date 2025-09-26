# Java Console Calculator 🧮

This repository contains the solution for **Task 1: Java Console Calculator**.

## Objective

The goal of this task was to create a basic command-line calculator program in Java that allows users to perform standard arithmetic operations and includes a loop for multiple calculations until the user chooses to exit.

## Features Implemented

* **Console I/O:** Uses the `java.util.Scanner` class to accept user input for numbers and the operator.
* **Arithmetic Operations:** Supports addition (`+`), subtraction (`-`), multiplication (`*`), and division (`/`).
* **Continuous Loop:** The program runs within a `while` loop, allowing for multiple consecutive calculations.
* **Exit Command:** Users can type `exit` when prompted for the first number to gracefully close the application.
* **Error Handling:**
    * Checks for and handles **division by zero**.
    * Uses a `try-catch` block to handle **invalid input** (e.g., non-numeric characters) and prompts the user to re-enter data.

## How to Run

1.  **Clone the repository:**
    ```bash
    git clone [Your Repo URL Here]
    ```
2.  **Compile the Java file:**
    ```bash
    javac Calculator.java
    ```
3.  **Run the compiled class:**
    ```bash
    java Calculator
    ```

## Example Usage
