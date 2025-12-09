// Max Sum of Consecutive Pairs
// Problem Statement:
// Given a number N and an array of N integers, find the maximum sum of the maximum elements obtained by considering all consecutive pairs of adjacent elements after rearranging the array suitably.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int[] rearr = new int[N];
        int l = 0, r = N - 1, idx = 0;

       
        while (l <= r) {
            rearr[idx++] = arr[l++];
            if (l <= r) rearr[idx++] = arr[r--];
        }

        long sum = 0;
        for (int i = 0; i < N - 1; i++) {
            sum += Math.max(rearr[i], rearr[i + 1]);
        }

        System.out.println(sum);
    }
}