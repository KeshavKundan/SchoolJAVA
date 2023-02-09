 

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        long num, n1 = 0, n2 = 1, n3 = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        System.out.println("F0" + " = " + 0);
        System.out.println("F1" + " = " + 1);
        for (int i = 2; i < num; i++) {
            n3 = n1 + n2;
            System.out.println("F" + i + " = " + n3);
            n1 = n2;
            n2 = n3;
            sum += n3;
        }
        System.out.println("\nSum of Series: " + sum);
        sc.close();
    }
}