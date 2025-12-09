// Binary to Hexadecimal Conversion
// Problem Statement:
// Given a binary number convert it to hexadecimal.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String binary = sc.nextLine().trim();

        // Convert binary to decimal
        int decimal = Integer.parseInt(binary, 2);

        // Convert decimal to hexadecimal
        String hex = Integer.toHexString(decimal).toUpperCase();

        System.out.println(hex);
    }
}