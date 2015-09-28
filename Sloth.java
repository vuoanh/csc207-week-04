import java.awt.Color;

public class Sloth extends Lion {

	public Sloth() {}
	
	public Direction getMove() {
		if (info.getNeighbor(NORTH).equals("L"))
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

	/** @returns the String representation of this lion (Z for sleeping 
	 * lion and L for not sleeping lion*/
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