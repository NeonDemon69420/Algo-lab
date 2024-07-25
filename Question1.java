import java.util.Scanner;


public class Question1{
    public static void main(String[] args) {
        // Declaration process

        double magenta,cyan,yellow,black;
        double red,green,white,blue;

        Scanner scanIn = new Scanner(System.in);
        //Asking the User for input and storing the data

        System.out.println("Input Magenta ");
        magenta = scanIn.nextDouble();

        System.out.println("Input Cyan");
        cyan = scanIn.nextDouble();

        System.out.println("Input Yellow ");
        yellow = scanIn.nextDouble();

        System.out.println("Input Black");
        black = scanIn.nextDouble();
        // Validation Section 

        if (magenta<0 || magenta >1 || cyan<0 || cyan>1 || yellow <0 || yellow >1 || black<0|| black>1 ) {
            System.out.println("Error value must be within the range of 0 and 1 ");            
        } else {
            //Conversion Section

            white = 1-black;
            System.out.println("White = " + Math.round(white));

            red = 255*white*(1-cyan);
            System.out.println("Cyan = "+ Math.round(red));

            green = 255*white*(1-magenta);
            System.out.println("Green = "+ Math.round(green));

            blue = 255* white * (1-yellow);
            System.out.println("Yellow = "+ Math.round(blue));
        }
    }
}