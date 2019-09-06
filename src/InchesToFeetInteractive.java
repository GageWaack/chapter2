import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        int feet;
        final int INCHES = 12;
        int inchesRemaining;
        int input;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of inches");
        input = keyboard.nextInt();

        feet = input / INCHES;

        inchesRemaining = input % 12;

        System.out.println("There is "+ feet+ " feet in " +input+ " inches, you have "+ inchesRemaining + " inches leftover");

    }
}
