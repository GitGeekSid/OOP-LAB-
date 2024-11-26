//Q5. Write a program for validating matrix. [Hint: Square matrix ] 

import java.util.Scanner;

public class prog5 {//MatrixValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows and columns from the user
        System.out.print("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns in the matrix: ");
        int columns = scanner.nextInt();

        // Validate if it's a square matrix
        if (rows != columns) {
            System.out.println("This is not a square matrix. The number of rows and columns must be equal.");
        } else {
            // It's a square matrix, so accept and display the matrix
            int[][] matrix = new int[rows][columns];
            
            System.out.println("Enter the elements of the matrix:");

            // Input matrix elements
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Display the matrix
            System.out.println("The matrix you entered is:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println(); // Move to next row
            }
        }

        scanner.close();
    }
}
