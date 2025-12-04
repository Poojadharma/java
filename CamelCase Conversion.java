// CamelCase Conversion
//Problem Statement:
// Given a string/sentence print its corresponding camelcase convention.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        StringBuilder camelCase = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ' ') {
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    camelCase.append(Character.toUpperCase(ch));
                    capitalizeNext = false;
                } else {
                    camelCase.append(ch);
                }
            }
        }

        System.out.println(camelCase.toString());
    }
}