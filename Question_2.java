
import java.util.Scanner;


public class Question_2{

    public static void main(String[] args) {
        double side1,side2,side3;
        double sum;   
        

        try (Scanner scanIn = new Scanner(System.in)) {
            System.out.println("Input the value of the First Side ");
            side1 = scanIn.nextInt();
            System.out.println("Input the Value of the Second Side ");
            side2= scanIn.nextInt();
            
            System.out.print("Input the value of the Third Side ");
            side3 = scanIn.nextInt();
            
            if (side1<0 || side2<0|| side3 < 0){
                System.out.println("All sides must be positive");
                //Checking for -ve values
                
            }else{
                
                sum = Math.pow(side1,2)+ Math.pow(side2, 2);
                //Sumation of a^2 and b^2
                
                if (sum == side3){
                    // Sumation of a^2 and b^2 must equal to c^2
                    System.out.println("The sides can constitute a right hand triangle");
                    
                    
                }else{
                    
                    System.out.println("Cannot constitute a Right angle triangle");
                    
                }
                
            }
        }



    }




}