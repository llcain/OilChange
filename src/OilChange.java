
import java.util.Scanner;


public class OilChange {

    public static void main (String [] args) {

        //initialize variables


        float odometerNumber;
        float totalMiles = 10300;
        float milesDay = 85;
        float result;

        Scanner Keyboard = new Scanner(System.in);

        //enter current odometer number

        System.out.println("Enter current odometer number");
        odometerNumber = Keyboard.nextFloat();


        //calculates the result of total miles driven

        result = odometerNumber + totalMiles;

        //Display calculates to screen

        System.out.println("Your next oil change is at " + result);


    }


}
