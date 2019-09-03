import javax.swing.*;

public class SalaryDialog {

    public static void main (String[] args) {
        String wageString;
        String dependantString;
        int dependant;
        double wage;
        double weeklyPay;
        final double HOURS_IN_WEEK = 37.5;
        boolean isYes;
        int selection;

        wageString = JOptionPane.showInputDialog(null, "enter employees hourly wage",
                "Salary Dialog 1", JOptionPane.INFORMATION_MESSAGE);
        weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;

        dependantString = JOptionPane.showInputDialog(null, "how many dependans?",
                "Salary Dialog 2", JOptionPane.QUESTION_MESSAGE);
        dependant = Integer.parseInt(dependantString);

        JOptionPane.showMessageDialog(null, "Weekly salary is $" +
        weeklyPay + "\nDeductions will be made for " + dependant + "dependants");
        selection = JOptionPane.showConfirmDialog(null, "Is your salary correct?");
        isYes = (selection == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null, "You responded " + isYes);

    }
}
