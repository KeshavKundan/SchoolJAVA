

import java.util.Arrays;

// AP, GP, HP
public class SeriesSequences {
    public long fabonacci[] = {0, 1};
    // public long[] fibonacci(int num) {
    // long series[] = new long[num], n1 = 0, n2 = 1, n3 = 0;
    // series[0] = n1;
    // series[1] = n2;
    // for (int i = 2; i < num; i++) {
    // n3 = n1 + n2;
    // n1 = n2;
    // n2 = n3;
    // series[i] = n3;
    // }
    // return series;
    // }

    public long fibonacci(int n) {
        long fab[] = new App().fabonacci;
        // function fib(n):
        //  root5 = squareroot(5)
        //  gr = (1 + root5) / 2
        //  igr = 1 - gr
        //  value = (power(gr, n) - power(igr, n)) / root5

        // return floor(value + 0.5) ---<round it to the closest integer since floating
        // point arithmetic cannot be trusted to give perfect integer answers>---

        // Math.floor(((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow(1 - ((1 +
        // Math.sqrt(5)) / 2), n)) / Math.sqrt(5)) + 0.5);
        if ((fab.length - 1) < n)
            fab = Arrays.copyOf(fab, (n + 1));
        if (n < 0) return -1;
        if (n == 0) return 0;
        else if (fab[n] == 0) fab[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return fab[n];
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(new SeriesSequences().fibonacci(i));
        }
    }
}