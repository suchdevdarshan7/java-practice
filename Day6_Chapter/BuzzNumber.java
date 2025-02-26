import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int last = num % 10;

        if (last == 7 || num % 7 == 0) {
            System.out.println("The number is Buzz number");
        } else {
            System.out.println("The number is not a buzz numbers");
        }

    }
}
