import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int mul;  

        for (int i = 1; i <= 10; i++) {
            mul = n * i;  
            System.out.println(n + " x " + i + " = " + mul);
        }

        sc.close();
    }
}