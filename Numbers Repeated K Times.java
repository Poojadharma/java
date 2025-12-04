// Numbers Repeated K Times
//Problem Statement:
// Given 2 numbers N,K and an array of N elements, print the number(s) that has been repeated K times.Print them in ascending order if there are more than one number to be printed.If no element satisfies the pattern then print -1

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if(entry.getValue() == K) {
                result.add(entry.getKey());
            }
        }
        if(result.isEmpty()) {
            System.out.print("-1");
        } else {
            Collections.sort(result);
            for(int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i));
                if(i != result.size() - 1) System.out.print(" ");
            }
        }
    }
}