import java.util.Scanner;

public class quest8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testingNumber = sc.nextInt();
        boolean flag = false;

        if (testingNumber == 0 || testingNumber == 1) {
            System.out.println("The number is neither prime nor composite!");
            sc.close();
            return;
        }

        for (int i = 2; i <= Math.sqrt(testingNumber); i++) {
            System.out.println("Iteration");
            if (testingNumber % i == 0) {
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("The number is prime ");
        } else {
            System.out.println("The number is not prime");
        }

    }
}
