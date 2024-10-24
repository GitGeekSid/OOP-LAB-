// Interface Shape
interface Shape {
    // Method to calculate the area
    double calculateArea();
}

// Class for Rectangle that implements the Shape interface
class Rectangle implements Shape {
    double length;
    double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the calculateArea method for rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Class for Circle that implements the Shape interface
class Circle implements Shape {
    double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the calculateArea method for circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class prog3 {
    public static void main(String[] args) {
        // Create a Rectangle object and calculate the area
        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());

        // Create a Circle object and calculate the area
        Circle circle = new Circle(3.5);
        System.out.println("Area of the circle: " + circle.calculateArea());
    }
}
