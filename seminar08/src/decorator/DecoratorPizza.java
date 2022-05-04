package decorator;

public class DecoratorPizza extends APizza {
	
	//obj concret
		protected APizza aPizza;
		
		public DecoratorPizza(APizza p) {
			// TODO Auto-generated constructor stub
			this.aPizza=p;
		}

		@Override
		public void getIngredients() {
			aPizza.getIngredients();
			
		}

		@Override
		public void calculateCost() {
			// TODO Auto-generated method stub
			aPizza.calculateCost();
		}

}
