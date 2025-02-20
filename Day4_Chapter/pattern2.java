import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int outer = 1; outer <= n; outer++) {
            for (int inner = 1; inner <= n; inner++) {
                if (inner == 1 || inner == n || outer == n || outer == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        sc.close();
    }
}
