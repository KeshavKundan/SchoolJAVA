
import java.util.Scanner;

public class SmallestNum {
    public static void main(String args[]) {
        // Declaring & initialising vars
        int t1, t2, y = 0, i;
        // Taking user input
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            t1 = t2 = sc.nextInt();
        }
        // Running for-loop no. of digit in num times
        for (; t1 > 0; t2 = y, t1 /= 10) {
            // // Running for-loop no. of digit in num times &
            // // Checking Maxmium and Minimum of every pair of no from right
            for (y = 0, i = 0; t2 > 0; t2 /= 100, i++)
                y += (((Math.min((t2 % 100) / 10, (t2 % 100) % 10) * 10) + Math.max((t2 % 100) / 10, (t2 % 100) % 10))
                        * (int) Math.pow(10, i * 2));
            // Re-initialising vars
            // Running for-loop no. of digit in num times &
            // Checking max and min of every pair of no from right skipping one digit
            for (t2 = y / 10, y %= 10, i = 0; t2 > 0; t2 /= 100, i++)
                y += (((Math.min((t2 % 100) / 10, (t2 % 100) % 10) * 10) + Math.max((t2 % 100) / 10, (t2 % 100) % 10))
                        * (int) Math.pow(10, i * 2) * 10);
        }
        System.out.println("Smallest Number possible : " + y);
    }
}