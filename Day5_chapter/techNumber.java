import java.util.Scanner;

public class techNumber {

    public static int CountDigits(int num) {
        int count = 0;

        while (num != 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    public static int Exponent(int base, int expo) {
        return (int) Math.pow(base, expo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int countOfNum = CountDigits(num);

        if (countOfNum % 2 == 1) {
            System.out.println("The number is not a tech number ");
            return;
        }
        int CountOfHalf = countOfNum / 2;
        int tenValue = Exponent(10, CountOfHalf)

        int last = num % tenValue;
        int first = num / tenValue;

        int sumOfBoth = last + first;
        int squareOfSum = Exponent(sumOfBoth, 2);

        System.out.println("The number is " + num);
        System.out.println("The square sum is " + squareOfSum);

        if (num == squareOfSum) {
            System.out.println("The number is tech number");
        } else {
            System.out.println("The number is not a tech number");
        }

    }
}
