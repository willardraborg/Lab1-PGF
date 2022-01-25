package game;
import javax.swing.JOptionPane;

public class UserInterface {
    public static void printMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    } 
    public static int askForInt(String msg) {
        String input = JOptionPane.showInputDialog(null, msg);
        int x = 0;
        int ctrl = 0;
        while(true) {
            if (input == null){
                return -2;
            }
            try {
            x = Integer.parseInt(input);
            }
            catch(Exception e) {
                 ctrl = 1;
            }
            if (ctrl == 1) {
                JOptionPane.showMessageDialog(null, "invalid data type.");
                input = JOptionPane.showInputDialog(null, msg);
                return -1;
            }
            if (1 > x || x > 2) {
                JOptionPane.showMessageDialog(null, "Chosen amount of pins is incorrect.");
            }
            else {
                break;
            }


        }
         return x;
    }
}
// package game;
// import javax.swing.JOptionPane;

// public class UserInterface {
//     /** Visar en dialogruta med texten msg. */
//     public static void printMessage(String msg) {
//         JOptionPane.showMessageDialog(null, msg);
//     } 

//     /**
//     * Visar en dialogruta med texten msg och och läser in ett positivt heltal. Error fixing.
//     */
//     public static int askForInt(String msg) {
//         String input = JOptionPane.showInputDialog(null, msg);
//         int x = 0;
//         while (true) {
//             if (input == null) {
//                 System.exit(0);
//                 return -2;         }
//             try {
//                 // if (!(input instanceof Integer)) {
//                 // return -1;
//                 // }
//                 x = Integer.parseInt(input);
//                 if (1 > x || x > 2) {
//                     JOptionPane.showMessageDialog(null, "Chosen amount of pins is incorrect. MökMonstret is coming for you...");
//                 } else {
//                     break; 
//                 }
//             } catch (Exception e) {
//                 JOptionPane.showMessageDialog(null, "Invalid data type. Try again. \n");
//             } 
//             JOptionPane.showMessageDialog(null, "How many pins do you want to take? (1 or 2) or face the endless wrath of MökMonstret! ");
//             input = JOptionPane.showInputDialog(null, "Gimme pins");
//         }
//         return x;
//     }
// }