import java.util.Scanner;

public class quest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        while (num != 0) {
            int last = num % 10;
            sum = sum * 10 + last;
            num /= 10;
        }

        System.out.print(sum);
        sc.close();
    }
}
