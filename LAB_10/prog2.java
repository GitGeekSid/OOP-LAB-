//Q2. Write a program that handles ArrayOverflowException. [ Hint: Consider the array size]

import java.util.Scanner;

public class prog2//ArrayOverflowHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        try {
            // Trying to insert values into the array, possibly exceeding the size
            System.out.println("Enter " + size + " elements: ");
            for (int i = 0; i <= size; i++) {  // Using <= to trigger an overflow when i == size
                System.out.print("Enter element for index " + i + ": ");
                arr[i] = scanner.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception if we try to go beyond the array's size
            System.out.println("Array Overflow! You are trying to access an index outside the array bounds.");
        }

        scanner.close();
    }
}
