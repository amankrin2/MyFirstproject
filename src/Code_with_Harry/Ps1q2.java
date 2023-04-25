package Code_with_Harry;
import java.util.*;

public class Ps1q2 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks of your sub1");
    int sub1 = sc.nextInt();
    System.out.println("Enter marks of your sub2");
    int sub2 = sc.nextInt();
    System.out.println("Enter marks of your sub3");
    int sub3 = sc.nextInt();

    int marks = sub1+sub2+sub3;
    float percentage = marks*100/300;
    float cgpaOfMarks = (percentage/9.5f);
    System.out.println("Your CGPA is " + cgpaOfMarks);
    }

    
}
