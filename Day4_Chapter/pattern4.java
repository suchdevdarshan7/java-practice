package Day4_Chapter;
// package Day3_Chapter;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int sum = 0;

        for (int o = 1; o <= n; o++) {

            for (int i = 1; i <= n; i++) {
                sum++;
                System.out.printf("%-3d", sum);
            }
            System.out.println("");
        }
    }
}
