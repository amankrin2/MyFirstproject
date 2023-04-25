package Apna_College.loopquestions;

import java.util.*;

public class print100times {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Counter = 0;
        System.out.println("Enter the words or sentence do u want to print 100 times");
        String input = sc.nextLine();

        while (Counter < 100) {

            System.out.println(input);
            Counter++;
        }
        

    }

}
