import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

      
        int multipliedBy2 = number << 1;

        
        int dividedBy2 = number >> 1;

       
        System.out.println("Original number: " + number);
        System.out.println("After multiplying by 2 (using <<): " + multipliedBy2);
        System.out.println("After dividing by 2 (using >>): " + dividedBy2);
    }
}
