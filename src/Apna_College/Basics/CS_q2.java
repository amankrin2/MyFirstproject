package Apna_College.Basics;
import java.util.*;

public class CS_q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your body temperature");
        double temp = sc.nextDouble();

        if (temp > 100) {
            System.out.println("You have a fever");

        } else {
            System.out.println("You dont't have a fever");

        }

    }

}
