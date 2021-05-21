package raphael.test.abstrato.interfaceETC;

public class Cat extends Animal implements Noise{
	
	private boolean sleeping;
	
	Cat(String name, String action, boolean sleeping){
		super(name, action);
		this.sleeping = sleeping;
	}
	

	public void doingAnAction() {
		super.doingAnAction();
		System.out.println("Now the Cat is scratching");
	}
	
	//Aqui o método está sendo overloaded, note que só foi possível informando um parametro
	public void doingAnAction(int i) {
		if (i == 1) {
			this.sleeping = true;
		}
		else {
			this.sleeping = false;
		}
	}
	
	public void makeNoise() {
		System.out.println("Meow");
	}
	
	public void test(){
		System.out.println("cat says hello!");
	}
	
	public boolean getSleeping() {
		return this.sleeping;
	}

}
