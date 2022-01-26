package game;
import javax.swing.JOptionPane;

public class Board {
	public int noPins;
	
	
	public void setUp(int x){
		noPins = x;
	}
	
	public void takePins(int x){
		noPins = noPins - x;
		JOptionPane.showMessageDialog(null, noPins);
	}
	
	public int getNoPins() {
		return noPins;
	}
	
}
