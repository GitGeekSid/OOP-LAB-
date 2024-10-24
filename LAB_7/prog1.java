// Class to store student details
class Student_Detail {
    String name;
    String id;
    static final String college_name = "MIT"; // College name is fixed for all students

    // Constructor to initialize student details
    public Student_Detail(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Method to display student details
    public void display_details() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("College Name: " + college_name);
        System.out.println();
    }
}

public class prog1 {
    public static void main(String[] args) {
        // Creating instances of Student_Detail class
        Student_Detail student1 = new Student_Detail("Alice", "MIT001");
        Student_Detail student2 = new Student_Detail("Bob", "MIT002");
        Student_Detail student3 = new Student_Detail("Charlie", "MIT003");

        // Displaying the details of each student
        System.out.println("Student Records:");
        student1.display_details();
        student2.display_details();
        student3.display_details();
    }
}
