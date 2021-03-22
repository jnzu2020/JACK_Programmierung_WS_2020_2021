//Aufgabe 1
public class BoardGame extends Game implements GroupActivities {

	public BoardGame(String name) {
		super(name);
		setPlayer(2);
	}
	
	protected void setPlayer(int player) {
		if (player <= GroupActivities.maxNumberOfPlayers && player >= GroupActivities.minNumberOfPlayers) {
			super.setPlayer(player);
		}
	}
	
	// Zu bearbeitender Bereich :
	
    // Aufgabe 3
	public String toString() {
		return super.toString() + " (Brettspiel)";
	}

	//Aufgabe 2
	@Override
	public double calculatePlayingTime() {
		double playingTime = 0;
		if (getPlayer() > 10) {
			playingTime = 1.5 * getPlayer();
		} else {
			playingTime = 14 - 1.5 * getPlayer();
		}
		if (playingTime > maxPlayingTime) {
			return maxPlayingTime;
		} else if (playingTime < minPlayingTime) {
			return minPlayingTime;
		} else {
			return playingTime;
		}
	}
}
