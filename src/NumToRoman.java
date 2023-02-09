/**
 * NumToRoman
 */
public class NumToRoman {
    public String numTORom(int num) {
        int romanNum[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String romanChar[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        String roman = "";
        for (int i = 0; i < romanNum.length; i++) {
            while (num >= romanNum[i]) {
                num = num - romanNum[i];
                roman += romanChar[i];
            }
        }
        return roman;
    }
    public static void main(String[] args) {
        System.out.print(new NumToRoman().numTORom(3946));
    }
}