//  Odd Factors of a Number
// Problem Statement:
// Given a number N, print the odd factors for the N.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean first = true;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0 && i % 2 != 0) {
                if (!first) System.out.print(" ");
                System.out.print(i);
                first = false;
            }
        }
    }
}