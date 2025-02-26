import java.util.Arrays;

public class ArrayProblem2 {
    public static void WrongMethod(int arr[]) {
        int brr[] = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            brr[j] = arr[i];
            j++;
        }

        System.out.println(Arrays.toString(brr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));

    }
}
