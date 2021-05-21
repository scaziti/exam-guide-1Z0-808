package raphael.test.hasA;

public class TestaRelacionamentoHasA {
	
	public static void main(String[] args) {
		
		Peugeot p208 = new Peugeot();
		p208.setCor("Prata");
		p208.setVelocidadeMax(210);
		p208.info();
		p208.peugeoutLiga();
		p208.peugeotDesliga();
	}

}
