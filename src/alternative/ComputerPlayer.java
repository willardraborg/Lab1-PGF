package game;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthTextAreaUI;

public class ComputerPlayer extends Player {
	public void ComputerPlayer(String s) {
		  
	}
	public int takePins(Board b, int y) {
		while (true) {
			Random rand = new Random();
			y = rand.nextInt(2) + 1;
			//System.out.println("computer chose ComputerPlayer: " + y);

			if (b.noPins - y <= 0) {
				JOptionPane.showMessageDialog(null, "human won!");
				Runtime.getRuntime().halt(0);
				//System.exit(0);
			}
			b.takePins(y);
			break;
	    }
		//System.out.println(b.noPins);
		return b.noPins;
	}
	// Generate number between 1 and 2 and then pick that amount.
//	public void take(Board b) {
//		Random rand = new Random();
//		takePins(b, rand.nextInt(2));
//	}
	
	
}
