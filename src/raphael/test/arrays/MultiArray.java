package raphael.test.arrays;

public class MultiArray {
	public static void main(String[] args) {
		
		// Legal, mas se declarar apenas na segunda posição, acusará erros
		int[][] a1 = new int[2][];
		
		for (int[] x : a1) {
			System.out.print(x + " ");
		}
		
		//====================================
		
		int[][] a2 = {{1, 2, 4}, {3,7}, {1,3,5}};
		for (int[] list : a2) {
			for (int list2 : list) {
				System.out.print(list2 + " ");
			}
		}
		
		//====================================
		
		int[][] books = new int[3][];
		int[] numbers = new int[6];
		int aNumber = 7;
		books[0] = aNumber; // NO, expecting an int array not an int
		books[0] = numbers; //OK, numbers is an int array
	}

}
