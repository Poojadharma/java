// Counting Distinct Pairs
// Problem Statement:
// Given an array A of N elements, count the number of distinct pairs (i,j) such that i < j and A[i] < A[j].If no such pairs can be made print -1

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Set<String> pairSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] < A[j]) {
                    pairSet.add(A[i] + "," + A[j]);
                }
            }
        }

        if (pairSet.size() == 0)
            System.out.println(-1);
        else
            System.out.println(pairSet.size());
    }
}
