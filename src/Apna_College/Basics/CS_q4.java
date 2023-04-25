package Apna_College.Basics;
import java.util.*;

public class CS_q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the year: ");

        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        /*
         * if((input%4==0) && (input%100==0) && (input%400==0)){
         * System.out.println("you eantered a leap year");
         * }
         * else{
         * System.out.println("You entered doesn't a leap year");
         * }
         */

        if (x && (y || z)) {
            System.out.print(year + " is a leap year");

        } else {
            System.out.println(year + " is not a leap year");
        }

    }

}
