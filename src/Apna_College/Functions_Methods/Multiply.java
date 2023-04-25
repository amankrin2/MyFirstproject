package Apna_College.Functions_Methods;

import java.util.*;

public class Multiply {
    static int multi(int x, int y) {
        int z = x * y;
        // System.out.println(z);
        return z;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a = sc.nextInt();
        System.out.println("Enter the value of a second number");
        int b = sc.nextInt();
        int c = multi(a, b);
        System.out.println("The multiplication of both numbers are : " +c);

    }

}
