import java.util.*;

public class Matrix {
    public static void print2DArray(int arr[][], int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 2;
        int colm = 3;
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        print2DArray(arr, row, colm);

        System.out.println(Arrays.deepToString(arr));
    }
}
