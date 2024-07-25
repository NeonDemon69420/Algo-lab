import java.util.Calendar;
import java.util.Scanner;

public class Myfirstinput{ 
    public static void main(String[] args) {
        String name;
        int yearOfBirth,age;

        try (Scanner scanIn = new Scanner(System.in)) {
            System.out.print("Please enter your name");
            name = scanIn.nextLine();
            System.out.println("Please enter your Year of birth");
            
            yearOfBirth = scanIn.nextInt();
            age=(Calendar.getInstance().get(Calendar.YEAR)- yearOfBirth);
            System.out.println(name +", you are "+ age +" years old");
        }


    }



}