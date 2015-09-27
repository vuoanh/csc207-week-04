import java.awt.Color;

public class Ant extends Critter {
	private boolean stepsNorth;
	private int steps = 0;

	public Ant(boolean stepsNorth){	
		this.stepsNorth = stepsNorth;
	}
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



