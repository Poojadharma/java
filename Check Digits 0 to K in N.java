// Check Digits 0 to K in N
// Problem Statement:
// Given a number N and a number K, check if it has all digits from 0 to k in it.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int K = sc.nextInt();

        boolean[] seen = new boolean[K + 1];

        // Mark digits found in N
        for (char c : N.toCharArray()) {
            int d = c - '0';
            if (d >= 0 && d <= K) {
                seen[d] = true;
            }
        }

        // Check if all digits from 0..K are seen
        for (int i = 0; i <= K; i++) {
            if (!seen[i]) {
                System.out.println("no");
                return;
            }
        }

        System.out.println("yes");
    }
}