package raphael.test.interfaces;

public interface Loja extends Carro{

	public default void print() {
		System.out.println("I");
	}
	
	static void method() {
		System.out.println("static");
	}
}
