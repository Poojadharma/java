// Rectangle with Integer Sides
// Problem Statement:
// Given 2 numbers P and A which are the perimeter and area of a rectangle respectively, find if there can actually be a rectangle with this perimeter and area having integer sides.If there exists such rectangle print 'yes' otherwise print 'no'.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int A = sc.nextInt();
        if (P % 2 != 0) {
            System.out.print("no");
            return;
        }
        int S = P / 2;  
        boolean possible = false;
        for (int l = 1; l * l <= A; l++) {
            if (A % l == 0) {
                int w = A / l;

                if (l + w == S) {
                    possible = true;
                    break;
                }
            }
        }
        System.out.print(possible ? "yes" : "no");
    }
}
