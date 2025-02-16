import java.util.Scanner;

public class quest2 {
    public static void main(String[] args) {
        // ! Print the multiplication table of any number of any range:
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int range = sc.nextInt();

        for (int i = 1; i <= range; i++) {
            System.out.printf("%d x %d = %d \n", number, i, (number * i));
        }

        sc.close();

    }
}
