
public class Recursion {
    public static void foo() {
        System.out.println("The recursion has started!");
        foo();
    }

    public static int fact(int num) {
        // base case terimate
        if (num == 0 || num == 1) {
            return 1;
        }
        System.out.println(num);
        return num * fact(num - 1);

    }

    public static void main(String[] args) {
        int ans = fact(5);
        System.out.println(ans);
    }
}
