import java.util.Scanner;

public class SearchArray {

    public static int searchElement(int arr[], int elementToSearch) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };
        int elementToSearch = sc.nextInt();
        searchElement(arr, elementToSearch);

        sc.close();

    }
}
