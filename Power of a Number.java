// Power of a Number
// Problem Statement:
// Given 2 numbers N and K.check if N is a power of K.Print 'yes' if it is a power of k otherwise print 'no'.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();

        System.out.println(isPower(N, K) ? "yes" : "no");
    }

    public static boolean isPower(long N, long K) {
        if (K == 1) return N == 1;  
        if (K == 0) return N == 0;  
        if (N == 0) return false;

        while (N % K == 0) {
            N /= K;
        }
        return N == 1;
    }
}
