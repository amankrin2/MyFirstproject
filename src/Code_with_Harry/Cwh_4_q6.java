package Code_with_Harry;

import java.util.*;

public class Cwh_4_q6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for your requirement \nif you want to a commercial website then press 1");
        System.out.println("if you want to a organizational website then enter 2");
        System.out.println("if you want to a indian website then press 3");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("www.amazon.in");
                System.out.println("www.flipkart.in");
                break;
            case 2:
                System.out.println("www.bpmce.org");
                break;
            case 3:
                System.out.println("www.apnacollege.in");
                System.out.println("www.tutorialspoint.in");
                break;
            default:
                System.out.println("Error!! You entered Out of the range number");
        }

    }

}
