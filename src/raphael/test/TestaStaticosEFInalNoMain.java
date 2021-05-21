package raphael.test;

import java.util.Scanner;

public class TestaStaticosEFInalNoMain {
	
	static double pi = 3.14;
	static final String nome = "Raphael";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		TestaStaticosEFInalNoMain te = new TestaStaticosEFInalNoMain();
		TestaStaticosEFInalNoMain ti = new TestaStaticosEFInalNoMain();
		
		te.pi = 4.9;
		
		System.out.println(ti.pi);
		
		//perceba que alterei o valor da vari�vel pi, ent�o os dois oobjetos passam a ter o mesmo valor
		
		System.out.println(te.nome);
		te.nome = "Ola";
		// Veja que apresenta um erro, pois como FINAL, ser� constante n�o posso declarar outro valor
	}

}
