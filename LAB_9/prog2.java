import java.util.Scanner;

public class prog2 {
    public static void main(String[] args) {
        // Input the word from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String inputWord = scanner.nextLine();

        // Replace repeating characters
        String result = replaceRepeatingChars(inputWord);

        // Output the result
        System.out.println("Word with repeating characters replaced: " + result);
    }

    // Method to replace repeating characters
    public static String replaceRepeatingChars(String word) {
        // StringBuilder to store the modified string
        StringBuilder modifiedWord = new StringBuilder();
        word = word.toLowerCase();  // Convert to lowercase for uniform comparison

        // Loop through the word
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (isRepeatingChar(word, currentChar)) {
                // Replace repeating characters with '*'
                modifiedWord.append('*');
            } else {
                // Keep non-repeating characters as is
                modifiedWord.append(currentChar);
            }
        }

        return modifiedWord.toString();
    }

    // Helper method to check if a character repeats in the word
    public static boolean isRepeatingChar(String word, char ch) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                count++;
            }
        }
        return count > 1;  // Character repeats if it occurs more than once
    }
}
