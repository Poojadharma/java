// Bitwise AND of Array Elements
// Problem Statement:
// Given a number N and an array of N elements ,find the Bitwise AND of the array elements.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = sc.nextInt(); // take the first element as initial AND value

        for (int i = 1; i < N; i++) {
            result &= sc.nextInt();  // bitwise AND with next elements
        }

        System.out.println(result);
    }
}