package Code_with_Harry;
import java.util.*;

public class Ps1q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in km");
        int distance = sc.nextInt();
        float distanceintoMiles = distance*0.62f;
        System.out.print(distanceintoMiles);
    }
    
}
