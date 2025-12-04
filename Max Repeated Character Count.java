// Max Repeated Character Count
// Problem Statement:
// Given a string S,count the maximum number of times a character repeated in the string.If no character is repeated print '0'.

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();  
        sc.close();

        int[] freq = new int[256];

       
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        int maxFreq = 0;

       
        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
            }
        }

       
        if (maxFreq == 1) {
            System.out.println(0);
        } else {
            System.out.println(maxFreq);
        }
    }
}
