import java.util.Scanner;

public class prog4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Input two strings from the user
        System.out.println("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String string2 = scanner.nextLine();

        // Menu
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Compare two strings");
            System.out.println("2. Convert uppercase characters to lowercase and vice-versa");
            System.out.println("3. Check if one string is a substring of the other");
            System.out.println("4. If substring found, replace it with 'Hello'");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    // Compare two strings
                    compareStrings(string1, string2);
                    break;
                case 2:
                    // Convert uppercase to lowercase and vice versa
                    System.out.println("String 1 after case conversion: " + swapCase(string1));
                    System.out.println("String 2 after case conversion: " + swapCase(string2));
                    break;
                case 3:
                    // Check if one string is a substring of the other
                    checkSubstring(string1, string2);
                    break;
                case 4:
                    // Replace the substring with "Hello"
                    replaceSubstring(string1, string2);
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

    // Method to compare two strings
    public static void compareStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }
    }

    // Method to convert uppercase to lowercase and vice versa
    public static String swapCase(String str) {
        StringBuilder swapped = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                swapped.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                swapped.append(Character.toUpperCase(c));
            } else {
                swapped.append(c);
            }
        }
        return swapped.toString();
    }

    // Method to check if one string is a substring of the other
    public static void checkSubstring(String str1, String str2) {
        if (str1.contains(str2)) {
            System.out.println("\"" + str2 + "\" is a substring of \"" + str1 + "\"");
        } else if (str2.contains(str1)) {
            System.out.println("\"" + str1 + "\" is a substring of \"" + str2 + "\"");
        } else {
            System.out.println("Neither string is a substring of the other.");
        }
    }

    // Method to replace the substring with "Hello"
    public static void replaceSubstring(String str1, String str2) {
        if (str1.contains(str2)) {
            String replacedString = str1.replace(str2, "Hello");
            System.out.println("After replacement: " + replacedString);
        } else if (str2.contains(str1)) {
            String replacedString = str2.replace(str1, "Hello");
            System.out.println("After replacement: " + replacedString);
        } else {
            System.out.println("No substring found to replace.");
        }
    }
}
