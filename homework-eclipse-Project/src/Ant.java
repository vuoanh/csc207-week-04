import java.awt.Color;

/**
 * An ant is a critter that either moves north and east or south and west depending 
 * on boolean stepsNorth
 */
public class Ant extends Critter {
	private boolean stepsNorth;
	private int steps = 0;

	/** Constructor*/
	public Ant(boolean stepsNorth){	
		this.stepsNorth = stepsNorth;
	}

	/** @return the next move of this ant - An ant alternates walking north and east 
	 * if StepsNorth equal to true, otherwise an ant alternates walking south and west 
	 */
	@Override
	public Direction getMove() {
		steps++;
		if (getStepsNorth() == true) {
			if (steps % 2 == 1) {
				return Direction.NORTH; 
			}
			else {return Direction.EAST;}
		} else {
			if (steps % 2 == 1) {
				return Direction.SOUTH; 
			}
			else {return Direction.WEST;} 
		}
	}	

	/** @return the food type for this Ant: grass */
	@Override
	public FoodType getFoodType() {
		return FoodType.GRASS;
	}

	/** @returns the color for this Ant: black */
	@Override
	public Color getColor() {
		return Color.BLACK;
	}

	/** @returns the speed of this Ant: fast*/
	@Override
	public Speed getSpeed() {
		return Speed.FAST;
	}	

	/** @returns the String representation of this Ant */
	@Override
	public String toString() {
		return "%";
	}

	/** @returns either true of false for stepsNorth */
	public boolean getStepsNorth(){
		return stepsNorth;
	}
}



