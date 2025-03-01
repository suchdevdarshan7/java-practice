import java.util.Arrays;

public class SwapAlternate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int length = arr.length;

        for (int i = 0; i < length; i = i + 2) {
            if (length > i + 1) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}