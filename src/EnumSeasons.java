/*
 * @author: Andres Montenegro
 * Purpose: Display a message for the month the user chooses.
 * contact: am23828@email.vccs.edu
 */
import javax.swing.JOptionPane;

public class EnumSeasons {
    enum AccountType {January, February, March, April, May, June, July, August, September, October, November, December}

    public static void main (String args[]) {
        AccountType[] choices = {AccountType.January, AccountType.February, AccountType.March, AccountType.April,
                AccountType.May, AccountType.June, AccountType.July, AccountType.August, AccountType.September,
                AccountType.October, AccountType.November, AccountType.December};
        AccountType input = (AccountType) JOptionPane.showInputDialog(null,
                "Select your account type.", "AccountType", JOptionPane.INFORMATION_MESSAGE,
                null, choices, choices[3]);

        while (input != null) {
            switch (input) {
                case December:
                case January:
                case February:
                    JOptionPane.showMessageDialog(null, "Do you wanna build a snow man?");
                    System.exit(0);
                    break;

                case March:
                case April:
                case May:
                    JOptionPane.showMessageDialog(null, "Happy Spring days!");
                    System.exit(0);
                    break;

                case June:
                case July:
                case August:
                    JOptionPane.showMessageDialog(null, "It's a summer time.");
                    System.exit(0);
                    break;

                case September:
                case October:
                case November:
                    JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
                    System.exit(0);
                    break;
            }
            input = (AccountType) JOptionPane.showInputDialog(null,
                    "Select your account type.", "Account Type",
                    JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);
        }
    }
}
