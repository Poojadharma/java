//  Counting Perfect Squares in a Range
// Problem Statement:
// Given a range (i.e) two numbers L and R count the number of perfect squares within the range (inclusive of L and R).If no perfect square exists within the range print '-1'

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();

        int start = (int)Math.ceil(Math.sqrt(L));
        int end = (int)Math.floor(Math.sqrt(R));

        int count = end - start + 1;

        if (count > 0)
            System.out.println(count);
        else
            System.out.println("-1");
    }
}