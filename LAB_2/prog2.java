import java.util.Scanner;

public class TypeConversions {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int intNumber = scanner.nextInt();

        System.out.print("Enter a double number: ");
        double doubleNumber = scanner.nextDouble();

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        
        byte intToByte = (byte) intNumber;
        int charToInt = (int) character;
        byte doubleToByte = (byte) doubleNumber;
        int doubleToInt = (int) doubleNumber;

        
       
        System.out.println("Int to Byte: " + intToByte);
        System.out.println("Char to Int: " + charToInt);
        System.out.println("Double to Byte: " + doubleToByte);
        System.out.println("Double to Int: " + doubleToInt);

    }
}
