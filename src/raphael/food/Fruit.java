package raphael.food;

public abstract class Fruit {
	
	private String sabor;
	private String cor;
	
	public abstract void adicionaSabor(String sabor);
	public abstract void adicionaCor(String cor);
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
