package Apna_College.Basics;
import java.util.*;

public class varq3 {
    public static void main(String args[]) {
        System.out.println("Enter the price of the pencil");
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();

        System.out.println("Enter the price of the pen");
        float pen = sc.nextFloat();

        System.out.println("Enter the price of the eraser");
        float eraser = sc.nextFloat();

        System.out.println("Total price of the above products are:");

        float cost = pencil + pen + eraser;
        float gst = (cost * 18) / 100;
        float bill = cost + gst;

        System.out.println(bill);
    }
}
