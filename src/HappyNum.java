/**
 * Happy Number
 * A number which eventually reaches 1 when replaced by the sum of the square of
 * each digit.
 * On the other hand, 4 is not a happy number because the sequence starting with
 * 4^2 = 16 and 1^2 + 6^2 = 37 eventually reaches 2^2 + 0^2 = 4, the number that
 * started the sequence, and so the process continues in an infinite cycle
 * without ever reaching 1.
 * A number which is not happy is called sad or unhappy. 
 */

import java.util.Scanner;
public class HappyNum {
    public static void main(String args[]) {
        int num, temp, sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a Number: ");
            temp = num = sc.nextInt();
        }
        while (temp != 1 && temp != 4) {
            while (temp > 0) {
                sum += Math.pow(temp % 10, 2);
                temp /= 10;
            }
            temp = sum;
            sum = 0;
        }
        if (temp == 1)
            System.out.println(num + " is a Happy Number");
        else
            System.out.println(num + " is a Unhappy Number");
    }
}