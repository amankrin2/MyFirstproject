package Apna_College.Patterns;

public class Print_InvertedStar {
    public static void main(String args[]) {
        int n = 7;
        for (int i = 1; i <= 7; i++) {
            for (int s = 1; s <= n - i + 1; s++) {
                System.out.print("* ");

            }
            System.out.println(" ");
        }
        

    }

}
