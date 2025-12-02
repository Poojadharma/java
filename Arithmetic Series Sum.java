
//Problem Statement: Arithmetic Series Sum
//Given 3 numbers A,B,C find the sum of Arithmetic Series with a=A, d=B and n=C


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong(); // first term
        long B = sc.nextLong(); // common difference
        long C = sc.nextLong(); // number of terms

        long sum = (C * (2 * A + (C - 1) * B)) / 2;

        System.out.println(sum);

        sc.close();
    }
}
