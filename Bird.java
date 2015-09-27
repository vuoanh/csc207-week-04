import java.awt.Color;

public class Bird extends Critter {
	private int steps = 0;
	
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

	public Direction getMove() {
		steps++;
		int res = steps % 12;;
		if (res < 3)
			return Direction.NORTH;
		else if (res < 6)
			return Direction.EAST;
		else if (res < 9)
			return Direction.SOUTH;
		else
			return Direction.WEST;
	}

	/** @returns the String representation of this bird */
	public String toString() {
		if (getMove() == null) { 
			throw new IllegalArgumentException();
		} 
		else if (getMove() == Direction.NORTH) {
			return "^";
		}
		else if (getMove() == Direction.EAST){
			return ">";
		}
		else if (getMove() == Direction.SOUTH){
			return "v";
		}
		else {
			return "<";
		}
	}
}

