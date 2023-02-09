public class recurssion {
    public int power(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b==1) {
            return a;
        } else {
            return a * power(a, b-1);
        }
    }
    
    public int fact(int n) {
        if (n > 1)
            return n * fact(n - 1);
        else
            return 1;
    }
}
