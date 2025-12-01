import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isprime=true;
        if(num<=1)
        {
            isprime=false;
        }
        else{
            for(int i=2;i<=num/2;i++)
            {
                if(num%i==0)
                {
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime)
        {
            System.out.print("Prime Number");
        }
        else{
            System.out.print("Not Prime Number");
        }
    }
}

