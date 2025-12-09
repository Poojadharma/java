// Suffix Sum of an Array
// Problem Statement:
// Given a number N and an array of N elements, print the suffix sum of the array.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        long[] suffix = new long[N];
        long sum = 0;

        for (int i = N - 1; i >= 0; i--) {
            sum += arr[i];
            suffix[i] = sum;
        }

        StringBuilder sb = new StringBuilder();
        for (long x : suffix) {
            sb.append(x).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}