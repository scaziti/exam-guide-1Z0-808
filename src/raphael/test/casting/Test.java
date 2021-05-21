package raphael.test.casting;

public class Test {
	
	public static void main(String[] args) {
		
		// using underscore
		int x = 1_000_000_000;
		System.out.println(x);
		
		// hexadecimal using 0X or 0x
		int y = 0xabc;
		System.out.println(y);
		
		// Binary using 0b or 0B
		int z = 0b0101;
		System.out.println(z);
		
		// Octal using 0
		int q = 03716;
		System.out.println(q);
		
		// explicit conversion
		
		//double to int
		int it = (int) 2345.60;
		System.out.println(it);
		
		// double to long
		long lo = (long) 1D;
		System.out.println(lo);
		
		// int to char, output: {
		char chars = (char) 123;
		System.out.println(chars);
		
		// float to short: output 234
		float f = 234.56F;
		short s = (short) f;
		System.out.println(s);
		
		// byte can only hold up to 127
		byte b = (byte) 128;
		System.out.println(b);
	}

}
