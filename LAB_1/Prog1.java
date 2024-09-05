//1.	Write a Java program to find area and circumference of a rectangle.
//(Hint: circumference = 2 (length + breadth) ;   area= length x breadth).
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the length and width of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate the area and perimeter (circumference) of the rectangle
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Display the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
