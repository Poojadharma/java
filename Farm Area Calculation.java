
//Problem Statement: Farm Area Calculation
//Given length L and breadth B of a farm, print the area of the farm upto 5 decimal decimals.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float L=sc.nextFloat();
        float B=sc.nextFloat();
        float area=L*B;
        System.out.printf("%.5f",area);
    }
}