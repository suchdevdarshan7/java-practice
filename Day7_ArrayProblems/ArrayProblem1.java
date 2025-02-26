// Print the odd || even numbers in an array !

import java.util.Arrays;

public class ArrayProblem1 {
    public static void main(String[] args) {
        int arr[] = { 12, 32, 41, 94, 53, 87 };
        int brr[] = new int[arr.length];
        int j = 0;

        // method 1:
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                brr[j] = arr[i];
                j++;
            }
        }

        // method 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.println(arr[i]);
            }
        }

        System.out.println(Arrays.toString(brr));

    }
}
