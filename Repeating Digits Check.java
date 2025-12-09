// Repeating Digits Check
// Problem Statement:
// Given a number N,check whether it has repeating digits in it.print 'yes' if it has repeating digits otherwise print 'no'.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();  
        HashSet<Character> set = new HashSet<>();
        for (char c : num.toCharArray()) {
            if (set.contains(c)) {
                System.out.println("yes");
                return;
            }
            set.add(c);
        }
       
        System.out.println("no");
    }
}