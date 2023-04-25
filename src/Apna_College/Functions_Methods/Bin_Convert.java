package Apna_College.Functions_Methods;

public class Bin_Convert {
    static void binToDec(int binNum) {
        // function of binary to decimal
        int myNUm = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;

        }
        System.out.println("decimal of " + myNUm + "=" + decNum);

    }

    // function of decimal to binary
    static void decTobin(int n) {
        int pow = 0;
        int binNum = 0;
        int myNUm = n;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binary form of " + myNUm + "=" + binNum);
    }

    public static void main(String args[]) {
        binToDec(1011);
        decTobin(11);

    }

}
