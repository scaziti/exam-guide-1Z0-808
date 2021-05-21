package raphael.food.defaultI;

import raphael.food.*;

class Apple extends Fruit{

	@Override
	public void adicionaSabor(String sabor) {
		setSabor(sabor);
		
	}

	@Override
	public void adicionaCor(String cor) {
		setCor(cor);
		
	}

}
