package game;

public abstract class Player {
	public String userId;
	
	public void Player(String s) {
		userId = s;
	}
	public String getUserId() {
		return userId;
	}
	public abstract void takePins(Board b, int x);

	// public int takePins(Board b, int x) {
	// 	b.takePins(x);
	// 	return b.noPins;
	// }
}
