package Apna_College.loopquestions;

import java.util.*;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number do u want to reverse");
        int num = sc.nextInt();

        while (num > 0) {
            int lastDigit = num % 10; // --> for last digit always use modulo operator
            System.out.print(lastDigit + "");
            num = num / 10; // n/=10 //--> to remove last digit always use divide operator

        }
        System.out.println(); // --> for next line

    }

}
