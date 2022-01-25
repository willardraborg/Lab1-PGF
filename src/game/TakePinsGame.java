package game;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class TakePinsGame {
	public static void main(String[] args) {
		//String select_game_type = JOptionPane.showInputDialog(null, "Turtle or HumanPlayer() against computer?");

		JOptionPane.showMessageDialog(null, "Human Råbert will now play a game of pins against the robot Råbot.");
		Board board = new Board();
		board.setUp(10);
		Player human = new HumanPlayer();
		human.Player("(Henom) Råbert");
		ComputerPlayer computer = new ComputerPlayer();
		computer.Player("(Tvättbjörn) Råbot");
		Random rand = new Random();
		
		outerloop:
		while (true) {
			int y;
			JOptionPane.showMessageDialog(null, "How many pins do you want to take? (1 or 2) or face the endless wrath of MökMonstret! ");
			String input = JOptionPane.showInputDialog(null, "Gimme pins");
			int x = 0;

			/** 
			* Försöker omvandla sträng till int, och om detta inte går återupprepas 
			* ett felmeddelande tills en sträng som kan omvandlas till en int ges.
			* Kollar även så att korrekt antal pins (1 eller 2) väljs
			*/
			while (true) {
				if (input == null){
					Runtime.getRuntime().halt(0);
					break outerloop;
				}
				try {
					x = Integer.parseInt(input);
					if (1 > x || x > 2) {
						JOptionPane.showMessageDialog(null, "Chosen amount of pins is incorrect. MökMonstret is coming for you...");
					} 
					
					else {
						break; 
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Invalid data type. Try again. \n");
				} 
				JOptionPane.showMessageDialog(null, "How many pins do you want to take? (1 or 2) or face the endless wrath of MökMonstret! ");
				input = JOptionPane.showInputDialog(null, "");
			}

			/** Avgör om human tar sista pinnen och förlorar (computer vinner)*/
			if (board.noPins - x <= 0) {
				JOptionPane.showMessageDialog(null, "(Tvättbjörn) Råbot won!");
				human.takePins(board, x);
				break;
			} else {
				human.takePins(board, x);
		    }

			/** Avgör om computer tar sista pinnen och förlorar (human vinner)*/
			y = rand.nextInt(2) + 1;
			if (board.noPins - y <= 0) {
				JOptionPane.showMessageDialog(null, "(Henom) Råbert won!");
				computer.takePins(board, y);
				break;
			} else {
				computer.takePins(board, y);
		    }
		}
	}
}
