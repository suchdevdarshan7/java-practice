import java.util.Scanner;

public class nPrimes {

    public static boolean isPrime(int number) {

        if (number == 0 || number == 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        int count = 0;
        int i = 0;
        while (count != range) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
            }
            i++;
        }

    }
}
