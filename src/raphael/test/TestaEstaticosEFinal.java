package raphael.test;

//importei a classe System de forma estática, assim posso chamar apenas o out lá embaixo
import static java.lang.System.out;

public class TestaEstaticosEFinal {
	
	
	public static void main(String[] args) {
		
		Loja l = new Loja();
		Loja m = new Loja();
		
		out.println(l.getProduto());
	}

}
