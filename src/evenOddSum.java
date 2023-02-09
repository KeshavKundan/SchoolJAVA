/* Write a program to accept ten numbers. Calculate and display sum of odd no and even no, total, average. */
import java.io.*;
public class evenOddSum {
    public static void main(String []args) throws IOException {
        InputStreamReader instream=new InputStreamReader(System.in);
        BufferedReader stdin=new BufferedReader(instream);
        int num, sumEven=0,sumOdd=0;
        System.out.println("Enter 10 integers... ");
        for (int i=1;i<=10;i++) {
            num=Integer.parseInt(stdin.readLine());
            if (num%2==0)
            sumEven+=num;
            else
            sumOdd+=num;
        }
        int totVal=sumEven+sumOdd;
        int avg=totVal/10;
        System.out.println("Sum of even numbers ... = "+sumEven);
        System.out.println("Sum of odd numbers ... = "+sumOdd);
        System.out.println("Total = "+totVal);
        System.out.println("Average = "+avg);
    }
}