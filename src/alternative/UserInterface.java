package game;
import javax.swing.JOptionPane;

public class UserInterface {
    /** Visar en dialogruta med texten msg. */
    public static void printMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    } 

    /**
    * Visar en dialogruta med texten msg och och läser in ett positivt heltal. Om
    * användaren skriver något som inte kan tolkas som ett positivt heltal ska -1
    * returneras. Om användaren klickar på "Avbryt" ska -2 returneras.
    * Metoden ShowInpoutDialog returnerar null i så fall
    */
    public static int askForInt(String msg) {
        String input = JOptionPane.showInputDialog(null, msg);
        int x = 0;

        while (true) {
            if (input == null){
                Runtime.getRuntime().halt(0);
                //break outerloop;
            }
            try {
                x = Integer.parseInt(input);
                if (1 > x || x > 2) {
                    JOptionPane.showMessageDialog(null, "Chosen amount of pins is incorrect. MökMonstret is coming for you...");
                } else {
                    break; 
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid data type. Try again. \n");
            } 
            JOptionPane.showMessageDialog(null, "How many pins do you want to take? (1 or 2) or face the endless wrath of MökMonstret! ");
            input = JOptionPane.showInputDialog(null, "Gimme pins");
        }
        return x;
    }
}