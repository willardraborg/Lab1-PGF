package game;
import javax.swing.JOptionPane;

public class UserInterface {
    /** Visar en dialogruta med texten msg. */
    public static void printMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    } 

    /**
    * Visar en dialogruta med texten msg och och läser in ett positivt heltal. Error fixing.
    */
    public static int askForInt(String msg) {
        String input = JOptionPane.showInputDialog(null, msg);
        int x = 0;
        if (input == null){
            input = Integer.parseInt(input);
            input = -2;
            return input;
        }
        // if (!(input instanceof integer)) {
        //     input = Integer.parseInt(input);
        //     input = -1;
        //     return input; 
        // }
        while (true) {
            if (input == -2) {
                //Runtime.getRuntime().halt(0);
                System.exit(0);
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