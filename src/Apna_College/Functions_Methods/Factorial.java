package Apna_College.Functions_Methods;
import java.util.*;

public class Factorial {
    static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number do you want a factorial");
        int i = sc.nextInt();
        int z = factorial(i);
        System.out.println("The factorial of your number " +z);
    }
    
}
