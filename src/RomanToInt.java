
public class RomanToInt {
    int romanToInt(String s) {
        int num = 0, s1, s2;
        for (int i = 0; i < s.length(); i++) {
            s1 = s.charAt(i) == 'I' ? 1 : (s.charAt(i) == 'V' ? 5 : (s.charAt(i) == 'X' ? 10 : (s.charAt(i) == 'L' ? 50 : (s.charAt(i) == 'C' ? 100 : (s.charAt(i) == 'D' ? 500 : (s.charAt(i) == 'M' ? 1000 : -1))))));
            if (i + 1 < s.length()) {
                s2 = s.charAt(i + 1) == 'I' ? 1 : (s.charAt(i + 1) == 'V' ? 5 : (s.charAt(i + 1) == 'X' ? 10 : (s.charAt(i + 1) == 'L' ? 50 : (s.charAt(i + 1) == 'C' ? 100 : (s.charAt(i + 1) == 'D' ? 500 : (s.charAt(i + 1) == 'M' ? 1000 : -1))))));;
                num = (s1 >= s2) ? num + s1 : num - s1;
            } else
                num = num + s1;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println("MMDCLXXV: "+new RomanToInt().romanToInt("MMDCLXXV"));
    }
}