import java.util.Scanner;

public class ISBNNumber {
    public static long count(long num) {
        int count = 0;

        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long countOfDigit = count(num);
        long digit = 1;
        long sum = 0;
        // 8147852369

        if (countOfDigit != 10) {
            System.out.println("It is not a ISBN number !");
            return;
        }

        while (num != 0) {
            long last = num % 10;
            sum = sum + (last * digit);
            digit++;
            num /= 10;
        }

        if (sum % 11 == 0) {
            System.out.println("The number is ISBN number");
        } else {
            System.out.println("The number is not a ISBN number");
        }

    }
}
