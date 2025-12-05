// Smallest LCM of two numbers
// Problem Statement:
// Given two numbers L,R print the smallest number which is divisible by both L and R.

import java.util.*;

public class Main {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();

        int g = gcd(L, R);
        long lcm = (long)L * R / g;  

        System.out.println(lcm);
    }
}
