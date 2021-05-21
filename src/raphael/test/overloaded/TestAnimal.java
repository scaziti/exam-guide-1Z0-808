package raphael.test.overloaded;

public class TestAnimal {
	
	public void doSomenthing(Animal a) {
		System.out.println("Called class Animal");
	}
	
	public void doSomenthing(Horse h) {
		System.out.println("Called class Horse");
	}
	
	public static void main(String[] args) {
		
		TestAnimal ta = new TestAnimal();
		Animal a = new Animal();
		Horse h = new Horse();
		Animal a2 = new Horse();
//		Horse h2 = (Horse) new Animal(); apresentará erro (exception)
		
		ta.doSomenthing(a);
		ta.doSomenthing(h);
		ta.doSomenthing(a2); // It will be called the Animal method
//		ta.facaAlgo(h2);
	}

}
