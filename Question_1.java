
import java.util.Scanner;

public class Question_1{
    public static void main(String[] args) {
        int var1,var2,var3,sum;
        double avg;

        try (Scanner scanIn = new Scanner(System.in)
        //basiclly asking user for input and saving in the variables named var1,var2 and var3
        ) {
            System.out.println("Enter Num1 ");
            var1= scanIn.nextInt();           
            
            System.out.println("Enter Num2 ");
            var2= scanIn.nextInt();
            
            System.out.println("Enter Num3 ");
            var3= scanIn.nextInt();           
            
            //only verifying if the inputs has been correctly done;
            
            // System.out.println(var1);
            // System.out.println(var2);
            // System.out.println(var3);
            
            //sum of all the variables
            
            sum= var1+var2+var3;
            
            System.out.println("The sum of the numbers = "+ sum);
            avg = sum/3;
            // used 3 beacuse only 3 inputs
            // should be stored in decimals form thus avg is double
            
            System.out.println("The average is "+avg);
            System.out.print("The product of thes numbers are ");
            System.out.println(var1*var2*var3);
            //product of the 3 integers,used print to print "the products.." and the value of product on the same line
            
            //Largest Number Comparator long method
            
            if (var1>var2 && var1>var3) {
                System.out.println("Number 1 is the largest number");
                
            }else if (var2>var1 && var2>var3) {
                System.out.println("Nubmer 2 is the largest number ");
                
            }else if (var3 > var2 && var3 > var1) {
                System.out.println("Number 3 is the largest number ");
                
            }else {
                System.out.println("All numbers are equal ");
            }
            
            
            //Smallest Number compatator long method
            
            
            if (var1<var2 && var1<var3) {
                System.out.println("Number 1 is the Smallest number");
                
            }else if (var2<var1 && var2<var3) {
                System.out.println("Nubmer 2 is the Smallest number ");
                
            }else if (var3 <var2 && var3 <var1) {
                System.out.println("Number 3 is the Smallest number ");
                
            }else {
                System.out.println("All numbers are equal ");
            }
        }








    }





}
