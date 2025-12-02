
//Problem Statement:Check if Number is Composite
//Given a number N, print 'yes' if it is composite else print 'no'

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isComposite = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }

        System.out.println(isComposite ? "yes" : "no");
    }
}
