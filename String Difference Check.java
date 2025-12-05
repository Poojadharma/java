//  String Difference Check
// Problem Statement:
// Given 2 strings and a number K, check whether they differ exactly by K characters.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        // Read input strings and K
        String s1 = sc.next();
        String s2 = sc.next();
        int K = sc.nextInt();
       
        sc.close();
       
        // If lengths are different, they cannot differ by exactly K characters
        if (s1.length() != s2.length()) {
            System.out.println("no");
            return;
        }
       
        int diffCount = 0;
        // Count differing characters
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
            }
        }
       
        // Check if difference matches K
        if (diffCount == K) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}