import java.util.Scanner;

class Employee {
    
    String name;
    String city;
    double basicSalary;
    double daPercent;
    double hraPercent;

    
    void getdata() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        name = scanner.nextLine();

        System.out.print("Enter city: ");
        city = scanner.nextLine();

        System.out.print("Enter basic salary: ");
        basicSalary = scanner.nextDouble();

        System.out.print("Enter DA percentage: ");
        daPercent = scanner.nextDouble();

        System.out.print("Enter HRA percentage: ");
        hraPercent = scanner.nextDouble();
    }

    
    double calculate() {
        return basicSalary + (basicSalary * daPercent / 100) + (basicSalary * hraPercent / 100);
    }

    
    void display() {
        double totalSalary = calculate();
        System.out.println("Employee Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("DA Percentage: " + daPercent);
        System.out.println("HRA Percentage: " + hraPercent);
        System.out.println("Total Salary: " + totalSalary);
    }
}

public class Main {
    public static void main(String[] args) {
       
        Employee emp = new Employee();

       
        emp.getdata();
        emp.display();
    }
}
