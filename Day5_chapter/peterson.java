import java.util.Scanner;

public class peterson {
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int last = temp % 10;
            sum = sum + factorial(last);
            temp = temp / 10;
        }
        System.out.println("The num is " + num);
        System.out.println("The sum is " + sum);
        if (sum == num) {
            System.out.println("The number is peterson number");
        } else {
            System.out.println("The number is not peterson number");
        }

    }
}
