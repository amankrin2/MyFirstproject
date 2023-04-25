package Code_with_Harry;

import java.util.*;

public class Cwh_4_q2 {
    public static void main(String args[]) {
        /*
         * WAP to find out weather a student is pass or fail; if it requres total
         * 40% and at least 33% in each subject to pass. Assume 3 sub and take marks as
         * input from user.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of your 1st sub : ");
        float sub1 = sc.nextFloat();
        System.out.println("Enter the marks of your 2nd sub : ");
        float sub2 = sc.nextFloat();
        System.out.println("Enter the marks of your 3rd sub : ");
        float sub3 = sc.nextFloat();
        float totalMarks = sub1 + sub2 + sub3;
        float percentage = (totalMarks) * 100 / 300;
        if (percentage >= 33.0) {
            System.out.println("You are pass and your total percentage is :" + percentage);

        } else {
            System.out.println("You are fail and your total percentage is :" + percentage);

        }
    }
}
