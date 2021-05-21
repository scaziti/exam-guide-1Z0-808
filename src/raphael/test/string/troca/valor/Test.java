package raphael.test.string.troca.valor;

public class Test {

	public static void main(String[] args) {
		
		//note que as duas local variable se referem/apontam para o mesmo
		String str = "RAPHA";
		String str2 = str;
		
		System.out.println(str2);
		
		//Ao fazer isso, ser� criada uma nova String, por�m, o str2 continuar� apontando para a string inicial "RAPHA"
		str2.toLowerCase();
		System.out.println(str2);
		
		// Por�m, agora fa�o uma NOVA vari�vel apontar para o conte�do de "rapha"
		String str3 = str2.toLowerCase();
		System.out.println(str3);
		
		
		
	}
}
