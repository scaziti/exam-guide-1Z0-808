package raphael.test.conversao.string;

public class Test {
	
	public static void main(String[] args) {
		
		// aqui o sistema ir� cortar cada caracter colocando em uma posi��o do array de char, ex: newX[0] = 'M';
		String x = "Meu pai � incr�vel";
		char[] arrayCharX = x.toCharArray();
		System.out.println(arrayCharX[0]);
		for (char list : arrayCharX) {
			System.out.print(list + " ");
		}
		
	}
}
