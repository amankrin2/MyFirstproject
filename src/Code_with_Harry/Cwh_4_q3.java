package Code_with_Harry;

import java.util.*;

public class Cwh_4_q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your total salary");
        int salary = sc.nextInt();
        if (salary > 250000) {
            float a = salary * 0.05f;
            float netSalary = salary - a;
            System.out.println("your total salary after tax is " + netSalary);
        } else if (salary >= 500000) {
            float a = salary * 0.2f;
            float netSalary = salary - a;
            System.out.println("your total salary after tax is : " + netSalary);
        } else if (salary > 1000000) {
            float a = salary * 0.3f;
            float netSalary = salary - a;
            System.out.println("your total salary after tax is : " + netSalary);
        } else {
            System.out.println("your total salary after tax is : " + salary);
        }
    }
}
