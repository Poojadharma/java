// Sorted Prime Factors
// Problem Statement:
// Given a number N, print their prime factors in sorted order.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> factors = new ArrayList<>();

       
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                factors.add(i);
                while (N % i == 0) {
                    N /= i;  
                }
            }
        }

       
        if (N > 1) {
            factors.add(N);
        }

       
        for (int i = 0; i < factors.size(); i++) {
            System.out.print(factors.get(i));
            if (i != factors.size() - 1) System.out.print(" ");
        }
    }
}
