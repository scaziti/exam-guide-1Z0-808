package raphael.test.loop.with.foR;

public class EnhancedFor {

	public static void main(String[] args) {
		
		int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		for (int[] x  : array) {
			System.out.print(x[x.length - 1] + " ");
			for (int y : x) {
				
				System.out.print(y + " ");
			}
		}
	}
}
