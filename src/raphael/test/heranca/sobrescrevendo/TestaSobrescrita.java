package raphael.test.heranca.sobrescrevendo;

public class TestaSobrescrita {
	
	
	public static void main(String[] args) {
		Animal an = new Gato();
		Animal an2 = new Animal();
		Gato an3 = new Gato();
		
		an.come();
		an2.come();
		an3.mexeCauda();
		
		an3.come("Comeu");
	}
	
}
