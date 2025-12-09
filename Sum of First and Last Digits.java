//  Sum of First and Last Digits
// Problem Statement:
// Given a number N, print the sum of its first and last digit.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine().trim();

        char first = n.charAt(0);               // first digit
        char last = n.charAt(n.length() - 1);   // last digit

        int sum = (first - '0') + (last - '0');

        System.out.println(sum);
    }
}