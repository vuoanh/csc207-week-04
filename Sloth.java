import java.awt.Color;

public class Sloth extends Lion implements CritterInfo {

	/** @returns the color for this sloth: pink*/
	public Color getColor() {
		return Color.PINK;
	}

	/** @returns the speed of this lion: slow */
	public Speed getSpeed() {
		return Speed.MEDIUM;
	}

	/** @returns the String representation of this lion (Z for sleeping 
	 * lion and L for not sleeping lion*/
	public String toString() {
		if (getMove() == Direction.CENTER){
			return "😴";
		}
		else return "L";
	}
	/** @return the current x-coordinate of the critter in the world. */
	public int getX() {};

	/** @return the current y-coordinate of the critter in the world. */
	public int getY() {};

	/** @return the width of the world. */
	public int getWidth() {}

	/** @return the height of the world. */
	public int getHeight() {}

	/** @return the number of steps currently taken in the world. */
	public int getNumSteps() {
		return steps;
	}
	/**
	 * @returns the String representation of the space adjacent to the
	 * critter in the given direction, i.e., what your critter "sees".
	 * @param direction the direction in which to look
	 */
	public String getNeighbor(Critter.Direction direction);

	/**
	 * @return the hunger level of the critter where 0 means that the
	 * critter is not hungry at all.
	 */
	public int getHungerLevel();

	/**
	 * @return true if the critter has mated.
	 * Remember that a critter can only mate once in its lifetime.
	 */
	public boolean hasMated();

	/** Tells the critter to kill itself.  Why would do this?  You monster. */
	public void suicide();
}
}


😈😎😱😴