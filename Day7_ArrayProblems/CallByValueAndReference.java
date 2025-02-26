import java.util.Arrays;

public class CallByValueAndReference {
    public static void Increment(int a) {
        a = a + 10;
    }

    public static void Manipulate(int arr[]) {
        arr[3] = 15112002;
    }

    public static void main(String[] args) {
        // ! IN java -- primitive data types can only be sent through call by value
        // int a = 10;
        // Increment(a);
        // System.out.println(a);

        // In java -- non - primitives is sent through call by reference

        int arr[] = { 1, 2, 3, 4, 5 };
        Manipulate(arr);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

    }
}
