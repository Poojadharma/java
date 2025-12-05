// Sorted Array Search
// Problem Statement:
// Given 2 numbers N,K followed by a sorted array of N elements, search and tell if an element K is present in the array.print 'yes' if element is present otherwise print 'no'.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long K = sc.nextLong();

        long[] arr = new long[(int) N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }

        if (binarySearch(arr, K)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    private static boolean binarySearch(long[] arr, long key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return true;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}