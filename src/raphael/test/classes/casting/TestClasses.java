package raphael.test.classes.casting;

public class TestClasses {
	
	public static void main(String[] args) {
		
		Animal[] animal = {new Dog(), new Cat(), new Animal()};
		for (Animal a : animal) {
			a.makeNoise();
			if (a instanceof Cat) {
				Cat batman = (Cat) a;
				batman.scratch();
				((Cat)batman).scratch(); // It is exactly the same argument!
			}
		}
	}

}
