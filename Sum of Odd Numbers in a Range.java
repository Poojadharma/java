// Sum of Odd Numbers in a Range
// Problem Statement:
// Given a range[L,R], print the sum of all the odd numbers within the range(inclusive of L and R).

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();

        int sum = 0;

        for (int i = L; i <= R; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}