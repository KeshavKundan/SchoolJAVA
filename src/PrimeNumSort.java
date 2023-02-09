import java.util.Scanner;

public class PrimeNumSort {
    public static void main(String args[]) {
        int A[] = new int[10], P[] = new int[10], C[] = new int[10], i = 0, j = 0, k = 0, c;
        try (Scanner sc = new Scanner(System.in)) {
            for (; i < 10; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                A[i] = sc.nextInt();
                c = 0;
                for (int f = 1; f <= A[i]; f++)
                    if (A[i] % f == 0)
                        c++;
                if (c > 2)
                    C[k++] = A[i];
                else if (c == 2)
                    P[j++] = A[i];
                else
                    continue;
            }
        }
        System.out.println("\nPrime Numbers: ");
        for (i = 0; i < P.length; i++)
            System.out.print((P[i] != 0) ? P[i] + " " : "");
        System.out.println("\nComposite Numbers:");
        for (i = 0; i < C.length; i++)
            System.out.print((C[i] != 0) ? C[i] + " " : "");
    }
}
