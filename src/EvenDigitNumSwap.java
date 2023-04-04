
 

import java.util.Scanner;

public class EvenDigitNumSwap {
  public static void main(String args[]) {
    // Declaring & initialising vars
    int num, temp, i = 0, x = 0, n = 0;

    // Taking user input
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number with even digits: ");
      num = sc.nextInt();
    }

    // Counting number of digits
    temp = num;
    while (temp > 0) {
      temp /= 10;
      x++;
    }

    // Checking Odd or Even
    if (x % 2 == 0) {
      temp = num;

      // Swaping pair of digits
      while (temp > 0) {
        x = temp % 100;
        n = n + (((x % 10) * 10 + (x / 10)) * (int) Math.pow(10, i * 2));
        temp /= 100;
        i++;
      }

      System.out.println("\nNumber after swaping consecutive pair of digits : " + n);
    } else
      System.out.println("\n" + num + " is not an even digit number.");
  }
}