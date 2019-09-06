import java.util.Scanner;
public class Eggs {
    public static void main (String[] args) {

        final int dozen = 12;
        double eggCost = .45;
        double dozenCost = 3.25;
        int input;
        double price;


        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of eggs");
        input = keyboard.nextInt();


        price = input * eggCost;

        System.out.print("You entered " + input + " so you have to pay " + price +" because 1 egg costs 45 cents");
    }
}
