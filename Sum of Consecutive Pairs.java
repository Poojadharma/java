// Sum of Consecutive Pairs
// Problem Statement:
// Given a number N and an array of N elements, find the sum of the sums obtained by considering all consecutive pairs of adjacent elements.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        long sum = 0;

        for (int i = 0; i < N - 1; i++) {
            sum += arr[i] + arr[i + 1];
        }

        System.out.println(sum);
    }
}
