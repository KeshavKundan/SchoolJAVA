/**
 * A Kaprekar number is a number whose square when divided into two parts and such that sum of parts is equal to the original number and none of the parts has value 0.
 */

import java.util.Scanner;
public class KaprekarNum {
    public static void main(String args[]) {
        int num, sq, temp, digit = 0, pow, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        temp = sq = num * num;
        while (sq > 0) {
            digit++;
            sq /= 10;
        }
        pow = (int)Math.pow(10, (digit / 2));
        while (temp > 0) {
            sum += temp % pow;
            temp /= pow;
        }
        if (sum == num)
            System.out.println(num+" is kaprekar number");
        else
            System.out.println(num+" is not a kaprekar number");
        sc.close();
    }
}
