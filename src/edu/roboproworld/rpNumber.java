package edu.roboproworld;

public class rpNumber {
    public long binaryNum(int num) {
        long bNr = 0, bN = 0;
        while (num > 0) {
            bNr = bNr * 10 + (num % 2 == 0 ? 2 : num % 2);
            num /= 2;
        }
        while (bNr > 0) {
            bN = bN * 10 + (bNr % 10 == 2 ? 0 : 1);
            bNr /= 10;
        }
        return bN;
    }

    public long octalNum(int num) {
        long oNr = 0, oN = 0;
        while (num > 0) {
            oNr = oNr * 10 + (num % 8 == 0 ? 8 : num % 8);
            num /= 8;
        }
        while (oNr > 0) {
            oN = oN * 10 + (oNr % 10 == 8 ? 0 : oNr % 10);
            oNr /= 10;
        }
        return oN;
    }

    public String hexNum(int num) {
        String hNr = "", hN = "";
        while (num > 0) {
            hNr += (num % 16 == 10 ? "A"
                    : (num % 16 == 11 ? "B"
                            : (num % 16 == 12 ? "C"
                                    : (num % 16 == 13 ? "D"
                                            : (num % 16 == 14 ? "E" : (num % 16 == 15 ? "F" : (num % 16)))))));
            num /= 16;
        }
        for (int i = 0; i < hNr.length(); i++)
            hN = hNr.charAt(i) + hN;
        return hN;
    }

    public Boolean oddEven(int num) {
        return (num % 2 != 0) ? false : true;
    }

    public String numToWord(int num) {
        String n,
                ones[] = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
                        "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen" },
                tens[] = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty" };
        if (num < 100000 && num > 0) {
            n = "Number (in words): ";
            if (num % 1000 == 0)
                n += ((num / 1000) < 20 ? ones[num / 1000] : tens[(num / 1000) / 10] + " " + ones[(num / 1000) % 10])
                                + " Thousand";
            else if (num % 100 == 0 && num / 100 < 100)
                n += ones[num / 100] + " Hundred";
            else if (num % 10 == 0 && num / 10 < 10)
                n += tens[num / 10];
            else if (num < 20)
                n += ones[num];
            else
                n += (num / 1000 != 0
                        ? ((num / 1000) < 20 ? ones[num / 1000]
                                : tens[(num / 1000) / 10] + " " + ones[(num / 1000) % 10])
                                + " Thousand "
                        : "")
                        + ((num % 1000) / 100 != 0 ? ones[((num % 1000) / 100) % 10] + " Hundred " : "")
                        + (num % 100 < 20 ? ones[num % 100]
                                : tens[((num % 1000) % 100) / 10] + " " + ones[((num % 1000) % 100) % 10]);
        } else
            n = "";
        return n;
    }

    public String numToRoman(int num) {
        int romanNum[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String roman = "", romanChar[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < romanNum.length; i++) {
            while (num >= romanNum[i]) {
                num -= romanNum[i];
                roman += romanChar[i];
            }
        }
        return roman;
    }

    public int romanToNum(String s) {
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

    public int smallestNum(int num) {
        int t1 = num, t2 = num, y = 0, i;
        while (t1 > 0) {
            y = 0;
            i = 0;
            while (t2 > 0) {
                y += (((Math.min((t2 % 100) / 10, (t2 % 100) % 10) * 10) + Math.max((t2 % 100) / 10, (t2 % 100) % 10))
                        * (int) Math.pow(10, i * 2));
                t2 /= 100;
                i++;
            }
            t2 = y / 10;
            y = y % 10;
            i = 0;
            while (t2 > 0) {
                y += (((Math.min((t2 % 100) / 10, (t2 % 100) % 10) * 10) + Math.max((t2 % 100) / 10, (t2 % 100) % 10))
                        * (int) Math.pow(10, i * 2) * 10);
                t2 /= 100;
                i++;
            }
            t2 = y;
            t1 /= 10;
        }
        return y;
    }

    public Boolean happyNum(int num) {
        int temp = num, sum = 0;
        while (temp != 1 && temp != 4) {
            while (temp > 0) {
                sum += Math.pow(temp % 10, 2);
                temp /= 10;
            }
            temp = sum;
            sum = 0;
        }
        return (temp == 1) ? true : false;
    }

    public Boolean kaprekarNum(int num) {
        int sq, temp = sq = num * num, digit = 0, pow, sum = 0;
        while (sq > 0) {
            digit++;
            sq /= 10;
        }
        pow = (int) Math.pow(10, (digit / 2));
        while (temp > 0) {
            sum += temp % pow;
            temp /= pow;
        }
        return (num == sum) ? true : false;
    }

    public Boolean palindromeNum(int num) {
        int temp = num, sum = 0 ;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return (num == sum) ? true : false;
    }

    public long Fibonacci(int num) {
        long n1 = 0, n2 = 1, n3 = 0, sum = 0;
        for (int i = 2; i < num; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            sum += n3;
        }
        return sum;
    }

    public String[] alphaFrequency(String str) {
        str = str.toUpperCase();
        int f = 0;
        String alphaFreq[] = new String[26];
        for (int i = 65; i <= 90; i++) {
            for (int j = 0; j < str.length(); j++)
                if ((int)str.charAt(j) == i)
                    f = f + 1;
            if (f > 0)
                alphaFreq[i - 65] = (char)i + "=" + f;
            else 
            f = 0;
        }
        return alphaFreq;
    }
}
