
//Problem Statement: Sum of First K Natural Numbers
// Write a program to print the sum of the first K natural numbers.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        // Sum of first K natural numbers formula: n*(n+1)/2
        long sum = (long) K * (K + 1) / 2;

        System.out.println(sum);

        sc.close();
    }
}

