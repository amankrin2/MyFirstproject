package Apna_College.Basics;
import java.util.*;

public class MarksPercentage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks subjectwise ");
        System.out.println("Enter marks of sub1");
        int sub1 = sc.nextInt();
        System.out.println("Enter marks of sub2");
        int sub2 = sc.nextInt();
        System.out.println("Enter marks of sub3");
        int sub3 = sc.nextInt();
        System.out.println("Enter marks of sub4");
        int sub4 = sc.nextInt();
        System.out.println("Enter marks of sub5");
        int sub5 = sc.nextInt();

        int marks = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Your total marks is " + marks);
        double percentage = marks * 100 / 500;

        System.out.println("And percentage is " + percentage);

    }
}
