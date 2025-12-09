// Bitwise XOR of Array Elements
// Problem Statement:
// Given a number N and an array of N elements, find the Bitwise XOR of the array elements.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;   // XOR identity value

        for (int i = 0; i < N; i++) {
            result ^= sc.nextInt();   // bitwise XOR with each element
        }

        System.out.println(result);
    }
}
