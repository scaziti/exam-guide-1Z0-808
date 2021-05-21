package raphael.test.string.troca.valor;

public class Test {

	public static void main(String[] args) {
		
		//note que as duas local variable se referem/apontam para o mesmo
		String str = "RAPHA";
		String str2 = str;
		
		System.out.println(str2);
		
		//Ao fazer isso, será criada uma nova String, porém, o str2 continuará apontando para a string inicial "RAPHA"
		str2.toLowerCase();
		System.out.println(str2);
		
		// Porém, agora faço uma NOVA variável apontar para o conteúdo de "rapha"
		String str3 = str2.toLowerCase();
		System.out.println(str3);
		
		
		
	}
}
