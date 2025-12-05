// Prime Pairs for a Number
// Problem Statement:
//  Given a number N, print the distinct pairs formed by multiplying two prime numbers (i.e)prime x prime should yield the N.Also print the numbers in descending order.If no such pairs can be formed print '-1'.

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean found = false;

        // Check factors only till sqrt(N)
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                int a = i;
                int b = N / i;

                if (isPrime(a) && isPrime(b)) {
                    found = true;

                    // Print in descending order
                    if (a > b)
                        System.out.println(a + " " + b);
                    else
                        System.out.println(b + " " + a);
                }
            }
        }

        if (!found) {
            System.out.println("-1");
        }
    }

    // Prime check function
    static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}