import java.awt.Color;

/**
 * An ant either moves north and east or south and west depending on boolean stepsNorth
 */
public class Ant extends Critter {
	private boolean stepsNorth;
	private int steps = 0;

	public Ant(boolean stepsNorth){	
		this.stepsNorth = stepsNorth;
	}
	
	/** @return the next move of this ant - An ant alternates walking north and east 
	 * if StepsNorth equal to true, otherwise an ant alternates walking south and west 
	 */
	public Direction getMove() {
		steps++;
		if (getStepsNorth() == true) {
			if (steps % 2 == 0) {
				return Direction.EAST; 
			}
			else {return Direction.NORTH;}
		} else {
			if (steps % 2 == 0) {
				return Direction.SOUTH; 
			}
			else {return Direction.WEST;} 
		}
	}	
	
	/** @return the food type for this Ant: grass */
	public FoodType getFoodType() {
		return FoodType.GRASS;
	}
	
	/** @returns the color for this Ant: black */
	public Color getColor() {
		return Color.BLACK;
	}
	
	/** @returns the speed of this Ant: fast*/
	public Speed getSpeed() {
		return Speed.FAST;
	}	
	
	/** @returns the String representation of this Ant */
	public String toString() {
		return "%";
	}

	/** @returns either true of false for stepsNorth */
	public boolean getStepsNorth(){
		return stepsNorth;
	}
}



