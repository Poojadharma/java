
//Problem Statement:Perfect Square Product
//Given 2 numbers N,M. Print 'yes' if their product is a perfect square else print 'no'

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long M = sc.nextLong();
        
        long product = N * M;
        long root = (long) Math.sqrt(product);
        
        if (root * root == product) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
        sc.close();
    }
}
