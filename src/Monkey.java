import java.util.*;
import java.awt.Color;

/**
 * A monkey is a Critter that moves in random direction and change its direction after each 5 steps
 * it also kills itself iff it walks for more than 9 steps without mating 
 */
public class Monkey extends Critter {

	private Random rand = new Random();
	private int speedPredictor = rand.nextInt(3);
	private int steps = 0;
	
	/** Constructor*/
	public Monkey(){}

	/** @return the next move of this Monkey: always move North. It changes speed every 5 steps; 
	 * changing speed also induces change in colors.
	 */
	@Override
	public Direction getMove() {
		steps++;
		if ((steps % 5) == 0) {
			speedPredictor = rand.nextInt(3);
			dieOfLonliness();
		}
		return Directions[0];
	}	
	
	/**tells the monkey to die iff it walks for more than 9 steps without mating 
	 */
	public void dieOfLonliness() {
		if (steps > 9 && info.hasMated() == false) {
			info.suicide();
		}
	}

	/** @return the food type for this Monkey: grass if it is not hungry and moving slowly
	 * otherwise it will eat meat*/
	@Override
	public FoodType getFoodType() {
		if (getSpeed() == Speed.SLOW || (info.getHungerLevel()) == 0)
			return FoodType.GRASS;
		else
			return FoodType.MEAT;
	}
	
	/** @returns the color for this Monkey - lighter with increasing speed
	 * black when speed is slow; gray when speed is medium; and cyan when speed is fast */
	@Override
	public Color getColor() {
		if (getSpeed() == Speed.SLOW)
			return Color.BLACK;
		else if (getSpeed() == Speed.MEDIUM)
			return Color.GRAY;
		else
			return Color.CYAN;
	}

	/** @returns the speed of this Monkey: changes speed randomly */
	@Override
	public Speed getSpeed() {
		if (speedPredictor == 0)
			return Speed.SLOW;
		else if (speedPredictor == 1)
			return Speed.MEDIUM;
		else 
			return Speed.FAST;
	}

	/** @returns the String representation of this Monkey - 😭  when the monkey walked 8 steps 
	 * and has not mated - 
	 * otherwise 🐵 
	 */
	@Override
	public String toString() {
		if (steps > 8 && info.hasMated() == false) {
			return "😭";
		}
		else  { 
			return "🐵 ";
		}
	}

}


