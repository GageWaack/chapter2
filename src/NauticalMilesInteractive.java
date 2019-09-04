import java.util.Scanner;
public class NauticalMilesInteractive {
    public static void main (String[] args) {

        final double KILOMETERS = 1.852;
        final double MILES = 1.150779;
        double inputMiles;
        double answerMiles;
        double answerKilo;


        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter number of nautical miles");
        inputMiles = keyboard.nextInt();

        answerMiles = inputMiles * MILES;
        answerKilo = inputMiles * KILOMETERS;

        System.out.println ("You entered " + inputMiles + " so "+ inputMiles + "is " + answerMiles + " actual miles" +
        " so that means " + inputMiles + " in KILOMETERS is " + answerKilo);



    }
}
