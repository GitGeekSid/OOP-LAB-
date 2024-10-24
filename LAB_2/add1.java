import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

       
        int resultA = (a << 2) + (b >> 2);
        System.out.println("Result of (a << 2) + (b >> 2): " + resultA);

       
        boolean resultB = (b > 0);
        System.out.println("Result of (b > 0): " + resultB);

       
        int resultC = (a + b * 100) / 10;
        System.out.println("Result of (a + b * 100) / 10: " + resultC);

       
        int resultD = a & b;
        System.out.println("Result of a & b: " + resultD);

        scanner.close();
    }
}
