import java.util.InputMismatchException;
import java.util.Scanner;

class tempraturecontrol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Temperature Converter:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");
            
            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.next(); // clear the invalid input
                continue;
            }

            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                continue;
            }
            
            System.out.println("Enter temperature:");
            double temp = 0;
            try {
                temp = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid temperature.");
                scanner.next(); // clear the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Result: " + celsiusToFahrenheit(temp) + " °F");
                    break;
                case 2:
                    System.out.println("Result: " + fahrenheitToCelsius(temp) + " °C");
                    break;
            }
        }
        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
