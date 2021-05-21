package raphael.test;

public class TestaCondicional {
	
	public static void main(String[] args) {
		
		// não vai compilar, pois fechei o if com semicolon...
		if (1 == 2);
			System.out.println("não");
		else
			System.out.println("sim");
	}

}
