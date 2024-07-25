import java.util.Scanner;

public class Question2{
    public static void main(String[] args) {
        int num1, num2;

        Scanner scanIn = new Scanner(System.in);

        System.out.println("Input number 1 ");
        num1 = scanIn.nextInt();

        System.out.println("Input number 2 ");
        num2 = scanIn.nextInt();   

        if ((num1 % num2)!= 0) {

        System.out.println("num1 is not a multiple of num 2 ");
        

        }else {
            System.out.println("num1 if a multiple of num2 ");    


        }


        
    }



}