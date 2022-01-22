package game;

public abstract class Player {
	public String userId;
	
	public void Player(String s) {
		userId = s;
	}
	public String getUserId() {
		return userId;
	}
	public int takePins(Board b, int x) {
		b.takePins(x);
		return b.noPins;
	}
}
