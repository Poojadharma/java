
//Problem Statement:  Find Minimum Among Ten Numbers
//Find the minimum among 10 numbers.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;

        // Read 10 integers and find minimum
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num < min) {
                min = num;
            }
        }

        System.out.println(min);

        sc.close();
    }
}
