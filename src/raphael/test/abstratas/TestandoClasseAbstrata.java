package raphael.test.abstratas;

public abstract class TestandoClasseAbstrata {
	
	private String nome;
	private int idade;
	
	public abstract void adicionaIdade(int valor);
	public abstract void adicionaNome(String nome);
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	

}
