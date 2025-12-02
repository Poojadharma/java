
//Problem Statement: Almost Sorted Array
// Given a number N followed by N elements which can be arranged in ascending order with maximum one element update. Print the index of the element which has to be changed else print '-1' if the updation not neccassary or if the given input needs more than one update to form ascending order.

import java.util.Scanner;

public class Main {

    public static int findUpdateIndex(int[] arr) {
        int n = arr.length;
        int count = 0;
        int index = -1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
                index = i; // Potential element to update
                if (count > 1) {
                    return -1; // More than one change needed
                }
            }
        }

        if (count == 0) {
            return -1; // Already sorted, no update needed
        }

        // Check if updating arr[index] or arr[index+1] would sort array
        int original = arr[index];
        arr[index] = (index == 0) ? arr[index + 1] - 1 : arr[index - 1] + 1;

        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            return index; // index of element to change
        } else {
            return -1; // Cannot sort with single update
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(findUpdateIndex(arr));
        }

        sc.close();
    }
}