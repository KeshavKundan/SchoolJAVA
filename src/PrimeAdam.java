import java.util.Scanner;

class PrimeAdam {
    public static void main(String[] args) {
        int m, n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first numbers: ");
            m = sc.nextInt();
            System.out.print("Enter second numbers: ");
            n = sc.nextInt();
        }
        System.out.println();
        for (int i = m + 1; i < n; i++) {
            System.out.println(i + " is " +
                    ((((new Numbers().isPrime(i) == 1) ? true : false) && ((new Numbers().isAdam(i) == 1) ? true : false))
                            ? ""
                            : "not ")
                    + "a Prime-Adam number.");
        }
    }
}