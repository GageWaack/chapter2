import java.util.Scanner;
public class MadLibs {

    public static void main (String[] args) {
        String color;
        String WordEst;
        String bodyPart;


        int a = 1;
        int b = 1;
        int c = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a color >>>");
        color = input.nextLine();
        System.out.print("Enter a word ending in est");
        WordEst = input.nextLine();
        System.out.print("enter a plural body part");
        bodyPart = input.nextLine();


        c = a%b;

        System.out.println("The " + color + " Dragon is the " + WordEst + " Dragon of all. ");
        System.out.println("The "+WordEst+ "Dragon also had a "+ bodyPart);
    }
}
