package Apna_College.loopquestions;

import java.util.*;

public class NumberPrint {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range which you want to print number");

        int range = sc.nextInt();
        int counter = 1;

        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;
        }

    }

}
