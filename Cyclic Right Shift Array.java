// Cyclic Right Shift Array
// Problem Statement:
// Given two numbers N,K followed by an array of N elements, print the array after doing right shift K times (in cyclic manner).

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sbAll = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sbAll.append(line).append(" ");
        }
        String all = sbAll.toString().trim();
        if (all.isEmpty()) return;

        String[] toks = all.split("\\s+");
        int[] vals = new int[toks.length];
        for (int i = 0; i < toks.length; i++) {
            vals[i] = Integer.parseInt(toks[i]);
        }

        int idx = 0;
        if (vals.length == 0) return;

        int N = vals[idx++];
        if (N <= 0) {
            return;
        }

        int remaining = vals.length - idx;

        int K;
        int[] arr = new int[N];

        if (remaining >= N + 1) {
            K = vals[idx++];
            for (int i = 0; i < N; i++) {
                arr[i] = vals[idx++];
            }
        } else if (remaining == N) {
            for (int i = 0; i < N; i++) {
                arr[i] = vals[idx++];
            }
            K = 0;
        } else if (remaining == 1 + N - 1) {
            for (int i = 0; i < N && idx < vals.length; i++) {
                arr[i] = vals[idx++];
            }
            K = (idx < vals.length) ? vals[idx++] : 0;
        } else {
           
            int available = Math.min(N, vals.length - idx);
            for (int i = 0; i < available; i++) arr[i] = vals[idx++];
            K = 0;
        }
        if (N == 0) {
            return;
        }
        if (N == 1) {
            System.out.println(arr[0]);
            return;
        }
        K = ((K % N) + N) % N;

        if (K == 0) {
            printArray(arr);
            return;
        }

        int[] res = new int[N];
        for (int i = 0; i < K; i++) {
            res[i] = arr[N - K + i];
        }
        for (int i = K; i < N; i++) {
            res[i] = arr[i - K];
        }

        printArray(res);
    }

    private static void printArray(int[] a) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (i > 0) out.append(" ");
            out.append(a[i]);
        }
        System.out.println(out.toString());
    }
}
