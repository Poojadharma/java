//  Find Position of Number in Array
//Problem Statement:
// Given a number N,K followed by array of N elements where the difference between any adjacent elements is 1. Find the position of the given number K.If K not found in the array print -1

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        while (i < N) {
            if (arr[i] == K) {
                System.out.println(i + 1);  
                return;
            }
            i += Math.abs(arr[i] - K);
        }
        System.out.println(-1);
    }
}