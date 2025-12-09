// Sort and Print Original Indices
// Problem Statement:
// Given a number N and an array of N elements,sort the array in increasing order and print the original indices of the elements present in sorted array.

import java.util.*;

public class Main {
    static class Pair {
        int value;
        int index; // original index

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Pair[] arr = new Pair[N];

        for (int i = 0; i < N; i++) {
            arr[i] = new Pair(sc.nextInt(), i + 1); // store 1-based index
        }

        Arrays.sort(arr, (a, b) -> a.value - b.value);

        StringBuilder sb = new StringBuilder();
        for (Pair p : arr) {
            sb.append(p.index).append(" ");
        }

        System.out.print(sb.toString().trim());
    }
}