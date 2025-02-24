import java.util.Scanner;

public class amstrong {

    public static int CountDigits(int num) {
        int count = 0;

        while (num != 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    public static int Exponent(int num, int count) {
        return (int) Math.pow(num, count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int count = CountDigits(num);

        while (temp != 0) {
            int last = temp % 10;
            sum = sum + Exponent(last, count);
            temp = temp / 10;
        }

        if (num == sum) {
            System.out.println("The number is amstrong !");
        } else {
            System.out.println("The number is not amstrong");
        }
    }
}
