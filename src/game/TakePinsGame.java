package game;
import java.util.Scanner;
import java.util.Random;

public class TakePinsGame {
	public static void main(String[] args) {
		Board board = new Board();
		board.setUp(10);
		Player human = new HumanPlayer();
		human.Player("Råbert");
		ComputerPlayer computer = new ComputerPlayer();
		computer.Player("Råbot");
		Random rand = new Random();
		
		while (board.noPins > 0) {
			int y;
			//* int x */
			System.out.print("How many pins do you want to take?(1 or 2) or face the endless wrath of MökMonstret: \n> ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			int number = 0;

			while (true) {
				try {
					number = Integer.parseInt(input);
					break; 
				} catch (Exception e) {
					System.out.println("Invalid data type");
				}
				System.out.print("How many pins do you want to take?(1 or 2) or face the endless wrath of MökMonstret: \n> ");
				input = scanner.nextLine();
			}
			
			human.takePins(board, number);
			y = rand.nextInt(2) + 1;
			computer.takePins(board, y);
		}
		System.out.println("Game Over!");
	}
}
