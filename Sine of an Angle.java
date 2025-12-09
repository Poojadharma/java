// Sine of an Angle
// Problem Statement:
// Given an angle A, print the sine of the given angle.

import java.util.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angleDegrees = sc.nextDouble();
        double angleRadians = Math.toRadians(angleDegrees);
        double sineValue = Math.sin(angleRadians);
        if (Math.abs(sineValue) < 1e-10) sineValue = 0;
        if (Math.abs(sineValue - 1) < 1e-10) sineValue = 1;
        if (Math.abs(sineValue + 1) < 1e-10) sineValue = -1;
        DecimalFormat df = new DecimalFormat("0.########");
        System.out.print(df.format(sineValue));
    }
}
