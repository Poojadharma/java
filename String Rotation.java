//  String Rotation
// Problem Statement:
// Given a string S and an integer K, print the string obtained by rotating the orignal string by K positions.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int k = sc.nextInt();

        int n = s.length();
        k = k % n;
        String rotated = s.substring(k) + s.substring(0, k);

        System.out.print(rotated);
    }
}
