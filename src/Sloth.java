import java.awt.Color;
/**
 * A Sloth is a small animal in the Lion family that are scared of Lion, hence runs away 
 * from a Lion (a not sleeping lion).
 */
public class Sloth extends Lion {
	
	public Sloth() {}
	
	/** @return the next move of this sloth - if it sees a lion, it would run in the 
	 * opposite direction, otherwise it sleeps (it's a sloth) */
	public Direction getMove() {
		if (info.getNeighbor(Direction.NORTH).equals("L"))
			return Direction.SOUTH;
		else if (info.getNeighbor(Direction.EAST).equals("L"))
			return Direction.WEST;	
		else if (info.getNeighbor(Direction.SOUTH).equals("L"))
			return Direction.NORTH;		
		else if (info.getNeighbor(Direction.WEST).equals("L"))
			return Direction.EAST;
		else return Direction.CENTER;
	}

	/** @returns the color for this sloth: pink*/
	public Color getColor() {
			return Color.PINK;
	}

	/** @returns the String representation of this sloth (😴 for sleeping 
	 * sloth; 😱 when it sees a lion; 😎 when it sees a sloth; otherwise 😈*/
	public String toString() {
		if (getMove() == Direction.CENTER){
			return "😴";
		}
		else if (getMove() != Direction.CENTER){
			return "😱";
		}
		else if (info.getNeighbor(Direction.NORTH).equals("Sloth")){
			return "😎";
		}
		else return "😈";
	}
}