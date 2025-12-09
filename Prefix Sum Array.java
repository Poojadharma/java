// Prefix Sum Array
// Problem Statement:
// Given a number N and an array of N elements, print the prefix sum array.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long sum = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sum += sc.nextInt();
            sb.append(sum).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
