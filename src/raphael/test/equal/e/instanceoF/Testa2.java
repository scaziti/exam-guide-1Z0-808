package raphael.test.equal.e.instanceoF;

public class Testa2 {
	
	public static void main(String[] args) {
		
		Testa2 t1 = new Testa2();
		Testa2 t2 = new Testa2();
		
		
		//Essa condi��o ser� falsa, pois existem refer�ncias diferentes para cada instancia
		if (t1.equals(t2))
			System.out.println("Equals");
		// resultado ser� vdd, pois toda classe � subclass of class Object
		if(t1 instanceof Object)
			System.out.println("Object");
	}

}
