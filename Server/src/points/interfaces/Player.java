package points.interfaces;
import java.awt.Color;
import java.io.Serializable;

public class Player implements Serializable {

	
	private static int playerCount = 0;
	private final int id;
	private final String name;
	private final int figure;
	private final Color color;
	private int score = 0;

	public Player(String name, int figure, Color color) {
		playerCount++;
		id = playerCount;
		this.name = name;
		this.figure = figure;
		this.color = color;
	}
	public int getScore() {
		return score;
	}
	public void addScore(int points) {
		score+=points;
	}
	public void clearScore() {
		score = 0;
	}
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getFigure() {
		return figure;
	}
	public Color getColor() {
		return color;
	}

}
