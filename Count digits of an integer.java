import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a numbers: ");
       int num=sc.nextInt();
       int temp = num;
       int count=0;
       if (num == 0) {
            count = 1;  
        } else {
            if (num < 0) {
                temp = -num;  
            }
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }
        System.out.print(count);
       
    }
}