import java.util.Scanner;

public class Conditionals{
    public static void main(String []args){
        Scanner sc  = new Scanner(System.in);

        int number = sc.nextInt();

        if(number==1 || number ==0){
            System.out.print("The number is neither odd nor even!");
        }
        else if(number%2==0){
             System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }




        // ! Odd or even:

        // if(number%2==0){
        //     System.out.println("The number is even");
        // }
        // else{
        //     System.out.println("The number is odd");
        // }


        // if(number%2==1){
        //     System.out.print("The number is odd");
        // }
        // else{
        //     System.out.print("The number is even");
        // }

        // if(number%2!=1){
        //     System.out.print("The number is even");
        // }
        // else{
        //     System.out.print("The number is odd");
        // } 

        // if(number%2!=0){
        //     System.out.print("The number is odd");
        // }
        // else{
        //     System.out.print("The number is even");
        // }

        


    }
}