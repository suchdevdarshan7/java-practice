import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println(name);
        System.out.println(a);
        sc.close();
    }
}
