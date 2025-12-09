//  Binary to Octal Conversion
// Problem Statement:
// Given a binary number convert it into octal format.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String binary = sc.nextLine().trim();

        // Convert binary to decimal
        int decimal = Integer.parseInt(binary, 2);

        // Convert decimal to octal
        String octal = Integer.toOctalString(decimal);

        System.out.println(octal);
    }
}