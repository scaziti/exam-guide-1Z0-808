package raphael.test;

//importei a classe System de forma est�tica, assim posso chamar apenas o out l� embaixo
import static java.lang.System.out;

public class TestaEstaticosEFinal {
	
	
	public static void main(String[] args) {
		
		Loja l = new Loja();
		Loja m = new Loja();
		
		out.println(l.getProduto());
	}

}
