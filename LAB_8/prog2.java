// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();
}

// Class for Rectangle that extends the abstract class Shape
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the calculateArea method for rectangle
    @Override
    double calculateArea() {
        return length * width;
    }
}

// Class for Circle that extends the abstract class Shape
class Circle extends Shape {
    double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the calculateArea method for circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class prog2 {
    public static void main(String[] args) {
        // Create a Rectangle object and calculate the area
        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());

        // Create a Circle object and calculate the area
        Circle circle = new Circle(3.5);
        System.out.println("Area of the circle: " + circle.calculateArea());
    }
}
