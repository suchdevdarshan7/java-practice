
import java.util.Scanner;

public class quest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Print the odd numbers between 1 to n;

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
