import java.util.Scanner;
import java.util.Arrays;

public class prog3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;
        int choice;

        // Input the string from the user
        System.out.println("Enter a string: ");
        inputString = scanner.nextLine();

        // Menu
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Check if the string is a palindrome");
            System.out.println("2. Write the string in alphabetical order");
            System.out.println("3. Reverse the string");
            System.out.println("4. Concatenate the original string with its reverse");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    // Check palindrome
                    if (isPalindrome(inputString)) {
                        System.out.println("The string is a palindrome.");
                    } else {
                        System.out.println("The string is not a palindrome.");
                    }
                    break;
                case 2:
                    // Alphabetical order
                    System.out.println("String in alphabetical order: " + sortAlphabetically(inputString));
                    break;
                case 3:
                    // Reverse the string
                    System.out.println("Reversed string: " + reverseString(inputString));
                    break;
                case 4:
                    // Concatenate original and reversed string
                    String reversedString = reverseString(inputString);
                    System.out.println("Concatenated string: " + inputString + reversedString);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }

    // Method to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    // Method to sort the string in alphabetical order
    public static String sortAlphabetically(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    // Method to reverse the string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
