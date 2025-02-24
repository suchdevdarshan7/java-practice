import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt(); // 10
        int expo = sc.nextInt(); // 2
        int power = 1;

        for (int i = 1; i <= expo; i++) {
            power = power * base;
        }

        System.out.println("The power is " + power);
    }
}
