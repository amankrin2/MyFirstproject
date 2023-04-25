package Apna_College.loopquestions;

import java.util.*;

public class ContinueExample {
    public static void main(String args[]) {
        // skip numbers and contiue the statement
        /*
         * for (int i = 1; i <= 5; i++) {
         * if (i == 3) {
         * 
         * continue;
         * }
         * System.out.println(i);
         * }
         */
        // Display all numbers entered by user except multiples of 10
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        do {
            System.out.println("Enter your number");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("number was : " + n);
        } while (true);

    }

}
