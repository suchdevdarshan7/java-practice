import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int square = 1;
        for (int i = 1; i < num / 2; i++) {
            System.out.println("Loop count" + i);
            square = i * i;
            if (square == num) {
                System.out.printf("The square root of %d is %d ", num, i);
                break;
            }
        }
    }
}
