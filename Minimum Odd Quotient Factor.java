//  Minimum Odd Quotient Factor
//Problem Statement:
// Given number N, find the minimum factor which yeilds odd number as the quotient.
 
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int answer = -1;

        for (int f = 1; f <= N; f++) {
            if (N % f == 0) {        // f is a factor
                if ((N / f) % 2 == 1) {  // quotient is odd
                    answer = f;
                    break;           // smallest factor found
                }
            }
        }

        System.out.println(answer);
    }
}
