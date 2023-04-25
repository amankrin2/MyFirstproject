package Apna_College.Functions_Methods;

import java.util.*;

public class PrimeOrNot {
    public static int prime(int a){
        int temp=0;
        for(int i=2; i<=(a-1); i++){
            if(a%i==0){
                temp += 1;
            }
        }if(temp>0){
           System.out.println("Number is not prime"); 
        }else{
            System.out.println("The number is prime");
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number do you want to check");
        int num = sc.nextInt();
        //int prime_OrNot = prime(num);
        //System.out.println(prime_OrNot);
        System.out.println(prime(num));
        
    }
}
    

