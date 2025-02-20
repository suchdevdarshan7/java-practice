import java.util.Scanner;

public class AmstrongNumber {
    public static int count(int number) {
        int count = 0;

        while (number != 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static int Exponent(int count, int number) {
        return (int) Math.pow(number, count);
    }

    public static boolean AmstrongOrNot(int number) {
        int temp = number;
        int sum = 0;
        int countOfNumber = count(number);

        while (temp != 0) {
            int last = temp % 10;
            sum = sum + Exponent(countOfNumber, last);
            temp /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        System.out.println(AmstrongOrNot(number) ? "Amstrong " : "Not Amstrong");

        sc.close();

    }
}
