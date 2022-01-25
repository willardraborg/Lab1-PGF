package game;
import javax.swing.JOptionPane;

public class HumanPlayer extends Player{
  public void HumanPlayer(String s) {
	  
  }
  public int takePins(Board b, int t) {
    if (b.noPins - t <= 0) {
      JOptionPane.showMessageDialog(null, "computer won!");
      Runtime.getRuntime().halt(0);
      //System.exit(0);
    }
    //System.out.println("Human chose HumanPlayer" + x);
    b.takePins(t);
    return b.noPins;
  }

}
