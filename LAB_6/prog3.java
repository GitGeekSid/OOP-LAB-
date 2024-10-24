// Base class Bank
class Bank {
    // Method to return the rate of interest (to be overridden)
    public double getRateOfInterest() {
        return 0.0; // Default interest rate, overridden in derived classes
    }
}

// Derived class SBI
class SBI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 8.0; // SBI rate of interest is 8%
    }
}

// Derived class ICICI
class ICICI extends Bank {
    @Override
    public double getRateOfInterest() {
        return 7.0; // ICICI rate of interest is 7%
    }
}

// Derived class AXIS
class AXIS extends Bank {
    @Override
    public double getRateOfInterest() {
        return 9.0; // AXIS rate of interest is 9%
    }
}

public class prog3 {
    public static void main(String[] args) {
        Bank bank; // Reference of type Bank (dynamic method dispatch)

        // Create objects of SBI, ICICI, and AXIS
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        // Display rate of interest for SBI
        bank = sbi;
        System.out.println("Rate of interest for SBI: " + bank.getRateOfInterest() + "%");

        // Display rate of interest for ICICI
        bank = icici;
        System.out.println("Rate of interest for ICICI: " + bank.getRateOfInterest() + "%");

        // Display rate of interest for AXIS
        bank = axis;
        System.out.println("Rate of interest for AXIS: " + bank.getRateOfInterest() + "%");
    }
}
