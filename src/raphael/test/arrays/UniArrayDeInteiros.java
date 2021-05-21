package raphael.test.arrays;

public class UniArrayDeInteiros {
	public static void main(String[] args) {
		
		int[] a1 = new int[3];
		a1[0] = 1;
		a1[1] = 2;
		a1[2] = 3;
		
		for (int x : a1) {
			System.out.print(x + " ");
		}
		
		//=============================================
		
		int num = 10;
		int[] a2 = new int[num];
		
		try{
			System.out.println("\n" + a2[11]); //runtime exception (ArrayIndexOutOfBoundsException)
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("\nIndex acessado não existe");
		}
		
		//=============================================
		
		int[] a3 = {1,2,3,4,5};
		int i; // legal
		for (i = 0; i < a3.length; i++) {
			System.out.print(a3[i] + " ");
		}
		
	}

}
