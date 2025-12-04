// One Character Difference
//Problem Statement:
// Given 2 strings check whether they differ exacly by one character.If yes then print 'yes' otherwise print 'no'

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();

        // If lengths are different, they can't differ by exactly one character
        if (s1.length() != s2.length()) {
            System.out.println("no");
            return;
        }

        int diffCount = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
                if (diffCount > 1) { // Early exit if more than 1 difference
                    System.out.println("no");
                    return;
                }
            }
        }

        // If exactly 1 difference, print yes
        System.out.println(diffCount == 1 ? "yes" : "no");
    }
}
