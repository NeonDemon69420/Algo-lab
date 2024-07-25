import java.util.Scanner;
public class Question_3{
    public static void main(String[] args) {

        int number;
        int sum =0 ;

        Scanner scanIn=new Scanner(System.in);

        System.out.println("Input Number ");
        number = scanIn.nextInt();
        //checks if the number is positive

        if (number<0){
            // if -ve error is output

            System.out.println("Error,Number must be a positive value");     
              

        }else {
            //checks if the number is even or odd
            // if even,proceeds to first if statement
            if (number % 2 == 0){

                for (int i = 0; i < number; i++) {
                    if (i% 2 != 0) {
                        sum = i+sum;                        
                    }                     
                }
                           
            }else{
                // if the number itself is odd,it is included within the counting process                

                for (int i = 0; i <= number; i++) {
                     if (i% 2 != 0) {
                        sum = i+sum;                        
                    }       
                    
                }           


            }
        }
        System.out.println(sum);       
        //prints out the sum of the odd numbers
         
    }
    




}