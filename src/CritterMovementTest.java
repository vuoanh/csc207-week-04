import static org.junit.Assert.*;

import org.junit.Test;

public class CritterMovementTest {

	@Test
	public void testAnt(){
		Critter ant = new Ant(true);
		assertEquals("ant.getMove() == Direction.NORTH", ant.getMove(), Critter.Direction.NORTH);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
