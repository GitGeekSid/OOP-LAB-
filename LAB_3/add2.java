public class SeriesCalculations {
    public static void main(String[] args) {
        
        double x = 1.0; 
        int sinTerms = 10; 
        double sinX = 0.0; 

       
        for (int n = 0; n < sinTerms; n++) {
            
            double factorial = 1.0;
            for (int i = 1; i <= 2 * n + 1; i++) {
                factorial *= i;
            }

           
            double power = Math.pow(x, 2 * n + 1);

            
            double term = (n % 2 == 0 ? 1 : -1) * (power / factorial);

           
            sinX += term;
        }

        System.out.println("Approximation of sin(" + x + ") is: " + sinX);

        
        int sumTerms = 10; 
        double sum = 0.0; 
       
        for (int i = 1; i <= sumTerms; i++) {
            
            double term = Math.pow(1.0 / i, i);

          
            sum += term;
        }

        System.out.println("Approximation of the sum series is: " + sum);
    }
}
