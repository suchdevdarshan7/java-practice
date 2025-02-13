import java.util.Scanner; // Scanner 

public class Sample{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in); // Object

        // System.in --> Reading the input from the keyboard

        // System.out.println("Enter a number!");
        // int a = sc.nextInt();


        // System.out.printf("The number entered was %d",a);

        // float pi = sc.nextFloat();

        // System.out.println("The value of pi is "+pi);

        // short ans = sc.nextShort();
        // long value = sc.nextLong();
        // double value1 = sc.nextDouble();
        // String name = sc.next();

        // char ch = sc.next().charAt(2);

        // System.out.print(ch);

        String name = sc.nextLine();

        System.out.print(name);

        sc.close();

    }
}