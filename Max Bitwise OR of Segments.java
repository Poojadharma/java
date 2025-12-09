// Max Bitwise OR of Segments
// Problem Statement:
// Given a number N and an array of N integers, find the maximum of Bitwise OR of all segments.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;

        for (int i = 0; i < N; i++) {
            result |= sc.nextInt();  // OR with each element
        }

        System.out.println(result);
    }
}