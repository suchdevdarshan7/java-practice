package Day4_Chapter;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int o = 1; o <= n; o++) {
            for (int i = 1; i <= o; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        sc.close();
    }
}
