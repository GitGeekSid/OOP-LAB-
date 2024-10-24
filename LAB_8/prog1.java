// Interface that is implemented by Hardware and Software classes
interface Product {
    void displayDetails();
    double calculateSales(double[] sales);  // Method to calculate sales over 3 months
}

// Class for hardware items
class Hardware implements Product {
    String category;
    String manufacturer;

    // Constructor to initialize hardware details
    public Hardware(String category, String manufacturer) {
        this.category = category;
        this.manufacturer = manufacturer;
    }

    // Implementing displayDetails() from Product interface
    public void displayDetails() {
        System.out.println("Hardware Item:");
        System.out.println("Category: " + category);
        System.out.println("Manufacturer: " + manufacturer);
    }

    // Implementing calculateSales() from Product interface
    public double calculateSales(double[] sales) {
        double totalSales = 0;
        for (double sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }
}

// Class for software items
class Software implements Product {
    String softwareType;
    String operatingSystem;

    // Constructor to initialize software details
    public Software(String softwareType, String operatingSystem) {
        this.softwareType = softwareType;
        this.operatingSystem = operatingSystem;
    }

    // Implementing displayDetails() from Product interface
    public void displayDetails() {
        System.out.println("Software Item:");
        System.out.println("Type of Software: " + softwareType);
        System.out.println("Operating System: " + operatingSystem);
    }

    // Implementing calculateSales() from Product interface
    public double calculateSales(double[] sales) {
        double totalSales = 0;
        for (double sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }
}

public class prog1 {
    public static void main(String[] args) {
        // Creating hardware and software objects
        Hardware hardware1 = new Hardware("Laptop", "Dell");
        Software software1 = new Software("Antivirus", "Windows");

        // Sales for the last 3 months for both hardware and software
        double[] hardwareSales = {1500, 1800, 1700};  // in dollars
        double[] softwareSales = {500, 600, 550};     // in dollars

        // Display hardware details and calculate total sales for hardware
        hardware1.displayDetails();
        double totalHardwareSales = hardware1.calculateSales(hardwareSales);
        System.out.println("Total Hardware Sales for 3 months: $" + totalHardwareSales);
        System.out.println();

        // Display software details and calculate total sales for software
        software1.displayDetails();
        double totalSoftwareSales = software1.calculateSales(softwareSales);
        System.out.println("Total Software Sales for 3 months: $" + totalSoftwareSales);
    }
}
