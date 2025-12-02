
//Problem Statement:
//Given a floating point number with 1 decimal place round it off to nearest greater integer and print it

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       double n=sc.nextDouble();
       int ipart=(int)n;
       if(n>ipart)
       {
           System.out.print(ipart+1);
       }
       else {
           System.out.println(ipart);
       }
    }
}
