import java.awt.Color;

/**
 * An ant alternates walking north and east if StepsNorth equal to true, otherwise an
 * ant alternates walking south and west,
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
	public FoodType getFoodType() {
		return FoodType.GRASS;
	}
	public Color getColor() {
		return Color.BLACK;
	}
	public Speed getSpeed() {
		return Speed.FAST;
	}
	public String toString() {
		return "%";
	}

	public boolean getStepsNorth(){
		return stepsNorth;
	}
}



