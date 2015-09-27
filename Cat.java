import java.awt.Color;
import java.util.*;

/**
 * A cat is a Critter that always marches east.
 */
public class Cat extends Critter {
	private int steps = 0;
	private Random rand = new Random();
	private int movePredictor = rand.nextInt(4);
	
	public Cat() {}

	/** @return the next move of this cat: always east */
	public Direction getMove() {
		steps++;
		if ((steps % 5) == 1) {		
			movePredictor = rand.nextInt(4);
		}
		return Directions[movePredictor];
	}

	/** @return the food type for this cat: meat */
	public FoodType getFoodType() {
		return FoodType.MEAT;
	}

	/** @returns the color for this cat: Magenta */
	public Color getColor() {
		return Color.MAGENTA;
	}

	/** @returns the speed of this cat: medium */
	public Speed getSpeed() {
		return Speed.MEDIUM;
	}

	/** @returns the String representation of this cat */
	public String toString() {
		return "🐱";
	}
}