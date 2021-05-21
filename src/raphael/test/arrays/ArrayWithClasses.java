package raphael.test.arrays;

public class ArrayWithClasses {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal a3 = new Animal();
		
		a1.name = "Lion";
		a2.name = "Cat";
		a3.name = "Bear";
		Animal[] list = new Animal[3];
		list[0] = a1;
		list[1] = a2;
		list[2] = a3;
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].name);
		}
	}
}
