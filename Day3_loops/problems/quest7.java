
public class quest7 {
    public static void main(String[] args) {
        // Write a Java program to find all factors of a number.
        int number = 20;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
