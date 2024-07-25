import java.util.Scanner;


public class Question3{
    public static void main(String[] args) {
        //Declaration process
        double radius;         
        double Volume,Area;
        Scanner scanIn= new Scanner(System.in);
        //Basic I/O
        
        System.out.println("Input radius");
        radius = scanIn.nextDouble();
        //Calculation Section
         if (radius <= 0) {
            System.out.println("Error the value of radius must be greater than zero ");

             
         } else {
            Volume = (4.0/3.0)* (Math.PI*(Math.pow(radius, 3)));
            Area = 4.0* Math.PI * Math.pow(radius, 2);

            System.out.println(Volume);
            System.out.println(Area);
         }

       




        
    }

}