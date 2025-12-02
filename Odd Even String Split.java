
//Problem Statement: Odd Even String Split
//Given a string S, print 2 strings such that first string containing all characters in odd position(s) and other containing all characters in even position(s).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        // Loop through the string
        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0) {
                odd.append(S.charAt(i)); // Odd positions (1-based)
            } else {
                even.append(S.charAt(i)); // Even positions (1-based)
            }
        }

        System.out.println(odd + " " + even);

        sc.close();
    }
}