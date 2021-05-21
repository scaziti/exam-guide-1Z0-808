package raphael.test.initialization.blocks;

public class Init {
	// primeiro chamará os static
	// quando crio a instancia da classe, com o new Init(), ele rodará a instancia a cada nova instanciação da classe
	// Por fim rodará os blocos dos construtores
	Init (int x){
		System.out.println("1-arg const");
	}
	
	Init (){
		System.out.println("no-arg const");
	}
	
	
	static {
		System.out.println("1st static init");
	}
	
	{System.out.println("1st instance init");}
	{System.out.println("2nd instance init");}

	static {
		System.out.println("2nd static init");
	}
	
	public static void main(String[] args) {
		new Init();
		new Init(7);
	}
// Portanto, a saída será assim:
// 1st static init
//	2nd static init
//	1st instance init
//	2nd instance init
//	no-arg const
//	1st instance init
//	2nd instance init
//	1-arg const
}
