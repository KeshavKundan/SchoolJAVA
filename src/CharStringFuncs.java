
/**
 * WAP to input a sentence. Compute & print the following:
 * 1. No. of Character
 * 2. No of letters
 */
public class CharStringFuncs {
    public int numOfChar(String str) {
        return str.length();
    }

    public int numOfLetter(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isLetter(str.charAt(i)))
                c++;
        return c;
    }

    public int numOfUpperCase(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isUpperCase(str.charAt(i)))
                c++;
        return c;
    }

    public int numOfLowerCase(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isLowerCase(str.charAt(i)))
                c++;
        return c;
    }

    public int numOfDigit(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isDigit(str.charAt(i)))
                c++;
        return c;
    }

    public int numOfVowel(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++)
            if (Character.isDigit(str.charAt(i)))
                c++;
        return c;
    }

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

    public static void main(String[] args) {}
}
