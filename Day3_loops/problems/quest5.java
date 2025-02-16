
public class quest5 {
    public static void main(String[] args) {
        int number = 33445;
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        System.out.println(count);
    }
}
