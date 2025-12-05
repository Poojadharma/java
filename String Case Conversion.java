// String Case Conversion
// Problem Statement:
// Given a string S change upper case to lowercase and lowercase to uppercase.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        StringBuilder sb = new StringBuilder(S.length());

        for (char c : S.toCharArray()) {
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);  
            }
        }

        System.out.println(sb.toString());
    }
}
