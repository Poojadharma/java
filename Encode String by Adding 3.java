// Encode String by Adding 3
// Problem Statement:
// Given a string S, print the encoded string by adding 3 to each character(a maps to d,b maps to e,c maps to f and so on).

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (char c : S.toCharArray()) {
            char shifted = (char)(c + 3);
            if (shifted > 'Z') {
                shifted = (char)(shifted - 26);
            }

            sb.append(shifted);
        }

        System.out.println(sb.toString());
    }
}
