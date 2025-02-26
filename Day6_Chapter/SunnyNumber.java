import java.util.Scanner;

public class SunnyNumber {

    public static boolean squareRoot(int num) {
        int square = 1;
        int i;
        for (i = 1; i < num / 2; i++) {
            square = i * i;
            if (square == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int IncrementValue = ++num;

        if (squareRoot(IncrementValue)) {
            System.out.println("The number is Sunny number");
        } else {
            System.out.println("The number is not Sunny number");
        }

    }
}
