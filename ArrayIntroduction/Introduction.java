import java.util.Arrays;
import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int arr[] = new int[] { 1, 2, 3, 4, 5 };
        // int brr[] = new int[10];
        // int crr[] = { 1, 2, 3, 4, 5 };

        // int length = sc.nextInt();
        // int nums[] = new int[length];

        // for (int i = 0; i < length; i++) {
        // nums[i] = sc.nextInt();
        // }

        // Simple printing of array not important for now :)
        // System.out.println(Arrays.toString(nums));

        // System.out.print("[");
        // ! traditional for loop printing
        // for (int i = 0; i < marks.length; i++) {
        // System.out.printf("%d ,", marks[i]);
        // }
        // System.out.println("]");

        int marks[] = { 100, 90, 88, 60, 74 };
        // ! For each loop : Simple way to print
        for (int element : marks) {
            System.out.println(element);
        }
    }
}