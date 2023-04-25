package Apna_College.Patterns;

public class Hollow_Rect {
    public static void hollow_rectangle(int totRows, int totCols) {
        // for outer loop rows
        for (int i = 1; i <= totRows; i++) {
            // for inner loop colums
            for (int j = 1; j <= totCols; j++) {
                // cell
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        hollow_rectangle(5, 5);

    }

    

}
