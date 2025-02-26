// Find the maximum number and minimum number in an array
public class ArrayProblem {
    public static void maxi(int arr[]) {
        int max = Integer.MIN_VALUE; // later optimaztion required

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The maximum number in an array is " + max);
    }

    public static void mini(int arr[]) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);

    }

    public static void main(String[] args) {
        int arr[] = { 89, 39, 204, 193, 592, 583, 239 };

        maxi(arr);
        mini(arr);

    }
}
