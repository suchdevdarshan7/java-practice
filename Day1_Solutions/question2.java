import java.util.Scanner;

// Write a Java program to find maximum between three numbers.

public class question2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.printf("%d is the greatest", a);
        } else if (b > a && b > c) {
            System.out.printf("%d is the greatest", b);
        } else if (c > a && c > b) {

            System.out.printf("%d is the greatest", c);
        }
        sc.close();
    }
}