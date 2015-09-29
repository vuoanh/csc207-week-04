import static org.junit.Assert.*;

import org.junit.Test;

public class CritterMovementTest {

	@Test
	public void testAnt(){
		Critter ant1 = new Ant(true);
		Critter ant2 = new Ant(false);
		for (int i = 0; i < 3; i++) {
			assertEquals("ant1.getMove() == Direction.NORTH", 
					ant1.getMove(),
					Critter.Direction.NORTH);
			assertEquals("ant1.getMove() == Direction.EAST", 
					ant1.getMove(),
					Critter.Direction.EAST);
			assertEquals("ant2.getMove() == Direction.SOUTH", 
					ant2.getMove(),
					Critter.Direction.SOUTH);
			assertEquals("ant1.getMove() == Direction.WEST", 
					ant2.getMove(),
					Critter.Direction.WEST);			
		}		
	}

	@Test
	public void testBird(){
		String[] birdSymbol = {"∧",">","∨","<"};
		Critter bird = new Bird();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++){
				assertEquals("bird.getMove() == Directions[i]", 
						bird.getMove(),
						Critter.Directions[i]);		
				assertEquals("bird.toString() == birdSymbol[i]", 
						bird.toString(),
						birdSymbol[i]);
			}
		}
	}

	@Test
	public void testLemming(){
		Critter lemming = new Lemming();
		for (int i = 0; i < 10; i++) {
			assertEquals("Lemming.getMove() == Direction.EAST", 
					lemming.getMove(),
					Critter.Direction.EAST);
		}
	}

	@Test
	public void testLion(){
		Lion lion = new Lion();
		for (int i = 0; i < 7; i++) {
			assertEquals("Lion.getMove() == Directions[lion.getMovePredictor()]", 
					lion.getMove(),
					Critter.Directions[lion.getMovePredictor()]);
			assertEquals("Lion.toString == L", 
					"L",
					lion.toString());
		}
		assertEquals("Lion.getMove() == Directions.CENTER", 
				lion.getMove(),
				Critter.Direction.CENTER);
		assertEquals("Lion.toString == Z", 
				"Z",
				lion.toString());	
	}

	@Test
	public void testCat(){
		Cat cat = new Cat();
		for (int i = 0; i < 3; i++) {
			assertEquals("cat.getMove() == Directions[cat.getMovePredictor()]", 
					cat.getMove(),
					Critter.Directions[cat.getMovePredictor()]);
		}
	}

	/**
	 * We did not test Monkey and Sloth because we used info.sucide() and info.getHungerLevel() because 
	 * PM told us that we do not have to because of some strategy thingy.
	 */

}
