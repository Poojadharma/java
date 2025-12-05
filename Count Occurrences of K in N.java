// Count Occurrences of K in N
// Problem Statement:
// Given 2 numbers N and K.Print the number of occurrences of K in N.If K is not found print '-1'.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        int K = sc.nextInt();

        String s = String.valueOf(N);
        char target = (char)(K + '0');

        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == target) count++;
        }

        if (count == 0)
            System.out.println("-1");
        else
            System.out.println(count);
    }
}
