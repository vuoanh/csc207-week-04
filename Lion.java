import java.awt.Color;
import java.util.*;

/**
 * A Lion is a Critter that moves and sleeps.
 */
public class Lion extends Cat {
	private int steps = 0;
	private Random rand = new Random();
	private int movePredictor = rand.nextInt(4);
	private int sleep = 0;

	public Lion() {}

	/** @return the next move of this lion -  */
	public Direction getMove() { 
		if (steps % 8 == 0){
			sleep = rand.nextInt(5);
		}
		if  (sleep > 0) {
			sleep--;
			steps--;
			return Direction.CENTER;	
		}

		if ((steps % 5) == 1) {		
			movePredictor = rand.nextInt(4);
		}
		return Directions[movePredictor];
	}	

	/** @return the food type for this lion: meat */
	public FoodType getFoodType() {
		return FoodType.MEAT;
	}

	/** @returns the color for this lion: orange */
	public Color getColor() {
		return Color.ORANGE;
	}

	/** @returns the speed of this lion: slow */
	public Speed getSpeed() {
		return Speed.SLOW;
	}

	/** @returns the String representation of this lion 
	Z for sleeping lion and L for not sleeping lion
	 */

	public String toString() {
		if (getMove() == Direction.CENTER){
			return "Z";
		}
		else return "L";
	}
}




