// Define a function power(int a, int b) to return a^b using recussive function in java ?

/**
 * Temp
 */
public class Temp {
    public int power(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b==1) {
            return a;
        } else {
            return a * power(a, b-1);
        }
    }
}