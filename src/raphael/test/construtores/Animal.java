package raphael.test.construtores;

public class Animal {
	
	String name;
	
	Animal (String name){
		this.name = name;
	}
	
	Animal(){
		this(makeRandomName());
	}
	
	static String makeRandomName() {
		int x = (int) (Math.random() * 3);
		
		String name = new String[] {"Raphael", "Jessica", "Batman"}[x];
		// Isso é o mesmo que escrever isso:
		// String[] nameList = {"Raphael", "Jessica", "Batman"};
		// String name = nameList[x];
		
		return name;
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.name);
		Animal b = new Animal("Morfeu");
		System.out.println(b.name);
	}
}
