package Day4_Chapter;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int outer = 1; outer <= n; outer++) {
            for (int inner = 1; inner <= n; inner++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        sc.close();

    }
}
