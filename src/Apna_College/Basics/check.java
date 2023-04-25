package Apna_College.Basics;
import java.util.*;

public class check {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write any number");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }

    }

}
