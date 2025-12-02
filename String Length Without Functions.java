
//Problem Statement: String Length Without Functions
// Given a string S, find its length(including the spaces)without using any pre-defined functions.


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        int count = 0;
        for (char c : S.toCharArray()) {
            count++;
        }

        System.out.println(count);
    }
}