package Apna_College.Basics;
import java.util.*;

public class Example_ternary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks out of hundred do you got");
        int marks = sc.nextInt();

        String type = marks >= 33 ? "Pass" : "Fail";

        System.out.println(type);

    }
}
