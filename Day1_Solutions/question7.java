// Write a Java program to input basic salary of an employee and calculate its Gross salary according to following:
// Basic Salary <= 10000 : HRA = 20%, DA = 80%
// Basic Salary <= 20000 : HRA = 25%, DA = 90%
// Basic Salary > 20000 : HRA = 30%, DA = 95%

import java.util.Scanner;

public class question7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int basic_salary = sc.nextInt();
        double gross_salary, hra, da;

        if (basic_salary <= 10000) {
            hra = basic_salary * 0.2;
            da = basic_salary * 0.8;
            gross_salary = hra + da + basic_salary;

        } else if (basic_salary <= 20000) {
            hra = basic_salary * 0.25;
            da = basic_salary * 0.9;
            gross_salary = hra + da + basic_salary;
        } else {
            hra = basic_salary * 0.3;
            da = basic_salary * 0.95;
            gross_salary = hra + da + basic_salary;
        }

        System.out.printf("%f is the total salary ", gross_salary);
        sc.close();
    }
}