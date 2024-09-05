class Complex {
    
    double real;
    double imaginary;

    
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    
    void add(int realNumber) {
        this.real += realNumber;
    }

  
    void add(Complex other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }

    
    void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

    public static void main(String[] args) {
      
        Complex c1 = new Complex(3, 4);    // 3 + 4i
        Complex c2 = new Complex(1, 2);    // 1 + 2i

        c1.add(5);                         // (3 + 5) + 4i = 8 + 4i
        System.out.print("Sum of integer and complex number: ");
        c1.display();

     
        c1.add(c2);                        // (8 + 1) + (4 + 2)i = 9 + 6i
        System.out.print("Sum of two complex numbers: ");
        c1.display();
    }
}
