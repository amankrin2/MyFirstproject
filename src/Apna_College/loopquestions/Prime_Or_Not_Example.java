package Apna_College.loopquestions;
import java.util.*;

public class Prime_Or_Not_Example {
    public static void main(String args[]){
        //check if a number is prime or not
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number do you want to check prime or not");
    int n = sc.nextInt();
    int temp = 0;
    for(int i=2; i<=(n-1); i++){
        if(n%i==0){
            temp=temp+1;
        }
    }if(temp>0){
        System.out.println("Number is not prime");
    }else{
        System.out.println("Number is prime");
    }

    }
}
