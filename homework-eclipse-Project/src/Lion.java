import java.awt.Color;
import java.util.*;

/**
 * A Lion is a Cat that moves and sleeps.
 */
public class Lion extends Cat {
	private int steps = 0;
	private Random rand = new Random();
	private int movePredictor = rand.nextInt(4);
	private int sleep = 0;

	/** Constructor*/
	public Lion() {}

	/** @return the next move of this lion - moves randomly in a cardinal direction
	 * for five steps, then chooses a new random cardinal direction, and repeats.
	 * The lion sleeps every 8 moves, sleeps counts for a random number of steps from 
	 * 0 to 5/ */
	@Override
	public Direction getMove() {
		steps++;
		if (steps % 8 == 0){
			sleep = rand.nextInt(5);
			if  (sleep > 0) {
				sleep--;
				steps--;
				return Direction.CENTER;	
			}
		}
		else if ((steps % 5) == 1) {		
			movePredictor = rand.nextInt(4);
		}
		return Directions[movePredictor];
	}	

	/** @returns the color for this lion: orange */
	@Override
	public Color getColor() {
		return Color.ORANGE;
	}

	/** @returns the speed of this lion: slow */
	@Override
	public Speed getSpeed() {
		return Speed.SLOW;
	}

	/** @returns the String representation of this lion 
	Z for sleeping lion and L for not sleeping lion
	 */
	@Override
	public String toString() {
		if (sleep > 0){
			return "Z";
		}
		else return "L";
	}
	
	/** @returns the random MovePredictor of the lion*/
	public int getMovePredictor() {
		return movePredictor;
	}
}




