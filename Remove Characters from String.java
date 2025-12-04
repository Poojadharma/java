// Remove Characters from String
//Problem Statement:
// Given a string two strings S1 and S2, remove characters from the S1 which are present in the S2.If S1 becomes empty then print -1

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        HashSet<Character> removeSet = new HashSet<>();
        for (char c : S2.toCharArray()) {
            removeSet.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : S1.toCharArray()) {
            if (!removeSet.contains(c)) {
                result.append(c);
            }
        }
        if (result.length() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(result.toString());
        }
    }
}
