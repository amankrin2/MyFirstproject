package Code_with_Harry;
import java.util.*;

public class Cwh_4_q5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("Yeah! you entered a leap year");
        }else{
            System.out.println("Oops! it's not a leap year");
        }

    }
    
}
