
// wap to input 25 alphabets and store in alphaay alpha[].
// alphaange all letters in alphabetical order using bubble sort.
import java.util.Scanner;

public class temp {
    public static void main(String[] args) {

        char alpha[] = new char[25];
        try (Scanner sc = new Scanner(System.in)) {
            for (int index = 0; index < alpha.length; index++) {
                System.out.print("Enter a character " + (index + 1) + ": ");
                alpha[index] = sc.next().charAt(0);
            }
        }
        for (int i = 0; i < alpha.length - 1; i++) {
            for (int j = 0; j < alpha.length - 1 - i; j++) {
                if ((int) (alpha[j].toLowerCase()) > (int) (alpha[j + 1].toLowerCase())) {
                    char temp = alpha[j];
                    alpha[j] = alpha[j + 1];
                    alpha[j + 1] = temp;
                }
            }
        }
        for (int index = 0; index < alpha.length; index++)
            System.out.println("Character " + (index + 1) + ": " + alpha[index]);
    }
}