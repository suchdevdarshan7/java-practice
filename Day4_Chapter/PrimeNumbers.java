
import java.util.Scanner;

public class PrimeNumbers {

    public static boolean isPrime(int number) {

        if (number == 0 || number == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();

        for (int i = 1; i <= range; i++) {
            if (isPrime(i)) {
                System.out.format("%d ", i);
            }
        }

        System.out.println(Math.sqrt(2));

        sc.close();
    }
}
