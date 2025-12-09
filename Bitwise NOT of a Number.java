// Bitwise NOT of a Number
// Problem Statement:
// Given a number N, print the Bitwise NOT of that number.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = ~N;   // Bitwise NOT

        System.out.println(result);
    }
}
