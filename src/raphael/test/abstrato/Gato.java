package raphael.test.abstrato;

public class Gato extends Animal {

	Gato(String s){
		super(null);
		System.out.println("Cat");
	}
	
	Gato(){
		this("Cat");
	}
}
