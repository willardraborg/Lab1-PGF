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
		
		while (true) {
			int y;

			System.out.print("How many pins do you want to take? (1 or 2) or face the endless wrath of MökMonstret: \n> ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			int x = 0;

			/** 
			* Försöker omvandla sträng till int, och om detta inte går återupprepas 
			* ett felmeddelande tills en sträng som kan omvandlas till en int ges.
			* Kollar även så att korrekt antal pins (1 eller 2) väljs
			*/
			while (true) {
				try {
					x = Integer.parseInt(input);
					if (1 > x || x > 2) {
						System.out.println("Chosen amount of pins is incorrect. MökMonstret is coming for you..."); 
					} else {
						break; 
					}
				} catch (Exception e) {
					System.out.print("Invalid data type. Try again. \n");
				}
				System.out.print("How many pins do you want to take? (1 or 2) or face the endless wrath of MökMonstret: \n> ");
				input = scanner.nextLine();
			}

			/** Avgör om human tar sista pinnen och förlorar (computer vinner)*/
			if (board.noPins - x <= 0) {
				System.out.println("Råbot won!");
				human.takePins(board, x);
				break;
			} else {
				human.takePins(board, x);
		    }

			/** Avgör om computer tar sista pinnen och förlorar (human vinner)*/
			y = rand.nextInt(2) + 1;
			if (board.noPins - y <= 0) {
				System.out.println("Råbert won!");
				computer.takePins(board, y);
				break;
			} else {
				computer.takePins(board, y);
		    }
		}
	}
}
