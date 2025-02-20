import java.util.Scanner;

public class chapter1 {
    public static void main(String args[]) {
        // System.out.println(100 * 2 / 5);
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();

        switch (days) {
            case 100:
                System.out.print(100);
                break;
            case 80:
                System.out.print(80);
                break;
            case 60:
                System.out.print(60);
                break;
            case 40:
                System.out.print(40);
                break;
            case 20:
                System.out.print(20);
                break;
            case 10:
                System.out.print(10);
                break;
            default:
                System.out.print("The input is not valid!");

        }
        sc.close();
    }
}
