package raphael.test.abstratas;

public class TestandoClasseAbstrata2 {
	
	public static void main(String[] args) {
		
//		TestandoClasseAbstrata c = new TestandoClasseAbstrata(); note que não posso instanciar por ser abstract
		
		TestandoClasseAbstrata3 t = new TestandoClasseAbstrata3();
		
		t.adicionaIdade(28);
		System.out.println(t.getIdade());
	}

}
