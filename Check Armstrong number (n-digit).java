import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a numbers: ");
       int num=sc.nextInt();
       int sum=0;
       int n=0;
       int orginalnum=num;
       while(orginalnum!=0)
       {
           orginalnum/=10;
           ++n;
           
       }
       orginalnum=num;
       while(orginalnum!=0)
       {
           int rem=orginalnum%10;
           sum+=Math.pow(rem,n);
           orginalnum/=10;
       }
       if(sum==num)
       {
           System.out.print("Armstrong number");
       }
       else{
           System.out.print("Not a Armstron Number");
       }
       
    }
}
