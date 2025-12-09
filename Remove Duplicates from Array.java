// Remove Duplicates from Array
// Problem Statement:
// Given a number N and an array of N elements, print the array after removing duplicate elements.If no duplicate elements found print the same.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(sc.nextInt());
        }

        StringBuilder sb = new StringBuilder();
        for (int x : set) {
            sb.append(x).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
