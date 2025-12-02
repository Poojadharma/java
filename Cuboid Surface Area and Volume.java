
//Problem Statement: Cuboid Surface Area and Volume
// Write a program to calculate the total surface area and volume of cuboid.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read length, breadth, and height
        int L = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();

        // Calculate total surface area: 2*(LB + BH + HL)
        int surfaceArea = 2 * (L*B + B*H + H*L);

        // Calculate volume: L * B * H
        int volume = L * B * H;

        // Print surface area and volume separated by a space
        System.out.println(surfaceArea + " " + volume);

        sc.close();
    }
}
