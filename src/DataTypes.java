import java.util.Scanner;
public class DataTypes {
    public static void main (String[] args) {
        int cats = 5;
        int barrel;
        int monkeysEntered;

        System.out.println("Number of moneys = " + cats);

        barrel = cats;

        System.out.println("Number of moneys in the barrel = "+ barrel);
        System.out.println("How many more monkeys d5o you want in the barrel >>>>>");
        Scanner inputDevice = new Scanner (System.in);
        monkeysEntered = inputDevice.nextInt();

        barrel = cats + monkeysEntered;

        System.out.println("There are now " + barrel + "monkeys in the barrel" );
        barrel = barrel/ ( 1+(int)(Math.random()*10));
        System.out.println("Due to over population you now have half of the monkeys in a barrel\n" +
        "there are now only " + barrel + "monekys left in the barrel");


    }
}
