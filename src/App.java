import java.util.Arrays;

import edu.roboproworld.*;

public class App {
    public static void main(String[] args) {
        // int a1[] = { 4, 5, 6 };
        // rpArray arr = new rpArray();
        // System.out.println("Hello, World!");
        // for (int i = 0; i < 3; i++) {
        //     System.out.println(a1[i]);
        // }
        // // a1 = Arrays.copyOf(a1, 5);
        // // a1 = null;
        // // int a1[] = arr.growSize(a1, 5);
        // // a1[5] = 2;
        // for (int index = 0; index < a1.length; index++) {
        //     System.out.println(a1[index]);
        // }
        int[] wordList = { 4, 5, 6 };
        System.out.println(wordList.length);
        for (int i = 0; i < wordList.length; i++)
            System.out.println(wordList[i]);
        wordList = Arrays.copyOf(wordList, wordList.length + 5);
        wordList[5] = 9;
        for (int i = 0; i < wordList.length; i++)
            System.out.println(wordList[i]);
        System.out.println(wordList.length);
    }
}
