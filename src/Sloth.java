import java.awt.Color;
/**
 * A Sloth is a small animal in the Lion family that are scared of Lion, hence runs away 
 * from a Lion (a not sleeping lion).
 */
public class Sloth extends Lion {

	/** Constructor*/
	public Sloth() {}

	/** @returns the color for this sloth: pink*/
	@Override
	public Color getColor() {
		return Color.PINK;
	}

	/** @returns the String representation of this sloth (😴 for sleeping 
	 * sloth; 😱 when it's not sleeping; 😎 when it sees a Lion at the North direction;
	 * otherwise 😈*/
	@Override
	public String toString() {
		if (info.getNeighbor(Direction.NORTH).equals("L")){
			return "😎";
		}
		if (getMove() == Direction.CENTER){
			return "😴";
		}
		else 
			return "😱";
	}
}
