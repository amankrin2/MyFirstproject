package Apna_College.loopquestions;

import java.util.*;

public class UserPrint {
    public static void main() {
        // Keep entering numbers till user enters a multiple of 10
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("enter your number");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
    }

}
