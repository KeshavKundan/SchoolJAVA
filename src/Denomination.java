/*
 *A book intends to design a program to display the denomination of an input amount, upto 5 digits. The available denomination with the bank are of rupees 2000, 500, 100, 50, 20, 10, 5, 2 and 1
 *
 *Design a program to accept the amount from the user and display the break-up in descending order of denomination. (i.e. preference should be given to the highest denomination avaible) along with the total number of notes. [Note: Only the denomination used should be displayed]. Also print the amount in words according to the digits.
 *
 *Example 1
 *
 *INPUT : 14856
 *OUTPUT: ONE FOUR EIGHT SEVEN SIX
 *
 *DENOMINATION : 2000 * 7 = 14000
 *                500 * 1 =   500
 *                100 * 3 =   300
 *                 50 * 1 =    50
 *                  5 * 1 =     5
 *                  1 * 1 =     1
 *
 *                   Total: 14856
 *  Total Number of notes : 21
**/

import java.util.Scanner;

public class Denomination {
  public static void main(String args[]) {
    // Declaring & initialising vars
    int num, temp, rupee[] = new int[10];
    String word[] = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE" }, n = "";

    // Taking user input
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the amount: ");
      num = sc.nextInt();
    }

    temp = num;
    while (temp > 0) {
      n = word[temp % 10] + " " + n;
      temp /= 10;
    }
    temp = num;

    rupee[9] = temp / 2000;
    temp %= 2000;
    rupee[8] = temp / 500;
    temp %= 500;
    rupee[7] = temp / 200;
    temp %= 200;
    rupee[6] = temp / 100;
    temp %= 100;
    rupee[5] = temp / 50;
    temp %= 50;
    rupee[4] = temp / 20;
    temp %= 20;
    rupee[3] = temp / 10;
    temp %= 10;
    rupee[2] = temp / 5;
    temp %= 5;
    rupee[1] = temp / 2;
    temp %= 2;
    rupee[0] = temp / 1;

    System.out.println("\n\nAmount: " + n + "\n");
    System.out.println("DENOMINATION:");
    if (rupee[9] != 0)
      System.out.println("              2000 * " + rupee[9] + " = " + rupee[9] * 2000);
    if (rupee[8] != 0)
      System.out.println("               500 * " + rupee[8] + " = " + rupee[8] * 500);
    if (rupee[7] != 0)
      System.out.println("               200 * " + rupee[7] + " = " + rupee[7] * 200);
    if (rupee[6] != 0)
      System.out.println("               100 * " + rupee[6] + " = " + rupee[6] * 100);
    if (rupee[5] != 0)
      System.out.println("                50 * " + rupee[5] + " = " + rupee[5] * 50);
    if (rupee[4] != 0)
      System.out.println("                20 * " + rupee[4] + " = " + rupee[4] * 20);
    if (rupee[3] != 0)
      System.out.println("                10 * " + rupee[3] + " = " + rupee[3] * 10);
    if (rupee[2] != 0)
      System.out.println("                 5 * " + rupee[2] + " = " + rupee[2] * 5);
    if (rupee[1] != 0)
      System.out.println("                 2 * " + rupee[1] + " = " + rupee[1] * 2);
    if (rupee[0] != 0)
      System.out.println("                 1 * " + rupee[0] + " = " + rupee[0] * 1);
    System.out.println("\n                 Total : " + num);
    System.out.println(
        "\n Total Number of Notes : " + (rupee[0] + rupee[1] + rupee[2] + rupee[3] + rupee[4] + rupee[5] + rupee[6]
            + rupee[7] + rupee[8] + rupee[9]));
  }
}