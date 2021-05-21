package raphael.test.string;

public class TestaMetodosString {
	public static void main(String[] args) {
		
		String s1 = "abc";
		
		// Traz o char na posição 2 da minha String 'c'
		System.out.println(s1.charAt(2)); 
		
		// Aqui crio o objeto abc 123, que s2 apontará. Sem o s2, o objeto criado ficaria perdido, pois não teria uma referência apontando
		String s2 = s1.concat(" 123");
		
		// Já aqui, devido ao sinal de += crio um novo objeto, que será apontado/referenciado pela variável de instancia s1
		s1 += "987";
		
		// Faço o x receber o comprimento da minha variável s1
		int x = s1.length();
		System.out.println(x);
		System.out.println(s1.length());
		
		// Aqui faço s1 apontar para um novo objeto, onde 'a' será trocado por 'J' (todo caracter 'a' que existir na String)
		s1 = s1.replace('a', 'J');
		System.out.println(s1);
		
		// vai imprimir da posição 2 em diante, por exemplo Jbc987 será c987
		System.out.println(s1.substring(2));
		
		// O mesmo do caso acima, porém, digo de qual posição inicial quero até a posição final
		System.out.println(s1.substring(2, 4));
		
		String str = " Hello, world ";
		System.out.println(str.toString());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim()); // remove os espaços em branco do começo e do fim
		
		// Aqui converto o String para um vetor de char
		char[] chars = str.toCharArray();
		for (char v : chars) {
			System.out.print(v + " ");
		}
	}

}
