

import java.util.Scanner;

public class ResultArray {
    public static void main(String args[]) {
        new ResultArray().A2D();
        // int m1[] = new int[10], m2[] = new int[10], m3[] = new int[10], Roll[] = new int[10];
        // try (Scanner sc = new Scanner(System.in)) {
        //     for (int i = 0; i < 10; i++) {
        //         System.out.print("\nEnter Roll Number: ");
        //         Roll[i] = sc.nextInt();
        //         System.out.print("Enter 1st Subject marks: ");
        //         m1[i] = sc.nextInt();
        //         System.out.print("Enter 2nd Subject marks: ");
        //         m2[i] = sc.nextInt();
        //         System.out.print("Enter 3rd Subject marks: ");
        //         m3[i] = sc.nextInt();
        //     }
        // }
        // System.out.println("\n\nStudents who scored marks above 60%: ");
        // for (int i = 0; i < 10; i++) {
        //     System.out.print((m1[i] >= 60) && (m2[i] >= 60) && (m3[i] >= 60)
        //             ? "Roll No.: " + Roll[i] + "\n\t1st Subject: " + m1[i] + "\n\t2nd Subject: " + m2[i]
        //                     + "\n\t3rd Subject: " + m3[i] + "\n"
        //             : "");
        // }
    }

    public void A2D() {
        int student[][] = new int[4][10];
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter Roll No.: ");
                student[0][i] = sc.nextInt();
                System.out.print("Enter 1st subject marks: ");
                student[1][i] = sc.nextInt();
                System.out.print("Enter 2nd subject marks: ");
                student[2][i] = sc.nextInt();
                System.out.print("Enter 3rd subject marks: ");
                student[3][i] = sc.nextInt();
            }
        }

        System.out.println("\n\nStudents who scored marks above 60%: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((student[1][i] >= 60) && (student[2][i] >= 60) && (student[3][i] >= 60)
                    ? "Roll No.: " + student[0][i] + "\n\t1st Subject: " + student[1][i] + "\n\t2nd Subject: "
                            + student[2][i] + "\n\t3rd Subject: " + student[3][i] + "\n"
                    : "");
        }
    }
}