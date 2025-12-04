// Holiday Check
//Problem Statement:
// Given a day, print 'yes' if it is a holiday otherwise print'no'.Assume that weekend days are holidays

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> holidays = new HashSet<>();
        holidays.add("saturday");
        holidays.add("sunday");
        while (sc.hasNext()) {
            String day = sc.next().toLowerCase();
            if (holidays.contains(day)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }
}