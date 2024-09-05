class Box {
   
    double width;
    double height;
    double depth;

    
    void setDimensions(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    
    double getVolume() {
        return width * height * depth;
    }
}

public class Main {
    public static void main(String[] args) {
       
        Box myBox = new Box();

        
        myBox.setDimensions(5.0, 10.0, 3.0);

      
        double volume = myBox.getVolume();
        System.out.println("The volume of the box is: " + volume);
    }
}
