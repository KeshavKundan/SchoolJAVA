public class NumToBOH {
    public long bNum(int num) {
        long bNr = 0, bN = 0;
        while (num > 0) {
            bNr = bNr * 10 + (num % 2 == 0  ? 2 : num % 2);
            num /= 2;
        }
        while (bNr > 0) {
            bN = bN * 10 + (bNr % 10 == 2 ? 0 : 1);
            bNr /= 10;
        }
        return bN;
    }

    public long oNum(int num) {
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

    public String hNum(int num) {
        String hNr = "", hN = "";
        while (num > 0) {
            hNr += (num % 16 == 10 ? "A" : (num % 16 == 11 ? "B" : (num % 16 == 12 ? "C" : (num % 16 == 13 ? "D" : (num % 16 == 14 ? "E" : (num % 16 == 15 ? "F" : (num % 16)))))));
            num /= 16;
        }
        for (int i = 0; i < hNr.length(); i++)
            hN = hNr.charAt(i) + hN;
        return hN;
    }

    public static void main (String args[]) {
        System.out.print("Number: 21\nBinary Number: "+new NumToBOH().bNum(21)+"\nOctal Number: "+new NumToBOH().oNum(21)+"\nHexadecimal Number: "+new NumToBOH().hNum(21));
    }
}
