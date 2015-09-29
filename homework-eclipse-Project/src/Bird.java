import java.awt.Color;

/**
 * A bird is a Critter that moves in a clockwise square of length 3
 */
public class Bird extends Critter {
	private int steps = -1;

	/** Constructor*/
	public Bird () { }

	/** @return the food type for this Bird: grass */
	@Override
	public FoodType getFoodType() {
		return FoodType.GRASS;
	}

	/** @returns the color for this bird: red */
	@Override
	public Color getColor() {
		return Color.RED;
	}

	/** @returns the speed of this bird: fast */
	@Override
	public Speed getSpeed() {
		return Speed.FAST;
	}

	/** @return the next move of this Bird: a bird moves 3 spaces north,
	 * 3 spaces east, 3 spaces south, and 3 spaces west, and then repeats*/
	@Override
	public Direction getMove() {
		steps++;
		int res = steps % 12;
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
	@Override
	public String toString() {
		int res = steps % 12;
		if (res < 3){
			return "∧";
		}
		else if (res < 6){
			return ">";
		}
		else if (res < 9){
			return "∨";
		}
		else {
			return "<";
		}
	}
}

