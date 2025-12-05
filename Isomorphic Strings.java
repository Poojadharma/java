// Isomorphic Strings
// Problem Statement:
// Given 2 strings,check whether it is isomorphic.If it is not isomorphic print '-1'.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (s1.length() != s2.length()) {
            System.out.println("-1");
            return;
        }
        int n = s1.length();
        char[] map1 = new char[256];
        char[] map2 = new char[256];
        Arrays.fill(map1, '\0');
        Arrays.fill(map2, '\0');
        for (int i = 0; i < n; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (map1[c1] == '\0' && map2[c2] == '\0') {
                map1[c1] = c2;
                map2[c2] = c1;
            }
            else {
                if (map1[c1] != c2 || map2[c2] != c1) {
                    System.out.println("no");
                    return;
                }
            }
        }

        System.out.println("yes");
    }
}
