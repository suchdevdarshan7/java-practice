import java.util.Scanner;

public class Reverse {
    public static String reverseString(String str) {
        String reversedString = "";

        char ch;

        for (int i = str.length() - 1; i >= 0; i--) {
            ch = str.charAt(i);
            reversedString += ch;
        }

        return reversedString;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Niteesh";
        String newStr = reverseString(str);

        System.out.println(newStr);
    }
}
