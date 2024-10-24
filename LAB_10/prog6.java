import java.util.Scanner;

public class prog6 { //NegativeRootCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input number from user
            System.out.print("Enter a number to find its square root: ");
            double number = scanner.nextDouble();

            // Check if the number is negative
            if (number < 0) {
                throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
            }

            // Calculate square root
            double result = Math.sqrt(number);
            System.out.println("Square root of " + number + " is: " + result);

        } catch (IllegalArgumentException e) {
            // Handle negative number error
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
