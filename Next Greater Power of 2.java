
//Problem Statement:
//Given a number N, find its next immediate greater power of 2(i.e 2^1, 2^2, 2^3...).


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int p = 1;
        while (p <= N) p *= 2;
        System.out.println(p); 
    }
}