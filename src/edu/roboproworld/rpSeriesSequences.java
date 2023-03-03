package edu.roboproworld;
// AP, GP, HP
public class rpSeriesSequences {
    public long[] fibonacci(int num) {
        long series[] = new long[num], n1 = 0, n2 = 1, n3 = 0;
        series[0] = n1;
        series[1] = n2;
        for (int i = 2; i < num; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            series[i] = n3;
        }
        return series;
    }
}
