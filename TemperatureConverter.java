import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Please choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        int choice = 0;
        double temperature = 0;
        boolean validInput = false;

        // Validate user input for choice
        while (!validInput) {
            System.out.print("Enter your choice (1 or 2): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    validInput = true;
                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                scanner.next(); // Clear invalid input
            }
        }

        // Prompt for temperature input and validate it
        validInput = false; // Reset for temperature validation
        while (!validInput) {
            System.out.print("Enter the temperature to convert: ");
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a numeric value for the temperature.");
                scanner.next(); // Clear invalid input
            }
        }

        // Perform the conversion based on the user's choice
        double convertedTemperature;
        if (choice == 1) {
            // Celsius to Fahrenheit conversion
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.printf("The temperature %.2f°C is equal to %.2f°F.%n", temperature, convertedTemperature);
        } else {
            // Fahrenheit to Celsius conversion
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.printf("The temperature %.2f°F is equal to %.2f°C.%n", temperature, convertedTemperature);
        }

        // Close the scanner to release resources
        scanner.close();
    }
}