import java.util.Scanner;

public class TemperatureConverter {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("      Temperature Converter");
        System.out.println("=================================");

        boolean running = true;

        while (running) {

            showMenu();

            int choice = getMenuChoice();

            if (choice == 7) {
                System.out.println("Thank you for using Temperature Converter!");
                running = false;
                continue;
            }

            double temperature = getTemperature();

            double result = 0;
            String targetUnit = "";

            switch (choice) {
                case 1:
                    result = celsiusToFahrenheit(temperature);
                    targetUnit = "°F";
                    break;

                case 2:
                    result = fahrenheitToCelsius(temperature);
                    targetUnit = "°C";
                    break;

                case 3:
                    result = celsiusToKelvin(temperature);
                    targetUnit = "K";
                    break;

                case 4:
                    result = kelvinToCelsius(temperature);
                    targetUnit = "°C";
                    break;

                case 5:
                    result = fahrenheitToKelvin(temperature);
                    targetUnit = "K";
                    break;

                case 6:
                    result = kelvinToFahrenheit(temperature);
                    targetUnit = "°F";
                    break;

                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            System.out.printf("Converted Temperature: %.2f %s%n",
                    result,
                    targetUnit);

            System.out.println();
        }

        scanner.close();
    }

    private static void showMenu() {
        System.out.println();
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.println("7. Exit");
    }

    private static int getMenuChoice() {

        while (true) {

            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();

                if (choice >= 1 && choice <= 7) {
                    return choice;
                }

                System.out.println("Please enter a number between 1 and 7.");
            } else {
                System.out.println("Invalid input. Enter a valid number.");
                scanner.next();
            }
        }
    }

    private static double getTemperature() {

        while (true) {

            System.out.print("Enter temperature value: ");

            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            }

            System.out.println("Invalid temperature. Please enter a valid number.");
            scanner.next();
        }
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    private static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
}
