package raphael.test.arrays;

public class ArraysOfPrimitives {
	public static void main(String[] args) {
		
		int[] a = new int[3];
		byte b = 4;
		char c = 'c';
		short s = 7;
		
		a[0] = b; //ok, byte is smaller than int
		a[1] = c; //ok, char is smaller than int
		a[2] = s; //ok, short is smaller than int
		
		for (int list : a) {
			System.out.print(list + " ");
		}
		
		System.out.println("\n");
		//===================================
		
		double[] a2 = new double[4];
		
		char chars = 'b';
		int i = 5;
		float f = 2.f;
		long l = 3L;
		
		a2[0] = 5;
		a2[1] = f;
		a2[2] = l;
		a2[3] = chars;
		
		for (double list : a2) {
			System.out.print(list + " ");
		}
		
	}

}
