// Counting Subarrays
// Problem Statement:
// Given an array print the number of subarrays that can be formed with it.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // We don't need to read the array elements for this problem
        for (int i = 0; i < N; i++) {
            sc.nextInt();
        }

        long totalSubarrays = (long) N * (N + 1) / 2;
        System.out.println(totalSubarrays);
    }
}
