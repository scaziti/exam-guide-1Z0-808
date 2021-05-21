package raphael.test.shadowing;

public class Animal {
	
	static int size = 7;
	static void changeIt(int size) {
		size += 200;
		System.out.println("size in changeIt is " + size);
	}
	
	public static void main(String[] args) {
		Animal a = new Animal();
		//Aqui estou chamando a static variable
		System.out.println("size = " + size);
		//Porém, aqui chamo o método que possui um shadowing, uma local variable de mesmo nome que a static
		changeIt(size);
		//Aqui estou chamando a static variable
		System.out.println("size after changeIt is " + size);
	}

}
