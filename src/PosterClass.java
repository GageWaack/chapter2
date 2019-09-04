import javax.swing.*;

public class PosterClass {
    public static void main (String[] args) {

        int postersBought;
        int boxesFilled;
        int postersLeftOver;
        int poster;
        String postersBoughtString;
        final int BOX_LIMIT = 11;

        postersBoughtString = JOptionPane.showInputDialog(null, "how many posters do you want",
                "Order Dialog", JOptionPane.INFORMATION_MESSAGE);
        postersBought = Integer.parseInt(postersBoughtString);

        boxesFilled = postersBought/BOX_LIMIT;
        postersLeftOver = postersBought % BOX_LIMIT;

        JOptionPane.showMessageDialog(null, "the number of boxes filled were" +
        boxesFilled + " with " + postersLeftOver + " posters left over");


    }
}
