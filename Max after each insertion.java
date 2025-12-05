// Max after each insertion
// Problem Statement:
// Given a number N and K followed by N elements and K elements. Now insert the given K elements one by one into the array and print the maximum in the array after each insertion .

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

       
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            pq.add(sc.nextInt());
        }

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < K; i++) {
            int x = sc.nextInt();
            pq.add(x);            
            output.append(pq.peek());
            if (i != K - 1) output.append(" ");
        }

        System.out.println(output.toString());
    }
}