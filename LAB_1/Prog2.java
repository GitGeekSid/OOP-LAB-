// Write a Java program to enter 10 numbers and display the number of positive, negative and zeros number
import java.util.Scanner;
class Prog2
{
    public static void main(String[] args)
    {
        int c1=0;
        int c2=0;
        //int c3=0;
        Scanner sc=new Scanner(System.in);
        for (int i=1;i<=10;i++)
        {
            int a=sc.nextInt();
            if(a>0)
            {
                c1++;
            }
            if(a<0)
            {
                c2++;
            }
        }
        System.out.println("Number of positive numbers: "+c1);
        System.out.println("Number of negative numbers: "+c2);
        System.out.println("Number of zeros: "+(10-(c1+c2)));
    }
}