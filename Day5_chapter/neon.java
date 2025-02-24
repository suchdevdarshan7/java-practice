import java.util.Scanner;

public class neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int square = num * num;
        int sum = 0;
        while (square != 0) {
            int last = square % 10;
            sum = sum + last;
            square /= 10;
        }
        System.out.println("The num is " + num);
        System.out.println("The sum is " + sum);
        if (sum == num) {
            System.out.println("The number is neon number");
        } else {
            System.out.println("The number is not a neon number");
        }

    }
}
