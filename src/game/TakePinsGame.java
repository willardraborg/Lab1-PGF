package game;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class TakePinsGame {
	public static Scanner scanner = new Scanner(System.in);
	
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
			Integer x;
			System.out.println("How many pins do you want to take?(1 or 2) or face the endless wrath of MökMonstret: \n > ");
			//String string = scanner.nextLine();
			x = scanner.nextInt();
			if ((x.getClass().getName()) != ("java.lang.Integer")) {
				
			}
			
			human.takePins(board, x);
			y = rand.nextInt(2) + 1;
			computer.takePins(board, y);
		}
		System.out.println("Game Over!");
	}
//	public static int getUserInput() {
//		int choice = 0; 
//		
//		try {
//			System.out.println("How many pins do you want to take?(1 or 2) or face the endless wrath of MökMonstret: \n > ");
//			choice = scanner.nextInt();
//		}
//		catch (InputMismatchException e) {
//			System.out.println("Invalid input, please enter an integer: ");
//		}
//		getUserInput();
//		return choice; 
//	}
	
}
