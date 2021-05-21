package raphael.test.arrays.polymorphism;

public class TestSportyThings {
	public static void main(String[] args) {
		Sporty[] sportyThings = new Sporty[3];
		
		sportyThings[0] = new Ferrari(); // OK, ferrari implements Sporty
		
		sportyThings[1] = new RacingFlats(); // OK, RacingFlats implements Sporty
		
		sportyThings[2] = new GolfClub(); // Not OK; GolfClub doesn't implement Sporty
		
	}

}
