package Apna_College.Basics;
import java.util.*;

public class varq1 {
    public static void main(String args[]) {
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        float avg = (a + b + c) / 3;
        System.out.println(avg);
    }

}
