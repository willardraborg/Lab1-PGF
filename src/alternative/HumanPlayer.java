package game;
import javax.swing.JOptionPane;

public class HumanPlayer extends Player{
  public void HumanPlayer(String s) {
	  
  }
  public void takePins(Board b, int x) {
    if (b.noPins - x <= 0) {
      JOptionPane.showMessageDialog(null, "computer won!");
      Runtime.getRuntime().halt(0);
      //System.exit(0);
    }
    //System.out.println("Human chose HumanPlayer" + x);
    b.takePins(x);
    //return b.noPins;
  }

}
