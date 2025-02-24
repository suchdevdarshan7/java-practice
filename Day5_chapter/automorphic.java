import java.util.Scanner;

public class automorphic {
    public static int CountDigits(int num) {
        int count = 0;

        while (num != 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int countOfDigit = CountDigits(num);
        int tenValue = (int) Math.pow(10, countOfDigit);
        int square = num * num;
        int last = square % tenValue;

        System.out.println("The number is " + num);
        System.out.println("The last is " + last);
        System.out.println("The square is " + square);

        if (num == last) {
            System.out.println("The number is automorphic number");
        } else {
            System.out.println("The number is not an automorphic number");
        }

    }
}
