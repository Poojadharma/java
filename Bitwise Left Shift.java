// Bitwise Left Shift
// Problem Statement:
// Given 2 numbers N,K print the number after performing bitwise left shift 'K' times.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int result = N << K;   // left shift N by K bits

        System.out.println(result);
    }
}