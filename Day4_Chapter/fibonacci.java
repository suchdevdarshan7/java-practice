package Day4_Chapter;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t1 = 0;
        int t2 = 1;
        int t3 = t1 + t2;

        System.out.printf("%d %d ", t1, t2);

        for (int i = 1; i <= n - 2; i++) {
            System.out.printf("%d ", t3);
            t1 = t2;
            t2 = t3;
            t3 = t1 + t2;
        }
    }
}
