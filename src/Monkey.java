import java.util.*;
import java.awt.Color;

public class Monkey extends Critter {

	private Random rand = new Random();
	private int speedPredictor = rand.nextInt(3);

	public Monkey(){}

	public Direction getMove() {
		if ((info.getNumSteps() % 5) == 0) {
			speedPredictor = rand.nextInt(3);
			if (info.getNumSteps() > 9 && info.hasMated() == false) {
				info.suicide();
			}
		}
		return Directions[0];
	}	

	public FoodType getFoodType() {
		if (getSpeed() == Speed.SLOW || (info.getHungerLevel()) == 0)
			return FoodType.GRASS;
		else
			return FoodType.MEAT;
	}

	public Color getColor() {
		if (getSpeed() == Speed.SLOW)
			return Color.BLACK;
		else if (getSpeed() == Speed.MEDIUM)
			return Color.GRAY;
		else
			return Color.CYAN;
	}

	public Speed getSpeed() {
		if (speedPredictor == 0)
			return Speed.SLOW;
		else if (speedPredictor == 1)
			return Speed.MEDIUM;
		else 
			return Speed.FAST;
	}

	public String toString() {
		if (info.getNumSteps() > 8 && info.hasMated() == false) {
			return "😭";
		}
		else  { 
			return "🐵 ";
		}
	}

}


