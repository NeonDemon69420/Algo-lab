
import java.util.Scanner;

public class Question5{
    public static void main(String[] args) {



        int num1,num2,num3,sum;
        double average,result;
        
        Scanner scanIn= new Scanner(System.in);
        int options;
        boolean looper= true;



        while (looper == true) { 
            System.out.println("Enter Num1 ");
            num1 = scanIn.nextInt();

            System.out.println("Enter Num2 ");
            num2 = scanIn.nextInt();

            System.out.println("Enter Num3 ");
            num3 =scanIn.nextInt();

            System.out.println("1.Addition");
            System.out.println("2.Average");
            System.out.println("3.Remainder when num1 is raised to the power of num2 and then divided by num3");
            System.out.println("4.Exit");
            options =scanIn.nextInt();
            System.out.println("You choose option "+options);
            if(options == 4) break;



            switch(options){
                case 1 -> {
                    sum = num1+num2+num3;
                    System.out.println("Result ="+sum);
                }
                case 2 -> {
                    average = ((num1+num2+num3)/3);
                    System.out.println("Result = "+average);
                }
                case 3 -> {
                    result=((Math.pow(num1, num2))%num3);
                    System.out.println("Result = "+ result);
                }          
                

            
        }
        System.out.println("loop complete!");



    }



    }
}