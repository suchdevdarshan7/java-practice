
public class SwapProblem {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.printf("The number a : %d and number b : %d", a, b);
    }
}
