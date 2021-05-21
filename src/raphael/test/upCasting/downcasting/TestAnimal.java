package raphael.test.upCasting.downcasting;

public class TestAnimal {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal animal1 = new Cat();
		
		Cat cat = new Cat();
		
		cat.makeNoise();
		cat.scratch();
		animal.makeNoise();
		animal1.makeNoise();
		
		// se quiser que o animal1 tenha o método scratch, tenho que fazer casting implicito (downcasting)
		System.out.println("After downcasting");
		Cat bat = (Cat) animal1;
		bat.scratch();
		
	}

}
