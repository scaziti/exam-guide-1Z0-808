package raphael.food.defaultI;

public class TestaFruta {
	
	public static void main(String[] args) {
		
		Apple a = new Apple();
		
		a.adicionaCor("Vermelho");
		a.adicionaSabor("doce");
		
		System.out.println(a.getCor() + a.getSabor());
	}

}
