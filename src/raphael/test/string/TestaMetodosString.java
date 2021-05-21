package raphael.test.string;

public class TestaMetodosString {
	public static void main(String[] args) {
		
		String s1 = "abc";
		
		// Traz o char na posi��o 2 da minha String 'c'
		System.out.println(s1.charAt(2)); 
		
		// Aqui crio o objeto abc 123, que s2 apontar�. Sem o s2, o objeto criado ficaria perdido, pois n�o teria uma refer�ncia apontando
		String s2 = s1.concat(" 123");
		
		// J� aqui, devido ao sinal de += crio um novo objeto, que ser� apontado/referenciado pela vari�vel de instancia s1
		s1 += "987";
		
		// Fa�o o x receber o comprimento da minha vari�vel s1
		int x = s1.length();
		System.out.println(x);
		System.out.println(s1.length());
		
		// Aqui fa�o s1 apontar para um novo objeto, onde 'a' ser� trocado por 'J' (todo caracter 'a' que existir na String)
		s1 = s1.replace('a', 'J');
		System.out.println(s1);
		
		// vai imprimir da posi��o 2 em diante, por exemplo Jbc987 ser� c987
		System.out.println(s1.substring(2));
		
		// O mesmo do caso acima, por�m, digo de qual posi��o inicial quero at� a posi��o final
		System.out.println(s1.substring(2, 4));
		
		String str = " Hello, world ";
		System.out.println(str.toString());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim()); // remove os espa�os em branco do come�o e do fim
		
		// Aqui converto o String para um vetor de char
		char[] chars = str.toCharArray();
		for (char v : chars) {
			System.out.print(v + " ");
		}
	}

}
