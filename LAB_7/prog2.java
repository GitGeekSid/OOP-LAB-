// Class to count the number of objects created
class ObjectCounter {
    // Static variable to count the number of objects
    static int count = 0;

    // Constructor increments the count whenever an object is created
    public ObjectCounter() {
        count++;
    }

    // Static method to return the number of objects created
    public static int getObjectCount() {
        return count;
    }
}

public class prog2 {
    public static void main(String[] args) {
        // Creating instances of ObjectCounter
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        // Display the number of objects created
        System.out.println("Number of objects created: " + ObjectCounter.getObjectCount());
    }
}
