//Sum of Squares of Digits
// Problem Statement:
//Given a number N, print the sum of the squares of its digits.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();  // Read N as a string
        sc.close();

        long sum = 0;  // Use long to handle large sums

        // Loop through each digit in the string
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0'; // Convert char to int
            sum += digit * digit;          // Add square of digit
        }

        System.out.println(sum);
    }
}