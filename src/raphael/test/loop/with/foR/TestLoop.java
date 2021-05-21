package raphael.test.loop.with.foR;

public class TestLoop {
	
	public static void main(String[] args) {
		
		out: for (int i = 0; i < 10; i++) {
			System.out.println("out" + i);
			in: for(int j = 0; j < 10; j++) {
				if (j == 5) {
					break in;
				}
				
				if (i == 5) {
					break out;
				}
				System.out.println("in " + j);
			}
		}
	}

}
