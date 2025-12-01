import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a number1: ");
       int n1=sc.nextInt();
       System.out.print("Enter a number2: ");
       int n2=sc.nextInt();
       System.out.print("Enter a number4: ");
       int n3=sc.nextInt();
       int largest;
       if(n1>=n2 &&n1>=n3)
       {
           largest=n1;
       }
       else if(n2>=n1&&n2>=n3)
       {
           largest=n2;
       }
       else
       {
           largest=n3;
       }
       System.out.print("largest number is: " + largest);
       
    }
}