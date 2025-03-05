import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5 };

        int n = arr[arr.length - 1];
        int formula = n * (n + 1) / 2;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int missingNum = formula - sum;
        System.out.println(missingNum);
    }
}
