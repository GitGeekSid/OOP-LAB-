import java.util.Scanner;

public class NonDiagonalElements {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the size of the square matrix (n x n): ");
        int size = scanner.nextInt();

       
        int[][] matrix = new int[size][size];

        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;

        System.out.println("Non-diagonal elements are:");

        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
               
                if (i != j && i + j != size - 1) {
                   
                    System.out.print(matrix[i][j] + " ");
                    
                    sum += matrix[i][j];
                }
            }
        }

       
        System.out.println();
        System.out.println("Sum of non-diagonal elements: " + sum);

    }
}
