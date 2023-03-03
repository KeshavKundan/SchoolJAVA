package edu.roboproworld;

public class rpSting {
    public int letters(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isLetter(str.charAt(i)))
                c++;
        return c;
    }

    public int upperCases(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isUpperCase(str.charAt(i)))
                c++;
        return c;
    }

    public int lowerCases(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isLowerCase(str.charAt(i)))
                c++;
        return c;
    }

    public int digits(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isDigit(str.charAt(i)))
                c++;
        return c;
    }

    public int vowels(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ' ' && (str.toLowerCase().charAt(i + 1) == 'a'
                    || str.toLowerCase().charAt(i + 1) == 'e' || str.toLowerCase().charAt(i + 1) == 'i'
                    || str.toLowerCase().charAt(i + 1) == 'o' || str.toLowerCase().charAt(i + 1) == 'u'))
                c++;
        return c;
    }
}
