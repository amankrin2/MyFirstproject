package Apna_College.loopquestions;
import java.util.*;

public class Ques2 {
    public static void main(String args[]){
        //write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        if(n % 2==0){
            System.out.println("Your number is even");
        }else{
            System.out.println("Your number is odd");
        }

    }
    
}
