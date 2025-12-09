//  Kth Digit from Position
// Problem Statement:
// Given a number N, print the kth digit from the given position p(given order N P K).

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        int P = sc.nextInt();
        int K = sc.nextInt();

        String s = String.valueOf(N);

        // Calculate target index (0-based)
        int index = P + K - 1;

        // Print the digit
        System.out.println(s.charAt(index));
    }
}