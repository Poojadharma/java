// Date Format Validation
// Problem Statement:
// Accept a string and find if it is of date format 'dd/mm/yyyy'.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date = sc.nextLine().trim();

        if (!date.matches("\\d{2}/\\d{2}/\\d{4}")) {
            System.out.println("no");
            return;
        }

        String[] parts = date.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (month < 1 || month > 12) {
            System.out.println("no");
            return;
        }

        // Check day according to month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Leap year adjustment for February
        if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            daysInMonth[1] = 29;
        }

        if (day < 1 || day > daysInMonth[month - 1]) {
            System.out.println("no");
            return;
        }

        System.out.println("yes");
    }
}
