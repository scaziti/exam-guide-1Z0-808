package raphael.test.hasA;

public class Carro {
	
	private String cor;
	private int velocidadeMax;
	
	public void info() {
		System.out.println("Cor do carro: " + this.cor + "\nVelocidade Máx: " + this.velocidadeMax);
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setVelocidadeMax(int vel) {
		this.velocidadeMax = vel;
	}

}
