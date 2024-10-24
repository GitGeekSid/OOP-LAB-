import java.util.Scanner;

public class prog1 {
    public static void main(String[] args) {
        // Input a multi-line string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string (type 'END' on a new line to stop):");

        StringBuilder inputString = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).equals("END")) {
            inputString.append(line).append("\n");
        }

        // Convert the StringBuilder to String for processing
        String str = inputString.toString().trim();

        // Count the number of characters
        int charCount = str.replace("\n", "").length(); // excluding line breaks

        // Count the number of words
        String[] words = str.split("\\s+");
        int wordCount = words.length;

        // Count the number of lines
        String[] lines = str.split("\n");
        int lineCount = lines.length;

        // Count the number of vowels
        int vowelCount = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Display the results
        System.out.println("Number of characters (excluding line breaks): " + charCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of vowels: " + vowelCount);
    }
}
