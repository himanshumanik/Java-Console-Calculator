import java.util.Scanner;

public class Calculator {

    /**
     * Performs the calculation based on the given operands and operator.
     * @param num1 The first number.
     * @param num2 The second number.
     * @param operator The mathematical operator (+, -, *, /).
     * @return The result of the operation, or NaN for division by zero or invalid operator.
     */
    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Double.NaN; // Not a Number
                }
                return num1 / num2;
            default:
                System.out.println("Error: Invalid operator.");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Control variable for the loop
        boolean running = true;

        System.out.println("--- Java Console Calculator ---");

        // Main calculation loop
        while (running) {
            try {
                // 1. Get the first number
                System.out.print("\nEnter first number (or 'exit' to quit): ");
                String input = scanner.next();
                
                // Check for the exit command
                if (input.equalsIgnoreCase("exit")) {
                    running = false;
                    continue; // Skip the rest of the loop and go to the next iteration (which will be the exit condition check)
                }

                // Parse the first number
                double num1 = Double.parseDouble(input);

                // 2. Get the operator
                System.out.print("Enter operator (+, -, *, /): ");
                // Read the operator as a string, and get the first character
                char operator = scanner.next().charAt(0); 

                // 3. Get the second number
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                // 4. Perform calculation
                double result = calculate(num1, num2, operator);

                // 5. Display result (only if the calculation was successful)
                if (!Double.isNaN(result)) {
                    // Format the output to one decimal place for a cleaner look
                    System.out.printf("Result: %.2f %c %.2f = %.2f\n", num1, operator, num2, result);
                }

            } catch (java.util.InputMismatchException e) {
                // Catch errors if the user enters non-numeric input when a number is expected
                System.out.println("Error: Invalid input. Please enter numbers for operands.");
                // Clear the invalid input from the scanner buffer
                scanner.next(); 
            } catch (NumberFormatException e) {
                 // Catch errors if the first input, after not being "exit", cannot be parsed as a double
                System.out.println("Error: Invalid input for the first number. Please enter a number.");
            } catch (Exception e) {
                // Catch any other unexpected errors
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }

        // Close the scanner and exit
        scanner.close();
        System.out.println("\nCalculator closed. Goodbye! 👋");
    }
}
