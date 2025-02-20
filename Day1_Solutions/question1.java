import java.util.Scanner;

// Write a Java program to find maximum between two numbers.

public class question1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.printf("%d is greater than %d", a, b);
        } else if (b > a) {
            System.out.printf("%d is greater than %d", b, a);
        } else {
            System.out.printf("%d is equal to %d", a, b);
        }
        sc.close();
    }
}