package raphael.test.exception.exercise;

public class Propagate {

	public static void main(String[] args) {
		
		Propagate p = new Propagate();
		String x = "";
		reverse(x);
	}
	
	public static String reverse(String s) {
		if (s.length() == 0) {
			throw new IllegalArgumentException("Falhou");
		}
		return null;
	}
}
