
/**
 * Write a description of class IntToStr here.
 * 
 * A program that converts integer value to number in words.
 *
 * @author Keshav Kundan
 */

import java.util.Scanner;

public class NumToWord {
  public static void main(String args[]) {
    // Declaring & initialising vars
    int num;
    String n, ones[] = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
        "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen" },
        tens[] = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty" };

    // Taking user input
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number (0 - 100000): ");
      num = sc.nextInt();
    }

    // Printing Number in Words
    if (num < 100000 && num > 0) {
      System.out.print("Number (in words): ");
      if (num % 1000 == 0)
        System.out.println(
            ((num / 1000) < 20 ? ones[num / 1000] : tens[(num / 1000) / 10] + " " + ones[(num / 1000) % 10])
                + " Thousand");
      else if (num % 100 == 0 && num / 100 < 100)
        System.out.println(ones[num / 100] + " Hundred");
      else if (num % 10 == 0 && num / 10 < 10)
        System.out.println(tens[num / 10]);
      else if (num < 20)
        System.out.println(ones[num]);
      else {
        n = (num / 1000 != 0
            ? ((num / 1000) < 20 ? ones[num / 1000] : tens[(num / 1000) / 10] + " " + ones[(num / 1000) % 10])
                + " Thousand "
            : "")
            + ((num % 1000) / 100 != 0 ? ones[((num % 1000) / 100) % 10] + " Hundred " : "")
            + (num % 100 < 20 ? ones[num % 100]
                : tens[((num % 1000) % 100) / 10] + " " + ones[((num % 1000) % 100) % 10]);
        System.out.println(n);
      }
    } else
      System.out.println("Out of Range.");
  }
}