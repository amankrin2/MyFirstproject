package TestQuestions;

public class FirstTest {
    public static void main(String args[]){
        //Q1 How many times will "Apna college" be printed.
        int count = 0;
        do{
            System.out.println("Apna College");
            count++;
        }while(count<10);

        //Q2. Print the pattern 
        /* 11111
         * 2222
         * 333
         * 44
         * 5
         */
        for(int j=1; j<=5; j++){
            for(int k=5; k>=j; k--){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        //Q3 What is the output?
        int a = 10;
        System.out.println(a--*a--);


        //Q4. Find the output of the following code.
        int i;
        for(i=1; i<6; i++){
            if(i>3)
            continue;
        }
        System.out.println(i);

        int cont =1;
        while(cont<=15){
            System.out.println(cont%2==1? "***" : "+++++");
            ++cont;
        }

        //Q5. Print the given pattern.
        /*
         * 1
         * 22
         * 333
         * 4444
         * 55555
         */

        /*for(int i = 1; i<=5; i++){
            for(int j=i; j>0; j--){
                System.out.print(i);
            }
            System.out.println();
         }*/

         //Q6. Evaluate the following Java expression, if x=3, y=5, and z=10:
         // ++z+y-y+z+x++

         int x =3, y = 5, z=10;

        System.out.println(++z+y-y+z+x++);



    }
    
}
