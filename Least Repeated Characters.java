//  Least Repeated Characters
// Problem Statement:
// Given a string, print the least repeated characters in the string.If there are more than one character repeated preserve the order as in the input.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

       
        LinkedHashMap<Character, Integer> freq = new LinkedHashMap<>();

       
        for (char c : s.toCharArray()) {
            if (c == ' ') continue;
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

       
        if (freq.isEmpty()) {
            System.out.print("");
            return;
        }

       
        int min = Integer.MAX_VALUE;
        for (int f : freq.values()) {
            min = Math.min(min, f);
        }

       
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            if (e.getValue() == min) {
                sb.append(e.getKey());
            }
        }

        System.out.print(sb.toString());
    }
}