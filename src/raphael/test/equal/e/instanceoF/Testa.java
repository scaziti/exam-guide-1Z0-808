package raphael.test.equal.e.instanceoF;

public class Testa {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		c1.nome = "Raphael";
		c2.nome = "Raphael";
		
		if (!c1.equals(c2))
			System.out.println("They are not equals");
		if (c1.nome == c2.nome)
			System.out.println("equals");
		if(c1 instanceof Carro)
			System.out.println("C1's an Object");
	}

}
