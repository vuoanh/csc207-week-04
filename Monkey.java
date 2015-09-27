import java.util.*;
import java.awt.Color;

public class Monkey extends Critter implements CritterInfo {

	private int steps = 0;
	private Random rand = new Random();
	private int speedPredictor = rand.nextInt(3);

	public Monkey(){	}


	public Direction getMove() {
		steps++;
		if ((steps % 5) == 0) {
			speedPredictor = rand.nextInt(3);
		}
		return Directions[0];
	}	


	public FoodType getFoodType() {
		if (getSpeed() == Speed.SLOW)
			return FoodType.GRASS;
		else
			return FoodType.MEAT;
	}

	public Color getColor() {
		if (getSpeed() == Speed.SLOW)
			return Color.BLACK;
		else if (getSpeed() == Speed.MEDIUM)
			return Color.GRAY;
		else
			return Color.CYAN;
	}

	public Speed getSpeed() {
		
		if (speedPredictor == 0)
			return Speed.SLOW;
		else if (speedPredictor == 1)
			return Speed.MEDIUM;
		else 
			return Speed.FAST;
	}

	public String toString() {
		return "🐵 ";
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getNumSteps() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String getNeighbor(Direction direction) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int getHungerLevel() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean hasMated() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void suicide() {
		// TODO Auto-generated method stub

	}
}


