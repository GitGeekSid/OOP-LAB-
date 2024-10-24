import java.util.Scanner;

// Base class for Student
class Student {
    String registrationNumber;
    String name;
    int age;

    // Constructor for initializing student details
    public Student(String registrationNumber, String name, int age) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class for UG Students
class UGStudent extends Student {
    int semester;
    double fees;
    static int totalUGAdmissions = 0; // Static variable to count total UG admissions

    // Constructor for initializing UG student details
    public UGStudent(String registrationNumber, String name, int age, int semester, double fees) {
        super(registrationNumber, name, age);
        this.semester = semester;
        this.fees = fees;
        totalUGAdmissions++; // Increment the count of UG admissions
    }

    // Method to display UG student details
    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: $" + fees);
    }
}

// Derived class for PG Students
class PGStudent extends Student {
    int semester;
    double fees;
    static int totalPGAdmissions = 0; // Static variable to count total PG admissions

    // Constructor for initializing PG student details
    public PGStudent(String registrationNumber, String name, int age, int semester, double fees) {
        super(registrationNumber, name, age);
        this.semester = semester;
        this.fees = fees;
        totalPGAdmissions++; // Increment the count of PG admissions
    }

    // Method to display PG student details
    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: $" + fees);
    }
}

public class prog2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set maximum possible admissions
        int maxAdmissions = 5;

        // Arrays to store UG and PG students
        UGStudent[] ugStudents = new UGStudent[maxAdmissions];
        PGStudent[] pgStudents = new PGStudent[maxAdmissions];

        int ugCount = 0, pgCount = 0;

        // Input for a few UG and PG students
        System.out.println("Enter details for UG students:");
        for (int i = 0; i < maxAdmissions; i++) {
            System.out.println("Enter UG Student " + (i + 1) + " details:");
            System.out.print("Registration Number: ");
            String regNo = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Semester: ");
            int semester = scanner.nextInt();
            System.out.print("Fees: ");
            double fees = scanner.nextDouble();
            ugStudents[ugCount++] = new UGStudent(regNo, name, age, semester, fees);
        }

        System.out.println("\nEnter details for PG students:");
        for (int i = 0; i < maxAdmissions; i++) {
            System.out.println("Enter PG Student " + (i + 1) + " details:");
            System.out.print("Registration Number: ");
            String regNo = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Semester: ");
            int semester = scanner.nextInt();
            System.out.print("Fees: ");
            double fees = scanner.nextDouble();
            pgStudents[pgCount++] = new PGStudent(regNo, name, age, semester, fees);
        }

        // Display UG student details
        System.out.println("\nUG Students:");
        for (int i = 0; i < ugCount; i++) {
            ugStudents[i].displayStudentDetails();
            System.out.println();
        }

        // Display PG student details
        System.out.println("PG Students:");
        for (int i = 0; i < pgCount; i++) {
            pgStudents[i].displayStudentDetails();
            System.out.println();
        }

        // Display total number of admissions
        System.out.println("Total UG Admissions: " + UGStudent.totalUGAdmissions);
        System.out.println("Total PG Admissions: " + PGStudent.totalPGAdmissions);

        scanner.close();
    }
}
