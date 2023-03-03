package edu.roboproworld;

public class rpSting {
    public int startsWithVowel(String str) {
        int freq = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ' ' && (str.toLowerCase().charAt(i + 1) == 'a'
                    || str.toLowerCase().charAt(i + 1) == 'e' || str.toLowerCase().charAt(i + 1) == 'i'
                    || str.toLowerCase().charAt(i + 1) == 'o' || str.toLowerCase().charAt(i + 1) == 'u'))
                freq++;
        return freq;
    }
}
