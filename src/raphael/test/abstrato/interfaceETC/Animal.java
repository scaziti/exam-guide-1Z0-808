package raphael.test.abstrato.interfaceETC;

public class Animal {
	
	// Attributes
	private String name;
	private String action;
	
	//Constructors
	Animal(String name, String action){
		this.action = action;
		this.name = name;
	}
	
	Animal(){
		
	}
	
	//Methods
	public void doingAnAction() {
		System.out.println("Generic animal is doing something!");
	}
	
	// Getters and Setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAction() {
		return this.action;
	}

}
