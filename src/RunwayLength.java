import java.util.Scanner;

public class RunwayLength {
    public static void main(String[] args) {
        double v_meter_second;
        double a_meter_second;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter speed and acceleration: ");

        v_meter_second = userInput.nextDouble();
        a_meter_second = userInput.nextDouble();

         double length =(v_meter_second * v_meter_second) / (2 * a_meter_second);
         //this is uploaded on github

        System.out.println("The minimum runway length for this airplane is: " + length);
    }
}
