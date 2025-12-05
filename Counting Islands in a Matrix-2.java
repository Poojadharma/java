// Counting Islands in a Matrix-2
// Problem Statement:
// Given a number N, and a N*N matrix containing only 0's and 1's, where 0's represent water and 1's representing land, find the number of island 1's(1 surrounded by 0 on all of its adjacent sides).If the island could not be found with the given matrix print -1.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int N = sc.nextInt();
        int[][] mat = new int[N][N];
       
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
               
                if (mat[i][j] == 1) {

                    boolean up = (i == 0) || (mat[i - 1][j] == 0);
                    boolean down = (i == N - 1) || (mat[i + 1][j] == 0);
                    boolean left = (j == 0) || (mat[i][j - 1] == 0);
                    boolean right = (j == N - 1) || (mat[i][j + 1] == 0);

                    if (up && down && left && right) {
                        count++;
                    }
                }
            }
        }

        if (count == 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}
