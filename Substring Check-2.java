// Substring Check-2
// Problem Statement:
// Given 2 strings.check if the second string is a substring of the first string.Print 'yes' if there exists a valid substring otherwise print 'no'.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();  
        String s2 = sc.next();  
        if (s1.contains(s2)) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}