/*3.	Write a Java program to generate prime numbers between n and m.(Hint: 
A prime number is a natural number greater than 1
 that has no positive divisors other than 1 and itself. Eg: 2, 3, 5,7,11 etc.)*/

 import java.util.Scanner;
 class prog3
 {
    public static void main(String[] args)
    {
        int count =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter lower limit: ");
        int ll=sc.nextInt();
        System.out.println("Enter upper limit: ");
        int ul=sc.nextInt();
        System.out.println("Prime numbers in between "+ll+" and "+ul+" are: ");
        for(int j=ll;j<=ul;j++)
        {
            for(int i=1;i<=ll;i++)
            {
                if((j%i)==0)
                {
                    count++;
                }
            }
           //System.out.println(count);
            if(count<=2)
                {
                    //System.out.println("Hello");
                    System.out.println(j);
                }
                count =0;
        }
    
    }
 }

