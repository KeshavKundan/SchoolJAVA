import java.util.Scanner;

public class V_Word {
    String str;
    int freq;

    V_Word() {
        str = "";
        freq = 0;
    }

    void readstr() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            str = " " + sc.nextLine();
        }
    }

    void vowfreq() {
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ' ' && (str.toLowerCase().charAt(i + 1) == 'a'
                    || str.toLowerCase().charAt(i + 1) == 'e' || str.toLowerCase().charAt(i + 1) == 'i'
                    || str.toLowerCase().charAt(i + 1) == 'o' || str.toLowerCase().charAt(i + 1) == 'u'))
                freq++;
    }

    void display() {
        System.out.println("\nSentences: " + str.substring(1));
        System.out.println("Frequency of words beginning with vowel: " + freq);
    }

    public static void main(String[] args) {
        V_Word vWord = new V_Word();
        vWord.readstr();
        vWord.vowfreq();
        vWord.display();
    }
}
// Programming isn't about what you know and get paid of, it's about what you can figure out and have fun with.