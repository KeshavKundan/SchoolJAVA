import java.util.Scanner;

class temp {
    public int isAdam(int P) {
        int temp = P, rev = 0, revSq;
        while (temp > 0) {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }
        revSq = rev * rev;
        rev = 0;
        temp = revSq;
        while (temp > 0) {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }
        return ((P * P) == rev) ? 1 : 0;
    }

    public int isPrime(int P) {
        int c = 0;
        for (int i = 2; i < P - 1; i++)
            if (P / i == 0)
                c++;
        return (c == 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        int m, n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first numbers:");
            m = sc.nextInt();
            System.out.print("Enter second numbers:");
            n = sc.nextInt();
        }
        System.out.println();
        for (int i = m + 1; i < n; i++) {
            System.out.println(i + " is " +
                    ((((new temp().isPrime(i) == 1) ? true : false) && ((new temp().isAdam(i) == 1) ? true : false))
                            ? ""
                            : "not ")
                    + "a Prime-Adam number.");
        }
    }
}