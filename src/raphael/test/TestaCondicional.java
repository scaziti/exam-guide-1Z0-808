package raphael.test;

public class TestaCondicional {
	
	public static void main(String[] args) {
		
		// n�o vai compilar, pois fechei o if com semicolon...
		if (1 == 2);
			System.out.println("n�o");
		else
			System.out.println("sim");
	}

}
