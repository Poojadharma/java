// Word Position in String
// Problem Statement:
// Given 2 strings S and X print the word position of X in S.(word count starts from 1).If the given word doesn't exists in S print '-1'.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        String X = sc.nextLine();

        String[] words = S.split("\\s+"); // split by spaces

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(X)) {
                System.out.println(i + 1); // position starts from 1
                return;
            }
        }

        System.out.println(-1);
    }
}