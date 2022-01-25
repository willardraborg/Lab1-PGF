package game;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class TakePinsGame {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "human will now play a game of pins against computer.");
		Board board = new Board();
		board.setUp(10);
		HumanPlayer human = new HumanPlayer();
		human.Player("human");
		ComputerPlayer computer = new ComputerPlayer();
		computer.Player("computer");
		
		while (true) {
			UserInterface.printMessage("How many pins do you want to take? (1 or 2) or face the endless wrath of MökMonstret!");
			int x = UserInterface.askForInt("Gimme pins");
			int y = 0;
			//System.out.println("human chose TakePinsGame:" + x);
			human.takePins(board, x);
		    computer.takePins(board, y);
		}
	}
}
