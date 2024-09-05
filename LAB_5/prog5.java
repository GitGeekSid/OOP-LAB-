class Number {
   
    private double value;

    
    public Number(double value) {
        this.value = value;
    }

    
    public boolean isZero() {
        return value == 0;
    }

    
    public boolean isPositive() {
        return value > 0;
    }

   
    public boolean isNegative() {
        return value < 0;
    }

   
    public boolean isOdd() {
        return value % 2 != 0;
    }

  
    public boolean isEven() {
        return value % 2 == 0;
    }

   
    public boolean isPrime() {
        if (value < 2 || value != (int) value) {
            return false;
        }
        int intValue = (int) value;
        for (int i = 2; i <= Math.sqrt(intValue); i++) {
            if (intValue % i == 0) {
                return false;
            }
        }
        return true;
    }

   
    public boolean isArmstrong() {
        if (value != (int) value) {
            return false;
        }
        int intValue = (int) value;
        int originalNumber = intValue;
        int sum = 0;
        int digits = 0;

       
        while (intValue != 0) {
            digits++;
            intValue /= 10;
        }

        intValue = originalNumber;

      
        while (intValue != 0) {
            int remainder = intValue % 10;
            sum += Math.pow(remainder, digits);
            intValue /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        
        Number num = new Number(153);

        
        System.out.println("Is zero? " + num.isZero());
        System.out.println("Is positive? " + num.isPositive());
        System.out.println("Is negative? " + num.isNegative());
        System.out.println("Is odd? " + num.isOdd());
        System.out.println("Is even? " + num.isEven());
        System.out.println("Is prime? " + num.isPrime());
        System.out.println("Is Armstrong? " + num.isArmstrong());
    }
}
