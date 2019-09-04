import java.util.Scanner;

public class InchesToFeet {
    public static void main(String[] args) {
        int feet;
        final int INCHES = 12;
        int inchesRemaining;
        int input;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of inches");
        input = keyboard.nextInt();

        feet = input / INCHES;

        inchesRemaining = INCHES % 4;

        System.out.println("There is "+ feet+ "in "+input+ " You have "+ inchesRemaining + "inches leftover");

    }
}
