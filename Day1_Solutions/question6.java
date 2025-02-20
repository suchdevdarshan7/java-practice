import java.util.Scanner;

// Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
// Percentage >= 90% : Grade A
// Percentage >= 80% : Grade B
// Percentage >= 70% : Grade C
// Percentage >= 60% : Grade D
// Percentage >= 40% : Grade E
// Percentage < 40% : Grade F

public class question6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of all subjects");
        int Physics = sc.nextInt();
        int Chemistry = sc.nextInt();
        int Biology = sc.nextInt();
        int Mathematics = sc.nextInt();
        int Computer = sc.nextInt();

        int percentage = ((Physics + Chemistry + Biology + Mathematics + Computer) / 500) * 100;

        System.out.printf("%d is ", percentage);

        sc.close();

    }
}