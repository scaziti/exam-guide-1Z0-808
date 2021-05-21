package raphael.test.heranca.polimorfismo;

public class TestaAnimal {
	
	public static void main(String[] args) {
		Gato cat = new Gato();
		Cachorro dog = new Cachorro();
		faca(cat);
		faca(dog);
		
	}
	
	public static void faca(Animal animal) {
		animal.mostraAnimal();
	}

}
