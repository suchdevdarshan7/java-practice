import java.util.Scanner;

public class method {
    public static void greet(String name) {
        System.out.printf("Hello mr %s welcome to my application nice to meet you ! \n", name);
    }

    public static void welcomeGuest() {
        System.out.print("Welcome to this website bye bye!");
    }

    public static void getUserData(String name, int age, String dept) {
        System.out.printf(
                "The name of the student : %s \nThe age of the student %d \nThe department of the student: %s\n", name,
                age, dept);
    }

    // public static void getSum(int a, int b) {
    // System.out.print(a + b);
    // }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static boolean isAllowedToDrive(int age) {
        return age > 18;
    }

    public static String generatePassword(String name) {

        // ! When defining a method we have parmaters
        // ! in generatePassword method name is parameter
        return "xxxxserljksdfoiuwerlknsd" + name + "3ohjsdf089sdfo8n";
    }

    // int sum(double a, double b){
    // return a + b;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // welcomeGuest();

        // String name = sc.next();
        // String name2 = sc.next();

        // greet(name);
        // greet(name2);

        // ! DRY --> Don't repeat yourself

        // getUserData("Niteesh", 20, "cse");
        // getUserData("Darshan", 22, "cyber security");

        // int ans = getSum(10, 20);

        // System.out.println(ans);

        // int age = 10;

        // if (isAllowedToDrive(age)) {
        // System.out.println("The person is allowed to drive cars!");
        // } else {
        // System.out.println("The person is not allowed to drive cars!");
        // }

        String name = "Niteesh";

        String newPassword = generatePassword(name);

        // When calling a method we pass a variable which is called Arguments

        System.out.println(newPassword);

        sc.close();

    }
}
