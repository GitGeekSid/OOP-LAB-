import java.util.Scanner;

public class prog1//NumberFormatExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            // Attempting to convert the input string to an integer
            int number = Integer.parseInt(input);
            System.out.println("The entered number is: " + number);
        } catch (NumberFormatException e) {
            // Handling the exception if the string cannot be converted to an integer
            System.out.println("Invalid input! '" + input + "' is not a valid number.");
        }

        scanner.close();
    }
}
