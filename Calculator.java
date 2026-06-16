import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char again;

        do {
            System.out.println("\n=== Calculator ===");

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.println("\nChoose operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            int result = 0;
            boolean validOperation = true;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;

                case 2:
                    result = num1 - num2;
                    break;

                case 3:
                    result = num1 * num2;
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero!");
                        validOperation = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("Result = " + result);
            }

            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            again = sc.next().charAt(0);

        } while (again == 'y' || again == 'Y');

        System.out.println("Thank you for using the calculator!");
        sc.close();
    }
}
