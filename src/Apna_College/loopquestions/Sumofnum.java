package Apna_College.loopquestions;

import java.util.*;

public class Sumofnum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Print sum of first n natural numbers
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;

        }
        System.out.println("sum is " + sum);
    }

}
