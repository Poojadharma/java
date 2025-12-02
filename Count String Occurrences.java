
//Problem Statement: Count String Occurrences
// Given a sentence and string S, find how many times S occurs in the given sentence.If S is not found in the sentence print -1

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String s = sc.nextLine();

        int count = 0;
        int index = 0;

        while (true) {
            index = sentence.indexOf(s, index);  // search from current index
            if (index == -1) break;              // no more occurrences
            count++;
            index += s.length();                 // move past the found substring
        }

        if (count == 0)
            System.out.println(-1);
        else
            System.out.println(count);
    }
}
