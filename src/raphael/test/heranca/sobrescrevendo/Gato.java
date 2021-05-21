package raphael.test.heranca.sobrescrevendo;

public class Gato extends Animal{
	
	//Aqui fiz um override da class Animal
	public void come() {
		super.come();
		System.out.println("ocorre primeiro"); //chama primeiro isso
		
	}
	
	// J� aqui, fiz um overload do m�todo que foi overrided
	public void come(String s) {
		System.out.println("Voc� incluiu a String: " + s);
	}
	
	public void mexeCauda() {
		Cauda.mexer();
	}
	

}
