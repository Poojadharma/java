
//Problem Statement:
//Given a number N, print yes if the number is a multiple of 7 else print no.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        if (N % 7 == 0)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}