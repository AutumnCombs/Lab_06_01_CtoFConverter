import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double tempC = 0;
        double tempF = 0;
        String trash = "";

        System.out.print("Enter the temperature in Celcius: ");

            tempC = in.nextDouble();
            in.nextLine();
            tempF = (tempC * 1.8) + 32;
            System.out.println("This is equivalent to " + tempF + " degrees F");

       if (tempF == 32) {
            System.out.println("This is the freezing point of water in Fahrenheit.");
        } else if (tempF == 212) {
            System.out.println("This is the boiling point of water in Fahrenheit.");
        } else {
            trash = in.nextLine();
            System.out.println("You must enter a valid temperature not " + trash);
        }
    }
}
