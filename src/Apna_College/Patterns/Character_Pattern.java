package Apna_College.Patterns;

public class Character_Pattern {
    public static void main(String args[]){
        int n = 4;
        char ch = 'A';
        //outer loop
        for(int line =1; line <=n; line++){
            //inner loop
            for(int chars = 1; chars<=line; chars++){ //I don't use char as a variable becauce char is a reserve keyword
               System.out.print(ch);
               ch++;
            }
            System.out.println();
        }
    }
}
