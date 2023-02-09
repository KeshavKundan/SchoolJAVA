
public class Frequency {
    public void charwithFreq(String str) {
        str = str.toUpperCase();
        int freq[] = new int[26];
        for (int i = 65; i <= 90; i++) {
            for (int j = 0; j < str.length(); j++)
                if ((int) str.charAt(j) == i)
                    freq[i - 65]++;
        }
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) - 65 < 27 && str.charAt(j) - 65 > 0 && freq[str.charAt(j) - 65] != 0) {
                System.out.println(str.charAt(j) + "=" + freq[str.charAt(j) - 65]);
                freq[str.charAt(j) - 65] = 0;
            }
        }
    }

    public static void main(String[] args) {
        new Frequency().charwithFreq("Every Programmer is an Author.");
    }
}
