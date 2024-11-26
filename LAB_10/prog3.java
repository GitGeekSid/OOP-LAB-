//Q3. Write a program to enter student’s Name, Roll Number and Marks in three subjects and find the percentage, 
//    grade and handle NumberFormatException.

import java.util.Scanner;

public class prog3 {//StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Input student name and roll number
            System.out.print("Enter Student's Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter Student's Roll Number: ");
            String rollNumber = scanner.nextLine();
            
            // Input marks in three subjects
            System.out.print("Enter marks in Subject 1: ");
            int subject1 = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter marks in Subject 2: ");
            int subject2 = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter marks in Subject 3: ");
            int subject3 = Integer.parseInt(scanner.nextLine());
            
            // Calculate total, percentage, and grade
            int totalMarks = subject1 + subject2 + subject3;
            float percentage = totalMarks / 3.0f;
            char grade = calculateGrade(percentage);
            
            // Display student details, percentage, and grade
            System.out.println("\nStudent Details:");
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);
            
        } catch (NumberFormatException e) {
            // Handling invalid number input
            System.out.println("Invalid input! Please enter numeric values for marks.");
        }

        scanner.close();
    }

    // Method to calculate grade based on percentage
    public static char calculateGrade(float percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
