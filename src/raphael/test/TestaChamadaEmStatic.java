package raphael.test;

public class TestaChamadaEmStatic {

	public static void main(String[] args) {
		int myGold = 7;
		System.out.println(countGold(myGold, 6));
	}


	static int countGold(int x, int y) {
		return x + y;
	}
	
	
}