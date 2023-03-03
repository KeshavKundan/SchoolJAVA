package edu.example;
 


/** wap to create two arrays one is name[] another is makrs[] to
store name and marks of ten students.
Arrange the name list according to descending order of the marks.
Print the sorted list with proper format.
 */
import java.util.Scanner;

public class ArrayDescending {
    public static void main(String args[]) {
        String name[] = new String[10];
        int marks[] = new int[10];
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Name " + (i + 1) + ".: ");
                name[i] = sc.next();
                System.out.print("  Marks: ");
                marks[i] = sc.nextInt();
            }
        }
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < marks.length - 1 - i; j++) {
                if (marks[j] < marks[j + 1]) {
                    int tempi = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = tempi;
                    String tempS = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tempS;
                }
            }
        }
        System.out.println("\n\nResult of students:");
        for (int i = 0; i < 10; i++)
            System.out.println(name[i] + "\t-  " + marks[i]);
    }
}