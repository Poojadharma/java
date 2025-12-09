//  Divisibility Check of a Number
// Problem Statement:
// Given a number N, check if N is divisible by any number less than N (ie.,it leaves no remainder)except 1.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean divisible = false;

        // Check divisors from 2 to N-1
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                divisible = true;
                break;
            }
        }

        if (divisible)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
