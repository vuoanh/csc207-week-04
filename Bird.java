import java.awt.Color;

/**
 * A bird is a Critter that moves in a clockwise square of length 3
 */
public class Bird extends Critter {

	public Bird () { }

	/** @return the food type for this Bird: grass */
	public FoodType getFoodType() {
		return FoodType.GRASS;
	}

	/** @returns the color for this bird: red */
	public Color getColor() {
		return Color.RED;
	}

	/** @returns the speed of this bird: fast */
	public Speed getSpeed() {
		return Speed.FAST;
	}

	/** @return the next move of this Lemming: a bird moves 3 spaces north,
	 * 3 spaces east, 3 spaces south, and 3 spaces west, and then repeats*/
	public Direction getMove() {
		int res = info.getNumSteps() % 12;;
		if (res < 3)
			return Direction.NORTH;
		else if (res < 6)
			return Direction.EAST;
		else if (res < 9)
			return Direction.SOUTH;
		else
			return Direction.WEST;
	}

	/** @returns the String representation of this bird 
	 * Character: Depends on the last direction the bird moved :
	 * 	North: “∧”
	 * 	East: “>”
	 * 	South: “∨”
	 * 	West: “<”
	 */

	public String toString() {
		if (getMove() == null) { 
			throw new IllegalArgumentException();
		} 
		else if (getMove() == Direction.NORTH) {
			return "∧";
		}
		else if (getMove() == Direction.EAST){
			return ">";
		}
		else if (getMove() == Direction.SOUTH){
			return "∨";
		}
		else {
			return "<";
		}
	}
}

