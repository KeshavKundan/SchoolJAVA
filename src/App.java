import edu.roboproworld.*;

public class App {
    public static void main(String[] args) {
        rpNumber number = new rpNumber();
        int arr[] = number.alphaFrequency("Every Programmer is an Author.");
        for(int i = 0; i < 26; i++){
            System.out.println(arr[i]);
        }
    }
}
