package Apna_College.Functions_Methods;

import java.util.*;

public class Bio_Coefficient {
    static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f = f*i;
        }
        return f;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        int z = a/(b*c);
        System.out.println("The bionomial coefficient of your number is : " + z);

    }

}
