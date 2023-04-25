package Apna_College.Arrays;

import java.util.*;

public class ArrayCC2 {
    public static void main(String args[]) {
        // taking input from user and calculate percentage
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Phy");
        marks[0] = sc.nextInt(); // taking input from user
        System.out.println("Enter the marks of che");
        marks[1] = sc.nextInt();
        System.out.println("Enter the marks of Math");
        marks[2] = sc.nextInt();
        System.out.println("Enter the marks of hindi");
        marks[3] = sc.nextInt();
        System.out.println("Enter the marks of eng");
        marks[4] = sc.nextInt();
        System.out.println("Your total marks are " +( marks[0] + marks[1] + marks[2] + marks[3] + marks[4]));
        int percentage = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5;
        System.out.println("Total percentage are " + percentage + "%");

    }

}
