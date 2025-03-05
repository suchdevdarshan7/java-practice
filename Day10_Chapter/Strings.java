import java.util.*;

public class Strings {
    public static boolean PalindromeString(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = new String("Niteesh");

        String name = "amma";
        String name2 = "Amma";

        char ch = sc.next().charAt(0);

        String newStr = name2.toLowerCase();
        String newStr2 = name2.toUpperCase();

        System.out.println(newStr);

        System.out.println(PalindromeString(newStr) ? "Is Palidrome" : "NOt a palindrome");

        sc.close();
    }
}
