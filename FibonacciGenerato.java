import java.util.Scanner;

public class FibonacciGenerator {

    private static final int MAX_VALUE = 10000; // The maximum value that the user can enter

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input
        int userInput; // The user's input

        // Get the user's input and validate it
        while (true) {
            System.out.print("Enter a positive integer less than or equal to " + MAX_VALUE + ": ");
            String input = scanner.nextLine();

            try {
                userInput = Integer.parseInt(input); // Try to parse the user's input as an integer
                if (userInput > 0 && userInput <= MAX_VALUE) { // Check if the input is valid
                    break; // Break out of the loop if the input is valid
                } else {
                    System.out.println("Invalid input. Please enter a positive integer less than or equal to " + MAX_VALUE);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid positive integer.");
            }
        }

        // Generate and print the Fibonacci sequence
        System.out.println("Fibonacci sequence up to " + userInput + ":");
        int[] fibonacciSequence = new int[userInput + 1]; // Create an array to store the Fibonacci sequence
        fibonacciSequence[0] = 0; // Initialize the first Fibonacci number
        fibonacciSequence[1] = 1; // Initialize the second Fibonacci number
        for (int i = 2; i <= userInput; i++) { // Loop through the Fibonacci sequence
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2]; // Calculate the next Fibonacci number
        }

        for (int i = 0; i <= userInput; i++) { // Print the Fibonacci sequence
            System.out.print(fibonacciSequence[i] + " ");
        }
    }
}
