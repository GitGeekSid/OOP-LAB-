// User-defined exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main class
public class prog4 {//UserDefinedExceptionDemo 
    // Method to check if the age is valid (>= 18)
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18. Access denied!");
        } else {
            System.out.println("Access granted. You are old enough.");
        }
    }

    public static void main(String[] args) {
        try {
            int age = 16; // Example invalid age
            checkAge(age);
        } catch (InvalidAgeException e) {
            // Handling the custom exception
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
