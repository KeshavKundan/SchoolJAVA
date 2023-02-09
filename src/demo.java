public class demo {
    public void DeciBin(int n) {
        if (n > 0) {
            DeciBin(n/2);
            System.out.print(n%2);
        }
        else
            System.out.print(0);
    }
    
    public void DeciOct(int n) {
        if (n > 0) {
            DeciOct(n/8);
            System.out.print(n%8);
        }
        else
            System.out.print(0);
    }
    
    public static void main(String args[]) {
        new demo().DeciOct(11);
    }
}
