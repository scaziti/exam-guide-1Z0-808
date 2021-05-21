package raphael.test.acessos2;


public class Pessoa {
	public String coolMethod() {
		return "me chupa";
	}
	
	//Consigo chamar, pois eles fazem parte do mesmo package
	public void chama() {
		int x = 10;
		PessoaProtected p = new PessoaProtected();
		
		System.out.println(p.nome);
	}
	
	
}
