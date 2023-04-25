package Apna_College.Basics;
import java.util.*;

public class incomeTaxCalculator {
    public static void main(String args[]) {
        // income<5L (0% tax)
        // income between 5-10 20% tax
        // income>10L 30% tax
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual salary to know about your tax");
        int income = sc.nextInt();
        int tax;

        if (income < 500000) {
            tax = 0;
            // System.out.println("Your total salary is " + income+0% tax);

        } else if (income >= 500000 && income < 1000000) {
            tax = (int) (income * 0.2);

        } else {
            tax = (int) (income * 0.3);
        }
        System.out.print("Your tax is " + tax);

    }

}
