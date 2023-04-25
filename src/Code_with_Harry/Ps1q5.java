package Code_with_Harry;

import java.util.*;

public class Ps1q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int num = sc.nextInt();

        if (num >= 0 || num < 0) {
            System.out.println("The number you entered is an integer ");
        } else {
            System.out.println("The number you entered is not an integer");
        }
    }

}
