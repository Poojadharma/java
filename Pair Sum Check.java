
//Problem Statement: Pair Sum Check
// Given 2 numbers N,X and an array of N elements, check if there exists any 2 numbers in the array with sum equal to X.If found print 'yes' otherwise print 'no'

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // HashSet to store visited numbers
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int needed = X - num;  // pair needed to form sum X

            if (set.contains(needed)) {
                System.out.println("yes");
                return;
            }

            set.add(num);
        }

        System.out.println("no");
    }
}

