public class App {
    public long fabonacci[] = {0, 1};
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(new SeriesSequences().fibonacci(i));
        }
    }
}
