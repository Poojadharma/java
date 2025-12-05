// Remove Extra Spaces
// Problem Statement:
// Given a sentence S take out the extra spaces.If no extra space is present print the same as output.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        boolean spaceSeen = false;

        for (char c : S.toCharArray()) {

            if (c == ' ') {
                if (!spaceSeen) {        
                    sb.append(c);
                    spaceSeen = true;
                }
            } else {
                sb.append(c);
                spaceSeen = false;
            }
        }

        System.out.println(sb.toString());
    }
}