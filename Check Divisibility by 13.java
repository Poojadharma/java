
//Problem Statement:Check Divisibility by 13
//Given a number N, print 'yes' if it is a multiple of 13 else print 'no'.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n % 13 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
        sc.close();
    }
}
