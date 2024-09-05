import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

       
        boolean isLeapYear;

        if (year % 4 != 0) {
            isLeapYear = false;  
        } else if (year % 100 != 0) {
            isLeapYear = true;  
        } else if (year % 400 != 0) {
            isLeapYear = false;  
        } else {
            isLeapYear = true;   
        }

       
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}
